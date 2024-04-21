package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDh(7600));
        Compte cp = stub.getCompte();
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());

    }
}