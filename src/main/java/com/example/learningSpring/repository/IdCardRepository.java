package com.example.learningSpring.repository;

import com.example.learningSpring.model.entity.IdCard;

import java.util.List;

public interface IdCardRepository {
 List<IdCard> getAll();
//  IdCard getById(Long id);
//  boolean insert(IdCard idCard);
//  boolean update(IdCard idCard);
//  boolean delete(Long id);
//  boolean updateAge(Long id,Integer age);
}
