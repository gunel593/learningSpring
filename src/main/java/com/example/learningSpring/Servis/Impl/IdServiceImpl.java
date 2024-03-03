package com.example.learningSpring.Servis.Impl;

import com.example.learningSpring.Mapper.IdMapper;
import com.example.learningSpring.Servis.IdService;
import com.example.learningSpring.model.dto.IdCardRequest;
import com.example.learningSpring.model.dto.IdCardResponce;
import com.example.learningSpring.model.entity.IdCard;
import com.example.learningSpring.repository.IdCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdServiceImpl implements IdService {
    private final IdMapper idMapper;
    private final IdCardRepository idCardRepository;
    public IdServiceImpl(IdMapper idMapper,IdCardRepository idCardRepository) {
        this.idMapper = idMapper;
        this.idCardRepository =idCardRepository;
    }

    public List<IdCardResponce> getAllIdCard(){
        List<IdCard>idCards=idCardRepository.getAll();
        List<IdCardResponce> idCardResponceList=idMapper.toIdCardResponceList(idCards);
        return idCardResponceList;
    }

//    @Override
//    public IdCardResponce getIdCardById(Long id) {
//     IdCard idCard= idCardRepository.getById(id);
//     IdCardResponce idCardResponce =idMapper.toIdCardResponce(idCard);
//     return idCardResponce;
//    }

//    @Override
//    public void addIdCard(IdCardRequest idCardRequest) {
//       IdCard idCard= idMapper.toIdCard(idCardRequest);
//        idCardRepository.insert(idCard);
//    }

//    @Override
//    public void updateIdCard(Long id, IdCardRequest idCardRequest) {
//       IdCard idCard= idMapper.toIdCard(id,idCardRequest);
//       idCardRepository.update(idCard);
//    }
//
//    @Override
//    public void updateIdCardAge(Long id, Integer age) {
//        idCardRepository.updateAge(id,age);
//    }
//
//    @Override
//    public void deleteIdCard(Long id) {
//        idCardRepository.delete(id);
//    }

}
