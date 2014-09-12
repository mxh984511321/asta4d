package com.astamuse.asta4d.web.form.annotation.renderable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.astamuse.asta4d.util.annotation.ConvertableAnnotation;
import com.astamuse.asta4d.web.form.annotation.renderable.convert.CommonInputAnnotationConvertor;
import com.astamuse.asta4d.web.form.field.FormFieldValueRenderer;
import com.astamuse.asta4d.web.form.field.impl.RadioBoxRenderer;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
@ConvertableAnnotation(CommonInputAnnotationConvertor.class)
public @interface RadioBox {
    String name() default "";

    String editSelector() default "";

    String displaySelector() default "";

    Class<? extends FormFieldValueRenderer> fieldValueRenderer() default RadioBoxRenderer.class;
}
