package com.soplab.lecture.service;
import com.soplab.lecture.factory.SashimiFactory;
import com.soplab.lecture.model.Sashimi;
import com.soplab.lecture.repository.SashimiRepository;
import org.apache.beam.repackaged.beam_sdks_java_core.org.apache.commons.lang3.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SashimiService {
    @Autowired
    SashimiRepository sashimiRepository;
    SashimiFactory sashimiFactory;
    private static SashimiService instance;

    public static SashimiService getInstance(){
        if(instance==null)
            instance = new SashimiService();
        return instance;
    }


    public List<Sashimi> getAllMenu(){
        return sashimiRepository.findAll();
    }

    public Sashimi getMenu(int id) {
        return sashimiRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("No such food with id"));
    }

    public Sashimi addMenu(Sashimi sashimi, String sashimiType) {
        Sashimi newSashimi = sashimiFactory.getType(sashimiType);
        newSashimi = SerializationUtils.clone(sashimi);
        newSashimi.setId(newSashimi.getId());
        return sashimiRepository.save(newSashimi);
    }

    public void deleteMenu(int id) {
        sashimiRepository.deleteById(id);
    }

    public Sashimi buyFoods(Sashimi sashimi, int amount) {
        sashimi.setAmount(sashimi.getAmount() - amount);
        return sashimiRepository.save(sashimi);
    }
}
