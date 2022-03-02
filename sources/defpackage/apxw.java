package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: apxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apxw extends apyo {
    public final URI a;
    public final Executor b;
    public final Integer c;
    public final Integer d;
    public final long e;
    private final Context f;
    private final Executor g;
    private final ScheduledExecutorService h;
    private final amsv i;
    private final apyc j;

    public apxw(Context context, URI uri, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, amsv amsv, apyc apyc, Integer num, Integer num2, long j2) {
        this.f = context;
        this.a = uri;
        this.g = executor;
        this.b = executor2;
        this.h = scheduledExecutorService;
        this.i = amsv;
        this.j = apyc;
        this.c = num;
        this.d = num2;
        this.e = j2;
    }

    public final Context a() {
        return this.f;
    }

    public final URI b() {
        return this.a;
    }

    public final Executor c() {
        return this.g;
    }

    public final Executor d() {
        return this.b;
    }

    public final ScheduledExecutorService e() {
        return this.h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r1 = r7.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r1 = r7.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        r1 = r7.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        r1 = r7.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x00ab
            boolean r1 = r8 instanceof defpackage.apyo
            r2 = 0
            if (r1 == 0) goto L_0x00aa
            apyo r8 = (defpackage.apyo) r8
            android.content.Context r1 = r7.f
            android.content.Context r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            java.net.URI r1 = r7.a
            java.net.URI r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            java.util.concurrent.Executor r1 = r7.g
            java.util.concurrent.Executor r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            java.util.concurrent.Executor r1 = r7.b
            java.util.concurrent.Executor r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            java.util.concurrent.ScheduledExecutorService r1 = r7.h
            if (r1 == 0) goto L_0x0049
            java.util.concurrent.ScheduledExecutorService r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x0048:
            goto L_0x0050
        L_0x0049:
            java.util.concurrent.ScheduledExecutorService r1 = r8.e()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0048
        L_0x0050:
            amsv r1 = r7.i
            amsv r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            apyc r1 = r7.j
            if (r1 == 0) goto L_0x006b
            apyc r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x006a:
            goto L_0x0072
        L_0x006b:
            apyc r1 = r8.g()
            if (r1 != 0) goto L_0x00a9
            goto L_0x006a
        L_0x0072:
            java.lang.Integer r1 = r7.c
            if (r1 == 0) goto L_0x0081
            java.lang.Integer r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x0080:
            goto L_0x0088
        L_0x0081:
            java.lang.Integer r1 = r8.h()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0080
        L_0x0088:
            java.lang.Integer r1 = r7.d
            if (r1 == 0) goto L_0x0097
            java.lang.Integer r3 = r8.i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            goto L_0x009e
        L_0x0097:
            java.lang.Integer r1 = r8.i()
            if (r1 == 0) goto L_0x009e
        L_0x009d:
            goto L_0x00a9
        L_0x009e:
            long r3 = r7.e
            long r5 = r8.j()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x00a9
            return r0
        L_0x00a9:
            return r2
        L_0x00aa:
            return r2
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apxw.equals(java.lang.Object):boolean");
    }

    public final amsv f() {
        return this.i;
    }

    public final apyc g() {
        return this.j;
    }

    public final Integer h() {
        return this.c;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int hashCode = (((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        ScheduledExecutorService scheduledExecutorService = this.h;
        int i5 = 0;
        if (scheduledExecutorService != null) {
            i2 = scheduledExecutorService.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((hashCode ^ i2) * 1000003) ^ this.i.hashCode()) * 1000003;
        apyc apyc = this.j;
        if (apyc != null) {
            i3 = apyc.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (hashCode2 ^ i3) * 1000003;
        Integer num = this.c;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (i6 ^ i4) * 1000003;
        Integer num2 = this.d;
        if (num2 != null) {
            i5 = num2.hashCode();
        }
        long j2 = this.e;
        return ((i7 ^ i5) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final Integer i() {
        return this.d;
    }

    public final long j() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.c);
        String valueOf9 = String.valueOf(this.d);
        long j2 = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 247 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("TransportConfig{applicationContext=");
        sb.append(valueOf);
        sb.append(", uri=");
        sb.append(valueOf2);
        sb.append(", networkExecutor=");
        sb.append(valueOf3);
        sb.append(", transportExecutor=");
        sb.append(valueOf4);
        sb.append(", transportScheduledExecutorService=");
        sb.append(valueOf5);
        sb.append(", recordNetworkMetricsToPrimes=");
        sb.append(valueOf6);
        sb.append(", grpcServiceConfig=");
        sb.append(valueOf7);
        sb.append(", trafficStatsUid=");
        sb.append(valueOf8);
        sb.append(", trafficStatsTag=");
        sb.append(valueOf9);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
