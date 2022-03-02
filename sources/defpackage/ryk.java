package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: ryk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ryk implements Executor {
    private final Handler a;

    public ryk(Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
