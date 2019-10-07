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
public class OrdenadorPorNome extends OrdenadorTemplate {
 
    @Override
    public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
        if (musica1.nome.compareToIgnoreCase(musica2.nome) <= 0) {
            return true;
        }
        return false;
    }

}