package com.holymirLabs.WalletCreatorBE.service;

import com.holymirLabs.WalletCreatorBE.dto.WalletRequest;
import com.holymirLabs.WalletCreatorBE.dto.WalletResponse;
import com.holymirLabs.WalletCreatorBE.exception.WalletGenerationException;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    @Override
    public WalletResponse generateWallet(String type, WalletRequest requestDto) throws WalletGenerationException {
        switch (type.toLowerCase()) {
            case "btc":
                return BitcoinWalletService.generateWallet(requestDto);
            case "eth":
                return EthereumWalletService.generateWallet(requestDto);
            case "tron":
                return TronWalletService.generateWallet(requestDto);
            default:
                throw new WalletGenerationException("Unsupported wallet type: " + type);
        }
    }
}
