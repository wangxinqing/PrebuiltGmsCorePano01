package defpackage;

/* renamed from: ao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ao implements Runnable {
    final /* synthetic */ as a;

    public ao(as asVar) {
        this.a = asVar;
    }

    public final void run() {
        Object obj;
        synchronized (this.a.b) {
            obj = this.a.f;
            this.a.f = as.c;
        }
        this.a.b(obj);
    }
}
