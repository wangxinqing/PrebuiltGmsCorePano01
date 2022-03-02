package defpackage;

import java.util.concurrent.Callable;

/* renamed from: acwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acwm implements Runnable {
    final /* synthetic */ acwi a;
    final /* synthetic */ Callable b;

    public acwm(acwi acwi, Callable callable) {
        this.a = acwi;
        this.b = callable;
    }

    public final void run() {
        try {
            this.a.a(this.b.call());
        } catch (Exception e) {
            this.a.a(e);
        }
    }
}
