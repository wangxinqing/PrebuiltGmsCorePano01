package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: apxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apxv extends apxy {
    public final Executor a;
    public final apyr b;
    private final Context c;
    private final aekn d;
    private final apyp e;
    private final Executor f;
    private final Executor g;
    private final amsv h;
    private final amsv i;
    private final amsv j;
    private final amsv k;

    public apxv(Context context, aekn aekn, apyp apyp, Executor executor, Executor executor2, Executor executor3, apyr apyr, amsv amsv, amsv amsv2, amsv amsv3, amsv amsv4) {
        this.c = context;
        this.d = aekn;
        this.e = apyp;
        this.f = executor;
        this.g = executor2;
        this.a = executor3;
        this.b = apyr;
        this.h = amsv;
        this.i = amsv2;
        this.j = amsv3;
        this.k = amsv4;
    }

    public final Context a() {
        return this.c;
    }

    public final aekn b() {
        return this.d;
    }

    public final apyp c() {
        return this.e;
    }

    public final Executor d() {
        return this.f;
    }

    public final Executor e() {
        return this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x00b2
            boolean r1 = r5 instanceof defpackage.apxy
            r2 = 0
            if (r1 == 0) goto L_0x00b1
            apxy r5 = (defpackage.apxy) r5
            android.content.Context r1 = r4.c
            android.content.Context r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            aekn r1 = r4.d
            aekn r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            apyp r1 = r4.e
            apyp r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            java.util.concurrent.Executor r1 = r4.f
            java.util.concurrent.Executor r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            java.util.concurrent.Executor r1 = r4.g
            java.util.concurrent.Executor r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            java.util.concurrent.Executor r1 = r4.a
            java.util.concurrent.Executor r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            java.util.concurrent.ScheduledExecutorService r1 = r5.g()
            if (r1 != 0) goto L_0x00b1
            apyr r1 = r4.b
            if (r1 == 0) goto L_0x0067
            apyr r3 = r5.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            goto L_0x006e
        L_0x0067:
            apyr r1 = r5.h()
            if (r1 == 0) goto L_0x006e
        L_0x006d:
            goto L_0x00b1
        L_0x006e:
            apyf r1 = r5.i()
            if (r1 != 0) goto L_0x00b1
            amsv r1 = r4.h
            amsv r3 = r5.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            amsv r1 = r4.i
            amsv r3 = r5.k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            amsv r1 = r4.j
            amsv r3 = r5.l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            amsv r1 = r4.k
            amsv r3 = r5.m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b1
            apyk r1 = r5.n()
            if (r1 != 0) goto L_0x00b1
            apyc r5 = r5.o()
            if (r5 != 0) goto L_0x00b1
            return r0
        L_0x00b1:
            return r2
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apxv.equals(java.lang.Object):boolean");
    }

    public final Executor f() {
        return this.a;
    }

    public final ScheduledExecutorService g() {
        return null;
    }

    public final apyr h() {
        return this.b;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.a.hashCode()) * -721379959;
        apyr apyr = this.b;
        if (apyr != null) {
            i2 = apyr.hashCode();
        } else {
            i2 = 0;
        }
        return (((((((((hashCode ^ i2) * -721379959) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * -721379959;
    }

    public final apyf i() {
        return null;
    }

    public final amsv j() {
        return this.h;
    }

    public final amsv k() {
        return this.i;
    }

    public final amsv l() {
        return this.j;
    }

    public final amsv m() {
        return this.k;
    }

    public final apyk n() {
        return null;
    }

    public final apyc o() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.a);
        String valueOf7 = String.valueOf((Object) null);
        String valueOf8 = String.valueOf(this.b);
        String valueOf9 = String.valueOf((Object) null);
        String valueOf10 = String.valueOf(this.h);
        String valueOf11 = String.valueOf(this.i);
        String valueOf12 = String.valueOf(this.j);
        String valueOf13 = String.valueOf(this.k);
        String valueOf14 = String.valueOf((Object) null);
        String valueOf15 = String.valueOf((Object) null);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        int length11 = String.valueOf(valueOf11).length();
        int length12 = String.valueOf(valueOf12).length();
        int length13 = String.valueOf(valueOf13).length();
        String str = valueOf15;
        StringBuilder sb = new StringBuilder(length + 310 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + String.valueOf(valueOf14).length() + String.valueOf(valueOf15).length());
        sb.append("ChannelConfig{context=");
        sb.append(valueOf);
        sb.append(", clock=");
        sb.append(valueOf2);
        sb.append(", transport=");
        sb.append(valueOf3);
        sb.append(", transportExecutor=");
        sb.append(valueOf4);
        sb.append(", ioExecutor=");
        sb.append(valueOf5);
        sb.append(", networkExecutor=");
        sb.append(valueOf6);
        sb.append(", transportScheduledExecutor=");
        sb.append(valueOf7);
        sb.append(", authContextManager=");
        sb.append(valueOf8);
        sb.append(", rpcCacheProvider=");
        sb.append(valueOf9);
        sb.append(", recordNetworkMetricsToPrimes=");
        sb.append(valueOf10);
        sb.append(", recordCachingMetricsToPrimes=");
        sb.append(valueOf11);
        sb.append(", recordBandwidthMetrics=");
        sb.append(valueOf12);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(valueOf13);
        sb.append(", streamzConfig=");
        sb.append(valueOf14);
        sb.append(", grpcServiceConfig=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
