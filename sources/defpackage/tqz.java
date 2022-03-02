package defpackage;

/* renamed from: tqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tqz implements Runnable {
    private final tlh a;
    private final String b;
    private final asas c;

    public tqz(tlh tlh, String str, asas asas) {
        this.a = tlh;
        this.b = str;
        this.c = asas;
    }

    public final void run() {
        tlh tlh = this.a;
        String str = this.b;
        asas asas = this.c;
        tkx tkx = tlh.f;
        long j = asas.b;
        int a2 = asar.a(asas.c);
        if (a2 == 0) {
            a2 = 1;
        }
        tkx.a(str, j, a2, asas.d);
    }
}
