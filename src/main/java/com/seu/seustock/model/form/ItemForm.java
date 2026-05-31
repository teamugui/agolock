package com.seu.seustock.model.form;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemForm {

    @NotBlank(message = "{valid.item.name.notBlank}")
    @Size(max = 100, message = "{valid.item.name.size}")
    private String name;

    @Size(max = 500, message = "{valid.item.description.size}")
    private String description;

    @PositiveOrZero(message = "{valid.price.positive}")
    @Digits(integer = 12, fraction = 0, message = "{valid.price.digits}")
    private BigDecimal price;

    private MultipartFile imageFile;
    private String imageHash;
}
