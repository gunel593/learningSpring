package com.example.learningSpring.Mapper;

import com.example.learningSpring.model.dto.IdCardRequest;
import com.example.learningSpring.model.dto.IdCardResponce;
import com.example.learningSpring.model.entity.IdCard;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IdMapper {
    public List<IdCardResponce> toIdCardResponceList(List<IdCard> idCardList) {
        List<IdCardResponce> idCardResponceList = new ArrayList<>();
        for (IdCard idCard : idCardList) {
            IdCardResponce idCardResponce = toIdCardResponce(idCard);
            idCardResponceList.add(idCardResponce);
        }
        return idCardResponceList;
    }

    public IdCardResponce toIdCardResponce(IdCard idCard) {

        IdCardResponce idCardResponce = IdCardResponce.builder()
                .id(idCard.getId())
                .name(idCard.getName())
                .surname(idCard.getSurname()).
                age(idCard.getAge()).
                fin_code(idCard.getFin_code())
                .series(idCard.getSeries())
                .serial_number(idCard.getSerial_number()).build();
      return idCardResponce;
    }
    public IdCard toIdCard(IdCardRequest idCardRequest){
      return  IdCard.builder().name(idCardRequest.getName())
                .surname(idCardRequest.getSurname())
                .age(idCardRequest.getAge())
                .fin_code(idCardRequest.getFin_code())
                .series(idCardRequest.getSeries())
                .serial_number(idCardRequest.getSerial_number()).build();
    }
    public IdCard toIdCard(Long id,IdCardRequest idCardRequest){
        return  IdCard.builder()
                .id(id)
                .name(idCardRequest.getName())
                .surname(idCardRequest.getSurname())
                .age(idCardRequest.getAge())
                .fin_code(idCardRequest.getFin_code())
                .series(idCardRequest.getSeries())
                .serial_number(idCardRequest.getSerial_number()).build();
    }
}