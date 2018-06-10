/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;
public class AlmacenInformacion {
    
    String titulo;
    String autor;
    String copyright;
    int ancho;
    int alto;
    String pistasHorizontales;
    String pistasVerticales;
    char [][] cruzi = {{'.',' ',' ',' ',' ','T',' ',' ',' ','.','P',' ',' ',' ',' '},
                       {'.',' ',' ',' ',' ',' ',' ',' ',' ','.',' ','B',' ',' ',' '},
                       {'.','W','T','B',' ',' ',' ','T',' ','.',' ',' ',' ',' ',' '},
                       {'.','S',' ','A',' ',' ',' ',' ',' ','.',' ',' ','.',' ',' '},
                       {' ',' ',' ',' ','G',' ',' ',' ',' ','.',' ',' ','P',' ',' '},
                       {'.',' ','O',' ','A','T',' ',' ',' ','.',' ',' ','E',' ','.'},
                       {' ','.',' ',' ','N',' ',' ','G','.',' ',' ',' ','R',' ','C'},
                       {' ',' ','.',' ','Z',' ',' ','.',' ',' ',' ',' ','R',' ','A'},
                       {' ',' ',' ','.','O',' ','.',' ',' ',' ',' ',' ','A',' ','S'},
                       {'C','O','B','A','L','L','A','.',' ',' ',' ',' ','.',' ','A'},
                       {' ',' ',' ',' ','.','.',' ',' ',' ',' ',' ',' ',' ',' ','.'},
                       {' ',' ',' ','.',' ',' ','.',' ',' ',' ',' ',' ',' ',' ','.'},
                       {' ',' ','.',' ',' ',' ',' ','.',' ',' ',' ',' ',' ',' ','.'},
                       {' ','.',' ',' ',' ',' ',' ',' ','.',' ',' ',' ',' ',' ','.'},
                       {'.',' ',' ',' ',' ',' ',' ','.',' ','.',' ',' ',' ',' ','.'}
       
    };
public void informacion()
{
    titulo = "Crucigrama nuevo";
    autor = "Juan jose";
    copyright = "2018";
    ancho = 15;
    alto = 15;
}
    
}