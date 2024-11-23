package com.holymirLabs.WalletCreatorBE.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WalletResponse {
    private String mnemonic;
    private String privateKey;
    private String publicKey;
    private String address;
}
