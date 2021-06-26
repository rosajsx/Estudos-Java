## Enumerações

- É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
 <br></br>
- Palavra chave em Java: enum <br></br>
- Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador   <br></br>


Exemplo:

Suponha que tu tenha um sistema de comercio e seus pedidos tem um ciclo de vida.

Um pedido feito pode estar em:

- Pagamento pendente -> Processando -> Enviado -> Entregue

Para declarar isso de forma semântica em java é possivel uitlizar ENUM.

```java
package entities.enums;

public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
```


## Categorias de classes
- Em um sistema orientado a objetos, de modo geral "tudo" é objeto. 
  
Por questões de design tais como organização, flexibilidade, reuso, delegação, etc. há varias categorias de classes:
- Views -> Telas do sistema
- Controllers -> Midleware entre a tela e o sistema
- Entities -> Entidades de negócio de um sistema
- Services -> Serviços
- Repositories -> Objetos responsaveis por acessar um banco de dados ou repositório de dado qualquer.


## Composição
* É um tipo de associação que permite que um objeto contenha outro 
* Relação "tem-um" ou "tem-vários"

- Vantagens:
   * Organização: divisão de responsabilidades
   * Coesão -> Cada objeto é responsavel por uma unica coisa.
   * Flexibilidade
   * Reuso
 
- Nota: Embora o símbolo UML para composição (todo-parte) seja o diamente preto, neste contexto estamos chamando de composição qualquer associação topo "tem-um" e "tem-varios".