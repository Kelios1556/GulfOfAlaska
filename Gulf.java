import java.util.*;
import java.io.*;
import java.nio.*;
import java.awt.Color;

public class Gulf {
    private static final ArrayList<Pattern> patterns;
    private static final String name;
    private static final int WID;
    private static final int LEN;

    private static final File CWD = new File(System.getProperty("user.dir"));
    private static final File Gulfs = Paths.get(CWD.getPath(), "gulfs").toFile();

    public Gulf(String name, int wid, int len) {
        this.name = name;
        this.WID = wid;
        this.LEN = len;
    }

    public static List<Pattern> painting() {
        return null;
    }

    public static Gulf load(String name) throws IOException {
        File target = Paths.get(Gulfs.getPath(), name).toFile();
        Gulf gulf;
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(target));
        gulf = (Gulf) input.readObject();
        input.close();
        return gulf;
    }

    public void save() throws IOException {
        File toFile = Paths.get(Gulfs.getPath(), this.name).toFile();
        if (!toFile.exists()) {
            toFile.createNewFile();
        }
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(toFile));
        output.writeObject(this);
        output.close();
    }

}
