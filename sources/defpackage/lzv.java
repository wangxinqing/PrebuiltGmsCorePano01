package defpackage;

import java.io.File;

/* renamed from: lzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lzv {
    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                a(a);
            }
        }
        return file.delete();
    }
}
