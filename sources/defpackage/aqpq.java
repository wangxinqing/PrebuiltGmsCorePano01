package defpackage;

/* renamed from: aqpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqpq extends aucd implements audy {
    public aqpq() {
        super((aucj) aqps.j);
    }

    public final void a(String str, aqrb aqrb) {
        str.getClass();
        aqrb.getClass();
        if (this.c) {
            c();
            this.c = false;
        }
        aqps aqps = (aqps) this.b;
        aqps aqps2 = aqps.j;
        audr audr = aqps.g;
        if (!audr.a) {
            aqps.g = audr.a();
        }
        aqps.g.put(str, aqrb);
    }
}
