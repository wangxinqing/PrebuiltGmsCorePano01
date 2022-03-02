package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aqar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqar extends azxi {
    private final apyi a;
    private final apxy b;
    private final Object c = new Object();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public aqar(apyi apyi, apxy apxy) {
        this.a = apyi;
        this.b = apxy;
    }

    private static final URI a(String str) {
        try {
            URI uri = new URI((String) null, str, (String) null, (String) null, (String) null);
            if (uri.getPort() == -1) {
                return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            return uri;
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: azxi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.azxl a(defpackage.baaj r21, defpackage.azxh r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            apxy r2 = r1.b
            azxg r3 = defpackage.apyj.a
            java.lang.Object r3 = r0.a((defpackage.azxg) r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0014
            java.lang.String r3 = r20.a()
        L_0x0014:
            java.net.URI r5 = a(r3)
            java.lang.String r3 = r5.getAuthority()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ 1
            java.lang.String r4 = "Could not parse channel authority"
            defpackage.amrl.b((boolean) r3, (java.lang.Object) r4)
            azxg r3 = defpackage.apyd.a
            java.lang.Object r3 = r0.a((defpackage.azxg) r3)
            r8 = r3
            java.lang.Integer r8 = (java.lang.Integer) r8
            azxg r3 = defpackage.apyd.b
            java.lang.Object r3 = r0.a((defpackage.azxg) r3)
            r9 = r3
            java.lang.Integer r9 = (java.lang.Integer) r9
            apxy r3 = r1.b
            amsv r3 = r3.m()
            java.lang.Object r3 = r3.a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            apzw r3 = new apzw
            r4 = r3
            r4.<init>(r5, r6, r8, r9)
            java.util.concurrent.ConcurrentHashMap r4 = r1.d
            java.lang.Object r4 = r4.get(r3)
            azxi r4 = (defpackage.azxi) r4
            if (r4 != 0) goto L_0x017e
            java.lang.Object r5 = r1.c
            monitor-enter(r5)
            java.util.concurrent.ConcurrentHashMap r4 = r1.d     // Catch:{ all -> 0x017b }
            boolean r4 = r4.containsKey(r3)     // Catch:{ all -> 0x017b }
            if (r4 != 0) goto L_0x0170
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x017b }
            amsv r4 = defpackage.amta.a((java.lang.Object) r4)     // Catch:{ all -> 0x017b }
            apyn r6 = new apyn     // Catch:{ all -> 0x017b }
            r6.<init>()     // Catch:{ all -> 0x017b }
            r6.a(r4)     // Catch:{ all -> 0x017b }
            android.content.Context r4 = r2.a()     // Catch:{ all -> 0x017b }
            if (r4 == 0) goto L_0x0168
            r6.a = r4     // Catch:{ all -> 0x017b }
            java.net.URI r4 = r3.a     // Catch:{ all -> 0x017b }
            r6.b = r4     // Catch:{ all -> 0x017b }
            java.lang.Integer r4 = r3.c     // Catch:{ all -> 0x017b }
            r6.h = r4     // Catch:{ all -> 0x017b }
            java.lang.Integer r4 = r3.d     // Catch:{ all -> 0x017b }
            r6.i = r4     // Catch:{ all -> 0x017b }
            long r7 = r3.b     // Catch:{ all -> 0x017b }
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x017b }
            r6.j = r4     // Catch:{ all -> 0x017b }
            java.util.concurrent.Executor r4 = r2.f()     // Catch:{ all -> 0x017b }
            if (r4 == 0) goto L_0x0160
            r6.c = r4     // Catch:{ all -> 0x017b }
            java.util.concurrent.Executor r4 = r2.d()     // Catch:{ all -> 0x017b }
            if (r4 == 0) goto L_0x0158
            r6.d = r4     // Catch:{ all -> 0x017b }
            java.util.concurrent.ScheduledExecutorService r4 = r2.g()     // Catch:{ all -> 0x017b }
            r6.e = r4     // Catch:{ all -> 0x017b }
            amsv r4 = r2.j()     // Catch:{ all -> 0x017b }
            r6.a(r4)     // Catch:{ all -> 0x017b }
            apyc r4 = r2.o()     // Catch:{ all -> 0x017b }
            r6.g = r4     // Catch:{ all -> 0x017b }
            java.lang.String r4 = ""
            java.lang.String r7 = " applicationContext"
            android.content.Context r8 = r6.a     // Catch:{ all -> 0x017b }
            if (r8 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r4 = r7
        L_0x00be:
            java.net.URI r7 = r6.b     // Catch:{ all -> 0x017b }
            if (r7 != 0) goto L_0x00c8
            java.lang.String r7 = " uri"
            java.lang.String r4 = r4.concat(r7)     // Catch:{ all -> 0x017b }
        L_0x00c8:
            java.util.concurrent.Executor r7 = r6.c     // Catch:{ all -> 0x017b }
            if (r7 != 0) goto L_0x00d6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x017b }
            java.lang.String r7 = " networkExecutor"
            java.lang.String r4 = r4.concat(r7)     // Catch:{ all -> 0x017b }
        L_0x00d6:
            java.util.concurrent.Executor r7 = r6.d     // Catch:{ all -> 0x017b }
            if (r7 != 0) goto L_0x00e4
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x017b }
            java.lang.String r7 = " transportExecutor"
            java.lang.String r4 = r4.concat(r7)     // Catch:{ all -> 0x017b }
        L_0x00e4:
            amsv r7 = r6.f     // Catch:{ all -> 0x017b }
            if (r7 != 0) goto L_0x00f2
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x017b }
            java.lang.String r7 = " recordNetworkMetricsToPrimes"
            java.lang.String r4 = r4.concat(r7)     // Catch:{ all -> 0x017b }
        L_0x00f2:
            java.lang.Long r7 = r6.j     // Catch:{ all -> 0x017b }
            if (r7 != 0) goto L_0x0100
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x017b }
            java.lang.String r7 = " grpcIdleTimeoutMillis"
            java.lang.String r4 = r4.concat(r7)     // Catch:{ all -> 0x017b }
        L_0x0100:
            boolean r7 = r4.isEmpty()     // Catch:{ all -> 0x017b }
            if (r7 == 0) goto L_0x013c
            apxw r4 = new apxw     // Catch:{ all -> 0x017b }
            android.content.Context r9 = r6.a     // Catch:{ all -> 0x017b }
            java.net.URI r10 = r6.b     // Catch:{ all -> 0x017b }
            java.util.concurrent.Executor r11 = r6.c     // Catch:{ all -> 0x017b }
            java.util.concurrent.Executor r12 = r6.d     // Catch:{ all -> 0x017b }
            java.util.concurrent.ScheduledExecutorService r13 = r6.e     // Catch:{ all -> 0x017b }
            amsv r14 = r6.f     // Catch:{ all -> 0x017b }
            apyc r15 = r6.g     // Catch:{ all -> 0x017b }
            java.lang.Integer r7 = r6.h     // Catch:{ all -> 0x017b }
            java.lang.Integer r8 = r6.i     // Catch:{ all -> 0x017b }
            java.lang.Long r6 = r6.j     // Catch:{ all -> 0x017b }
            long r18 = r6.longValue()     // Catch:{ all -> 0x017b }
            r6 = r8
            r8 = r4
            r16 = r7
            r17 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x017b }
            aqah r6 = new aqah     // Catch:{ all -> 0x017b }
            apyp r7 = r2.c()     // Catch:{ all -> 0x017b }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x017b }
            r6.<init>(r7, r4, r2)     // Catch:{ all -> 0x017b }
            java.util.concurrent.ConcurrentHashMap r2 = r1.d     // Catch:{ all -> 0x017b }
            r2.put(r3, r6)     // Catch:{ all -> 0x017b }
            goto L_0x0170
        L_0x013c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017b }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x017b }
            java.lang.String r3 = "Missing required properties:"
            int r4 = r2.length()     // Catch:{ all -> 0x017b }
            if (r4 != 0) goto L_0x0150
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x017b }
            r2.<init>(r3)     // Catch:{ all -> 0x017b }
            goto L_0x0154
        L_0x0150:
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x017b }
        L_0x0154:
            r0.<init>(r2)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x0158:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x017b }
            java.lang.String r2 = "Null transportExecutor"
            r0.<init>(r2)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x0160:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x017b }
            java.lang.String r2 = "Null networkExecutor"
            r0.<init>(r2)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x0168:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x017b }
            java.lang.String r2 = "Null applicationContext"
            r0.<init>(r2)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x0170:
            java.util.concurrent.ConcurrentHashMap r2 = r1.d     // Catch:{ all -> 0x017b }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x017b }
            r4 = r2
            azxi r4 = (defpackage.azxi) r4     // Catch:{ all -> 0x017b }
            monitor-exit(r5)     // Catch:{ all -> 0x017b }
            goto L_0x017e
        L_0x017b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x017b }
            throw r0
        L_0x017e:
            r2 = r21
            azxl r0 = r4.a(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqar.a(baaj, azxh):azxl");
    }

    public final String a() {
        return this.a.a().a;
    }
}
