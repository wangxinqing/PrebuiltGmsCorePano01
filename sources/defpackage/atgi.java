package defpackage;

import java.util.concurrent.Executor;

/* renamed from: atgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atgi implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
