package com.vti.blogapp.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostCreateForm {
    private String title;
    private String content;
    private String description;
}
