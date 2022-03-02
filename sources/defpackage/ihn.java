package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ihn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ihn implements Executor {
    static final Executor a = new ihn();

    private ihn() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
