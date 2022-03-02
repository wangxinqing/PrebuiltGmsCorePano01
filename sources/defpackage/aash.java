package defpackage;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aash  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aash {
    private static final String[] a = {"/system/bin/su", "/system/xbin/su", "/system/bin/.su", "/system/xbin/.su"};

    static List a() {
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            File file = new File(str);
            aasf aasf = new aasf();
            aasf.a = str;
            aasf.b = file.exists();
            if (file.exists()) {
                try {
                    aasf.c = aann.a(file);
                } catch (IOException | NoSuchAlgorithmException e) {
                    aasf.c = null;
                }
            }
            arrayList.add(aasf);
        }
        return arrayList;
    }
}
