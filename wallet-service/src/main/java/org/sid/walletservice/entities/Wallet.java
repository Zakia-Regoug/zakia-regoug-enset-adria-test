package org.sid.walletservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Wallet {
    @Id
    private String id;
    private double solde;
    private Date createdAt;
    private String device;
    @ManyToOne
    private Client client;

}
