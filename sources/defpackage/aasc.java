package defpackage;

import java.util.LinkedHashMap;

/* renamed from: aasc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aasc {
    public static final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);

    static {
        aasc.class.getSimpleName();
    }

    private aasc() {
    }

    public static byte[] a(String str, long j) {
        if (str == null || str.isEmpty() || !a.containsKey(str)) {
            return null;
        }
        aawy aawy = (aawy) a.get(str);
        if (aawy.c == j) {
            return aawy.b.k();
        }
        a.remove(str);
        return null;
    }
}
