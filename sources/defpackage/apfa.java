package defpackage;

import java.util.List;

/* renamed from: apfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apfa extends aucd implements audy {
    public apfa() {
        super((aucj) apfb.g);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        apfb apfb = (apfb) this.b;
        apfb apfb2 = apfb.g;
        if (!apfb.d.a()) {
            apfb.d = aucj.a(apfb.d);
        }
        auab.a(iterable, (List) apfb.d);
    }
}
