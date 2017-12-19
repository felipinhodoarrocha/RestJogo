/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Joguinho {
    
    //Tabela
    static String[][] m = { {"1","2","3"},{"4","5","6"},{"7","8","9"} };
    //Variavel pra contar e definir simbolos do usuário
    static int jogada = 0;
    //Array de lances vitoriosos
    static String [] T = new String[8];
    //Vai guardar o simbolo x ou o
    static String simbolo = " ";
    
    public String Jodada(String posicao){
        String l = " ";
        
        if(jogada % 2 == 0){
            simbolo = "x"; 
        }else if(jogada % 2 != 0){
            simbolo = "0";
        }
        
        if(posicao.equals("1")){
            m[0][0] = simbolo;
        }else if(posicao.equals("2")){
            m[0][1] = simbolo;
        }else if(posicao.equals("3")){
            m[0][2] = simbolo;
        }else if(posicao.equals("4")){
            m[1][0] = simbolo;
        }else if(posicao.equals("5")){
            m[1][1] = simbolo;
        }else if(posicao.equals("6")){
            m[1][2] = simbolo;
        }else if(posicao.equals("7")){
            m[2][0] = simbolo;
        }else if(posicao.equals("8")){
            m[2][1] = simbolo;
        }else if(posicao.equals("9")){
            m[2][2] = simbolo;
        }
        jogada++;
        return l = " ";
    }
    
    public String Mostrar(){
       String l = "";
       for(int i =0;i <3;i++){
          for(int j =0;j <3;j++){               
              l = l + "  " + (m[i][j]);
          }
          l = l + "<br>" + "</br> ";
      }
       return l;
        
    }
    public String QuemGanhou(){
        
        String [] T = new String[8];
        String vencedor = null;
        //linha
        T[0] = m[0][0] + m[0][1] + m[0][2];
        T[1] = m[1][0] + m[1][1] + m[1][2];
        T[2] = m[2][0] + m[2][1] + m[2][2];
        //coluna
        T[3] = m[0][0] + m[1][0] + m[2][0];
        T[4] = m[0][1] + m[1][1] + m[2][1];
        T[5] = m[0][2] + m[1][2] + m[2][2];
        //Diagonal
        T[6] = m[0][0] + m[1][1] + m[2][2];
        T[7] = m[0][2] + m[1][1] + m[2][0];
        
        for(int i = 0; i < T.length;i++){
            if(T[i].equals("xxx")){
                vencedor = "Jogador 1 venceu";
            }else if(T[i].equals("000")){
                vencedor = "Jogador 2 venceu";
            }else if (jogada >=9 ){
                vencedor = "ngm ganhou";
            }   
        }              
        return vencedor;
     
    }
    public String Validaa(String p){
 
        if(!p.equals("9") && !p.equals("8") && !p.equals("7") && !p.equals("6") 
                && !p.equals("5") && !p.equals("4") && !p.equals("3") && !p.equals("2")
                && !p.equals("1")){
            p = "número inválido";
        }
        return p ;
    }
  
    public static int getJogada() {
        return jogada;
    }

    public static String getSimbolo() {
        return simbolo;
    }
    
}
