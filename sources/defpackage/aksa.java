package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: aksa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksa {
    public final Handler a;
    public final ExecutorService b;

    public aksa(Handler handler, ExecutorService executorService) {
        this.a = handler;
        this.b = executorService;
    }

    public final void a(Callable callable, aksb aksb) {
        this.b.execute(new akrz(this, callable, aksb));
    }
}
