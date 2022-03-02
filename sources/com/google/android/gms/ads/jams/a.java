package com.google.android.gms.ads.jams;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a implements com.google.android.gms.ads.task.a {
    private final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    static void c() {
        qwq a2 = qwq.a((Context) ihs.b());
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.ads.jams.NegotiationService";
        qxf.a(0, awhl.d());
        qxf.k = "jams-negotiation-task";
        qxf.b(1);
        a2.a((qxx) qxf.b());
        StringBuilder sb = new StringBuilder(62);
        sb.append("[JAMS] Next negotiation to run in 0 seconds");
        c.a(sb.toString());
    }

    public final void a() {
        if (new d(ihs.b()).c()) {
            c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x03ac A[SYNTHETIC, Splitter:B:168:0x03ac] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0765  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x077a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:336:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r36 = this;
            r1 = r36
            com.google.android.gms.ads.jams.c r2 = r1.a
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r0 = r0.getTime()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 36
            r4.<init>(r3)
            java.lang.String r3 = "[JAMS] Negotiator starts running at "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.google.android.gms.ads.internal.util.client.c.a((java.lang.String) r0)
            com.google.android.gms.ads.jams.b r0 = r2.a
            boolean r3 = r0.b()
            r5 = 1
            java.lang.String r7 = ""
            java.lang.String r8 = "temporal_cookie"
            java.lang.String r9 = "temporal_cookie_expiration_timestamp"
            r12 = 0
            r15 = 1
            r14 = 0
            if (r3 != 0) goto L_0x01cf
            com.google.android.gms.ads.jams.d r3 = r0.c
            android.content.SharedPreferences r3 = r3.a
            java.lang.String r4 = "scheduled_next_negotiation_timestamp"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0078
            com.google.android.gms.ads.jams.d r3 = r0.c
            android.content.SharedPreferences r3 = r3.a
            long r3 = r3.getLong(r4, r12)
            long r16 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r16
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r17 = r11.toMillis(r5)
            int r11 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r11 >= 0) goto L_0x0067
            goto L_0x0078
        L_0x0067:
            java.lang.String r11 = "[JAMS] Too early to perform negotiation"
            com.google.android.gms.ads.internal.util.client.c.a((java.lang.String) r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r11.toSeconds(r3)
            r0.a(r3)
            goto L_0x01d0
        L_0x0078:
            qub r3 = r0.b
            java.lang.String r4 = "com.google"
            android.accounts.Account[] r3 = r3.a((java.lang.String) r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            com.google.android.gms.ads.jams.d r11 = r0.c
            java.util.Set r11 = r11.a()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            int r6 = r3.length
            r10 = 0
        L_0x0092:
            if (r10 >= r6) goto L_0x00a0
            r12 = r3[r10]
            java.lang.String r12 = r12.name
            r4.add(r12)
            int r10 = r10 + 1
            r12 = 0
            goto L_0x0092
        L_0x00a0:
            java.util.Iterator r6 = r11.iterator()
        L_0x00a4:
            boolean r10 = r6.hasNext()
            java.lang.String r11 = "default_account_name"
            if (r10 == 0) goto L_0x00f0
            java.lang.Object r10 = r6.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r12 = r4.contains(r10)
            if (r12 != 0) goto L_0x00a4
            com.google.android.gms.ads.jams.d r12 = r0.c
            android.content.SharedPreferences r12 = r12.a
            java.lang.String r11 = r12.getString(r11, r7)
            boolean r11 = r10.equals(r11)
            r12 = 3
            if (r11 != 0) goto L_0x00c9
            r11 = 5
            goto L_0x00ca
        L_0x00c9:
            r11 = 3
        L_0x00ca:
            com.google.android.gms.ads.jams.d r13 = r0.c
            boolean r13 = r13.d()
            if (r13 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            if (r11 != r12) goto L_0x00de
        L_0x00d5:
            int r11 = r11 + -1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5.put(r10, r11)
        L_0x00de:
            com.google.android.gms.ads.jams.d r11 = r0.c
            android.content.SharedPreferences r10 = r11.a((java.lang.String) r10)
            android.content.SharedPreferences$Editor r10 = r10.edit()
            android.content.SharedPreferences$Editor r10 = r10.clear()
            r10.apply()
            goto L_0x00a4
        L_0x00f0:
            java.util.Iterator r6 = r4.iterator()
        L_0x00f4:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0159
            java.lang.Object r10 = r6.next()
            java.lang.String r10 = (java.lang.String) r10
            int r12 = r3.length
            if (r12 <= r15) goto L_0x0111
            r12 = r3[r14]
            java.lang.String r12 = r12.name
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x010f
            r12 = 4
            goto L_0x0112
        L_0x010f:
            r12 = 2
            goto L_0x0112
        L_0x0111:
            r12 = 1
        L_0x0112:
            com.google.android.gms.ads.jams.d r13 = r0.c
            android.content.SharedPreferences r13 = r13.a((java.lang.String) r10)
            boolean r19 = r13.contains(r9)
            if (r19 == 0) goto L_0x0141
            r14 = 0
            long r20 = r13.getLong(r9, r14)
            long r13 = java.lang.System.currentTimeMillis()
            int r15 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x0141
            com.google.android.gms.ads.jams.d r13 = r0.c
            android.content.SharedPreferences r13 = r13.a((java.lang.String) r10)
            android.content.SharedPreferences$Editor r13 = r13.edit()
            android.content.SharedPreferences$Editor r13 = r13.remove(r8)
            android.content.SharedPreferences$Editor r13 = r13.remove(r9)
            r13.apply()
        L_0x0141:
            com.google.android.gms.ads.jams.d r13 = r0.c
            boolean r13 = r13.d()
            if (r13 == 0) goto L_0x014a
            goto L_0x014d
        L_0x014a:
            r13 = 4
            if (r12 == r13) goto L_0x0156
        L_0x014d:
            int r12 = r12 + -1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r5.put(r10, r12)
        L_0x0156:
            r14 = 0
            r15 = 1
            goto L_0x00f4
        L_0x0159:
            int r6 = r3.length
            if (r6 <= 0) goto L_0x0171
            com.google.android.gms.ads.jams.d r6 = r0.c
            r10 = 0
            r3 = r3[r10]
            java.lang.String r3 = r3.name
            android.content.SharedPreferences r6 = r6.a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r3 = r6.putString(r11, r3)
            r3.apply()
            goto L_0x01bd
        L_0x0171:
            com.google.android.gms.ads.jams.d r3 = r0.c
            java.util.Set r6 = r3.a()
            java.util.Iterator r6 = r6.iterator()
        L_0x017b:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x01b0
            java.lang.Object r10 = r6.next()
            java.lang.String r10 = (java.lang.String) r10
            android.content.Context r11 = r3.b
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r12 = "jams.prefs."
            int r13 = r10.length()
            if (r13 != 0) goto L_0x019b
            java.lang.String r10 = new java.lang.String
            r10.<init>(r12)
            goto L_0x019f
        L_0x019b:
            java.lang.String r10 = r12.concat(r10)
        L_0x019f:
            r12 = 0
            android.content.SharedPreferences r10 = r11.getSharedPreferences(r10, r12)
            android.content.SharedPreferences$Editor r10 = r10.edit()
            android.content.SharedPreferences$Editor r10 = r10.clear()
            r10.apply()
            goto L_0x017b
        L_0x01b0:
            android.content.SharedPreferences r3 = r3.a
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.clear()
            r3.apply()
        L_0x01bd:
            com.google.android.gms.ads.jams.d r0 = r0.c
            android.content.SharedPreferences r0 = r0.a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "all_account_names"
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r3, r4)
            r0.apply()
            goto L_0x01d1
        L_0x01cf:
        L_0x01d0:
            r5 = 0
        L_0x01d1:
            if (r5 == 0) goto L_0x0832
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r3 = r0.iterator()
            r4 = 0
            r10 = 0
        L_0x01de:
            boolean r0 = r3.hasNext()
            java.lang.String r6 = "ideal_next_negotiation_timestamp"
            java.lang.String r11 = "time_to_next_negotiation_mins"
            if (r0 == 0) goto L_0x077d
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r12 = r0.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r13 = defpackage.aoti.a(r0)
            com.google.android.gms.ads.jams.b r0 = r2.a
            boolean r14 = r12.isEmpty()
            if (r14 != 0) goto L_0x0239
            android.content.Context r0 = r0.a     // Catch:{ Exception -> 0x0214 }
            java.lang.String r14 = "oauth2:https://www.googleapis.com/auth/ads_measurement"
            java.lang.String r0 = defpackage.eig.a((android.content.Context) r0, (java.lang.String) r12, (java.lang.String) r14)     // Catch:{ Exception -> 0x0214 }
            r14 = r0
            goto L_0x023a
        L_0x0214:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r14 = java.lang.String.valueOf(r0)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 34
            r15.<init>(r14)
            java.lang.String r14 = "[JAMS] Failed to get OAuth token: "
            r15.append(r14)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            com.google.android.gms.ads.internal.util.client.c.b(r0)
            r14 = 0
            goto L_0x023a
        L_0x0239:
            r14 = 0
        L_0x023a:
            if (r14 != 0) goto L_0x024b
            com.google.android.gms.ads.jams.b r0 = r2.a
            java.lang.Boolean r0 = r0.a()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0249
            goto L_0x024b
        L_0x0249:
            r10 = 1
            goto L_0x01de
        L_0x024b:
            com.google.android.gms.ads.jams.b r15 = r2.a
            boolean r0 = defpackage.awhl.c()
            if (r0 == 0) goto L_0x0258
            ihs r0 = defpackage.ihs.b()
            goto L_0x025a
        L_0x0258:
            android.content.Context r0 = r15.a
        L_0x025a:
            int r20 = defpackage.bgr.h
            defpackage.bgq.a(r0)
            defpackage.bgq.a(r7, r0)
            bgr r1 = new bgr
            r1.<init>(r0, r7)
            boolean r20 = defpackage.bgq.a()
            if (r20 == 0) goto L_0x027c
            r20 = r3
            java.util.concurrent.ExecutorService r3 = defpackage.bgq.c
            r21 = r10
            bgp r10 = new bgp
            r10.<init>(r0)
            r3.execute(r10)
            goto L_0x0280
        L_0x027c:
            r20 = r3
            r21 = r10
        L_0x0280:
            boolean r3 = defpackage.bho.a()
            if (r3 == 0) goto L_0x029d
            com.google.android.gms.ads.internal.config.f r3 = com.google.android.gms.ads.internal.config.n.k
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0295
            goto L_0x029d
        L_0x0295:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The caller must not be called from the UI thread."
            r0.<init>(r1)
            throw r0
        L_0x029d:
            long r22 = java.lang.System.currentTimeMillis()
            com.google.android.gms.ads.internal.config.f r3 = com.google.android.gms.ads.internal.config.n.c
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x02b4
            r32 = r4
            r4 = 0
            r10 = 0
            goto L_0x02d5
        L_0x02b4:
            bhm r10 = defpackage.bgn.a
            if (r10 == 0) goto L_0x02bd
            bhm r10 = defpackage.bgn.a
            bgm r10 = r10.l
            goto L_0x02be
        L_0x02bd:
            r10 = 0
        L_0x02be:
            com.google.android.gms.ads.internal.config.f r24 = com.google.android.gms.ads.internal.config.n.i
            java.lang.Object r24 = r24.a()
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            boolean r24 = r24.booleanValue()
            if (r24 != 0) goto L_0x02cf
            java.lang.String r24 = "te"
            goto L_0x02d1
        L_0x02cf:
            java.lang.String r24 = "be"
        L_0x02d1:
            r32 = r4
            r4 = r24
        L_0x02d5:
            com.google.ads.afma.proto2api.c r5 = com.google.ads.afma.proto2api.c.Q     // Catch:{ Exception -> 0x0382 }
            aucd r5 = r5.o()     // Catch:{ Exception -> 0x0382 }
            r24 = r9
            java.lang.String r9 = r1.g     // Catch:{ Exception -> 0x037b }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x037b }
            if (r9 != 0) goto L_0x0312
            java.lang.String r9 = r1.g     // Catch:{ Exception -> 0x030d }
            r34 = r14
            boolean r14 = r5.c     // Catch:{ Exception -> 0x0308 }
            if (r14 != 0) goto L_0x02ee
            goto L_0x02f4
        L_0x02ee:
            r5.c()     // Catch:{ Exception -> 0x0308 }
            r14 = 0
            r5.c = r14     // Catch:{ Exception -> 0x0308 }
        L_0x02f4:
            aucj r14 = r5.b     // Catch:{ Exception -> 0x0308 }
            com.google.ads.afma.proto2api.c r14 = (com.google.ads.afma.proto2api.c) r14     // Catch:{ Exception -> 0x0308 }
            r9.getClass()     // Catch:{ Exception -> 0x0308 }
            r35 = r2
            int r2 = r14.a     // Catch:{ Exception -> 0x0379 }
            r16 = 2
            r2 = r2 | 2
            r14.a = r2     // Catch:{ Exception -> 0x0379 }
            r14.e = r9     // Catch:{ Exception -> 0x0379 }
            goto L_0x0316
        L_0x0308:
            r0 = move-exception
            r35 = r2
            goto L_0x0389
        L_0x030d:
            r0 = move-exception
            r35 = r2
            goto L_0x0387
        L_0x0312:
            r35 = r2
            r34 = r14
        L_0x0316:
            bhm r2 = defpackage.bgq.b(r0)     // Catch:{ Exception -> 0x0379 }
            java.util.concurrent.ExecutorService r9 = r2.b     // Catch:{ Exception -> 0x0379 }
            if (r9 == 0) goto L_0x035e
            java.util.List r0 = r1.a(r2, r0, r5)     // Catch:{ Exception -> 0x0379 }
            bhm r1 = defpackage.bgn.a     // Catch:{ Exception -> 0x0379 }
            if (r1 == 0) goto L_0x035b
            bhm r1 = defpackage.bgn.a     // Catch:{ Exception -> 0x0379 }
            java.util.concurrent.ExecutorService r1 = r1.b     // Catch:{ Exception -> 0x0379 }
            if (r1 == 0) goto L_0x035b
            boolean r2 = r0.isEmpty()     // Catch:{ Exception -> 0x0379 }
            if (r2 != 0) goto L_0x0358
            com.google.android.gms.ads.internal.config.f r2 = com.google.android.gms.ads.internal.config.n.d     // Catch:{ InterruptedException -> 0x0348 }
            java.lang.Object r2 = r2.a()     // Catch:{ InterruptedException -> 0x0348 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ InterruptedException -> 0x0348 }
            r14 = r5
            r9 = r6
            long r5 = r2.longValue()     // Catch:{ InterruptedException -> 0x0346 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0346 }
            r1.invokeAll(r0, r5, r2)     // Catch:{ InterruptedException -> 0x0346 }
            goto L_0x0360
        L_0x0346:
            r0 = move-exception
            goto L_0x034b
        L_0x0348:
            r0 = move-exception
            r14 = r5
            r9 = r6
        L_0x034b:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0356 }
            java.lang.String r0 = defpackage.bho.a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0356 }
            r1 = 0
            r2[r1] = r0     // Catch:{ Exception -> 0x0356 }
            goto L_0x0360
        L_0x0356:
            r0 = move-exception
            goto L_0x038a
        L_0x0358:
            r14 = r5
            r9 = r6
            goto L_0x0360
        L_0x035b:
            r14 = r5
            r9 = r6
            goto L_0x0360
        L_0x035e:
            r14 = r5
            r9 = r6
        L_0x0360:
            if (r3 != 0) goto L_0x0363
            goto L_0x0377
        L_0x0363:
            if (r10 == 0) goto L_0x0376
            r0 = 1000(0x3e8, float:1.401E-42)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0371 }
            long r1 = r1 - r22
            r10.a(r0, r1, r4)     // Catch:{ Exception -> 0x0371 }
            goto L_0x0376
        L_0x0371:
            r0 = move-exception
            r31 = r0
            r5 = r14
            goto L_0x038d
        L_0x0376:
        L_0x0377:
            r5 = r14
            goto L_0x03a5
        L_0x0379:
            r0 = move-exception
            goto L_0x0389
        L_0x037b:
            r0 = move-exception
            r35 = r2
            r9 = r6
            r34 = r14
            goto L_0x038a
        L_0x0382:
            r0 = move-exception
            r35 = r2
            r24 = r9
        L_0x0387:
            r34 = r14
        L_0x0389:
            r9 = r6
        L_0x038a:
            r31 = r0
            r5 = 0
        L_0x038d:
            if (r3 != 0) goto L_0x0390
            goto L_0x03a5
        L_0x0390:
            if (r10 == 0) goto L_0x03a4
            r26 = 1001(0x3e9, float:1.403E-42)
            r27 = -1
            long r0 = java.lang.System.currentTimeMillis()
            long r28 = r0 - r22
            r25 = r10
            r30 = r4
            r25.a(r26, r27, r28, r30, r31)
            goto L_0x03a5
        L_0x03a4:
        L_0x03a5:
            long r1 = java.lang.System.currentTimeMillis()
            r6 = -1
            if (r5 == 0) goto L_0x03f5
            aucj r0 = r5.i()     // Catch:{ Exception -> 0x03ef }
            com.google.ads.afma.proto2api.c r0 = (com.google.ads.afma.proto2api.c) r0     // Catch:{ Exception -> 0x03ef }
            int r14 = r0.U     // Catch:{ Exception -> 0x03ef }
            if (r14 != r6) goto L_0x03c8
            aueh r14 = defpackage.aueh.a     // Catch:{ Exception -> 0x03c3 }
            aueq r14 = r14.a((java.lang.Object) r0)     // Catch:{ Exception -> 0x03c3 }
            int r14 = r14.b(r0)     // Catch:{ Exception -> 0x03c3 }
            r0.U = r14     // Catch:{ Exception -> 0x03c3 }
            goto L_0x03c9
        L_0x03c3:
            r0 = move-exception
            r31 = r0
            r14 = r7
            goto L_0x03f3
        L_0x03c8:
        L_0x03c9:
            if (r14 == 0) goto L_0x03ed
            aucj r0 = r5.i()     // Catch:{ Exception -> 0x03ef }
            com.google.ads.afma.proto2api.c r0 = (com.google.ads.afma.proto2api.c) r0     // Catch:{ Exception -> 0x03ef }
            java.lang.String r0 = defpackage.bfu.a((com.google.ads.afma.proto2api.c) r0)     // Catch:{ Exception -> 0x03ef }
            if (r3 != 0) goto L_0x03d9
            r14 = r7
            goto L_0x03eb
        L_0x03d9:
            if (r10 == 0) goto L_0x03ea
            r5 = 1004(0x3ec, float:1.407E-42)
            long r22 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x03ef }
            r14 = r7
            long r6 = r22 - r1
            r10.a(r5, r6, r4)     // Catch:{ Exception -> 0x03e8 }
            goto L_0x03eb
        L_0x03e8:
            r0 = move-exception
            goto L_0x03f1
        L_0x03ea:
            r14 = r7
        L_0x03eb:
            r5 = 5
            goto L_0x041d
        L_0x03ed:
            r14 = r7
            goto L_0x03f6
        L_0x03ef:
            r0 = move-exception
            r14 = r7
        L_0x03f1:
            r31 = r0
        L_0x03f3:
            r5 = 5
            goto L_0x0400
        L_0x03f5:
            r14 = r7
        L_0x03f6:
            r5 = 5
            java.lang.String r0 = java.lang.Integer.toString(r5)     // Catch:{ Exception -> 0x03fd }
            goto L_0x041d
        L_0x03fd:
            r0 = move-exception
            r31 = r0
        L_0x0400:
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r3 != 0) goto L_0x0408
            goto L_0x041d
        L_0x0408:
            if (r10 == 0) goto L_0x041c
            r26 = 1005(0x3ed, float:1.408E-42)
            r27 = -1
            long r6 = java.lang.System.currentTimeMillis()
            long r28 = r6 - r1
            r25 = r10
            r30 = r4
            r25.a(r26, r27, r28, r30, r31)
            goto L_0x041d
        L_0x041c:
        L_0x041d:
            aotj r1 = defpackage.aotj.g
            aucd r1 = r1.o()
            com.google.android.gms.ads.jams.d r2 = r15.c
            android.content.SharedPreferences r2 = r2.a((java.lang.String) r12)
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L_0x0452
            com.google.android.gms.ads.jams.d r2 = r15.c
            android.content.SharedPreferences r2 = r2.a((java.lang.String) r12)
            java.lang.String r2 = r2.getString(r8, r14)
            boolean r3 = r1.c
            if (r3 == 0) goto L_0x0443
            r1.c()
            r3 = 0
            r1.c = r3
        L_0x0443:
            aucj r3 = r1.b
            aotj r3 = (defpackage.aotj) r3
            r2.getClass()
            int r4 = r3.a
            r6 = 1
            r4 = r4 | r6
            r3.a = r4
            r3.b = r2
        L_0x0452:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0457
            goto L_0x045d
        L_0x0457:
            r1.c()
            r2 = 0
            r1.c = r2
        L_0x045d:
            aucj r2 = r1.b
            aotj r2 = (defpackage.aotj) r2
            r0.getClass()
            int r3 = r2.a
            r4 = 2
            r3 = r3 | r4
            r2.a = r3
            r2.c = r0
            int r0 = r13 + -1
            if (r13 == 0) goto L_0x077a
            r2.f = r0
            r0 = r3 | 256(0x100, float:3.59E-43)
            r2.a = r0
            r3 = 1
            if (r13 == r3) goto L_0x047c
            java.lang.String r3 = "uds-gmscore"
            goto L_0x047e
        L_0x047c:
            java.lang.String r3 = "gmscore"
        L_0x047e:
            r3.getClass()
            r0 = r0 | 4
            r2.a = r0
            r2.d = r3
            aotm r0 = defpackage.aotm.h
            aucd r0 = r0.o()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0492
            goto L_0x0498
        L_0x0492:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x0498:
            aucj r2 = r0.b
            aotm r2 = (defpackage.aotm) r2
            java.lang.String r3 = "20141203-01"
            r3.getClass()
            int r4 = r2.a
            r6 = 1
            r4 = r4 | r6
            r2.a = r4
            r2.b = r3
            com.google.android.gms.ads.jams.d r2 = r15.c
            android.content.SharedPreferences r2 = r2.a
            boolean r2 = r2.contains(r11)
            if (r2 == 0) goto L_0x04d5
            com.google.android.gms.ads.jams.d r2 = r15.c
            android.content.SharedPreferences r2 = r2.a
            r3 = 0
            long r6 = r2.getLong(r11, r3)
            int r2 = (int) r6
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x04c3
            goto L_0x04c9
        L_0x04c3:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x04c9:
            aucj r3 = r0.b
            aotm r3 = (defpackage.aotm) r3
            int r4 = r3.a
            r6 = 2
            r4 = r4 | r6
            r3.a = r4
            r3.c = r2
        L_0x04d5:
            com.google.android.gms.ads.jams.d r2 = r15.c
            android.content.SharedPreferences r2 = r2.a
            java.lang.String r3 = "retry_count"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x04ff
            com.google.android.gms.ads.jams.d r2 = r15.c
            long r2 = r2.e()
            int r3 = (int) r2
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x04ed
            goto L_0x04f3
        L_0x04ed:
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x04f3:
            aucj r2 = r0.b
            aotm r2 = (defpackage.aotm) r2
            int r4 = r2.a
            r6 = 4
            r4 = r4 | r6
            r2.a = r4
            r2.d = r3
        L_0x04ff:
            com.google.android.gms.ads.jams.d r2 = r15.c
            android.content.SharedPreferences r2 = r2.a
            boolean r2 = r2.contains(r9)
            if (r2 == 0) goto L_0x0539
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = java.lang.System.currentTimeMillis()
            com.google.android.gms.ads.jams.d r6 = r15.c
            android.content.SharedPreferences r6 = r6.a
            r10 = 0
            long r6 = r6.getLong(r9, r10)
            long r3 = r3 - r6
            long r3 = java.lang.Math.max(r10, r3)
            long r2 = r2.toMinutes(r3)
            int r3 = (int) r2
            boolean r2 = r0.c
            if (r2 == 0) goto L_0x052d
            r0.c()
            r2 = 0
            r0.c = r2
        L_0x052d:
            aucj r2 = r0.b
            aotm r2 = (defpackage.aotm) r2
            int r4 = r2.a
            r4 = r4 | 8
            r2.a = r4
            r2.e = r3
        L_0x0539:
            int r2 = defpackage.jlo.b()
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0542
            goto L_0x0548
        L_0x0542:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x0548:
            aucj r3 = r0.b
            aotm r3 = (defpackage.aotm) r3
            int r4 = r3.a
            r4 = r4 | 32
            r3.a = r4
            r3.f = r2
            aotl r2 = defpackage.aotl.e
            aucd r2 = r2.o()
            long r3 = defpackage.awhl.b()
            boolean r6 = r2.c
            if (r6 != 0) goto L_0x0563
            goto L_0x0569
        L_0x0563:
            r2.c()
            r6 = 0
            r2.c = r6
        L_0x0569:
            aucj r6 = r2.b
            aotl r6 = (defpackage.aotl) r6
            int r7 = r6.a
            r9 = 1
            r7 = r7 | r9
            r6.a = r7
            r6.b = r3
            boolean r3 = defpackage.awhl.c()
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x057e
            goto L_0x0584
        L_0x057e:
            r2.c()
            r4 = 0
            r2.c = r4
        L_0x0584:
            aucj r4 = r2.b
            aotl r4 = (defpackage.aotl) r4
            int r6 = r4.a
            r7 = 2
            r6 = r6 | r7
            r4.a = r6
            r4.c = r3
            long r3 = defpackage.awhl.e()
            boolean r6 = r2.c
            if (r6 != 0) goto L_0x0599
            goto L_0x059f
        L_0x0599:
            r2.c()
            r6 = 0
            r2.c = r6
        L_0x059f:
            aucj r6 = r2.b
            aotl r6 = (defpackage.aotl) r6
            int r9 = r6.a
            r10 = 4
            r9 = r9 | r10
            r6.a = r9
            r6.d = r3
            aucj r2 = r2.i()
            aotl r2 = (defpackage.aotl) r2
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x05b6
            goto L_0x05bc
        L_0x05b6:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x05bc:
            aucj r3 = r0.b
            aotm r3 = (defpackage.aotm) r3
            r2.getClass()
            r3.g = r2
            int r2 = r3.a
            r2 = r2 | 64
            r3.a = r2
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x05d0
            goto L_0x05d6
        L_0x05d0:
            r1.c()
            r2 = 0
            r1.c = r2
        L_0x05d6:
            aucj r2 = r1.b
            aotj r2 = (defpackage.aotj) r2
            aucj r0 = r0.i()
            aotm r0 = (defpackage.aotm) r0
            r0.getClass()
            r2.e = r0
            int r0 = r2.a
            r0 = r0 | 32
            r2.a = r0
            aucj r0 = r1.i()
            aotj r0 = (defpackage.aotj) r0
            r1 = r35
            com.google.android.gms.ads.jams.b r2 = r1.a
            r3 = 260(0x104, float:3.64E-43)
            defpackage.izj.b(r3)
            byte[] r3 = r0.k()     // Catch:{ Exception -> 0x06c3, all -> 0x06ba }
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x06c3, all -> 0x06ba }
            java.lang.Boolean r2 = r2.a()     // Catch:{ Exception -> 0x06c3, all -> 0x06ba }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x06c3, all -> 0x06ba }
            if (r2 != 0) goto L_0x060d
            java.lang.String r2 = "https://www.googleapis.com/adsmeasurement/v1/measurement/transmit?key=AIzaSyAF4QL5fUEwz9gUpsIySsmqqr9pVow3MuU"
            goto L_0x060f
        L_0x060d:
            java.lang.String r2 = "https://www.googleapis.com/adsmeasurement/v1/measurement/transmit"
        L_0x060f:
            r4.<init>(r2)     // Catch:{ Exception -> 0x06c3, all -> 0x06ba }
            r2 = 256(0x100, float:3.59E-43)
            java.net.URLConnection r2 = defpackage.jlk.a(r4, r2)     // Catch:{ Exception -> 0x06c3, all -> 0x06ba }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ Exception -> 0x06c3, all -> 0x06ba }
            awhl r4 = defpackage.awhl.a     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            awhm r4 = r4.a()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            long r5 = r4.d()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            int r4 = (int) r5     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r2.setConnectTimeout(r4)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            awhl r4 = defpackage.awhl.a     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            awhm r4 = r4.a()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            long r4 = r4.e()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            int r5 = (int) r4     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r2.setReadTimeout(r5)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            java.lang.String r4 = "POST"
            r2.setRequestMethod(r4)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            java.lang.String r4 = "Content-type"
            java.lang.String r5 = "application/x-protobuf"
            r2.setRequestProperty(r4, r5)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            int r4 = r3.length     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            java.lang.String r5 = "Content-Length"
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r2.setRequestProperty(r5, r6)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            if (r34 == 0) goto L_0x0667
            java.lang.String r5 = "Authorization"
            java.lang.String r6 = "Bearer "
            int r9 = r34.length()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            if (r9 != 0) goto L_0x065e
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            goto L_0x0664
        L_0x065e:
            r9 = r34
            java.lang.String r9 = r6.concat(r9)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
        L_0x0664:
            r2.setRequestProperty(r5, r9)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
        L_0x0667:
            r5 = 1
            r2.setDoInput(r5)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r2.setDoOutput(r5)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            int r5 = r0.U     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r6 = -1
            if (r5 != r6) goto L_0x0681
            aueh r5 = defpackage.aueh.a     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            aueq r5 = r5.a((java.lang.Object) r0)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            int r5 = r5.b(r0)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r0.U = r5     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            goto L_0x0682
        L_0x0681:
        L_0x0682:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r5 = 0
            r0.write(r3, r5, r4)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r0.writeTo(r3)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r0.close()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            int r0 = r2.getResponseCode()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r3) goto L_0x069e
            goto L_0x06c5
        L_0x069e:
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            aubs r3 = defpackage.aubs.c()     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            aotk r4 = defpackage.aotk.d     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r4, (java.io.InputStream) r0, (defpackage.aubs) r3)     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            aotk r0 = (defpackage.aotk) r0     // Catch:{ Exception -> 0x06b8, all -> 0x06b5 }
            defpackage.jlk.a(r2)
            defpackage.izj.a()
            goto L_0x06cc
        L_0x06b5:
            r0 = move-exception
            r14 = r2
            goto L_0x06bc
        L_0x06b8:
            r0 = move-exception
            goto L_0x06c5
        L_0x06ba:
            r0 = move-exception
            r14 = 0
        L_0x06bc:
            defpackage.jlk.a(r14)
            defpackage.izj.a()
            throw r0
        L_0x06c3:
            r0 = move-exception
            r2 = 0
        L_0x06c5:
            defpackage.jlk.a(r2)
            defpackage.izj.a()
            r0 = 0
        L_0x06cc:
            if (r0 == 0) goto L_0x0765
            com.google.android.gms.ads.jams.b r2 = r1.a
            int r3 = r0.a
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0750
            com.google.android.gms.ads.jams.d r2 = r2.c
            int r2 = r2.b()
            if (r2 != 0) goto L_0x06df
        L_0x06de:
            goto L_0x06ed
        L_0x06df:
            java.lang.String r2 = r0.b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x06de
            r3 = r24
            r12 = r32
            goto L_0x0754
        L_0x06ed:
            long r2 = r0.c
            awhl r5 = defpackage.awhl.a
            awhm r5 = r5.a()
            long r5 = r5.i()
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x074b
            long r2 = r0.c
            awhl r5 = defpackage.awhl.a
            awhm r5 = r5.a()
            long r5 = r5.h()
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0746
            com.google.android.gms.ads.jams.b r2 = r1.a
            com.google.android.gms.ads.jams.d r2 = r2.c
            java.lang.String r3 = r0.b
            long r5 = java.lang.System.currentTimeMillis()
            long r22 = defpackage.awhl.e()
            android.content.SharedPreferences r2 = r2.a((java.lang.String) r12)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putString(r8, r3)
            long r5 = r5 + r22
            r3 = r24
            android.content.SharedPreferences$Editor r2 = r2.putLong(r3, r5)
            r2.apply()
            long r5 = r0.c
            r12 = r32
            long r5 = java.lang.Math.max(r5, r12)
            r2 = r1
            r9 = r3
            r4 = r5
            r7 = r14
            r3 = r20
            r10 = r21
            r1 = r36
            goto L_0x01de
        L_0x0746:
            r3 = r24
            r12 = r32
            goto L_0x0754
        L_0x074b:
            r3 = r24
            r12 = r32
            goto L_0x0754
        L_0x0750:
            r3 = r24
            r12 = r32
        L_0x0754:
            java.lang.String r0 = "[JAMS] Got an invalid response"
            com.google.android.gms.ads.internal.util.client.c.c(r0)
            r2 = r1
            r9 = r3
            r4 = r12
            r7 = r14
            r3 = r20
            r10 = 1
            r1 = r36
            goto L_0x01de
        L_0x0765:
            r3 = r24
            r12 = r32
            r4 = 1
            java.lang.String r0 = "[JAMS] Failed to negotiate"
            com.google.android.gms.ads.internal.util.client.c.c(r0)
            r2 = r1
            r9 = r3
            r4 = r12
            r7 = r14
            r3 = r20
            r10 = 1
            r1 = r36
            goto L_0x01de
        L_0x077a:
            r1 = 0
            throw r1
        L_0x077d:
            r1 = r2
            r12 = r4
            r9 = r6
            r21 = r10
            if (r21 != 0) goto L_0x07d5
            com.google.android.gms.ads.jams.b r0 = r1.a
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0793
            java.lang.String r0 = "[JAMS] Drop negotiation response"
            com.google.android.gms.ads.internal.util.client.c.a((java.lang.String) r0)
            goto L_0x0832
        L_0x0793:
            com.google.android.gms.ads.jams.d r1 = r0.c
            android.content.SharedPreferences r1 = r1.a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putLong(r11, r12)
            r1.apply()
            com.google.android.gms.ads.jams.d r1 = r0.c
            r2 = 0
            r1.a((long) r2)
            com.google.android.gms.ads.jams.d r1 = r0.c
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            long r4 = r4.toMillis(r12)
            android.content.SharedPreferences r1 = r1.a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            long r2 = r2 + r4
            android.content.SharedPreferences$Editor r1 = r1.putLong(r9, r2)
            r1.apply()
            long r1 = defpackage.awhl.b()
            long r1 = java.lang.Math.max(r1, r12)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = r3.toSeconds(r1)
            r0.a(r1)
            goto L_0x0832
        L_0x07d5:
            com.google.android.gms.ads.jams.b r0 = r1.a
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x07e3
            java.lang.String r0 = "[JAMS] Ignore negotiation failure"
            com.google.android.gms.ads.internal.util.client.c.a((java.lang.String) r0)
            goto L_0x0832
        L_0x07e3:
            awhl r1 = defpackage.awhl.a
            awhm r1 = r1.a()
            long r1 = r1.a()
            awhl r3 = defpackage.awhl.a
            awhm r3 = r3.a()
            long r3 = r3.g()
            com.google.android.gms.ads.jams.d r5 = r0.c
            long r5 = r5.e()
            r7 = 20
            long r7 = java.lang.Math.min(r5, r7)
            r9 = 0
            long r7 = java.lang.Math.max(r9, r7)
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = (double) r7
            double r7 = java.lang.Math.pow(r9, r7)
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r7
            double r3 = (double) r3
            double r1 = java.lang.Math.min(r1, r3)
            java.lang.String r3 = "[JAMS] Scheduling retry..."
            com.google.android.gms.ads.internal.util.client.c.a((java.lang.String) r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = (long) r1
            long r1 = r3.toSeconds(r1)
            r0.a(r1)
            com.google.android.gms.ads.jams.d r0 = r0.c
            r1 = 1
            long r5 = r5 + r1
            r0.a((long) r5)
        L_0x0832:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.jams.a.b():int");
    }
}
