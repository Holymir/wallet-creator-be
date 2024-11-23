package com.holymirLabs.WalletCreatorBE.controller;

import com.holymirLabs.WalletCreatorBE.dto.WalletRequest;
import com.holymirLabs.WalletCreatorBE.dto.WalletResponse;
import com.holymirLabs.WalletCreatorBE.exception.WalletGenerationException;
import com.holymirLabs.WalletCreatorBE.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/{type}")
    public ResponseEntity<WalletResponse> generateWallet(
            @PathVariable String type,
            @RequestBody WalletRequest requestDto
    ) throws WalletGenerationException {
        WalletResponse wallet = walletService.generateWallet(type, requestDto);
        return ResponseEntity.ok(wallet);
    }
}
