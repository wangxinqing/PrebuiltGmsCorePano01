package defpackage;

/* renamed from: rzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rzy implements acvp {
    private final rzz a;

    public rzy(rzz rzz) {
        this.a = rzz;
    }

    public final void a(acwa acwa) {
        rzz rzz = this.a;
        synchronized (rzz.d.h) {
            sac.a(rzz.c, acwa);
            rzz.b = false;
            for (rzx rzx : rzz.a) {
                if (!acwa.b()) {
                    rzx.a.a(acwa.e());
                } else {
                    rzx.a();
                }
            }
            rzz.a.clear();
            sac sac = rzz.d;
            boolean b = acwa.b();
            if (sac.h.size() > 1) {
                sac.h.removeFirst();
                ((rzz) sac.h.getFirst()).a();
            } else if (b) {
                sac.h.removeFirst();
            }
        }
    }
}
