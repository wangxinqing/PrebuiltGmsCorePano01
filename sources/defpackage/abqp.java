package defpackage;

/* renamed from: abqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abqp implements acek {
    private final abqw a;
    private final acau b;
    private final int c;

    public abqp(abqw abqw, acau acau, int i) {
        this.a = abqw;
        this.b = acau;
        this.c = i;
    }

    public final void a() {
        abqw abqw = this.a;
        acau acau = this.b;
        int i = this.c;
        abqw.b.d("Discovering nearby device timed out.", new Object[0]);
        if (azjt.b()) {
            abqw.b();
        }
        acau.a(i);
    }
}
