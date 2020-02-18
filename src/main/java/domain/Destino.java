package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "destino")
public class Destino implements BaseEntity{

    @Id()
    @GeneratedValue(generator = "destino_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_destino")
    private Long id;

    @Column(name = "nome")
    private String name;

    @OneToMany(mappedBy = "destino")
    private List<ProdutoDestino> produtoDestinoList;

    public Destino() {
    }

    public Destino(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idModalidade) {
        this.id = idModalidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<GuideModality> getGuideModalityList() {
//        return guideModalityList;
//    }
//
//    public void setGuideModalityList(List<GuideModality> guideModalityList) {
//        this.guideModalityList = guideModalityList;
//    }


    @Override
    public String toString() {
        return "Destino{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
