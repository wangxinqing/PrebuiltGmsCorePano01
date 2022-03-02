package defpackage;

import java.util.concurrent.Callable;

/* renamed from: akrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akrz implements Runnable {
    public final aksb a;
    final /* synthetic */ aksa b;
    private final Callable c;

    public akrz(aksa aksa, Callable callable, aksb aksb) {
        this.b = aksa;
        this.a = aksb;
        this.c = callable;
    }

    private final void a(Throwable th) {
        this.b.a.post(new akrx(this, th));
    }

    public final void run() {
        try {
            Object call = this.c.call();
            if (call != null) {
                this.b.a.post(new akry(this, call));
            } else {
                a(new NullPointerException());
            }
        } catch (Exception e) {
            a(e);
        }
    }
}
