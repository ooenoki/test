package sample.entity;

import javax.annotation.Generated;
import sample.entity.AddressNames._AddressNames;
import sample.entity.CatalogNames._CatalogNames;
import sample.entity.DepartmentNames._DepartmentNames;
import sample.entity.EmployeeNames._EmployeeNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2015/09/07 19:00:55")
public class Names {

    /**
     * {@link Address}の名前クラスを返します。
     * 
     * @return Addressの名前クラス
     */
    public static _AddressNames address() {
        return new _AddressNames();
    }

    /**
     * {@link Catalog}の名前クラスを返します。
     * 
     * @return Catalogの名前クラス
     */
    public static _CatalogNames catalog() {
        return new _CatalogNames();
    }

    /**
     * {@link Department}の名前クラスを返します。
     * 
     * @return Departmentの名前クラス
     */
    public static _DepartmentNames department() {
        return new _DepartmentNames();
    }

    /**
     * {@link Employee}の名前クラスを返します。
     * 
     * @return Employeeの名前クラス
     */
    public static _EmployeeNames employee() {
        return new _EmployeeNames();
    }
}