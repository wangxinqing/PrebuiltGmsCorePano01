package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: aof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aof implements Executor {
    final /* synthetic */ Handler a;

    public aof(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
