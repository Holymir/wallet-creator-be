package com.holymirLabs.WalletCreatorBE.service;

import com.holymirLabs.WalletCreatorBE.dto.WalletRequest;
import com.holymirLabs.WalletCreatorBE.dto.WalletResponse;
import lombok.extern.slf4j.Slf4j;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Keys;
import org.web3j.utils.Numeric;

@Slf4j
public class EthereumWalletService {
    public static WalletResponse generateWallet(WalletRequest requestDto) {
        try {
            // Step 1: Generate a new key pair (private and public keys)
            ECKeyPair keyPair = Keys.createEcKeyPair();
            System.out.println(Numeric.toHexStringWithPrefix(keyPair.getPublicKey()));
            // Step 2: Extract the private key
            String privateKey = Numeric.toHexStringWithPrefix(keyPair.getPrivateKey());

            // Step 3: Derive the Ethereum address
            String address = "0x" + Keys.getAddress(keyPair.getPublicKey());

            // Print the generated keys and address
            System.out.println("Ethereum Address: " + address);
            System.out.println("Private Key: " + privateKey);

            return WalletResponse.builder()
                    .mnemonic("qmks")
                    .privateKey(privateKey)
                    .publicKey("0xalabalanica")
                    .address(address)
                    .build();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new WalletResponse(/* wallet details */);
    }
}
