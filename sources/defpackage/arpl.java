package defpackage;

/* renamed from: arpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arpl implements arse {
    public static final aibe h = new aibe(0, 0, 0);
    public final arsf a;
    public final arrd b;
    public arrc c;
    public arpt d;
    public int e = 100000;
    public int f = 60000;
    public boolean g = true;
    public arsy i = new arsy((byte[]) null);

    public arpl(arsf arsf) {
        int i2;
        int i3;
        this.a = arsf;
        this.b = new arrd();
        if (a()) {
            arsf arsf2 = this.a;
            arqy arqy = arsf2.u;
            long proksConfig = arsf2.g.proksConfig() & 8;
            if (!arqy.e) {
                if (proksConfig == 0) {
                    i2 = 50;
                } else {
                    i2 = 300;
                }
                arqy.b = new arqp(i2);
                arqy.c = new arqp(i2);
                if (proksConfig == 0) {
                    i3 = 40;
                } else {
                    i3 = 100;
                }
                arqy.d = new arqp(i3);
                arqy.e = true;
            }
        }
        arsf.t = this;
        aqek aqek = arsf.r;
        if (aqek != null) {
            a(aqek);
        }
    }

    public final void a(aqek aqek) {
        if (aqek.i(79)) {
            this.e = aqek.b(79);
        }
        if (aqek.i(80)) {
            this.f = aqek.b(80);
        }
        if (aqek.i(81)) {
            this.g = aqek.a(81);
        }
    }

    public final boolean a() {
        return (this.a.g.proksConfig() & 4) != 0;
    }
}
