package com.astamuse.asta4d.web.test.form;

import com.astamuse.asta4d.test.render.infra.SimpleCase;

public class FormRenderCase extends SimpleCase {

    public FormRenderCase(String templateFileName, String confirmFileName) {
        super(templateFileName, confirmFileName);
    }

    public FormRenderCase(String templateFileName) {
        super(templateFileName);
    }

    @Override
    protected String retrieveTempateFielParentPath() {
        return "/com/astamuse/asta4d/web/test/form/templates/";
    }

    @Override
    protected String retrieveConfirmFielParentPath() {
        return "/com/astamuse/asta4d/web/test/form/confirms/";
    }
}
