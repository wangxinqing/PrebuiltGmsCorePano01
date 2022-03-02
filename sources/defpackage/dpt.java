package defpackage;

/* renamed from: dpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dpt implements dne {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dpv b;

    public dpt(dpv dpv, Runnable runnable) {
        this.b = dpv;
        this.a = runnable;
    }

    public final void a() {
        this.b.a.post(this.a);
    }
}
