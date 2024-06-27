package jmat_f5bosco.mag_ditail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jmat_f5bosco.mag_ditail.models.CardInterface;
import jmat_f5bosco.mag_ditail.service.CardService;

@Controller
public class MagiccrazyController {

    @Autowired
    private CardService cardService;

    @GetMapping("/cards")
    public String getAllMagiccrazy(Model model) {
        List<CardInterface> cards = cardService.getAllCards();
        model.addAttribute("cards", cards);
        return "cards"; 
    }
}

