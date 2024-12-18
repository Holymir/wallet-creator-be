package com.holymirLabs.WalletCreatorBE.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WalletResponse {
    private String mnemonic;
    private String privateKey;
    private String publicKey;
    private String address;
}
