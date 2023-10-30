package org.sid.walletservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullWallet", types = Wallet.class)
public interface WalletProjection {
    public String getId();
    public double getSolde();
    public String getDevice();
}
