package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: lyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lyz {
    public static final int[] a = {222, 102, 196, 157, 211, 196, 204, 224, 186, 202, 183, 38, 201, 205, 206, 102, 202, 215, 117, 195, 133, 102, 183, 182, 117};
    public static final int[] b = {210, 102, 203, 222, 196, 157, 196, 219, 186, 183, 38, 216, 210, 102, 117, 218, 195, 210, 133, 217, 102, 219, 183, 182, 117, 224, 208, 102, 183, 182, 214, 217, 117, 181, 203, 188, 37, 228, 218, 182};
    public static final int[] c = {211, 127, 4, 204, 206, 222, 197, 19, 53};
    public static final int[] d = {205, 221, 102, 217, 176, 206, 183, 149, 192, 190, 154, 214, 201, 213, 102, 209, 117, 195, 133, 102, 212, 203, 213, 183, 182, 117};
    private static final int[] f = {102};
    final lzc e;

    public lyz(lzc lzc) {
        this.e = lzc;
    }

    public final void a(String str, List list) {
        File file = new File(str);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles(new lyy())) {
                String name = file2.getName();
                String a2 = this.e.a(f);
                long length = file2.length();
                String a3 = this.e.a(f);
                String a4 = jkg.a(file2, this.e.a(c));
                int length2 = String.valueOf(name).length();
                StringBuilder sb = new StringBuilder(length2 + 20 + String.valueOf(a2).length() + String.valueOf(a3).length() + String.valueOf(a4).length());
                sb.append(name);
                sb.append(a2);
                sb.append(length);
                sb.append(a3);
                sb.append(a4);
                list.add(sb.toString());
            }
        }
    }
}
