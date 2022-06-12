package br.com.treinaweb.adoteumpet.core.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Adocao {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal valor;
    @Column(nullable = false)
    private String email;

    @ManyToOne(optional = true)
    private Pet pet;

    // public Adocao() {
    // }

    // public Adocao(Long id, BigDecimal valor, String email, Pet pet) {
    // this.id = id;
    // this.valor = valor;
    // this.email = email;
    // this.pet = pet;
    // }

    // public Long getId() {
    // return id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    // public BigDecimal getValor() {
    // return valor;
    // }

    // public void setValor(BigDecimal valor) {
    // this.valor = valor;
    // }

    // public String getEmail() {
    // return email;
    // }

    // public void setEmail(String email) {
    // this.email = email;
    // }

    // public Pet getPet() {
    // return pet;
    // }

    // public void setPet(Pet pet) {
    // this.pet = pet;
    // }

    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((id == null) ? 0 : id.hashCode());
    // return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Adocao other = (Adocao) obj;
    // if (id == null) {
    // if (other.id != null)
    // return false;
    // } else if (!id.equals(other.id))
    // return false;
    // return true;
    // }

    // @Override
    // public String toString() {
    // return "Adocao [email=" + email + ", id=" + id + ", pet=" + pet + ", valor="
    // + valor + "]";
    // }

}
