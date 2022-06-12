package br.com.treinaweb.adoteumpet.api.pet.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetResponse {

    private Long id;
    private String nome;
    private String historia;
    private String foto;

    // public Long getId() {
    // return id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    // public String getNome() {
    // return nome;
    // }

    // public void setNome(String nome) {
    // this.nome = nome;
    // }

    // public String getHistoria() {
    // return historia;
    // }

    // public void setHistoria(String historia) {
    // this.historia = historia;
    // }

    // public String getFoto() {
    // return foto;
    // }

    // public void setFoto(String foto) {
    // this.foto = foto;
    // }

}
