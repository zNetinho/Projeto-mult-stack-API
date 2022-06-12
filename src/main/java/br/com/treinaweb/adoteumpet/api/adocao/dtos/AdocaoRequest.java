package br.com.treinaweb.adoteumpet.api.adocao.dtos;

import java.math.BigDecimal;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import br.com.treinaweb.adoteumpet.api.adocao.validators.PetExistById;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class AdocaoRequest {

    @Email
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String email;
    @NotNull
    @Min(10)
    @Max(100)
    private BigDecimal valor;
    @NotNull
    @Positive
    @PetExistById
    private Long petId;

    // public AdocaoRequest() {
    // }

    // public AdocaoRequest(String email, BigDecimal valor, Long petId) {
    // this.email = email;
    // this.valor = valor;
    // this.petId = petId;
    // }

    // public String getEmail() {
    // return email;
    // }

    // public void setEmail(String email) {
    // this.email = email;
    // }

    // public BigDecimal getValor() {
    // return valor;
    // }

    // public void setValor(BigDecimal valor) {
    // this.valor = valor;
    // }

    // public Long getPetId() {
    // return petId;
    // }

    // public void setPetId(Long petId) {
    // this.petId = petId;
    // }

    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((email == null) ? 0 : email.hashCode());
    // result = prime * result + ((petId == null) ? 0 : petId.hashCode());
    // result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
    // AdocaoRequest other = (AdocaoRequest) obj;
    // if (email == null) {
    // if (other.email != null)
    // return false;
    // } else if (!email.equals(other.email))
    // return false;
    // if (petId == null) {
    // if (other.petId != null)
    // return false;
    // } else if (!petId.equals(other.petId))
    // return false;
    // if (valor == null) {
    // if (other.valor != null)
    // return false;
    // } else if (!valor.equals(other.valor))
    // return false;
    // return true;
    // }

    // @Override
    // public String toString() {
    // return "AdocaoRequest [email=" + email + ", petId=" + petId + ", valor=" +
    // valor + "]";
    // }

}
