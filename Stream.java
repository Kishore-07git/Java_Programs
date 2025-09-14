import java.io.*;
class Stream
{
    public static void main(String args[]) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("sample.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeBoolean(true);
        dos.writeByte(07);
        dos.writeShort(777);
        dos.writeInt(10000);
        dos.writeLong(78463727);
        dos.writeFloat(77.6473f);
        dos.writeDouble(77.7546473d);
        dos.writeChar('k');
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("sample.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readBoolean());
        System.out.println(dis.readByte());
        System.out.println(dis.readShort());
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        System.out.println(dis.readChar());
        dis.close();
        fis.close();
    }
}
