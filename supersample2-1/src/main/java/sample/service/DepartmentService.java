package sample.service;

import java.util.List;
import javax.annotation.Generated;
import sample.entity.Department;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static sample.entity.DepartmentNames.*;

/**
 * {@link Department}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/09/07 18:52:12")
public class DepartmentService extends AbstractService<Department> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Department findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Department> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}