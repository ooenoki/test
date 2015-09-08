package sample.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

import sample.dto.CatalogListDto;

@Component(instance = InstanceType.SESSION)
public class CatalogForm implements Serializable {

	// 商品一覧
	public CatalogListDto catalogList;

	// ページ制御用オフセット値
	public int offset;
}
