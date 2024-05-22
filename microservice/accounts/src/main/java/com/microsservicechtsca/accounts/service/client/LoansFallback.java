package com.microsservicechtsca.accounts.service.client;

import com.microsservicechtsca.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallback implements LoansFeignClient {

    @Override
    public ResponseEntity<LoansDto> fetchLoansDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
