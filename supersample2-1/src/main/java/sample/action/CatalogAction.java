package sample.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sample.dto.CatalogDto;
import sample.dto.CatalogListDto;
import sample.entity.Catalog;
import sample.form.CatalogForm;
import sample.service.CatalogService;

public class CatalogAction {

	@Resource
	protected CatalogService catalogService;

	// セッションスコープに格納されています。
	@ActionForm
	@Resource
	protected CatalogForm catalogForm;

	/** ロガー */
    Logger loggerDebug = (Logger)Logger.getInstance("debugLogger");
    Logger loggerFatal = (Logger)Logger.getInstance("fatalLogger");

	// 初期一覧の表示
	@Execute(validator = false)
	public String list() {
		catalogForm.catalogList = new CatalogListDto();
		catalogForm.catalogList.catalogDtos = entity2dto(catalogService
				.findAll());
		catalogForm.offset = 0;
		//loggertest
        loggerDebug.debug("(DEBUG)debug!!!");
        loggerDebug.info("(DEBUG)info!!!");
        loggerDebug.warn("(DEBUG)warn!!!");
        loggerDebug.error("(DEBUG)error!!!");
        loggerDebug.fatal("(DEBUG)fatal!!!");

        loggerFatal.debug("(FATAL)debug!!!");
        loggerFatal.info("(FATAL)info!!!");
        loggerFatal.warn("(FATAL)warn!!!");
        loggerFatal.error("(FATAL)error!!!");
        loggerFatal.fatal("(FATAL)fatal!!!");

		return "catalog.jsp";
	}

	// 次ページの表示
	@Execute(validator = false)
	public String next() {
		catalogForm.offset += 5;
		return "catalog.jsp";
	}

	// 前ページの表示
	@Execute(validator = false)
	public String prev() {
		catalogForm.offset -= 5;
		return "catalog.jsp";
	}

	// Entity→DTOに変換
	private List<CatalogDto> entity2dto(List<Catalog> catalogEntities) {
		List<CatalogDto> catalogDtos = new ArrayList<CatalogDto>();
		for (Catalog c : catalogEntities) {
			CatalogDto d = Beans.createAndCopy(CatalogDto.class, c).execute();
			catalogDtos.add(d);
		}
		return catalogDtos;
	}
}