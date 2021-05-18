package com.wlei.springBucks.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.joda.money.Money;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "T_MENU")
@Data
@Builder
@NoArgsConstructor
public class Coffee implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentBigMoneyAmount",
    parameters = {@org.hibernate.annotations.Parameter(name = "currencyCode", value = "CNY")})
    private Money price;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;

}
