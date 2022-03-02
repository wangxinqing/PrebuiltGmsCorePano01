package defpackage;

/* renamed from: avqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqf extends aucd implements audy {
    public avqf() {
        super((aucj) avqg.i);
    }

    public final void a(avqi avqi) {
        if (this.c) {
            c();
            this.c = false;
        }
        avqg avqg = (avqg) this.b;
        avqg avqg2 = avqg.i;
        avqi.getClass();
        if (!avqg.f.a()) {
            avqg.f = aucj.a(avqg.f);
        }
        avqg.f.add(avqi);
    }

    public final void c(long j) {
        if (this.c) {
            c();
            this.c = false;
        }
        avqg avqg = (avqg) this.b;
        avqg avqg2 = avqg.i;
        avqg.e();
        avqg.d.a(j);
    }

    public final void a(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        avqg avqg = (avqg) this.b;
        avqg avqg2 = avqg.i;
        str.getClass();
        avqg.f();
        avqg.e.add(str);
    }
}
