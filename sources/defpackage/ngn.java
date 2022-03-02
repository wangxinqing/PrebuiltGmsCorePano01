package defpackage;

import java.io.File;

/* renamed from: ngn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngn {
    public static boolean a(File file) {
        if (file.setExecutable(true, false)) {
            return true;
        }
        ngz.a("FontFileUtils", "can't make %s world executable", file);
        return false;
    }
}
