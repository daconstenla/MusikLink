package com.music.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wine")
public class Banda {


		
		public static final String WINES_TABLE_NAME = "wine";
		
		@Id
		public int		bandaId;
		public String 	nombre;
		public String 	estilo;
		
}
