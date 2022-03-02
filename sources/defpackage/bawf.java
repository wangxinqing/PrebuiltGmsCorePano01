package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* renamed from: bawf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bawf implements Executor {
    private final Executor a;

    public bawf(Executor executor) {
        this.a = executor;
    }

    public final void execute(Runnable runnable) {
        bawe bawe = new bawe(runnable, Thread.currentThread());
        this.a.execute(bawe);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = bawe.b;
        if (inlineExecutionProhibitedException == null) {
            bawe.a = null;
            return;
        }
        throw inlineExecutionProhibitedException;
    }
}
