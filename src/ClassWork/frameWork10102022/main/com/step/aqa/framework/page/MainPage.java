package ClassWork.frameWork10102022.main.com.step.aqa.framework.page;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Page;
import com.step.aqa.framework.page.block.TopMenuBlock;
import com.step.aqa.framework.page.block.leftMenu.FooterLeftMenuBlock;
import com.step.aqa.framework.page.block.leftMenu.HeaderLeftMenuBlock;
import com.step.aqa.framework.page.block.leftMenu.NavigationLeftMenuBlock;
import com.step.aqa.framework.page.block.main.EventBlock;
import com.step.aqa.framework.page.block.main.NewsBlock;
import com.step.aqa.framework.page.block.present.NavigationBlock;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.block_interface.HasTopMenuBlock;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.block_interface.left_menu.HasFooterLeftMenuBlock;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.block_interface.left_menu.HasHeaderLeftMenuBlock;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.block_interface.left_menu.HasNavigationLeftMenuBlock;

@Page(pageName = "Main page")
public class MainPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock, HasNavigationLeftMenuBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationBlock navigationBlock = new NavigationBlock();
    private EventBlock eventBlock = new EventBlock();
    private NewsBlock newsBlock = new NewsBlock();


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
    public NavigationLeftMenuBlock getNavigationLeftMenuBlock() {
        return getNavigationLeftMenuBlock();
    }

    public EventBlock getEvenBlock() {return eventBlock;};

    public NewsBlock getNewsBlock() {return newsBlock;};
}
