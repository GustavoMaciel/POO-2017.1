/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author gmnun
 */
public class FuncionarioJaExisteException extends Exception{
    public FuncionarioJaExisteException(String m){
        super(m);
    }
}
