

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
//teste
@Path("Class1")
public class Partida {
    
    Joguinho jogo = new Joguinho();
    String[][] m1 = { {"1","2","3"},{"4","5","6"},{"7","8","9"} };
    
    @GET    
    @Path("Iniciar")
    public String Iniciar(@QueryParam("valor")String valor){
        String x1 = jogo.Validaa(valor);
        if(x1 == "número inválido"){
            return "Jógada inválida";           
        }
        jogo.Jodada(valor); 
        //jogo.QuemGanhou();
        String x = jogo.QuemGanhou();
        if(x != "Jogador 1 venceu" && x != "Jogador 2 venceu" && x != "ngm ganhou"){
            return jogo.Mostrar();
        }else{
            return jogo.Mostrar() + " " + x;       
        }       
    }
    
    @GET    
    @Path("Reiniciar")
    public String Reiniciar(){
       String l = "";
       for(int i =0;i <3;i++){
          for(int j =0;j <3;j++){               
              l = l + "  " + (m1[i][j]);
          }
          l = l + "<br>" + "</br> ";
      }
       return l;
     }
    
}
