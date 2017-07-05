package com.example.user.listview_arrayadapter;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class UKChart {

    private ArrayList<Song> list;

    public UKChart() {
        list = new ArrayList<Song>();
        list.add(new Song(1, "BROWS ON FLEEK", "MC BROOSEY"));
        list.add(new Song(2, "WILD THOUGHTS", "DJ KHALED FT RIHANNA/TILLER"));
        list.add(new Song(3, "BRIDGE OVER TROUBLED WATER", "ARTISTS FOR GRENFELL"));
        list.add(new Song(4, "UNFORGETTABLE", "FRENCH MONTANA FT SWAE LEE"));
        list.add(new Song(5, "MAMA", "JONAS BLUE FT WILLIAM SINGE"));
        list.add(new Song(6, "STRIP THAT DOWN", "LIAM PAYNE FT QUAVO"));
        list.add(new Song(7, "I'M THE ONE", "DJ KHALED/BIEBER/QUAVO/CHANCE"));
        list.add(new Song(8, "2U", "DAVID GUETTA FT JUSTIN BIEBER"));
        list.add(new Song(9, "POWER", "LITTLE MIX"));
        list.add(new Song(10, "YOUR SONG", "RITA ORA"));
    }

        public ArrayList<Song> getList(){
            return new ArrayList<Song>(list);
        }

    }
