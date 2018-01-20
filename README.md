# Geometria
Punto:  
  Attributi:  
    coordinate x, y;  
  Metodi:  
    costruttore,  
    getDifference()-Calcola la distanza tra quel punto ed uno fornito tramite parametro.  
Segmento:  
  Attributi (tutti private):  
    due Punto: p1, p2;  
    lunghezza, lunghezza segmento da p1 a p2   
    coeffAngolare della retta passante tra p1 e p2 (Servirà in successione per capire se i triangoli sono rettangoli)  
      
  Costruttore:  
  	assegnazione punti + calcolo lunghezza e coeffangolare  
  Getter e setter dei vari attributi. (NB: ai setter dei punti va ricalcolato sia la lunghezza che coeffAngolare)  
  
Triangolo  
	Attributi:  
		3 segmenti  
		1 boolean isTriangoloRettangolo  
	Costruttore:  
		i controlli sono:   
 	     Sono i due segmenti adiacenti? ovvero hanno uno dei due estremi in comune?  
	     se si  
 	       assegna l'ipotenusa un nuovo segmento con estremi uguali agli estremi non comuni degli altri cateti  
 	       Questo può portare ad assegnare all'ipotenusa un cateto, onde evitare ciò ho fatto un controllo il quale assegna l'ipotenusa al           cateto più lungo.   
 	     se no  
 	       punti = null	  
