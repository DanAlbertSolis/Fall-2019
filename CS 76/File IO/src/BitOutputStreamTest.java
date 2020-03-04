// Dan Albert Solis
// 2/4/2020
// File I/O

import java.io.*;

class BitOutputStream {

    /**
     * Instance variable declarations and initializations
     */
    private int stream = 0;
    private int count = 0;
    private byte mask = 1; //Used with Bitwise OR ( | )
    private FileOutputStream stdin;

    /**
     * Default Constructor
     */
    public BitOutputStream() {

    }

    /**
     * Overloaded constructor that that intializes stdin and throws
     * an IOException if caught
     * @param file
     * @throws IOException
     */
    public BitOutputStream(File file) throws IOException {
        stdin = new FileOutputStream(file);
    }

    /**
     * writeBit method that left shifts the 1 in a bit and if the bit
     * is equal 1, an bitwise OR is used to add it on.
     * @param bit char
     * @throws IOException
     */
    public void writeBit(char bit) throws IOException {
        stream = stream << 1;
        count++;

        if (bit == '1') {
            stream = stream | mask;
        }

        if (count == 8) {
            stdin.write(stream);
            count = 0;
        }

    }

    /**
     * writeBit method that iterates through string char by char
     * and calls writeBit(char x)
     * @param bit String
     * @throws IOException
     */
    public void writeBit(String bit) throws IOException {
        for (int i = 0; i < bit.length(); i++)
            writeBit(bit.charAt(i));
    }

    /**
     * Checks to see if the byte is still "open" and if it is, fills
     * in the rest with zeroes to complete the byte.
     * @throws IOException
     */
    public void close() throws IOException {
        if (count != 0) {
            for (int i = 0; i < (8 - count); i++){
                stream = stream << 1;
            }
        }
        stdin.write(stream);
    }
}

public class BitOutputStreamTest{
    public static void main(String[] args) throws IOException{
        BitOutputStream obj1 = new BitOutputStream(new File("/Users/dans/Desktop/io/testoutput.dat"));
        obj1.writeBit("010000100100001001101");
        obj1.close();


    }

}
