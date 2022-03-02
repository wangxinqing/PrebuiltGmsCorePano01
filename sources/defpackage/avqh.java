package defpackage;

import java.util.List;

/* renamed from: avqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqh extends aucd implements audy {
    public avqh() {
        super((aucj) avqi.f);
    }

    public final void a(avqf avqf) {
        if (this.c) {
            c();
            this.c = false;
        }
        avqi avqi = (avqi) this.b;
        avqg avqg = (avqg) avqf.i();
        avqi avqi2 = avqi.f;
        avqg.getClass();
        avqi.c();
        avqi.d.add(avqg);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avqi avqi = (avqi) this.b;
        avqi avqi2 = avqi.f;
        avqi.c();
        auab.a(iterable, (List) avqi.d);
    }
}
