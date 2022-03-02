package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: bamh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamh implements baek {
    private final Executor a;
    private final boolean b;
    private final boolean c;
    private final balt d;
    private final SocketFactory e;
    private final SSLSocketFactory f;
    private final banj g;
    private final boolean h;
    private final badi i;
    private final long j;
    private final ScheduledExecutorService k;
    private boolean l;

    public bamh(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, banj banj, boolean z, long j2, balt balt) {
        boolean z2;
        boolean z3 = true;
        if (scheduledExecutorService == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        this.k = z2 ? (ScheduledExecutorService) balk.a(bagt.m) : scheduledExecutorService;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = banj;
        this.h = false;
        this.i = new badi("keepalive time nanos");
        this.j = j2;
        this.b = executor != null ? false : z3;
        amrl.a((Object) balt, (Object) "transportTracerFactory");
        this.d = balt;
        this.a = this.b ? (Executor) balk.a(bami.p) : executor;
    }

    public final baep a(SocketAddress socketAddress, baej baej, azxj azxj) {
        baej baej2 = baej;
        if (!this.l) {
            badi badi = this.i;
            return new bamt((InetSocketAddress) socketAddress, baej2.a, baej2.c, baej2.b, this.a, this.e, this.f, this.g, baej2.d, new bamg(new badh(badi, badi.c.get())), this.d.a());
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    public final ScheduledExecutorService a() {
        return this.k;
    }

    public final void close() {
        if (!this.l) {
            this.l = true;
            if (this.c) {
                balk.b(bagt.m, this.k);
            }
            if (this.b) {
                balk.b(bami.p, this.a);
            }
        }
    }
}
