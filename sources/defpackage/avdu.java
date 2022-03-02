package defpackage;

import java.util.List;

/* renamed from: avdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdu extends aucd implements audy {
    public avdu() {
        super((aucj) avdv.h);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avdv avdv = (avdv) this.b;
        avdv avdv2 = avdv.h;
        if (!avdv.d.a()) {
            avdv.d = aucj.a(avdv.d);
        }
        auab.a(iterable, (List) avdv.d);
    }
}
