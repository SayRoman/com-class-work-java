package com.step.aqa.framework.page;

import com.step.aqa.framework.annotation.Page;
import com.step.aqa.framework.page.block.TopMenuBlock;
import com.step.aqa.framework.page.block.leftMenu.FooterLeftMenuBlock;
import com.step.aqa.framework.page.block.leftMenu.HeaderLeftMenuBlock;
import com.step.aqa.framework.page.block.present.NavigationBlock;
import com.step.aqa.framework.page.block_interface.HasTopMenuBlock;
import com.step.aqa.framework.page.block_interface.left_menu.HasFooterLeftMenuBlock;
import com.step.aqa.framework.page.block_interface.left_menu.HasHeaderLeftMenuBlock;
import com.step.aqa.framework.page.block_interface.left_menu.HasNavigationLeftMenuBlock;

@Page(pageName = "Main page")
public class MainPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock, HasNavigationLeftMenuBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationBlock navigationBlock = new NavigationBlock();


    @Override
    public TopMenuBlock getTopMenuBlock() {
        return topMenuBlock;
    }

    @Override
    public FooterLeftMenuBlock getFooterLeftMenuBlock() {
        return footerLeftMenuBlock;
    }

    @Override
    public HeaderLeftMenuBlock getHeaderLeftMenuBlock() {
        return headerLeftMenuBlock;
    }

    @Override
    public NavigationBlock getNavigationLeftMenuBlock() {
        return navigationBlock;
    }
}
