package defpackage;

import java.util.concurrent.Executor;

/* renamed from: jnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jnk implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
