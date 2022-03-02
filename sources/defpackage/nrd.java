package defpackage;

import java.util.concurrent.Executor;

/* renamed from: nrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nrd implements Executor {
    static final Executor a = new nrd();

    private nrd() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
