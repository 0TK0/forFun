package com.zyq.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tk on 2018/12/14.
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String name;

    private Integer age;

}
