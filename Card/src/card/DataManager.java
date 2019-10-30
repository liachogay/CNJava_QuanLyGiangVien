/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author virgin
 */
public class DataManager {
    private static DataManager _Instance;
    
    public static DataManager Instance(){
        if (_Instance == null){
            _Instance= new DataManager();
        }
        return _Instance;
    }
    
    private List<String> _ListUrlImage=Arrays.asList(
            //Kiet
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Cry.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Dance.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Dive.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Draw.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Fish.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Fly.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Hug.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Jump.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Open.PNG",
//            "C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Play.PNG"
            //Trung
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Cry.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Dance.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Dive.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Draw.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Fish.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Fly.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Hug.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Jump.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Open.PNG",
            "E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Play.PNG"
            //Phi
    );
    
    public DataManager(){
        _InitializeRound1();
        _InitializeRound2();
    }
    
    private HashMap<String,String> _ImageToResult = new HashMap<String,String>();
       
    //Chữ để mapping
    private List<String> _Result = new ArrayList<>();
    
    //Chữ -> câu (made by gg translade)
    private HashMap<String,String> _ResultToSentence = new HashMap<String,String>();
    
    //Chữ -> cách phát âm (made by gg translate)
    private HashMap<String,String> _ResultToPronounce = new HashMap<String,String>();
    
    private List<Integer> _ListIndexGot = new ArrayList<>();
    
    private List<String> _ListPronounceRound2 = new ArrayList<>();
    
    //Cách phát âm -> câu ẩn
    private HashMap<String,String> _PronounceToHiddenSentence = new HashMap<String,String>();
    
    //Câu ẩn -> cách phát âm
    private HashMap<String,String> _HiddenSentenceToPronounce = new HashMap<String,String>(); 
    
    
    private void _InitializeRound1(){
        BufferedReader BR = null;
        try {
            //Get file by path file;
            //Kiet
            //File a = new File("C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Data.txt");
            //Trung
            File a = new File("E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Data.txt");
            List<String> TempFile = new ArrayList<>();
            BR = new BufferedReader(new FileReader(a));
            String line=null;
            try {
                while((line = BR.readLine()) != null){
                    TempFile.add(line);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
//            for(int i=0;i<TempFile.size();i++){
//                System.out.println(i+ " " + TempFile.get(i));
//            }
            for(int i=0;i<TempFile.size()-3;i+=3){
                _ImageToResult.put(_ListUrlImage.get(i/3), TempFile.get(i));
                _Result.add(TempFile.get(i));
                _ResultToPronounce.put(TempFile.get(i), TempFile.get(i+1));
                _ResultToSentence.put(TempFile.get(i),TempFile.get(i+2));
            }   
//            for(int i=0;i<_ResultToSentence.size();i++){
//                System.out.println(_Result.get(i) + " " + _ResultToPronounce.get(_Result.get(i))
//                        +  " " + _ResultToSentence.get(_Result.get(i)));
//            }
        } catch (FileNotFoundException ex) {
                ex.printStackTrace();
        } finally {
            try {
                BR.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void _InitializeRound2(){
        //Kiet
        //File file = new File("C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\DataSpaceRound2.txt");
        //Trung
        File file = new File("E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\DataSpaceRound2.txt");
            Scanner sc = null;
            try {
                sc = new Scanner(file);
                String Pronounce = null;
                String HiddenSentence = null;
                while(sc.hasNextLine()){
                    Pronounce = sc.nextLine();
                    if (sc.hasNextLine()){
                        HiddenSentence = sc.nextLine();
                    }
                    _ListPronounceRound2.add(Pronounce);
                    _PronounceToHiddenSentence.put(Pronounce, HiddenSentence);
                    _HiddenSentenceToPronounce.put(HiddenSentence, Pronounce);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Round2.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public int GetSize(){
        return _Result.size();
    }
    
    public String GetUrlImage(int index){
        return _ListUrlImage.get(index);
    }
    
    public String GetResultByImage(String str){
        return _ImageToResult.get(str);
    }
    
    public String GetResult(int index){
        if (index < 0){
            index = -index;
        }
        return _Result.get(index);
    }
    
    public String GetSentenceByResult(String str){
        return _ResultToSentence.get(str);
    }
    
    public String GetPronounceByResult(String str){
        return _ResultToPronounce.get(str);
    }
    
    public List<Integer> GetListIndexGot(){
        return _ListIndexGot;
    }
    
    public void ClearListIndexGot(){
        _ListIndexGot.clear();
    }
    
    public void AddListIndexGot(int index){
        if (index < 0){
            index = -index;
        }
        String str = "";
        for(int i=0;i<_ListIndexGot.size();i++){
            str+= _ListIndexGot.get(i)+" ";
        }
        System.out.println("----------- BEFORE ------------");
        System.out.println(str);
        _ListIndexGot.add(index);
        str += index + " ";
        
        System.out.println("----------- AFTER ------------");
        System.out.println(str);
        
    }
    
    public int GetItemInListIndexGot(int index){
        if (index < 0){
            index = -index;
        }
        return _ListIndexGot.get(index);
    }
    
    public String GetHiddenSentenceByPronounce(String Pronounce){
        return _PronounceToHiddenSentence.get(Pronounce);
    }
    
    public String GetPronounceToHiddenSentence(String HiddenSentence){
        return _HiddenSentenceToPronounce.get(HiddenSentence);
    }
    
    public String GetPronounceByIndexRound2(int index){
        return _ListPronounceRound2.get(index);
    }
}
