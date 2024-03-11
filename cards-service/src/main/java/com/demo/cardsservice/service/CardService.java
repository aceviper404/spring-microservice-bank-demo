package com.demo.cardsservice.service;

import com.demo.cardsservice.service.dto.CardDto;

public interface CardService {

    void create(String mobileNumber);

    CardDto getByMobileNumber(String mobileNumber);

    boolean update(CardDto cardsDto);

    boolean deleteByMobileNumber(String mobileNumber);

}
