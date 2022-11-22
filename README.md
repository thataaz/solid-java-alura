# SOLID Alura

<img src="https://raw.githubusercontent.com/MicaelliMedeiros/micaellimedeiros/master/image/computer-illustration.png" min-width="400px" max-width="400px" width="400px" align="right" alt="Computador iuriCode">

<p align="left"> 
  Repositório do Curso de SOLID com Java: princípios da programação orientada a objetos.
</p>

<p align="left">
  🦄 Linguagens: <strong>Java</strong>
</p>


## O que é SOLID?
SOLID é um acrônimo criado por Michael Feathers, após observar que cinco princípios da orientação a objetos e design de código — Criados por Robert C. Martin (a.k.a. Uncle Bob) e abordados no artigo The Principles of OOD — poderiam se encaixar nesta palavra.

### Princípio da responsabilidade única - (Single-responsibility principle)
![image](https://user-images.githubusercontent.com/59610437/198605603-74f454ea-2284-4785-ab46-c2cb1dc34dc4.png)

### Princípio aberto-fechado (Open–closed principle)
As entidades de classes/módulos/funções devem estar abertas para extensão e fechado para modificação. Com esse principio podemos garantir que as alterações sendo realizadas através de extensão da entidade base nada será afetado no contexto dos códigos que utilizam a classe original.

```
  Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes
```

![image](https://user-images.githubusercontent.com/59610437/198607075-c94e5bb7-788b-43ce-913e-7d2caf5d5f06.png)

### Princípio da substituição de Liskov (Liskov substitution principle)
```
  “As classes derivadas devem ser substituíveis pelas suas classes bases”.
```

Esse é o princípio que traz a ideia de **herança**. Temos uma classe pai, que geralmente possui atributos genéricos e temos uma classe filha, que herda os atributos da classe pai e pode ter outros atributos específicos para si mesma.

![image](https://user-images.githubusercontent.com/59610437/198609212-d0587dca-8d58-4304-806e-4e39af67b103.png)

### Princípio de segregação de Interface (Interface segregation principle)
```
  “Classes não devem ser forçadas a depender de métodos que não usam.” 
```

Esse princípios diz para criar interfaces refinadas e específicas, e essas são melhores que interfaces genéricas. Não devemos ser forçados a depender das interfaces que não iremos utilizar. Esse princípio lida com as desvantagens da implementação de grandes interfaces únicas.

![image](https://user-images.githubusercontent.com/59610437/198610770-acc4a710-e9d4-4bee-a165-c104a06c36c1.png)

### Princípio da inversão de dependência (Dependency inversion principle)
O princípio da inversão de dependência traz a ideia de que:

```
  “Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.”
```

```
  “Abstrações não devem depender de detalhes. Os detalhes devem depender das abstrações.”
```

Os módulos que são classes de alto nível devem depender de conceitos, também chamadas de abstrações independente de como funcionam, ou seja, a função da inversão de dependência faz com que os softwares se desassociem dos módulos.

![image](https://user-images.githubusercontent.com/59610437/198612158-bccf9c63-4f9b-4b37-860a-ee7e30dd9b83.png)

### Resuminho Básico

* É mais seguro e boa prática para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
* As interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
* O Princípio de Inversão de Dependência (DIP) -> implementações devem depender de abstrações e abstrações não devem depender de implementações;
* Interfaces devem definir apenas os métodos que fazem sentido para seu contexto;
* O Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa; (aqui pra mitigar posso colocar a Classe implementando duas Interfaces, por exemplo)

### Referências

[Principios SOLID em Imagens](https://www.marcelogoberto.com.br/2020/08/principios-solid-em-imagens.html)

[SOLID: guia completo sobre os 5 princípios da POO!](https://blog.betrybe.com/linguagem-de-programacao/solid-cinco-principios-poo/)


