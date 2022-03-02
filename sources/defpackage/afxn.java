package defpackage;

/* renamed from: afxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afxn {
    public static amgp a(aqvr aqvr) {
        if (aqvr.a.isEmpty()) {
            return null;
        }
        amgi amgi = ((aqwr) aqvr.a.get(0)).a;
        if (amgi == null) {
            amgi = amgi.D;
        }
        aucx aucx = amgi.e;
        if (aucx.isEmpty()) {
            return null;
        }
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            amgp amgp = (amgp) aucx.get(i);
            if ((amgp.a & 1) != 0) {
                amgl amgl = amgp.b;
                if (amgl == null) {
                    amgl = amgl.h;
                }
                if (amgl.e) {
                    return amgp;
                }
            }
        }
        return (amgp) aucx.get(0);
    }
}
