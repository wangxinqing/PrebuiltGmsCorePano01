package defpackage;

import java.util.Comparator;
import java.util.List;

/* renamed from: bmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bmy {
    public static final Comparator a = bmw.a;
    public static final Comparator b = bmx.a;
    public static final bpw c = bpw.a(a);

    static {
        bpw.a(b);
    }

    public static int a(ansk ansk, ansk ansk2, boolean z) {
        amya a2 = amya.b.a((Comparable) ansk.b, (Comparable) ansk2.b).a(ansk.e, ansk2.e);
        if (z) {
            amya a3 = a2.a(ansk.f.size(), ansk2.f.size());
            int i = 0;
            while (i < ansk.f.size() && i < ansk2.f.size()) {
                a3 = a3.a((Comparable) (String) ansk.f.get(i), (Comparable) (String) ansk2.f.get(i));
                i++;
            }
            a2 = a3;
        }
        return a2.a();
    }

    public static String a(ansk ansk) {
        StringBuilder sb = new StringBuilder();
        a(ansk, sb);
        return sb.toString();
    }

    public static String a(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            a((ansk) list.get(i), sb);
        }
        return sb.toString();
    }

    private static void a(ansk ansk, StringBuilder sb) {
        sb.append(ansk.b);
        sb.append(':');
        sb.append(ansk.e);
        aucx aucx = ansk.f;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            sb.append('+');
            sb.append((String) aucx.get(i));
        }
    }

    public static boolean a(bpw bpw, bpw bpw2) {
        if (!bpw.a.equals(bpw2.a) || bpw.size() != bpw2.size()) {
            return false;
        }
        for (int i = 0; i < bpw.size(); i++) {
            if (bpw.a.compare(bpw.get(i), bpw2.get(i)) != 0) {
                return false;
            }
        }
        return true;
    }
}
