package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* renamed from: lzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lzc {
    private static final String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ():[];/.-";
    private char[] b;

    public lzc(String str) {
        Random random = new Random((long) str.hashCode());
        String valueOf = String.valueOf(a);
        String valueOf2 = String.valueOf(str);
        this.b = (valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)).toCharArray();
        ArrayList arrayList = new ArrayList();
        for (char valueOf3 : this.b) {
            arrayList.add(Character.valueOf(valueOf3));
        }
        Collections.shuffle(arrayList, random);
        for (int i = 0; i < arrayList.size(); i++) {
            this.b[i] = ((Character) arrayList.get(i)).charValue();
        }
    }

    public final String a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            if (i >= 0) {
                char[] cArr = this.b;
                if (i < cArr.length) {
                    sb.append(cArr[i]);
                }
            }
        }
        return sb.toString();
    }
}
