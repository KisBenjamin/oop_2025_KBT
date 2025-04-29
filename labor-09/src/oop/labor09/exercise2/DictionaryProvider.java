package oop.labor09.exercise2;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType dtype) {
        switch (dtype) {
            case ARRAY_LIST:
                return ArrayListDictionary.newInstance();
            // case TREE_SET:
            //     return TreeSetDictionary.newInstance();
            // case HASH_SET:
            //     return HashSetDictionary.newInstance();
            default:
                return null;
        }
    }
}