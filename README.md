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

![image](https://user-images.githubusercontent.com/59610437/198607075-c94e5bb7-788b-43ce-913e-7d2caf5d5f06.png)

### Princípio da substituição de Liskov (Liskov substitution principle)
```
“As classes derivadas devem ser substituíveis pelas suas classes bases”.
```

Esse é o princípio que traz a ideia de **herança**. Temos uma classe pai, que geralmente possui atributos genéricos e temos uma classe filha, que herda os atributos da classe pai e pode ter outros atributos específicos para si mesma.

![image](https://user-images.githubusercontent.com/59610437/198609212-d0587dca-8d58-4304-806e-4e39af67b103.png)

### Princípio de segregação de Interface (Interface segregation principle)

Esse princípios diz para criar interfaces refinadas e específicas, e essas são melhores que interfaces genéricas. Não devemos ser forçados a depender das interfaces que não iremos utilizar. Esse princípio lida com as desvantagens da implementação de grandes interfaces únicas.

![image](https://user-images.githubusercontent.com/59610437/198610770-acc4a710-e9d4-4bee-a165-c104a06c36c1.png)
