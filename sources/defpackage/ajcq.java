package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: ajcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajcq implements FileFilter {
    public final boolean accept(File file) {
        if (file.isFile()) {
            String name = file.getName();
            int length = name.length();
            int i = 0;
            while (i < length) {
                if (Character.isDigit(name.charAt(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
