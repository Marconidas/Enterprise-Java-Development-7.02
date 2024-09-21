package com.BankAppPrivate.BankAppPrivate.service;

import com.BankAppPrivate.BankAppPrivate.model.ThirdParty;
import com.BankAppPrivate.BankAppPrivate.repository.ThirdPartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class ThirdPartyService {

    @Autowired
    private ThirdPartyRepository thirdPartyRepository;

    //@Autowired
    //private BCryptPasswordEncoder passwordEncoder;

    /*@Transactional
    public ThirdParty registerThirdParty(ThirdParty thirdParty) {
        thirdParty.setHashKey(passwordEncoder.encode(thirdParty.getHashKey()));
        return thirdPartyRepository.save(thirdParty);
    }*/

    public ThirdParty getThirdPartyById(Long id) {
        return thirdPartyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tercero no encontrado"));
    }

    public void deleteThirdParty(Long id) {
        ThirdParty thirdParty = getThirdPartyById(id);
        thirdPartyRepository.delete(thirdParty);
    }
}
