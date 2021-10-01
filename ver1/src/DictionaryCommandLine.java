public class DictionaryCommandLine {

    DictionaryManagement dicM = new DictionaryManagement();

    /**
     * Contructor.
     */
    public DictionaryCommandLine() {
    }

    /**
     * getter, setter DicM
     */
    public DictionaryManagement getDicM() {
        return dicM;
    }

    public void setDicM(DictionaryManagement dicM) {
        this.dicM = dicM;
    }

    /**
     * Ham in
     */
    public void showAllWords(Dictionary dic) {
        //System.out.println(dic.getCount_word());
        System.out.format("%-10s %-20s %-20s \n", "No", "| English", "| VietNamese");
        for (int i = 0; i < dic.getCount_word(); i++) {
            System.out.format("%-10s %-20s %-20s \n",
                    i,
                    dic.getWord(i).getWord_target(),
                    dic.getWord(i).getWord_explain());
        }

    }

    /**
     * Hàm có chức năng gọi hàm insertFromCommandline() và showAllWords().
     */
    public void dictionaryBasic() {
        dicM.insertFromCommandline();
        showAllWords(dicM.getDic());
    }

    /**
     * Hàm có chức năng gọi hàm insertFromFile, showAllWords() và dictionaryLookup().
     */
    public void dictionaryAdvanced() {
        dicM.insertFromFile();
        showAllWords(getDicM().dic);
        dicM.dictionaryLookup();
    }

}
