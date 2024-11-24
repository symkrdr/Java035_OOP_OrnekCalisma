package com.seyma;

import com.seyma.entity.*;
import com.seyma.repository.MusteriRepository;
import com.seyma.utility.AracState;
import com.seyma.utility.State;

public class Runner {
    public static void main(String[] args) {
        /**
         * Araç Kiralama
         *
         * --Müşteri
         * --Araç
         * --Marka ve model ayrı entity
         * -Firma (Kiralama yapan firma
         * --Bakım

         */
       // Arac arac = new Arac("06ss",4,"Mavi", AracState.KIRALANABILIR, State.ACTIVE,"Corolla","Toyota");
       // AracRepository aracRepository = new AracRepository();
       // aracRepository.save(arac);
       // System.out.println(arac);

        Musteri musteri= new Musteri("Ahmet Yılmaz","506 765 45 33","ahmet@gmail.com", State.PASSIVE);
        MusteriRepository musteriRepository = new MusteriRepository();
        musteriRepository.save(musteri);
        System.out.println(musteri);

        /**
         * 1-Kirada olan araçlar hangileri?
         * 2-Müsait olan ,kirada olmayan ve arıza olmayan araçlar?
         * 3-bugün kiradan dönecek araçlar?
         * 4-ahmet adındaki mstr hangi aracı kiraladı?
         *
         */

        Firma firma = new Firma("Ankara",5064222);
        System.out.println(firma);

        Arac Firma;
        Kiralama kiralama = new Kiralama("12.02.2024","21.02.2024",musteri,AracState.KIRALANMIS,firma);








    }





}