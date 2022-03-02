package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bacj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacj implements baek {
    private final ScheduledExecutorService a = ((ScheduledExecutorService) balk.a(bagt.m));
    private final Executor b;
    private final back c;
    private final balu d;

    public bacj(back back, Executor executor, balu balu) {
        this.c = back;
        amrl.a((Object) executor, (Object) "executor");
        this.b = executor;
        amrl.a((Object) balu, (Object) "transportTracer");
        this.d = balu;
    }

    public final baep a(SocketAddress socketAddress, baej baej, azxj azxj) {
        return new bacu(this.c, (InetSocketAddress) socketAddress, baej.a, baej.c, baej.b, this.b, this.d);
    }

    public final ScheduledExecutorService a() {
        return this.a;
    }

    public final void close() {
        balk.b(bagt.m, this.a);
    }
}
