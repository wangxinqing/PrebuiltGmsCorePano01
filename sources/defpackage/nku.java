package defpackage;

/* renamed from: nku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nku {
    public static final amkz a;
    private static final amsv b;
    private static volatile amsv c;

    static {
        amkz a2 = new amlb().a();
        a = a2;
        amsv a3 = amta.a((Object) a2);
        b = a3;
        c = a3;
    }

    public static amkv a(nih nih) {
        return a(nih, false);
    }

    public static nih b() {
        njx c2 = c();
        if (c2 == null) {
            return null;
        }
        amri amri = c2.b;
        if (!amri.a() || (((barb) amri.b()).a & 32) == 0) {
            return null;
        }
        nih nih = ((barb) amri.b()).b;
        return nih == null ? nih.f : nih;
    }

    public static njx c() {
        amks a2 = amlv.a(ammb.a);
        if (a2.b()) {
            return (njx) a2.a();
        }
        return null;
    }

    public static amkv a(nih nih, boolean z) {
        aucf aucf = (aucf) barb.c.o();
        if (nih != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            barb barb = (barb) aucf.b;
            nih.getClass();
            barb.b = nih;
            barb.a |= 32;
        }
        njx njx = new njx(z, (barb) aucf.i());
        amku amku = new amku(amku.a, new ou());
        amkt amkt = ammb.a;
        amrl.b(!amku.c, (Object) "Can't mutate after handing to trace");
        amrl.a((Object) njx);
        amrl.b(!amku.a(amkt), (Object) "Key already present");
        amku.b.put(amkt, njx);
        return amku.a();
    }

    public static amkz a() {
        return (amkz) ((amsz) c).a;
    }

    static synchronized void a(amsv amsv) {
        synchronized (nku.class) {
            iva.a(c == b, (Object) "Duplicate init");
            c = amsv;
        }
    }
}
