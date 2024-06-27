package jmat_f5bosco.mag_ditail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmat_f5bosco.mag_ditail.models.CardInterface;
import jmat_f5bosco.mag_ditail.models.Magiccrazy;
import jmat_f5bosco.mag_ditail.repository.MagiccrazyRepository;

@Service
public class CardService {

    @Autowired
    private final MagiccrazyRepository cardRepository;

    public CardService(MagiccrazyRepository cardRepository) {
        this.cardRepository = cardRepository;
        System.out.println(cardRepository);
    }

    public List<CardInterface> getAllCards() {
        List<Magiccrazy> magiccrazyList = cardRepository.findAll();
        List<CardInterface> cardInterfaces = new ArrayList<>();
        for (Magiccrazy magiccrazy : magiccrazyList) {
            cardInterfaces.add(magiccrazy);
        }
        return cardInterfaces;
    }
   /*  public CardInterface decorateCardIfBlack(CardInterface card) {
        if ("black".equalsIgnoreCase(card.getColor())) {
            return new BlackCardDecorator(card);
        }
        return card;
    }*/
}
