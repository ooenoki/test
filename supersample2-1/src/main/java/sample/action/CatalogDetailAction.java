package sample.action;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sample.form.CatalogDetailForm;
import sample.form.CatalogForm;
import sample.service.CatalogService;

public class CatalogDetailAction {

    @Resource
    protected CatalogService catalogService;

    @ActionForm
    @Resource
    protected CatalogDetailForm catalogDetailForm;

    //セッションスコープにあるCatalogFormインスタンスをインジェクションします。
    @Resource
    protected CatalogForm catalogForm;

    // 1)商品詳細の表示
    @Execute(validator = false, urlPattern = "show/{id}")
    public String show() {

        // 2)セッションから商品番号に該当するレコードを取得して、フォームにコピーします。
        Beans.copy(catalogForm.catalogList.findById(catalogDetailForm.id), catalogDetailForm).execute();

        return "catalogDetail.jsp";
    }
}
