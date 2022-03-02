package defpackage;

import android.os.IInterface;
import com.google.android.gms.config.ConfigChimeraService;

/* renamed from: joq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class joq extends bhw implements IInterface {
    public final /* synthetic */ ConfigChimeraService a;

    public joq() {
        super("com.google.android.gms.config.internal.IConfigService");
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.jop r33, com.google.android.gms.config.internal.FetchConfigIpcRequest r34) {
        /*
            r32 = this;
            r0 = r33
            r1 = r34
            int r2 = android.os.Binder.getCallingUid()
            long r11 = android.os.Binder.clearCallingIdentity()
            r13 = r32
            com.google.android.gms.config.ConfigChimeraService r9 = r13.a
            acrz r10 = new acrz
            java.lang.String r8 = r1.a
            r5 = 1
            java.lang.String r6 = "Config Fetch"
            java.lang.String r7 = "com.google.android.gms"
            r3 = r10
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Map r3 = r9.b
            r14 = 6503(0x1967, float:9.113E-42)
            if (r3 == 0) goto L_0x0025
            goto L_0x0036
        L_0x0025:
            r9.a()
            java.util.Map r3 = r9.b
            if (r3 != 0) goto L_0x0036
            r9.a((defpackage.jop) r0, (int) r14)
            r9.a((defpackage.acrz) r10)
            r20 = r11
            goto L_0x03a8
        L_0x0036:
            java.lang.String r3 = r1.a
            boolean r2 = r9.a((int) r2, (java.lang.String) r3)
            if (r2 != 0) goto L_0x004a
            r1 = 6500(0x1964, float:9.108E-42)
            r9.a((defpackage.jop) r0, (int) r1)
            r9.a((defpackage.acrz) r10)
            r20 = r11
            goto L_0x03a8
        L_0x004a:
            long r15 = java.lang.System.currentTimeMillis()
            jof r2 = new jof
            java.lang.String r3 = r1.a
            java.lang.String r4 = r1.d
            r2.<init>(r9, r3, r4)
            java.lang.Object r3 = r9.a
            monitor-enter(r3)
            java.util.Map r4 = r9.c     // Catch:{ all -> 0x03af }
            java.lang.String r5 = r1.a     // Catch:{ all -> 0x03af }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x03af }
            r8 = r4
            job r8 = (defpackage.job) r8     // Catch:{ all -> 0x03af }
            monitor-exit(r3)     // Catch:{ all -> 0x03af }
            if (r8 != 0) goto L_0x006d
            r13 = r8
            r20 = r11
            goto L_0x01be
        L_0x006d:
            boolean r3 = r8.c()
            if (r3 == 0) goto L_0x01bb
            long r3 = r1.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = r5.convert(r3, r6)
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r7 != 0) goto L_0x0087
            goto L_0x00ae
        L_0x0087:
            java.util.List r3 = r8.d
            r4 = 0
            r17 = -1
            if (r3 == 0) goto L_0x00a1
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00a1
            java.util.List r3 = r8.d
            java.lang.Object r3 = r3.get(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r19 = r3.longValue()
            goto L_0x00a3
        L_0x00a1:
            r19 = r17
        L_0x00a3:
            int r3 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x00a8
            goto L_0x00b5
        L_0x00a8:
            long r19 = r15 - r19
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 < 0) goto L_0x00b5
        L_0x00ae:
            joa r3 = defpackage.joa.CACHE
            r13 = r8
            r20 = r11
            goto L_0x01c0
        L_0x00b5:
            java.lang.String r3 = r1.a
            java.lang.Object r5 = r9.f
            monitor-enter(r5)
            java.util.Set r6 = r9.g     // Catch:{ all -> 0x01b8 }
            boolean r3 = r6.contains(r3)     // Catch:{ all -> 0x01b8 }
            monitor-exit(r5)     // Catch:{ all -> 0x01b8 }
            if (r3 != 0) goto L_0x01b2
            java.lang.String r5 = r1.a
            boolean r3 = r8.c()
            if (r3 == 0) goto L_0x018e
            java.util.List r3 = r8.d
            if (r3 == 0) goto L_0x014d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x014b
            java.util.List r3 = r8.e
            if (r3 != 0) goto L_0x00da
            goto L_0x00fe
        L_0x00da:
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00fe
            java.util.List r3 = r8.d
            java.lang.Object r3 = r3.get(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            java.util.List r3 = r8.e
            java.lang.Object r3 = r3.get(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r19 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r19 > 0) goto L_0x00fe
            r13 = r8
            goto L_0x014e
        L_0x00fe:
            int r7 = r9.b((java.lang.String) r5)
            java.util.List r3 = r8.d
            int r3 = r3.size()
            if (r3 < r7) goto L_0x0145
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r19 = 3600(0xe10, float:5.045E-42)
            r20 = 300(0x12c, float:4.2E-43)
            r21 = 86400(0x15180, float:1.21072E-40)
            java.lang.String r22 = "throttling_success_interval_seconds"
            r3 = r9
            r4 = r5
            r5 = r22
            r14 = r6
            r6 = r19
            r23 = r7
            r7 = r20
            r13 = r8
            r8 = r21
            int r3 = r3.a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (int) r7, (int) r8)
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r14.convert(r3, r5)
            r5 = r23
            long r6 = r13.a(r5)
            long r6 = r15 - r6
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0146
            long r5 = r13.a(r5)
            long r17 = r5 + r3
            r20 = r11
            r3 = r17
            goto L_0x0194
        L_0x0145:
            r13 = r8
        L_0x0146:
            r20 = r11
            r3 = r17
            goto L_0x0194
        L_0x014b:
            r13 = r8
            goto L_0x014e
        L_0x014d:
            r13 = r8
        L_0x014e:
            java.util.List r3 = r13.e
            if (r3 == 0) goto L_0x018f
            int r14 = r9.c(r5)
            java.util.List r3 = r13.e
            int r3 = r3.size()
            if (r3 < r14) goto L_0x018f
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6 = 3600(0xe10, float:5.045E-42)
            r7 = 300(0x12c, float:4.2E-43)
            r19 = 86400(0x15180, float:1.21072E-40)
            java.lang.String r20 = "throttling_failure_interval_seconds"
            r3 = r9
            r4 = r5
            r5 = r20
            r20 = r11
            r11 = r8
            r8 = r19
            int r3 = r3.a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (int) r7, (int) r8)
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r11.convert(r3, r5)
            long r5 = r13.b(r14)
            long r5 = r15 - r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0191
            long r5 = r13.b(r14)
            long r17 = r5 + r3
            goto L_0x0192
        L_0x018e:
            r13 = r8
        L_0x018f:
            r20 = r11
        L_0x0191:
        L_0x0192:
            r3 = r17
        L_0x0194:
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x01af
            byte[] r5 = r13.b
            byte[] r6 = defpackage.jof.a(r2)
            boolean r5 = java.util.Arrays.equals(r5, r6)
            if (r5 != 0) goto L_0x01a9
            joa r3 = defpackage.joa.FETCH_NOT_THROTTLED
            goto L_0x01c0
        L_0x01a9:
            joa r5 = defpackage.joa.FETCH_THROTTLED
            r5.g = r3
            r3 = r5
            goto L_0x01c0
        L_0x01af:
            joa r3 = defpackage.joa.FETCH_NOT_THROTTLED
            goto L_0x01c0
        L_0x01b2:
            r13 = r8
            r20 = r11
            joa r3 = defpackage.joa.FETCH_ANOTHER_TASK_INFLIGHT
            goto L_0x01c0
        L_0x01b8:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01b8 }
            throw r0
        L_0x01bb:
            r13 = r8
            r20 = r11
        L_0x01be:
            joa r3 = defpackage.joa.FETCH_NOT_THROTTLED
        L_0x01c0:
            joa r4 = defpackage.joa.FETCH_ANOTHER_TASK_INFLIGHT
            if (r3 == r4) goto L_0x035d
            java.lang.Object r4 = r9.a
            monitor-enter(r4)
            java.util.Map r5 = r9.b     // Catch:{ all -> 0x035a }
            java.lang.String r6 = r1.a     // Catch:{ all -> 0x035a }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x035a }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x035a }
            java.util.Map r6 = r9.e     // Catch:{ all -> 0x035a }
            java.lang.String r7 = r1.a     // Catch:{ all -> 0x035a }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x035a }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x035a }
            monitor-exit(r4)     // Catch:{ all -> 0x035a }
            com.google.android.gms.common.data.DataHolder r4 = r1.c
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r4 == 0) goto L_0x0214
            ilk r8 = new ilk
            android.os.Parcelable$Creator r12 = com.google.android.gms.config.internal.CustomVariable.CREATOR
            r8.<init>(r4, r12)
            java.util.Iterator r4 = r8.iterator()
        L_0x01f0:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0204
            java.lang.Object r8 = r4.next()
            com.google.android.gms.config.internal.CustomVariable r8 = (com.google.android.gms.config.internal.CustomVariable) r8
            java.lang.String r12 = r8.a
            java.lang.String r8 = r8.b
            r7.put(r12, r8)
            goto L_0x01f0
        L_0x0204:
            com.google.android.gms.common.data.DataHolder r4 = r1.c
            if (r4 != 0) goto L_0x0209
            goto L_0x0214
        L_0x0209:
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x0214
            com.google.android.gms.common.data.DataHolder r4 = r1.c
            r4.close()
        L_0x0214:
            java.lang.String r4 = r1.a
            byte[] r12 = r9.a((java.lang.String) r4, (java.util.Map) r7)
            boolean r4 = r3.e
            if (r4 != 0) goto L_0x0294
            boolean r1 = r3.f
            byte[] r2 = r13.c
            boolean r2 = java.util.Arrays.equals(r12, r2)
            r2 = r2 ^ 1
            r4 = 6507(0x196b, float:9.118E-42)
            r7 = 6502(0x1966, float:9.111E-42)
            if (r5 != 0) goto L_0x0231
            r14 = 6503(0x1967, float:9.113E-42)
            goto L_0x0242
        L_0x0231:
            if (r1 != 0) goto L_0x023b
            if (r2 == 0) goto L_0x0238
            r14 = -6508(0xffffffffffffe694, float:NaN)
            goto L_0x0242
        L_0x0238:
            r14 = -6506(0xffffffffffffe696, float:NaN)
            goto L_0x0242
        L_0x023b:
            if (r2 == 0) goto L_0x0240
            r14 = 6507(0x196b, float:9.118E-42)
            goto L_0x0242
        L_0x0240:
            r14 = 6502(0x1966, float:9.111E-42)
        L_0x0242:
            if (r5 == 0) goto L_0x0249
            com.google.android.gms.common.data.DataHolder r11 = r9.b((java.util.Map) r5)
            goto L_0x024a
        L_0x0249:
            r11 = 0
        L_0x024a:
            com.google.android.gms.common.data.DataHolder r1 = r9.b((java.util.List) r6)
            com.google.android.gms.config.internal.FetchConfigIpcResponse r2 = new com.google.android.gms.config.internal.FetchConfigIpcResponse
            r25 = -1
            r27 = 0
            r22 = r2
            r23 = r14
            r24 = r11
            r22.<init>(r23, r24, r25, r27)
            if (r14 != r7) goto L_0x0260
            goto L_0x0263
        L_0x0260:
            if (r14 == r4) goto L_0x0263
            goto L_0x0274
        L_0x0263:
            com.google.android.gms.config.internal.FetchConfigIpcResponse r2 = new com.google.android.gms.config.internal.FetchConfigIpcResponse
            long r3 = r3.g
            r22 = r2
            r23 = r14
            r24 = r11
            r25 = r3
            r27 = r1
            r22.<init>(r23, r24, r25, r27)
        L_0x0274:
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.a
            r0.a((com.google.android.gms.common.api.Status) r3, (com.google.android.gms.config.internal.FetchConfigIpcResponse) r2)
            if (r11 == 0) goto L_0x0284
            boolean r0 = r11.b()
            if (r0 != 0) goto L_0x0284
            r11.close()
        L_0x0284:
            if (r1 == 0) goto L_0x028f
            boolean r0 = r1.b()
            if (r0 != 0) goto L_0x028f
            r1.close()
        L_0x028f:
            r9.a((defpackage.acrz) r10)
            goto L_0x03a8
        L_0x0294:
            long r3 = r1.b
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x02a0
            int r4 = (int) r3
            r13 = r4
            goto L_0x02a6
        L_0x02a0:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r13 = 2147483647(0x7fffffff, float:NaN)
        L_0x02a6:
            java.lang.String r14 = r1.a
            java.util.List r8 = r1.g
            java.lang.String r6 = r1.e
            java.lang.String r5 = r1.f
            int r4 = r1.h
            java.util.List r3 = r1.i
            int r11 = r1.j
            int r1 = r1.k
            r18 = r8
            jog r8 = new jog
            r8.<init>()
            r8.b = r14
            r8.a = r9
            r8.e = r7
            r8.d = r2
            r7 = 60000(0xea60, float:8.4078E-41)
            r19 = 30000(0x7530, float:4.2039E-41)
            r22 = 1800000(0x1b7740, float:2.522337E-39)
            java.lang.String r23 = "http_connection_timeout_millis"
            r28 = r3
            r3 = r9
            r29 = r4
            r4 = r14
            r30 = r5
            r5 = r23
            r31 = r6
            r6 = r7
            r7 = r19
            r19 = r2
            r0 = r8
            r2 = r18
            r8 = r22
            int r3 = r3.a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (int) r7, (int) r8)
            r0.f = r3
            r6 = 60000(0xea60, float:8.4078E-41)
            r7 = 30000(0x7530, float:4.2039E-41)
            r8 = 1800000(0x1b7740, float:2.522337E-39)
            java.lang.String r5 = "http_read_timeout_millis"
            r3 = r9
            int r3 = r3.a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (int) r7, (int) r8)
            r0.g = r3
            r0.h = r2
            r2 = r31
            r0.i = r2
            r2 = r30
            r0.j = r2
            r2 = r29
            r0.k = r2
            r2 = r28
            r0.l = r2
            r0.m = r13
            r0.n = r11
            r0.o = r1
            java.lang.Object r1 = r9.a
            monitor-enter(r1)
            java.util.Map r2 = r9.c     // Catch:{ all -> 0x0357 }
            java.lang.Object r2 = r2.get(r14)     // Catch:{ all -> 0x0357 }
            if (r2 == 0) goto L_0x033b
            java.util.Map r2 = r9.c     // Catch:{ all -> 0x0357 }
            java.lang.Object r2 = r2.get(r14)     // Catch:{ all -> 0x0357 }
            job r2 = (defpackage.job) r2     // Catch:{ all -> 0x0357 }
            java.util.Map r2 = r2.a     // Catch:{ all -> 0x0357 }
            if (r2 == 0) goto L_0x033b
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x0357 }
            java.util.Map r2 = r9.c     // Catch:{ all -> 0x0357 }
            java.lang.Object r2 = r2.get(r14)     // Catch:{ all -> 0x0357 }
            job r2 = (defpackage.job) r2     // Catch:{ all -> 0x0357 }
            java.util.Map r2 = r2.a     // Catch:{ all -> 0x0357 }
            r11.<init>(r2)     // Catch:{ all -> 0x0357 }
            goto L_0x033c
        L_0x033b:
            r11 = 0
        L_0x033c:
            monitor-exit(r1)     // Catch:{ all -> 0x0357 }
            r0.c = r11
            joh r11 = new joh
            r1 = r11
            r8 = r19
            r2 = r9
            r3 = r0
            r4 = r14
            r5 = r15
            r7 = r33
            r9 = r12
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            jod r0 = new jod
            r0.<init>()
            r0.execute(r11)
            goto L_0x03a8
        L_0x0357:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0357 }
            throw r0
        L_0x035a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x035a }
            throw r0
        L_0x035d:
            java.lang.Object r2 = r9.a
            monitor-enter(r2)
            java.util.Map r0 = r9.b     // Catch:{ all -> 0x03ac }
            java.lang.String r3 = r1.a     // Catch:{ all -> 0x03ac }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x03ac }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x03ac }
            java.util.Map r3 = r9.e     // Catch:{ all -> 0x03ac }
            java.lang.String r1 = r1.a     // Catch:{ all -> 0x03ac }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x03ac }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x03ac }
            monitor-exit(r2)     // Catch:{ all -> 0x03ac }
            if (r0 == 0) goto L_0x037c
            com.google.android.gms.common.data.DataHolder r11 = r9.b((java.util.Map) r0)
            goto L_0x037d
        L_0x037c:
            r11 = 0
        L_0x037d:
            com.google.android.gms.common.data.DataHolder r0 = r9.b((java.util.List) r1)
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.a
            com.google.android.gms.config.internal.FetchConfigIpcResponse r2 = new com.google.android.gms.config.internal.FetchConfigIpcResponse
            r3 = 6501(0x1965, float:9.11E-42)
            r2.<init>(r3, r11, r0)
            r3 = r33
            r3.a((com.google.android.gms.common.api.Status) r1, (com.google.android.gms.config.internal.FetchConfigIpcResponse) r2)
            if (r11 == 0) goto L_0x039a
            boolean r1 = r11.b()
            if (r1 != 0) goto L_0x039a
            r11.close()
        L_0x039a:
            if (r0 == 0) goto L_0x03a5
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x03a5
            r0.close()
        L_0x03a5:
            r9.a((defpackage.acrz) r10)
        L_0x03a8:
            android.os.Binder.restoreCallingIdentity(r20)
            return
        L_0x03ac:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03ac }
            throw r0
        L_0x03af:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03af }
            goto L_0x03b3
        L_0x03b2:
            throw r0
        L_0x03b3:
            goto L_0x03b2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.joq.a(jop, com.google.android.gms.config.internal.FetchConfigIpcRequest):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public joq(ConfigChimeraService configChimeraService) {
        super("com.google.android.gms.config.internal.IConfigService");
        this.a = configChimeraService;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10, android.os.Parcel r11, android.os.Parcel r12) {
        /*
            r9 = this;
            r0 = 4
            java.lang.String r1 = "com.google.android.gms.config.internal.IConfigCallbacks"
            r2 = 0
            if (r10 == r0) goto L_0x00a9
            r0 = 5
            if (r10 == r0) goto L_0x0071
            r0 = 6
            if (r10 == r0) goto L_0x0038
            r0 = 8
            if (r10 == r0) goto L_0x0012
            r10 = 0
            return r10
        L_0x0012:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x002a
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.jop
            if (r1 == 0) goto L_0x0024
            r2 = r0
            jop r2 = (defpackage.jop) r2
            goto L_0x002b
        L_0x0024:
            jon r2 = new jon
            r2.<init>(r10)
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            android.os.Parcelable$Creator r10 = com.google.android.gms.config.internal.FetchConfigIpcRequest.CREATOR
            android.os.Parcelable r10 = defpackage.bhx.a((android.os.Parcel) r11, (android.os.Parcelable.Creator) r10)
            com.google.android.gms.config.internal.FetchConfigIpcRequest r10 = (com.google.android.gms.config.internal.FetchConfigIpcRequest) r10
            r9.a(r2, r10)
            goto L_0x00e0
        L_0x0038:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x0051
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.jop
            if (r1 == 0) goto L_0x004b
            r2 = r0
            jop r2 = (defpackage.jop) r2
            r5 = r2
            goto L_0x0053
        L_0x004b:
            jon r2 = new jon
            r2.<init>(r10)
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            r5 = r2
        L_0x0053:
            java.lang.String r10 = r11.readString()
            java.util.ArrayList r8 = defpackage.bhx.b(r11)
            int r6 = android.os.Binder.getCallingUid()
            jnx r11 = new jnx
            r3 = r11
            r4 = r9
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            com.google.android.gms.config.internal.FetchConfigIpcRequest r0 = new com.google.android.gms.config.internal.FetchConfigIpcRequest
            r0.<init>(r10)
            r9.a(r11, r0)
            goto L_0x00e0
        L_0x0071:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x008a
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.jop
            if (r1 == 0) goto L_0x0084
            r2 = r0
            jop r2 = (defpackage.jop) r2
            r5 = r2
            goto L_0x008c
        L_0x0084:
            jon r2 = new jon
            r2.<init>(r10)
            goto L_0x008b
        L_0x008a:
        L_0x008b:
            r5 = r2
        L_0x008c:
            java.lang.String r10 = r11.readString()
            java.lang.String r8 = r11.readString()
            int r6 = android.os.Binder.getCallingUid()
            jny r11 = new jny
            r3 = r11
            r4 = r9
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            com.google.android.gms.config.internal.FetchConfigIpcRequest r0 = new com.google.android.gms.config.internal.FetchConfigIpcRequest
            r0.<init>(r10)
            r9.a(r11, r0)
            goto L_0x00e0
        L_0x00a9:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 == 0) goto L_0x00c2
            android.os.IInterface r0 = r10.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.jop
            if (r1 == 0) goto L_0x00bc
            r2 = r0
            jop r2 = (defpackage.jop) r2
            r5 = r2
            goto L_0x00c4
        L_0x00bc:
            jon r2 = new jon
            r2.<init>(r10)
            goto L_0x00c3
        L_0x00c2:
        L_0x00c3:
            r5 = r2
        L_0x00c4:
            java.lang.String r10 = r11.readString()
            java.lang.String r8 = r11.readString()
            int r6 = android.os.Binder.getCallingUid()
            jnw r11 = new jnw
            r3 = r11
            r4 = r9
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            com.google.android.gms.config.internal.FetchConfigIpcRequest r0 = new com.google.android.gms.config.internal.FetchConfigIpcRequest
            r0.<init>(r10)
            r9.a(r11, r0)
        L_0x00e0:
            r12.writeNoException()
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.joq.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
