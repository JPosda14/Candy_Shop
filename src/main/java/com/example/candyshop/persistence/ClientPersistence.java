package com.example.candyshop.persistence;

import com.example.candyshop.models.Client;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ClientPersistence {
    public static final String RUTE_ARCHIVE_CLIENT = "C:\\Users\\Asus\\Documents\\Semestre III\\Programación II\\candyShop\\candyShop\\src\\main\\java\\com\\example\\candyshop\\persistencedta\\clients.txt";

    public static void saveClient(HashSet<Client>clients) throws IOException{
        String contenido="";
        for(Client client: clients){
            contenido+= client.getName() +"/"+client.getId()+"/"+client.getPassword()+"\n";
    }
        ArchiveUtil.saveArchive(RUTE_ARCHIVE_CLIENT,contenido,false);
}
    public static HashSet<Client>loadClient() throws FileNotFoundException, IOException{
        HashSet<Client>clients=new HashSet<Client>();
        System.out.println(ArchiveUtil.readArchive(RUTE_ARCHIVE_CLIENT).toString());
        System.out.println("sos");
        ArrayList<String> content = ArchiveUtil.readArchive(RUTE_ARCHIVE_CLIENT);
        String line = "";
        for (int i= 0;i<content.size();i++){
            Client client= new Client();
            line= "";
            client.setName(line.split("/")[0]);
            client.setPassword(line.split("/")[1]);
            client.setId(Integer.parseInt(line.split("/")[2]));
            clients.add(client);
        }return clients;
    }
}
