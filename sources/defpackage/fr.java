package defpackage;

/* renamed from: fr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fr implements Runnable {
    final /* synthetic */ fu a;
    final /* synthetic */ Object b;

    public fr(fu fuVar, Object obj) {
        this.a = fuVar;
        this.b = obj;
    }

    public final void run() {
        this.a.a = this.b;
    }
}
