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


