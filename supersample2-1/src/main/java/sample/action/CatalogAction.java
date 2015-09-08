package sample.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

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

	// 初期一覧の表示
	@Execute(validator = false)
	public String list() {
		catalogForm.catalogList = new CatalogListDto();
		catalogForm.catalogList.catalogDtos = entity2dto(catalogService
				.findAll());
		catalogForm.offset = 0;
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