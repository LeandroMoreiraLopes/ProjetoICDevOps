package br.ce.leandro.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.leandro.servicos.CalculadoraTest;
import br.ce.leandro.servicos.CalculoValorLocacaoTest;
import br.ce.leandro.servicos.LocacaoServiceTest;

//@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculoValorLocacaoTest.class,
	LocacaoServiceTest.class
})
public class SuiteExecucao {
	//Remova se puder!
}
