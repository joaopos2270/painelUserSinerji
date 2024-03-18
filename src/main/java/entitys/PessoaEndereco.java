/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitys;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author JoaoPos
 */
@Entity
@Table(name = "endereco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PessoaEndereco.findAll", query = "SELECT p FROM PessoaEndereco p"),
    @NamedQuery(name = "PessoaEndereco.findById", query = "SELECT p FROM PessoaEndereco p WHERE p.id = :id"),
    @NamedQuery(name = "PessoaEndereco.findByEstado", query = "SELECT p FROM PessoaEndereco p WHERE p.estado = :estado"),
    @NamedQuery(name = "PessoaEndereco.findByCidade", query = "SELECT p FROM PessoaEndereco p WHERE p.cidade = :cidade"),
    @NamedQuery(name = "PessoaEndereco.findByLogradouro", query = "SELECT p FROM PessoaEndereco p WHERE p.logradouro = :logradouro"),
    @NamedQuery(name = "PessoaEndereco.findByNumero", query = "SELECT p FROM PessoaEndereco p WHERE p.numero = :numero"),
    @NamedQuery(name = "PessoaEndereco.findByCep", query = "SELECT p FROM PessoaEndereco p WHERE p.cep = :cep")})
public class PessoaEndereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2)
    @Column(name = "estado")
    private String estado;
    @Size(max = 100)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 100)
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "numero")
    private Integer numero;
    @Size(max = 8)
    @Column(name = "cep")
    private String cep;
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    @ManyToOne
    private Pessoa idPessoa;

    public PessoaEndereco() {
    }

    public PessoaEndereco(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaEndereco)) {
            return false;
        }
        PessoaEndereco other = (PessoaEndereco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.PessoaEndereco[ id=" + id + " ]";
    }
    
}
