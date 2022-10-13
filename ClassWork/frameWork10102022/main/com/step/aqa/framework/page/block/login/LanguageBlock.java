package com.step.aqa.framework.page.block.login;

import com.step.aqa.framework.annotation.Block;
import com.step.aqa.framework.page.block.BaseBlock;
import com.step.aqa.framework.page.block_interface.login.language_element.HasLanguageElement;
import com.step.aqa.framework.page.block_interface.login.language_element.HasTitleLanguageElement;
import com.step.aqa.framework.page.element.login.language_element.LanguageElement;
import com.step.aqa.framework.page.element.login.language_element.TitleLanguageElement;

@Block(blockName = "Language Login block")
public class LanguageBlock extends BaseBlock implements HasLanguageElement, HasTitleLanguageElement {

    private LanguageElement languageElement = new LanguageElement("selector for Language element");
    private TitleLanguageElement titleLanguageElement = new TitleLanguageElement("selector for Language");

    @Override
    public LanguageElement getLanguageElement() {
        return languageElement;
    }

    @Override
    public TitleLanguageElement getTitleLanguageElement() {
        return titleLanguageElement;
    }
}
