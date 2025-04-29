package oop.labor09.exercise2;

public interface IDictionary {
    public String DICTIONARY_FILE = "dictionary.txt";
    public boolean add(String s);
    public boolean find(String s);
    public int size();

}
