package defpackage;

/* renamed from: athj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class athj implements Runnable {
    private final athn a;

    public athj(athn athn) {
        this.a = athn;
    }

    public final void run() {
        athn athn = this.a;
        synchronized (athn.f) {
            athn.c();
        }
    }
}
