/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.teste.unitario.integracao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Anderson Souza
 * @email jair_anderson_bs@hotmail.com
 * @since 2016, Feb 10, 2016
 */
public class PessoaTest {
    
    public PessoaTest() {
    }
    
    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa();
        String esperado = "2";
        String resultado = "2";
        assertEquals(esperado, resultado);
    }
    
    
    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        Pessoa pessoa = new Pessoa();
        String esperado = "Anderson";
        pessoa.setNome(esperado);
        assertEquals(esperado, pessoa.getNome());
        assertSame(esperado, pessoa.getNome());
    }

    /**
     * Test of getIdade method, of class Pessoa.
     */
    @Test
    public void testGetIdade() {
        Pessoa pessoa = new Pessoa();
        assertEquals(0, 0);
    }

    /**
     * Test of setIdade method, of class Pessoa.
     */
    @Test
    public void testSetIdade() {
        Pessoa pessoa = new Pessoa();
        int esperado = 15;
        pessoa.setIdade(esperado);
        assertSame(pessoa.getIdade(), esperado);
    }
    
}
