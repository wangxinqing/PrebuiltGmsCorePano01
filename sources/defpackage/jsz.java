package defpackage;

/* renamed from: jsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsz implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ jta b;

    public jsz(jta jta, Object obj) {
        this.b = jta;
        this.a = obj;
    }

    public final void run() {
        this.b.cancelLoad();
        this.b.deliverResult(this.a);
    }
}
