/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author ialima
 */
public abstract class OrdenadorTemplate {
    public abstract boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2);
 
    public ArrayList<MusicaMP3> ordenarMusica(ArrayList<MusicaMP3> lista) {
        ArrayList<MusicaMP3> novaLista = new ArrayList<MusicaMP3>();
        for (MusicaMP3 musicaMP3 : lista) {
            novaLista.add(musicaMP3);
        }
 
        for (int i = 0; i < novaLista.size(); i++) {
            for (int j = i; j < novaLista.size(); j++) {
                if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
                    MusicaMP3 temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }
 
        return novaLista;
    }
}
