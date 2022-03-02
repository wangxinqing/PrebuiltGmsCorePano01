package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: afhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afhx implements Executor {
    private final Handler a;

    public afhx(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
