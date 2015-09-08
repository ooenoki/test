package sample.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Employeeエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/09/07 18:51:42")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** nameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String name;

    /** jobTypeプロパティ */
    @Column(length = 30, nullable = false, unique = false)
    public String jobType;

    /** salaryプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer salary;

    /** departmentIdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer departmentId;

    /** addressIdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer addressId;

    /** address関連プロパティ */
    @ManyToOne
    public Address address;

    /** department関連プロパティ */
    @ManyToOne
    public Department department;
}