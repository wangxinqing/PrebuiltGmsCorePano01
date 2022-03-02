package defpackage;

/* renamed from: ajph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajph {
    private long a = -1;
    private final aizw b;
    private final ajpi[] c;

    public ajph(aizw aizw, ajpi... ajpiArr) {
        this.b = aizw;
        this.c = ajpiArr;
    }

    private static boolean a() {
        return !aydu.a.a().nlpClientStatsOmitAppend();
    }

    public final void a(long j) {
        ajpi[] ajpiArr = this.c;
        for (int i = 0; i < 5; i++) {
            ajpiArr[i].a();
        }
        this.a = j;
    }

    public final void a(aizy aizy, aqek aqek) {
        long c2 = aizy.c();
        long j = this.a;
        if (j == -1) {
            a(c2);
        } else if (c2 - j >= 7200000) {
            aucd o = artq.i.o();
            long b2 = aizy.b();
            aqek aqek2 = new aqek(ajck.av);
            long j2 = this.a;
            long j3 = (b2 - c2) + j2;
            int i = (int) ((c2 - j2) / 1000);
            aqek2.b(1, b2 / 1000);
            aqek2.g(2, i);
            if (o.c) {
                o.c();
                o.c = false;
            }
            artq artq = (artq) o.b;
            artq.a = 1 | artq.a;
            artq.b = i;
            ajpi[] ajpiArr = this.c;
            for (int i2 = 0; i2 < 5; i2++) {
                ajpi ajpi = ajpiArr[i2];
                if (a()) {
                    ajpi.a(aqek2, j3);
                }
                if (aydu.g()) {
                    ajpi.a(o, j3);
                }
                ajpi.a();
            }
            if (a()) {
                aqek.a(5, (Object) aqek2);
            }
            if (aydu.g()) {
                this.b.a((artq) o.i());
            }
            this.a = c2;
        }
    }
}
