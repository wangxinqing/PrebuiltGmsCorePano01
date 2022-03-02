package defpackage;

import java.io.File;

/* renamed from: boq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class boq {
    public static String a(String str, int i) {
        File file = new File(new File(str).getParentFile(), "mx");
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(File.pathSeparator);
            }
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("classes");
            sb2.append(i2 + 2);
            sb2.append(".zip");
            sb.append(new File(file, sb2.toString()).getAbsolutePath());
        }
        return sb.toString();
    }
}
