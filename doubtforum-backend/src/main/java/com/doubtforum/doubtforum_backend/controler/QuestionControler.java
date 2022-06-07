package com.doubtforum.doubtforum_backend.controler;

import com.doubtforum.doubtforum_backend.entity.Question;
import com.doubtforum.doubtforum_backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
@RequestMapping("/questions")
public class QuestionControler {

    @PostMapping("/saveAttachment")
    public ResponseEntity<String> saveAttachment(@RequestParam("attachment") MultipartFile multipartFile) {
        try {
            String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
            String uploadDir = "attachments/";

            saveFile(uploadDir, fileName, multipartFile);

            return new ResponseEntity<String>(uploadDir + fileName, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @Autowired(required = true)
    private QuestionService questionService;

    @PostMapping("/addQuestion")
    public ResponseEntity<String> addCustomer(@RequestBody Question question) {
        Question question1;
        try {
            question1 = questionService.saveQuestion(question);
            return new ResponseEntity<String>("Question Details Added Successfully", HttpStatus.OK);

        } catch (Exception ex) {
            return new ResponseEntity<String>("Question Details Not Added", HttpStatus.BAD_REQUEST);
        }
    }

    public static void saveFile(String uploadDir, String fileName,
                                MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(uploadDir);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
    }


}
