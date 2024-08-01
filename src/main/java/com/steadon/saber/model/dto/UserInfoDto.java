package com.steadon.saber.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfoDto {
    private Integer id;
    private String name;
    private String department;
}
