package sample.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static sample.entity.AddressNames.*;

/**
 * {@link Address}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2015/09/07 18:52:14")
public class AddressTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Address.class).id(1).getSingleResult();
    }

    /**
     * employeeListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_employeeList() throws Exception {
        jdbcManager.from(Address.class).leftOuterJoin(employeeList()).id(1).getSingleResult();
    }
}