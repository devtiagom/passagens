package domain;

import javax.persistence.*;

@Entity
@Table(name = "produto_destino")
public class ProdutoDestino implements BaseEntity {

    @Id()
    @GeneratedValue(generator = "guia_modalide_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_produto_destino")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_destino")
    private Destino destino;

    public ProdutoDestino() {}

    public ProdutoDestino(Produto produto, Destino destino) {
        this.produto = produto;
        this.destino = destino;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}