package com.google.android.gms.stats.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DropBoxEntryAddedChimeraService extends TracingIntentService {
    private hol a;
    private hph b;
    private acro c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Receiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.DROPBOX_ENTRY_ADDED".equals(intent.getAction())) {
                Intent intent2 = new Intent("com.google.android.gms.stats.ACTION_UPLOAD_DROPBOX_ENTRIES");
                intent2.setPackage(context.getPackageName());
                context.startService(intent2);
            }
        }
    }

    public DropBoxEntryAddedChimeraService() {
        super("DropBoxEntryAddedChimeraService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c3, code lost:
        r3 = r13;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r9.a(r10, r11, r12, (defpackage.avvz) r1, r16, r17, r18, r19, defpackage.aznh.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d7, code lost:
        if (defpackage.aznu.c() != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01dd, code lost:
        if (defpackage.aznu.f() != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01df, code lost:
        defpackage.acsq.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e2, code lost:
        r8.b.d();
        r0 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e9, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01eb, code lost:
        r0.a(r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f2, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f6, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x022f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0230, code lost:
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0268, code lost:
        r1.a(r11, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r0 = r9.a(r24, r3, r5, r8.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0184, code lost:
        if (r0 != null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0186, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x018e, code lost:
        if (r0.i.size() != 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0190, code lost:
        r8.b.d();
        r0 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0197, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0199, code lost:
        r0.a(r13, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a3, code lost:
        if (defpackage.aznu.c() != false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01aa, code lost:
        if (defpackage.aznu.f() != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        defpackage.acsq.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r11 = r8.a;
        r12 = r8.b;
        r1 = (defpackage.aucd) r0.c(5);
        r1.a((defpackage.aucj) r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x022f A[ExcHandler: all (th java.lang.Throwable), PHI: r13 
      PHI: (r13v2 long) = (r13v0 long), (r13v0 long), (r13v0 long), (r13v0 long), (r13v3 long), (r13v3 long), (r13v3 long), (r13v3 long), (r13v3 long), (r13v0 long), (r13v0 long), (r13v0 long) binds: [B:9:0x0030, B:28:0x00a2, B:37:0x00dd, B:68:0x014f, B:81:0x017b, B:90:0x019f, B:98:0x01af, B:96:0x01ac, B:97:?, B:57:0x0124, B:58:?, B:44:0x00f9] A[DONT_GENERATE, DONT_INLINE], Splitter:B:28:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r24 = this;
            r8 = r24
            java.lang.String r0 = ":lastRunMsec"
            java.lang.String r1 = defpackage.jlo.a()
            java.lang.String r2 = "(eng-"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x026e
            aznk r1 = defpackage.aznk.a
            aznl r1 = r1.a()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x026e
            boolean r1 = defpackage.acub.a()
            if (r1 == 0) goto L_0x026e
            acsj r9 = defpackage.acsj.h()
            boolean r1 = defpackage.azms.b()
            if (r1 == 0) goto L_0x026e
            java.lang.String r15 = r9.a
            r13 = 10
            hol r1 = new hol     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r2 = 0
            r1.<init>(r8, r2, r2)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r8.a = r1     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            hph r1 = new hph     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            hol r3 = r8.a     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            java.lang.String r4 = "PLATFORM_STATS_COUNTERS"
            r5 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4, r5)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r8.b = r1     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r1.<init>()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            boolean r3 = defpackage.azoi.b()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r4 = 0
            if (r3 == 0) goto L_0x005a
            r17 = r1
            r16 = 0
            r18 = 0
            r19 = 0
            goto L_0x00a2
        L_0x005a:
            boolean r1 = defpackage.azoo.b()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            boolean r3 = defpackage.acub.c()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            acro r5 = new acro     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r5.<init>()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r8.c = r5     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            java.util.List r5 = defpackage.acro.a(r24)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            boolean r6 = defpackage.azpm.c()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r7 = 1
            if (r6 == 0) goto L_0x0084
            boolean r6 = r5.isEmpty()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r6 != 0) goto L_0x0084
            boolean r6 = defpackage.azmy.b()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r6 != 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            if (r3 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r7 = 0
        L_0x0085:
            if (r3 != 0) goto L_0x009a
            if (r7 != 0) goto L_0x009a
            if (r1 != 0) goto L_0x009a
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x0099
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r13, (java.util.concurrent.TimeUnit) r1)
        L_0x0099:
            return
        L_0x009a:
            r19 = r1
            r18 = r3
            r17 = r5
            r16 = r7
        L_0x00a2:
            android.content.SharedPreferences r1 = r8.getSharedPreferences(r15, r4)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r3 = -1
            long r3 = r1.getLong(r0, r3)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            long r10 = r5 - r3
            azol r7 = defpackage.azol.a     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            azom r7 = r7.a()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            long r20 = r7.a()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            int r7 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r7 < 0) goto L_0x021f
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r1.putLong(r0, r5)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r1.apply()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dd
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x00dc
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r13, (java.util.concurrent.TimeUnit) r1)
        L_0x00dc:
            return
        L_0x00dd:
            boolean r0 = defpackage.azoi.b()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r0 == 0) goto L_0x014c
            adry r0 = new adry     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r0.<init>()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            iby r0 = defpackage.adrz.a(r8, r0)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            java.lang.String r1 = r9.b     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            acwa r1 = r0.f(r1)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r10 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x013c, TimeoutException -> 0x013a, InterruptedException -> 0x0123 }
            defpackage.acws.a(r1, r10, r7)     // Catch:{ ExecutionException -> 0x013c, TimeoutException -> 0x013a, InterruptedException -> 0x0123 }
            boolean r7 = r1.b()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r7 != 0) goto L_0x0100
            goto L_0x0114
        L_0x0100:
            java.lang.Object r7 = r1.d()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r7 == 0) goto L_0x0114
            java.lang.Object r1 = r1.d()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            boolean r1 = r1.booleanValue()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r1 == 0) goto L_0x0114
            r10 = r0
            goto L_0x014d
        L_0x0114:
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x0122
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r13, (java.util.concurrent.TimeUnit) r1)
        L_0x0122:
            return
        L_0x0123:
            r0 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r0.interrupt()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x0139
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r13, (java.util.concurrent.TimeUnit) r1)
        L_0x0139:
            return
        L_0x013a:
            r0 = move-exception
            goto L_0x013d
        L_0x013c:
            r0 = move-exception
        L_0x013d:
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x014b
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r13, (java.util.concurrent.TimeUnit) r1)
        L_0x014b:
            return
        L_0x014c:
            r10 = r2
        L_0x014d:
            java.lang.String r0 = "dropbox"
            java.lang.Object r0 = r8.getSystemService(r0)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            android.os.DropBoxManager r0 = (android.os.DropBoxManager) r0     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r11 = r3
        L_0x0156:
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x015d
            r11 = r13
            goto L_0x0210
        L_0x015d:
            android.os.DropBoxManager$Entry r1 = r0.getNextEntry(r2, r11)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r1 == 0) goto L_0x020f
            java.lang.String r7 = r1.getTag()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            r1.close()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r7 == 0) goto L_0x01ff
            boolean r11 = r7.isEmpty()     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r11 != 0) goto L_0x01fc
            java.lang.String r11 = "platform_stats_bookmark"
            boolean r7 = r7.equals(r11)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
            if (r7 != 0) goto L_0x01fc
            hph r7 = r8.b     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            r1 = r9
            r2 = r24
            avwc r0 = r1.a(r2, r3, r5, r7)     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            if (r0 != 0) goto L_0x0188
            r3 = r13
            goto L_0x01e2
        L_0x0188:
            aucx r1 = r0.i     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            int r1 = r1.size()     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            if (r1 != 0) goto L_0x019f
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x019e
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r13, (java.util.concurrent.TimeUnit) r1)
        L_0x019e:
            return
        L_0x019f:
            boolean r1 = defpackage.aznu.c()     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            if (r1 != 0) goto L_0x01a6
        L_0x01a5:
            goto L_0x01af
        L_0x01a6:
            boolean r1 = defpackage.aznu.f()     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            if (r1 != 0) goto L_0x01a5
            defpackage.acsq.a(r0)     // Catch:{ acrj -> 0x0232, all -> 0x022f }
        L_0x01af:
            hol r11 = r8.a     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            hph r12 = r8.b     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            r1 = 5
            java.lang.Object r1 = r0.c(r1)     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            aucd r1 = (defpackage.aucd) r1     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            r1.a((defpackage.aucj) r0)     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            avvz r1 = (defpackage.avvz) r1     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            boolean r2 = defpackage.aznh.b()     // Catch:{ acrj -> 0x01f8, all -> 0x022f }
            r3 = r13
            r13 = r1
            r14 = r16
            r7 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r2
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ acrj -> 0x01f5, all -> 0x01f1 }
            boolean r1 = defpackage.aznu.c()     // Catch:{ acrj -> 0x01f5, all -> 0x01f1 }
            if (r1 != 0) goto L_0x01e2
            boolean r1 = defpackage.aznu.f()     // Catch:{ acrj -> 0x01f5, all -> 0x01f1 }
            if (r1 != 0) goto L_0x01e2
            defpackage.acsq.a(r0)     // Catch:{ acrj -> 0x01f5, all -> 0x01f1 }
        L_0x01e2:
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x01f0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r3, (java.util.concurrent.TimeUnit) r1)
        L_0x01f0:
            return
        L_0x01f1:
            r0 = move-exception
            r11 = r3
            goto L_0x025f
        L_0x01f5:
            r0 = move-exception
            r11 = r3
            goto L_0x0235
        L_0x01f8:
            r0 = move-exception
            r7 = r15
            r11 = r13
            goto L_0x0235
        L_0x01fc:
            r11 = r13
            r7 = r15
            goto L_0x0201
        L_0x01ff:
            r11 = r13
            r7 = r15
        L_0x0201:
            long r13 = r1.getTimeMillis()     // Catch:{ acrj -> 0x020d }
            r15 = r7
            r22 = r11
            r11 = r13
            r13 = r22
            goto L_0x0156
        L_0x020d:
            r0 = move-exception
            goto L_0x0235
        L_0x020f:
            r11 = r13
        L_0x0210:
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x021e
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r11, (java.util.concurrent.TimeUnit) r1)
        L_0x021e:
            return
        L_0x021f:
            r11 = r13
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x022e
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r11, (java.util.concurrent.TimeUnit) r1)
        L_0x022e:
            return
        L_0x022f:
            r0 = move-exception
            r11 = r13
            goto L_0x025f
        L_0x0232:
            r0 = move-exception
            r11 = r13
            r7 = r15
        L_0x0235:
            hph r0 = r8.b     // Catch:{ all -> 0x025e }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x025e }
            java.lang.String r2 = "CollectionException"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x025e }
            hox r0 = r0.c(r1)     // Catch:{ all -> 0x025e }
            r0.a()     // Catch:{ all -> 0x025e }
            java.lang.String r0 = "DropBoxEntryAddedChiSer"
            java.lang.String r1 = "Fail to handle dropbox entry added."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x025e }
            hph r0 = r8.b
            r0.d()
            hol r0 = r8.a
            if (r0 == 0) goto L_0x025d
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.a((long) r11, (java.util.concurrent.TimeUnit) r1)
        L_0x025d:
            return
        L_0x025e:
            r0 = move-exception
        L_0x025f:
            hph r1 = r8.b
            r1.d()
            hol r1 = r8.a
            if (r1 == 0) goto L_0x026d
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r1.a((long) r11, (java.util.concurrent.TimeUnit) r2)
        L_0x026d:
            throw r0
        L_0x026e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.service.DropBoxEntryAddedChimeraService.a():void");
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        if ("com.google.android.gms.stats.ACTION_UPLOAD_DROPBOX_ENTRIES".equals(intent.getAction())) {
            a();
        }
    }
}
