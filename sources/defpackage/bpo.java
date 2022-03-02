package defpackage;

/* renamed from: bpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class bpo implements Runnable {
    private final bpq a;
    private final String b;

    public bpo(bpq bpq, String str) {
        this.a = bpq;
        this.b = str;
    }

    public final void run() {
        this.a.f.a(amzy.a((Object) this.b));
    }
}
