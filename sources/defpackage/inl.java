package defpackage;

import java.util.concurrent.Future;

/* renamed from: inl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class inl implements Runnable {
    private final Future a;
    private final Thread b;

    public inl(Future future, Thread thread) {
        this.a = future;
        this.b = thread;
    }

    public final void run() {
        inm.a(this.a, this.b);
    }
}
