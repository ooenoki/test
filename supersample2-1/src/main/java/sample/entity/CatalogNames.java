package sample.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Catalog}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/09/07 19:00:55")
public class CatalogNames {

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
     * priceのプロパティ名を返します。
     * 
     * @return priceのプロパティ名
     */
    public static PropertyName<Integer> price() {
        return new PropertyName<Integer>("price");
    }

    /**
     * detailのプロパティ名を返します。
     * 
     * @return detailのプロパティ名
     */
    public static PropertyName<String> detail() {
        return new PropertyName<String>("detail");
    }

    /**
     * pictureurlのプロパティ名を返します。
     * 
     * @return pictureurlのプロパティ名
     */
    public static PropertyName<String> pictureurl() {
        return new PropertyName<String>("pictureurl");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CatalogNames extends PropertyName<Catalog> {

        /**
         * インスタンスを構築します。
         */
        public _CatalogNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CatalogNames(final String name) {
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
        public _CatalogNames(final PropertyName<?> parent, final String name) {
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
         * priceのプロパティ名を返します。
         *
         * @return priceのプロパティ名
         */
        public PropertyName<Integer> price() {
            return new PropertyName<Integer>(this, "price");
        }

        /**
         * detailのプロパティ名を返します。
         *
         * @return detailのプロパティ名
         */
        public PropertyName<String> detail() {
            return new PropertyName<String>(this, "detail");
        }

        /**
         * pictureurlのプロパティ名を返します。
         *
         * @return pictureurlのプロパティ名
         */
        public PropertyName<String> pictureurl() {
            return new PropertyName<String>(this, "pictureurl");
        }
    }
}