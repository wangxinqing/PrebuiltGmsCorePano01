package defpackage;

import android.util.Pair;

/* renamed from: xpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xpw {
    public static Pair a(amgi amgi) {
        if (amgi == null) {
            return null;
        }
        if (amgi.d.size() > 0) {
            amfz amfz = (amfz) amgi.d.get(0);
            String str = amfz.e;
            String str2 = amfz.f;
            int i = amfz.a;
            if ((i & 2) != 0) {
                str = amfz.c;
            } else if ((i & 16) == 0) {
                str = str2;
            } else if ((i & 32) != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" ");
                sb.append(str2);
                str = sb.toString();
            }
            return Pair.create(str, 40);
        }
        if (amgi.g.size() > 0) {
            amfm amfm = (amfm) amgi.g.get(0);
            if ((amfm.a & 16) != 0) {
                return Pair.create(amfm.e, 10);
            }
        }
        if (amgi.h.size() > 0) {
            amgo amgo = (amgo) amgi.h.get(0);
            if ((amgo.a & 2) != 0) {
                return Pair.create(amgo.c, 20);
            }
        }
        return null;
    }

    public static String a(amgi amgi, String str) {
        if (!amgi.d.isEmpty()) {
            amfz amfz = (amfz) amgi.d.get(0);
            String str2 = amfz.e;
            String str3 = amfz.f;
            if (!str2.isEmpty() && !str3.isEmpty()) {
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str2).length());
                sb.append(str3);
                sb.append(" ");
                sb.append(str2);
                return sb.toString();
            } else if (!str3.isEmpty()) {
                return str3;
            }
        }
        return str;
    }
}
