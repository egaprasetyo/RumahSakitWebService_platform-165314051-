/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.google.gson.Gson;
import helper.HelperPasien;
import java.util.List;
import pojos.Pasien;

/**
 *
 * @author admin
 */
public class TestPasien {
    public static void main(String[] args) {
        HelperPasien test = new HelperPasien();
        List<Pasien> list = test.getAllPasien();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
