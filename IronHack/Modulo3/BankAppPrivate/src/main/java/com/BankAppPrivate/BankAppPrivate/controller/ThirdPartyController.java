package com.BankAppPrivate.BankAppPrivate.controller;

import com.BankAppPrivate.BankAppPrivate.model.ThirdParty;
import com.BankAppPrivate.BankAppPrivate.service.ThirdPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/third-parties")
public class ThirdPartyController {

    @Autowired
    private ThirdPartyService thirdPartyService;

    @GetMapping("/{id}")
    public ThirdParty getThirdPartyById(@PathVariable Long id) {
        return thirdPartyService.getThirdPartyById(id);
    }

    /*@PostMapping
    public void registerThirdParty(@RequestBody ThirdParty thirdParty) {
        thirdPartyService.registerThirdParty(thirdParty);
    }*/

    @DeleteMapping("/{id}")
    public void deleteThirdParty(@PathVariable Long id) {
        thirdPartyService.deleteThirdParty(id);
    }
}
