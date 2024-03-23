package com.busycoder.bankapp.dto;


import lombok.*;

//@Getter
//@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    private int id;
    private String name;
    private String email;
    private long balance;

}
