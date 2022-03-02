package defpackage;

/* renamed from: baje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baje implements Runnable {
    final /* synthetic */ bahv a;
    final /* synthetic */ bajg b;

    public baje(bajg bajg, bahv bahv) {
        this.b = bajg;
        this.a = bahv;
    }

    public final void run() {
        azyv azyv = this.b.i.F;
        azyv.a(azyv.d, this.a);
        this.b.i.u.add(this.a);
    }
}
