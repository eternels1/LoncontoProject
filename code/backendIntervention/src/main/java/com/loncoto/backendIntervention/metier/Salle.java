package com.loncoto.backendIntervention.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter@Setter@NoArgsConstructor@ToString
public class Salle {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Id								private int id;
@Column(length=50)				private String name;	
@ManyToOne						private Etage etageSalle;	

}