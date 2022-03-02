package defpackage;

import android.util.SparseArray;

/* renamed from: guc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class guc extends gtw {
    private static final SparseArray b = new gua();
    private static final SparseArray c = new gub();

    public final int a() {
        return 0;
    }

    public final byte[] a(gti gti) {
        return null;
    }

    public final boolean c() {
        return false;
    }

    public final String d(gti gti) {
        String str;
        byte[] a = gti.a(gtw.a);
        if (a == null || a.length <= 2 || (str = (String) b.get(a[2])) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 3; i < a.length; i++) {
            String str2 = (String) c.get(a[i]);
            if (str2 != null) {
                sb.append(str2);
            } else {
                byte b2 = a[i];
                if (b2 <= 32 || b2 >= Byte.MAX_VALUE) {
                    return null;
                }
                sb.append((char) b2);
            }
        }
        return sb.toString();
    }

    public final Integer a(int i) {
        return Integer.valueOf(i);
    }
}
