package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: avzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzb {
    private final String[] a;

    public avzb(avza avza) {
        List list = avza.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final avza b() {
        avza avza = new avza();
        Collections.addAll(avza.a, this.a);
        return avza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a2 = a();
        for (int i = 0; i < a2; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public final String a(int i) {
        int i2 = i + i;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.a;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    public final String b(int i) {
        int i2 = i + i + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.a;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }
}
