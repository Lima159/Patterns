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
public class OrdenadorPorEstrela extends OrdenadorTemplate {
 
    @Override
    public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
        if (musica1.estrelas > musica2.estrelas) {
            return true;
        }
        return false;
    }
 
}