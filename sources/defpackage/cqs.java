package defpackage;

import android.util.Base64;
import java.io.File;

/* renamed from: cqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqs {
    public static String a(String str) {
        int i;
        int i2;
        byte[] decode = Base64.decode(str, 11);
        int length = decode.length;
        char[] cArr = new char[(length + length)];
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte b = decode[i3];
            int i5 = (b >> 4) & 15;
            int i6 = i4 + 1;
            if (i5 >= 10) {
                i = i5 + 87;
            } else {
                i = i5 + 48;
            }
            cArr[i4] = (char) i;
            byte b2 = b & 15;
            int i7 = i6 + 1;
            if (b2 >= 10) {
                i2 = b2 + 87;
            } else {
                i2 = b2 + 48;
            }
            cArr[i6] = (char) i2;
            i3++;
            i4 = i7;
        }
        return new String(cArr);
    }

    public static void a(File file) {
        if (file.exists() && !file.delete() && file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String file2 : list) {
                    a(new File(file, file2));
                }
            }
            if (file.delete()) {
            }
        }
    }
}
