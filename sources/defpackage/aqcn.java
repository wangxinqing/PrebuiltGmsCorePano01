package defpackage;

/* renamed from: aqcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqcn extends azxr {
    private final Object a = new Object();
    private aqcm b;
    private final aqcl c;

    public aqcn(aqcl aqcl) {
        this.c = aqcl;
    }

    public final babm a() {
        synchronized (this.a) {
            if (this.b == null) {
                aqcm aqcm = new aqcm(this.c);
                this.b = aqcm;
                return aqcm;
            }
            babm babm = new babm();
            return babm;
        }
    }
}
