package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: ahyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyp {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static void b(File file) {
        File[] listFiles;
        if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File b : listFiles) {
                    b(b);
                }
            }
            file.delete();
        }
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.exists()) {
            file.delete();
        }
        return file.mkdirs();
    }
}
