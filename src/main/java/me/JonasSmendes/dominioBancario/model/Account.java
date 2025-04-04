package me.JonasSmendes.dominioBancario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "tb_account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(unique = true)
    private String number;
    private String agency;
    @Column(scale = 13, precision = 2)
    private BigDecimal balance;
    @Column(name = "additional_limit", scale = 13, precision = 2)
    private BigDecimal limit;
}
