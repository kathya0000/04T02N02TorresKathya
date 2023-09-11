package cat.itacademy.barcelonactiva.torrres.kathya.s04.t02.n02.T02N02TorresKathya.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="fruta")
@Getter
@Setter
public class FrutaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre;
    @Column
    private int pesoKg;
}