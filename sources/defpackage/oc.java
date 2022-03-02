package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: oc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oc {
    public final File a;
    public final File b;

    public oc(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public static void a(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
        }
    }
}
