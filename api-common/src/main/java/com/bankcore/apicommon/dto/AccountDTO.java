package com.bankcore.apicommon.dto;

import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

  private int id;

  private String accountNumber;

  private String forename;

  private String surname;

  private String pin;

  private String ssn;

  private BigDecimal currentBalance;

  private List<TransactionDTO> lastFiveTransactions;

}
