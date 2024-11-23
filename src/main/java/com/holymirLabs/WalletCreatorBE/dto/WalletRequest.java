package com.holymirLabs.WalletCreatorBE.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WalletRequest {
    private int strength; // Mnemonic strength (e.g., 128, 256)
    private String entropy; // Optional custom entropy
}
