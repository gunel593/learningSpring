package com.example.learningSpring.Controller;

import com.example.learningSpring.Servis.IdService;
import com.example.learningSpring.model.dto.IdCardRequest;
import com.example.learningSpring.model.dto.IdCardResponce;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/id-cards")
public class IdController {
    private final IdService idService;

    public IdController(IdService idService) {
        this.idService = idService;
    }

    @GetMapping
    public ResponseEntity<List<IdCardResponce>> getAllIdCard() {
        List<IdCardResponce> allIdcard = idService.getAllIdCard();
        return ResponseEntity.ok(allIdcard);
    }
//
//    @GetMapping("/id/{id}")
//    public ResponseEntity<IdCardResponce> getById(@PathVariable Long id) {
//        IdCardResponce idCard = idService.getIdCardById(id);
//        return ResponseEntity.ok(idCard);
//    }
//
//    @PostMapping
//    public ResponseEntity<Void> addIdCard(@RequestBody IdCardRequest idCardRequest) {
//        idService.addIdCard(idCardRequest);
//        return ResponseEntity.ok().build();
//    }
//
//    @PutMapping("/id/{id}")
//    public ResponseEntity<Void> updateIdCard(@PathVariable Long id,
//                                             @RequestBody IdCardRequest idCardRequest) {
//        idService.updateIdCard(id,idCardRequest);
//        return ResponseEntity.ok().build();
//    }
//    @PatchMapping("/id/{id}")
//    public ResponseEntity<Void> updateCardAge(@PathVariable Long id,
//                                             @RequestParam Integer age) {
//        idService.updateIdCardAge(id,age);
//        return ResponseEntity.ok().build();
//    }
//    @DeleteMapping("/id/{id}")
//    public ResponseEntity<Void> deleteById(@PathVariable Long id){
//        idService.deleteIdCard(id);
//        return ResponseEntity.ok().build();
//    }
}