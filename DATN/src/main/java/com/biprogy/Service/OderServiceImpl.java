package com.biprogy.Service;

import com.biprogy.Model.Oder;
import com.biprogy.Repository.OderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OderServiceImpl implements OderService {

    @Autowired
    OderRepository oderRepository;

    @Override
    public List<Oder> getAll() {
        return this.oderRepository.findAll() ;
    }
}
