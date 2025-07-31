class FIndPrefixinArray {
    public int Findprefix(String[] words, String prefs) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(prefs)) {
                //System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = { "atlantic", "atmosphere", "atom", "atomizer", "aat" };
        String prefs = "at";
        FIndPrefixinArray fpa = new FIndPrefixinArray();
        int count = fpa.Findprefix(words, prefs);
        System.out.println("Total words starting with prefix '" + prefs + "': " + count);
    }
}
