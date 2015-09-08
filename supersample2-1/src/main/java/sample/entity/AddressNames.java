package sample.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import sample.entity.EmployeeNames._EmployeeNames;

/**
 * {@link Address}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/09/07 19:00:55")
public class AddressNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * employeeListのプロパティ名を返します。
     * 
     * @return employeeListのプロパティ名
     */
    public static _EmployeeNames employeeList() {
        return new _EmployeeNames("employeeList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _AddressNames extends PropertyName<Address> {

        /**
         * インスタンスを構築します。
         */
        public _AddressNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _AddressNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _AddressNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * employeeListのプロパティ名を返します。
         * 
         * @return employeeListのプロパティ名
         */
        public _EmployeeNames employeeList() {
            return new _EmployeeNames(this, "employeeList");
        }
    }
}