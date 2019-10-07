/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ialima
 */
public class MusicaMP3 {
    String nome;
    String autor;
    String ano;
    int estrelas;
 
    public MusicaMP3(String nome, String autor, String ano, int estrela) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.estrelas = estrela;
    }
}