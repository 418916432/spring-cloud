package com.windbay.user.po;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserPO {
    private Long id;
    private String username;
    private String password;
    private String mobile;
    private Date createdAt;
    private Date updatedAt;
}
