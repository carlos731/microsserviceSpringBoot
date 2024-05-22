package com.microsservicechtsca.accounts.service.client;

import com.microsservicechtsca.accounts.dto.CardsDto;
import com.microsservicechtsca.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CardsFallback implements CardsFeignClient {

    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
