/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;



/**
 *
 * @author 182120050
 */
public class ServicosFactory {
    public static  PessoaServicos pessoaS= new PessoaServicos();
    public static  CarroServicos carroS= new CarroServicos();
    
    public static PessoaServicos getPessoaServicos(){
    return pessoaS;
        
    }
    public static CarroServicos getCarrosServicos(){
       return carroS;
    }
}
