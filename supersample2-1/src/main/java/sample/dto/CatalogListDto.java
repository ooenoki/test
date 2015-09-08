package sample.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CatalogListDto implements Serializable {

	// 商品一覧
	public List<CatalogDto> catalogDtos = new ArrayList<CatalogDto>();

	// 商品IDをキーにして、商品を取得
	public CatalogDto findById(String id) {
		CatalogDto rtn = null;
		for (CatalogDto dto : catalogDtos) {
			if (dto.id.equals(id)) {
				rtn = dto;
			}
		}
		return rtn;
	}
}
