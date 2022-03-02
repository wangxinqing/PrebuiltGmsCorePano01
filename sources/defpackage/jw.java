package defpackage;

/* renamed from: jw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jw implements Runnable {
    final /* synthetic */ jy a;
    final /* synthetic */ jx b;

    public jw(jy jyVar, jx jxVar) {
        this.a = jyVar;
        this.b = jxVar;
    }

    public final void run() {
        this.a.b.remove(this.b.a);
    }
}
