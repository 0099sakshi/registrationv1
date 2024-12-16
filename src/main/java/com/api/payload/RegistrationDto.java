package com.api.payload;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
public class RegistrationDto {
@NotEmpty
    @Size(min = 2, message = "Min should be 2 letters", max=0)
    private String name;
    @Email
    private String email;
    @Size(min=10,max=10,message = "should be 10 digits")
    private String mobile;

}