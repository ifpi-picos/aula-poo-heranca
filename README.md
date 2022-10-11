# Aula de POO - Herança com Java

## Informações sobre os tipos de funcionários
**Professor**
- nome
- matricula
- titulacao
- salario
- eixo
- *getValorRt()*
- *getSalarioTotal()*

**Técnico**
- nome
- matricula
- titulacao
- salario
- departamento
- *getValorRt()*
- *getSalarioTotal()*

**Diretor**
- nome
- matricula
- titulacao
- salario
- funcao
- gratificacao
- *getValorRt()*
- *getSalarioTotal()*


Calculo da RT
- Professor: Mestre 50% do salário, Doutor 100% do salário, outros 0%;
- Tércnico: Mestre 25% do salário, Doutor 75% do salário, outros 0%;
- Diretor: Mestre 50% do salário, Doutor 50% do salário, outros 0%;

Calculo do Salário total:
- Professor: Salário + RT;
- Tércnico: Salário + RT;
- Diretor: Salário + RT + Gratificação;


## Atividade
Implementar a classe Diretor conforme as informações acima.