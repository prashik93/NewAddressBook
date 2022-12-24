package com.addressbooksystem;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AddressBookJson {
    public static void main(String[] args) throws IOException {
        AddressBookJson jsonAddressBook = new AddressBookJson();
        //jsonAddressBook.readFromJsonFile();
        //jsonAddressBook.writeInJsonFile();
    }

    public void readFromJsonFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\Projects\\intellijProjects\\AddressBookSystem\\src\\AddressBookContactDetails.json"));
            Map<String, List<ContactDetails>> map = new Gson().fromJson(
                    br, new TypeToken<HashMap<String, List<ContactDetails>>>() {}.getType()
            );
            map.forEach((k, v) -> {
                System.out.println(k);
                v.forEach(System.out::println);
            });
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public void writeInJsonFile() {
        final String outputFilePath = "E:\\Projects\\intellijProjects\\AddressBookSystem\\src\\AddressBookContactDetails.json";

        try{
            File file = new File(outputFilePath);
            FileWriter writer = new FileWriter(file);
            Gson gson = new Gson();
            gson.toJson(MultipleAddressBook.addressBookMap, writer);
            writer.close();
            System.out.println("Data Added Successfully...");
        }catch(IOException e){
            e.printStackTrace();
        }
    }*/

    /*public void writeInJsonFile() throws IOException {

        BufferedWriter br = new BufferedWriter(new FileWriter("E:\\Projects\\intellijProjects\\AddressBookSystem\\src\\AddressBookContactDetails.json"));
        Map<String, List<ContactDetails>> map = new Gson().fromJson(
                br.toString(), new TypeToken<HashMap<String, List<ContactDetails>>>() {}.getType()
        );

        MultipleAddressBook multipleAddressBook = new MultipleAddressBook();
        multipleAddressBook.addMultipleAddressBook();
        Gson gson = new Gson();

        String json = gson.toJson(br, (Type) map);
        try {
            FileWriter writer = new FileWriter("E:\\Projects\\intellijProjects\\AddressBookSystem\\src\\AddressBookContactDetails.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }*/
}
