package com.holymirLabs.WalletCreatorBE.service;

import com.holymirLabs.WalletCreatorBE.dto.WalletResponse;
import com.holymirLabs.WalletCreatorBE.dto.WalletRequest;
import com.holymirLabs.WalletCreatorBE.exception.WalletGenerationException;

public interface WalletService {
    WalletResponse generateWallet(String type, WalletRequest requestDto) throws WalletGenerationException;
}
