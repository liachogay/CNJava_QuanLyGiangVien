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
    
    public class DataRound3{
        private String _Adjective;
        private String _Noun;
        private String _Verb;
        private String _SentenceAdjective;
        private String _SentenceNoun;
        private String _SentenceVerb;
        
        public DataRound3(){
            _Adjective="";
            _Noun="";
            _Verb="";
            _Verb="";
            _SentenceAdjective="";
            _SentenceNoun="";
            _SentenceVerb="";
        }

        public DataRound3(String Adj,String Noun,String Verb,
                String SentenceAdj,String SentenceNoun,String SentencVerb){
            _Adjective=Adj;
            _Noun=Noun;
            _Verb=Verb;
            _SentenceAdjective=SentenceAdj;
            _SentenceNoun=SentenceNoun;
            _SentenceVerb=SentencVerb;
        }
        public DataRound3(DataRound3 obj){
            _Adjective=obj.GetAdjective();
            _Noun=obj.GetNoun();
            _Verb=obj.GetVerb();
            _SentenceAdjective=obj.GetAdjective();
            _SentenceNoun=obj.GetSentenceNoun();
            _SentenceVerb=obj.GetSentenceVerb();
        }
        
        
        public void Replace(DataRound3 Obj){
            _Adjective=Obj.GetAdjective();
            _Noun=Obj.GetNoun();
            _Verb=Obj.GetVerb();
            _SentenceAdjective=Obj.GetSentenceAdjective();
            _SentenceNoun=Obj.GetSentenceNoun();
            _SentenceVerb=Obj.GetSentenceVerb();
        }
        
        public String GetAdjective(){
            return _Adjective;
        }
        public void SetAdjective(String Adj){
            _Adjective = Adj;
        }
        public String GetNoun(){
            return _Noun;
        }
        public void SetNoun(String Noun){
            _Noun = Noun;
        }
        public String GetVerb(){
            return _Verb;
        }
        public void SetVerb(String Verb){
            _Verb = Verb;
        }
        public String GetSentenceAdjective(){
            return _SentenceAdjective;
        }
        public void SetSentenceAdjective(String SentenceAdjective){
            _SentenceAdjective = SentenceAdjective;
        }
        public String GetSentenceNoun(){
            return _SentenceNoun;
        }
        public void SetSentenceNoun(String SentenceNoun){
            _SentenceNoun = SentenceNoun;
        }
        public String GetSentenceVerb(){
            return _SentenceVerb;
        }
        public void SetSentenceVerb(String SentenceVerb){
            _SentenceVerb = SentenceVerb;
        }
    };
    
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
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Cry.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Dance.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Dive.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Draw.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Fish.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Fly.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Hug.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Jump.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Open.PNG",
//            "/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Play.PNG"
   
            
    );
    
    public DataManager(){
        _InitializeRound1();
        _InitializeRound2();
        _InitializeRound3();
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
    
    private List<DataRound3> _ListDataRond3 = new ArrayList<>();
    
    private HashMap<String,String> _AdjToSentence = new HashMap<String,String>();
    
    private HashMap<String,String> _NounToSentence = new HashMap<String,String>();
    
    private HashMap<String,String> _VerbToSentence = new HashMap<String,String>();
    
    private int _Score  = 0;
    
    private void _InitializeRound1(){
        BufferedReader BR = null;
        try {
            //Get file by path file;
            //Kiet
            //File a = new File("C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Data.txt");
            //Trung
            File a = new File("E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\Data.txt");
            //Phi
//            File a = new File("/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/Data.txt");
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
        //Phi
//        File file = new File("/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/DataSpaceRound2.txt");
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
    
    private void _InitializeRound3(){
        //Kiet
        //File file = new File("C:\\Users\\ASUS\\Desktop\\Project_HCMUE\\CNJava_QuanLyGiangVien\\Card\\src\\card\\DataRound3.txt");
        //Trung
        File file = new File("E:\\tool\\GitKraken\\CNJava_QuanLyGiangVien\\Card\\src\\card\\DataRound3.txt");
        //Phi
//        File file = new File("/Users/virgin/Desktop/CNJava_QuanLyGiangVien/Card/src/card/DataRound3.txt");
            Scanner sc = null;
            try {
                sc = new Scanner(file);
                while(sc.hasNextLine()){
                    DataRound3 Temp = new DataRound3();
                    String Adj = null;
                    String Noun = null;
                    String Verb = null;
                    String SentenceAdj = null;
                    String SentenceNoun = null;
                    String SentenceVerb = null;
                    if (sc.hasNextLine()){
                        Adj = sc.nextLine();
                        Noun = sc.nextLine();
                        Verb = sc.nextLine();
                        SentenceAdj = sc.nextLine();
                        SentenceNoun = sc.nextLine();
                        SentenceVerb = sc.nextLine();
                    }
                    Temp.SetAdjective(Adj);
                    Temp.SetNoun(Noun);
                    Temp.SetVerb(Verb);
                    Temp.SetSentenceAdjective(SentenceAdj);
                    Temp.SetSentenceNoun(SentenceNoun);
                    Temp.SetSentenceVerb(SentenceVerb);
                    _AdjToSentence.put(Adj, SentenceAdj);
                    _NounToSentence.put(Noun, SentenceNoun);
                    _VerbToSentence.put(Verb,SentenceVerb);
                    _ListDataRond3.add(Temp);
//                    _PronounceToHiddenSentence.put(Pronounce, HiddenSentence);
//                    _HiddenSentenceToPronounce.put(HiddenSentence, Pronounce);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Round2.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i=0;i<_ListDataRond3.size();i++){
                System.out.println(_ListDataRond3.get(i).GetAdjective());
                System.out.println(_ListDataRond3.get(i).GetNoun());
                System.out.println(_ListDataRond3.get(i).GetVerb());
                System.out.println(_ListDataRond3.get(i).GetSentenceAdjective());
                System.out.println(_ListDataRond3.get(i).GetSentenceNoun());
                System.out.println(_ListDataRond3.get(i).GetSentenceVerb());
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
    public void setScore(int score){
        this._Score = score;
    }
    public int getScore(){
        return this._Score;
    }
    
    public DataRound3 GetDataRound3ByIndex(int index){
        return _ListDataRond3.get(index);
    }
    
    public int GetSizeDataRound3(){
        return _ListDataRond3.size();
    }
    
    public String GetSentenceAdj(String adj){
        return _AdjToSentence.get(adj);
    }
    
    public String GetSentenceNoun(String noun){
        return _NounToSentence.get(noun);
    }
    
    public String GetSentenceVerb(String verb){
        return _VerbToSentence.get(verb);
    }
}
