package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: afhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afhw implements Executor {
    private final Handler a;

    public afhw(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
