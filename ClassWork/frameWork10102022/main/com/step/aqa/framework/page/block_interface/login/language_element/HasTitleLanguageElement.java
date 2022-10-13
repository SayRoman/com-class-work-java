package com.step.aqa.framework.page.block_interface.login.language_element;

import com.step.aqa.framework.page.element.login.language_element.TitleLanguageElement;

public interface HasTitleLanguageElement {

    TitleLanguageElement getTitleLanguageElement();

    default void showTitleLanguageElementSelector() {
        System.out.println(getTitleLanguageElement().elementSelector);
    }
}
