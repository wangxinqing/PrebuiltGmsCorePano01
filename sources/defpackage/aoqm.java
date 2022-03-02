package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aoqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aoqm implements Executor {
    ;

    private aoqm(String str) {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
