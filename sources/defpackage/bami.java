package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: bami  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bami extends badc {
    static final banj o;
    public static final balj p = new bamf();
    public SocketFactory q;
    private Executor r;
    private ScheduledExecutorService s;
    private SSLSocketFactory t;
    private final banj u = o;
    private final long v = bagt.i;
    private int w = 1;

    static {
        bani bani = new bani(banj.a);
        bani.a(banh.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, banh.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, banh.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, banh.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, banh.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, banh.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, banh.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, banh.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
        bani.a(banw.TLS_1_2);
        bani.b();
        o = bani.a();
        TimeUnit.DAYS.toNanos(1000);
    }

    private bami(String str) {
        super(str);
    }

    public static bami a(String str, int i) {
        return new bami(bagt.a(str, i));
    }

    public static bami forTarget(String str) {
        return new bami(str);
    }

    /* access modifiers changed from: protected */
    public final int c() {
        int i = this.w;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return 443;
        } else {
            StringBuilder sb = new StringBuilder(15);
            sb.append("TLS not handled");
            throw new AssertionError(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final SSLSocketFactory d() {
        int i = this.w;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            try {
                if (this.t == null) {
                    this.t = SSLContext.getInstance("Default", banu.b.c).getSocketFactory();
                }
                return this.t;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("TLS Provider failure", e);
            }
        } else {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Unknown negotiation type: TLS");
            throw new RuntimeException(sb.toString());
        }
    }

    public final bami scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        amrl.a((Object) scheduledExecutorService, (Object) "scheduledExecutorService");
        this.s = scheduledExecutorService;
        return this;
    }

    public final bami sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.t = sSLSocketFactory;
        this.w = 1;
        return this;
    }

    public final bami transportExecutor(Executor executor) {
        this.r = executor;
        return this;
    }

    /* access modifiers changed from: protected */
    public final baek a() {
        return new bamh(this.r, this.s, this.q, d(), this.u, false, this.v, this.n);
    }
}
