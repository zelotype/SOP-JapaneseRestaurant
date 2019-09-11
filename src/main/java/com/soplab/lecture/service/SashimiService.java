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
    SashimiRepository SashimiRepository;
    SashimiFactory SashimiFactory;
    private static SashimiService instance;

    public static SashimiService getInstance(){
        if(instance==null)
            instance = new SashimiService();
        return instance;
    }


    public List<Sashimi> getAllMenu(){
        return SashimiRepository.findAll();
    }

    public Sashimi getMenu(String id) {
        return SashimiRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("No such food with id"));
    }

    public Sashimi addMenu(Sashimi sashimi, String sashimiType) {
        Sashimi newSashimi = SashimiFactory.getType(sashimiType);
        newSashimi = SerializationUtils.clone(sashimi);
        return SashimiRepository.save(newSashimi);
    }

    public void deleteMenu(String id) {
        SashimiRepository.deleteById(id);
    }

    public Sashimi updateMenu(Sashimi newSashimi, String id) {
        Sashimi thisSashimi = this.getMenu(id);
        thisSashimi = SerializationUtils.clone(newSashimi);
        return SashimiRepository.save(thisSashimi);
    }

    public Sashimi buyFoods(Sashimi sashimi, int amount) {
        sashimi.setAmount(sashimi.getAmount() - amount);
        return SashimiRepository.save(sashimi);
    }
}
