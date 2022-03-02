package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: apnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apnd {
    public static apli a(Status status, String str) {
        iva.a((Object) status);
        String str2 = status.j;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        int i = status.i;
        if (i == 17510) {
            return new aplk(str);
        }
        if (i == 17511) {
            return new aplr(str);
        }
        if (i == 17602) {
            return new aplp(str);
        }
        switch (i) {
            case 17513:
                return new aplj(str);
            case 17514:
                return new aplh(str);
            case 17515:
                return new aplq(str);
            case 17516:
                return new aplo(str);
            case 17517:
                return new apln(str);
            case 17518:
                return new apll(str);
            case 17519:
                return new aplm(str);
            default:
                return new apli(str);
        }
    }

    public static String a(String str) {
        int i = 20000;
        if (str.length() <= 20000) {
            return str;
        }
        if (Character.isHighSurrogate(str.charAt(19999)) && Character.isLowSurrogate(str.charAt(20000))) {
            i = 19999;
        }
        return str.substring(0, i);
    }
}
