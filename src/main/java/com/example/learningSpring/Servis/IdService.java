package com.example.learningSpring.Servis;

import com.example.learningSpring.model.dto.IdCardRequest;
import com.example.learningSpring.model.dto.IdCardResponce;

import java.util.List;

public interface IdService {
    List<IdCardResponce> getAllIdCard();
//    IdCardResponce getIdCardById(Long id);
//
//    void addIdCard(IdCardRequest idCardRequest);
//    void updateIdCard(Long id,IdCardRequest idCardRequest);
//    void updateIdCardAge(Long id, Integer age);
//    void deleteIdCard(Long id);

}

