package defpackage;

/* renamed from: dho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class dho implements o {
    public static final o a = new dho();

    private dho() {
    }

    public final Object a(Object obj) {
        aqso aqso = ((csl) obj).a;
        if (aqso.b != 5) {
            return amzy.h();
        }
        amzt j = amzy.j();
        aucx aucx = ((aqts) aqso.c).a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            aqtt aqtt = (aqtt) aucx.get(i);
            if (!awgy.k()) {
                String str = aqtt.c;
                aqsr aqsr = aqtt.b;
                if (aqsr == null) {
                    aqsr = aqsr.d;
                }
                j.c(dhp.a(str, (aqrk) null, aqsr));
            } else {
                String str2 = aqtt.c;
                aqrl aqrl = aqtt.d;
                if (aqrl == null) {
                    aqrl = aqrl.g;
                }
                aqrk a2 = aqrk.a(aqrl.b);
                aqsr aqsr2 = aqtt.b;
                if (aqsr2 == null) {
                    aqsr2 = aqsr.d;
                }
                j.c(dhp.a(str2, a2, aqsr2));
            }
        }
        return j.a();
    }
}
