package defpackage;

/* renamed from: jid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jid implements Runnable {
    final /* synthetic */ jie a;
    private final ob b;

    public jid(jie jie, ob obVar) {
        this.a = jie;
        this.b = new ob(obVar);
    }

    public final void run() {
        synchronized (this.a.b) {
            this.a.a(this.b);
        }
    }
}
