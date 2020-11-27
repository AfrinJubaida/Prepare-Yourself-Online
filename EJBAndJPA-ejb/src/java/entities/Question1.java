/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author afrin
 */
@Entity
@Table(name = "QUESTION1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Question1.findAll", query = "SELECT q FROM Question1 q")
    , @NamedQuery(name = "Question1.findByNum", query = "SELECT q FROM Question1 q WHERE q.num = :num")
    , @NamedQuery(name = "Question1.findByQus", query = "SELECT q FROM Question1 q WHERE q.qus = :qus")
    , @NamedQuery(name = "Question1.findByA", query = "SELECT q FROM Question1 q WHERE q.a = :a")
    , @NamedQuery(name = "Question1.findByB", query = "SELECT q FROM Question1 q WHERE q.b = :b")
    , @NamedQuery(name = "Question1.findByC", query = "SELECT q FROM Question1 q WHERE q.c = :c")
    , @NamedQuery(name = "Question1.findByD", query = "SELECT q FROM Question1 q WHERE q.d = :d")})
public class Question1 implements Serializable {

    @Size(max = 10)
    @Column(name = "ANS")
    private String ans;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM")
    private Integer num;
    @Size(max = 600)
    @Column(name = "QUS")
    private String qus;
    @Size(max = 50)
    @Column(name = "A")
    private String a;
    @Size(max = 50)
    @Column(name = "B")
    private String b;
    @Size(max = 50)
    @Column(name = "C")
    private String c;
    @Size(max = 50)
    @Column(name = "D")
    private String d;

    public Question1() {
    }

    public Question1(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getQus() {
        return qus;
    }

    public void setQus(String qus) {
        this.qus = qus;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (num != null ? num.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Question1)) {
            return false;
        }
        Question1 other = (Question1) object;
        if ((this.num == null && other.num != null) || (this.num != null && !this.num.equals(other.num))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Question1[ num=" + num + " ]";
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
    
}
