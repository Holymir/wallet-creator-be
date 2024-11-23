package com.holymirLabs.WalletCreatorBE.service;

import com.holymirLabs.WalletCreatorBE.dto.WalletRequest;
import com.holymirLabs.WalletCreatorBE.dto.WalletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TronWalletService {
    public static WalletResponse generateWallet(WalletRequest requestDto) {
        // Implementation for Tron wallet generation
        log.info("Generate TRON wallet");
        return new WalletResponse();
    }
}
