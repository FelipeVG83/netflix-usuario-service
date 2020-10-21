package com.fiap.netflix.usuarios.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Interesse {
	@Id
	private int idUsuario;
	private String idFilme;
    
}
