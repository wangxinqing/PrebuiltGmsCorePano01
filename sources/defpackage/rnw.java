package defpackage;

/* renamed from: rnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rnw implements rnr {
    private final rny a;

    public rnw(rny rny) {
        this.a = rny;
    }

    public final void a(Object obj) {
        rny rny = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        synchronized (rny.c) {
            rny.h = booleanValue;
            rny.c();
        }
    }
}
