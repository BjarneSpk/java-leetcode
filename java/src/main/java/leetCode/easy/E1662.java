package leetCode.easy;

public class E1662 {
    public boolean arrayStringsAreEqual( String[] word1, String[] word2 ) {

        StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();

        for ( String s : word1 ) {
            sb1.append( s );
        }
        for ( String s : word2 ) {
            sb2.append( s );
        }

        return sb1.toString().contentEquals( sb2 );
    }
}
