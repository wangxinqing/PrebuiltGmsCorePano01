package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: badr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class badr implements baek {
    public final Executor a;
    private final baek b;

    public badr(baek baek, Executor executor) {
        amrl.a((Object) baek, (Object) "delegate");
        this.b = baek;
        amrl.a((Object) executor, (Object) "appExecutor");
        this.a = executor;
    }

    public final baep a(SocketAddress socketAddress, baej baej, azxj azxj) {
        return new badq(this, this.b.a(socketAddress, baej, azxj), baej.a);
    }

    public final void close() {
        this.b.close();
    }

    public final ScheduledExecutorService a() {
        return this.b.a();
    }
}
