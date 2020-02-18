package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "produto")
public class Produto implements BaseEntity{

    @Id()
    @GeneratedValue(generator = "produto_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_produto")
    private Long id;

    @Column(name = "modalidade")
    private String modality;

    @OneToMany(mappedBy = "produto")
    private List<ProdutoDestino> produtoDestinoList;

    public Produto() {
    }

    public Produto(String modality) {
        this.modality = modality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idModalidade) {
        this.id = idModalidade;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
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
        return "Produto{" +
                "id=" + id +
                ", modality='" + modality + '\'' +
                '}';
    }
}
