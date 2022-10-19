package ClassWork.frameWork10102022.main.com.step.aqa.framework.page;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Page;
import com.step.aqa.framework.page.block.TopMenuBlock;
import com.step.aqa.framework.page.block.leftMenu.FooterLeftMenuBlock;
import com.step.aqa.framework.page.block.leftMenu.HeaderLeftMenuBlock;
import com.step.aqa.framework.page.block.leftMenu.NavigationLeftMenuBlock;
import com.step.aqa.framework.page.block.present.HeadBlock;
import com.step.aqa.framework.page.block.present.MaterialInformationBlock;
import com.step.aqa.framework.page.block.present.NavigationBlock;
import com.step.aqa.framework.page.block.present.StudentTableBlock;
import com.step.aqa.framework.page.block_interface.HasTopMenuBlock;
import com.step.aqa.framework.page.block_interface.left_menu.HasFooterLeftMenuBlock;
import com.step.aqa.framework.page.block_interface.left_menu.HasHeaderLeftMenuBlock;
import com.step.aqa.framework.page.block_interface.left_menu.HasNavigationLeftMenuBlock;
import com.step.aqa.framework.page.block_interface.present.HasHeadBlock;
import com.step.aqa.framework.page.block_interface.present.HasMaterialInformationBlock;
import com.step.aqa.framework.page.block_interface.present.HasNavigationBlock;
import com.step.aqa.framework.page.block_interface.present.HasStudentTableBlock;

@Page(pageName = "Present page")
public class PresentsPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock,
        HasHeaderLeftMenuBlock, HasNavigationLeftMenuBlock, HasHeadBlock, HasMaterialInformationBlock,
        HasNavigationBlock, HasStudentTableBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private HeadBlock headBlock = new HeadBlock();
    private MaterialInformationBlock materialInformationBlock = new MaterialInformationBlock();
    private NavigationBlock navigationBlock = new NavigationBlock();
    private StudentTableBlock studentTableBlock = new StudentTableBlock();


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
        return navigationLeftMenuBlock;
    }

    @Override
    public HeadBlock getHeadBlock() {
        return headBlock;
    }

    @Override
    public MaterialInformationBlock getMaterialInformationBlock() {
        return materialInformationBlock;
    }

    @Override
    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }

    @Override
    public StudentTableBlock getStudentTableBlock() {
        return studentTableBlock;
    }
}
