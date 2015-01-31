package com.music.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wine")
public class Banda {


		
		public static final String WINES_TABLE_NAME = "wine";
		
		@Id
		public int		wineId;
		public String 	name;
		public String 	grape;
}
