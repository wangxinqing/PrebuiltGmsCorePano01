package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.regex.Pattern;

/* renamed from: acsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsa extends acrl {
    private static Pattern j = Pattern.compile(azmj.b());
    final String h = "BatterystatsDumpsysTask.gz";
    final String i = "BatterystatsDumpsysTask_last.gz";

    public final int a() {
        return (int) azmj.a.a().c();
    }

    public final long c() {
        return azmg.a.a().c();
    }

    public final long d() {
        return 0;
    }

    public final boolean f() {
        return azmg.a.a().a();
    }

    public final boolean g() {
        return azmj.a.a().e();
    }

    public acsa() {
        super("Batterystats", "batterystats", "BATTERY_STATS", azmj.a.a().b());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        r6.write(r0);
        r6.newLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r14 != -1) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        if (r0.contains(defpackage.azmj.a.c().h()) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r10 = defpackage.azmj.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        if (j.pattern().equals(r10) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        j = java.util.regex.Pattern.compile(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        r0 = j.matcher(r0);
        r11 = (int) defpackage.azmj.a.c().f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r0.find() != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        if (r0.groupCount() <= r11) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e0, code lost:
        r10 = java.lang.Long.parseLong(r0.group(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        android.util.Log.w("BatterystatsDumpsysTask", "Couldn't find battery stats reset timestamp.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ee, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        android.util.Log.e("BatterystatsDumpsysTask", "Fail to get reset time", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020e, code lost:
        r11 = r2;
        r1 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x020d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.avwc b(android.content.Context r21, java.io.InputStream r22, long r23, long r25, defpackage.hph r27) {
        /*
            r20 = this;
            r9 = r20
            r7 = r21
            r8 = r27
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r9.h
            java.io.File r0 = r7.getFileStreamPath(r0)
            java.lang.String r1 = r9.i
            java.io.File r1 = r7.getFileStreamPath(r1)
            boolean r2 = r1.exists()
            java.lang.String r5 = "BatterystatsDumpsysTask"
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = "Last dump exists!"
            android.util.Log.w(r5, r2)
            r1.delete()
        L_0x0026:
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x002f
            r0.renameTo(r1)
        L_0x002f:
            r10 = 0
            java.lang.String[] r0 = new java.lang.String[r10]
            azmg r1 = defpackage.azmg.a
            azmh r1 = r1.a()
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0050
            azmj r0 = defpackage.azmj.a
            azmk r0 = r0.a()
            java.lang.String r0 = r0.a()
            java.lang.String r1 = "&"
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0
            goto L_0x0051
        L_0x0050:
            r1 = r0
        L_0x0051:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0221, all -> 0x021d }
            java.lang.String r2 = r9.h     // Catch:{ IOException -> 0x0221, all -> 0x021d }
            java.io.File r2 = r7.getFileStreamPath(r2)     // Catch:{ IOException -> 0x0221, all -> 0x021d }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0221, all -> 0x021d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0221, all -> 0x021d }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0221, all -> 0x021d }
            r12 = r22
            r6.<init>(r12)     // Catch:{ IOException -> 0x0221, all -> 0x021d }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0221, all -> 0x021d }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0219, all -> 0x0215 }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0219, all -> 0x0215 }
            java.util.zip.GZIPOutputStream r13 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0219, all -> 0x0215 }
            r13.<init>(r0)     // Catch:{ IOException -> 0x0219, all -> 0x0215 }
            java.nio.charset.Charset r0 = defpackage.acrk.e     // Catch:{ IOException -> 0x0219, all -> 0x0215 }
            r12.<init>(r13, r0)     // Catch:{ IOException -> 0x0219, all -> 0x0215 }
            r6.<init>(r12)     // Catch:{ IOException -> 0x0219, all -> 0x0215 }
            r14 = -1
        L_0x007b:
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            if (r0 == 0) goto L_0x00ff
            int r11 = r1.length     // Catch:{ IOException -> 0x0211, all -> 0x020d }
        L_0x0082:
            if (r10 >= r11) goto L_0x008f
            r12 = r1[r10]     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            boolean r12 = r0.contains(r12)     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            if (r12 != 0) goto L_0x00fc
            int r10 = r10 + 1
            goto L_0x0082
        L_0x008f:
            r6.write(r0)     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            r6.newLine()     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            r10 = -1
            int r12 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x00fb
            azmj r10 = defpackage.azmj.a     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            azmk r10 = r10.a()     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            java.lang.String r10 = r10.h()     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            boolean r10 = r0.contains(r10)     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            if (r10 == 0) goto L_0x00fb
            java.lang.String r10 = defpackage.azmj.b()     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            java.util.regex.Pattern r11 = j     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            java.lang.String r11 = r11.pattern()     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            boolean r11 = r11.equals(r10)     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            if (r11 == 0) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            j = r10     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
        L_0x00c2:
            java.util.regex.Pattern r10 = j     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            java.util.regex.Matcher r0 = r10.matcher(r0)     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            azmj r10 = defpackage.azmj.a     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            azmk r10 = r10.a()     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            long r10 = r10.f()     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            int r11 = (int) r10     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            boolean r10 = r0.find()     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            if (r10 != 0) goto L_0x00da
        L_0x00d9:
            goto L_0x00e9
        L_0x00da:
            int r10 = r0.groupCount()     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            if (r10 <= r11) goto L_0x00d9
            java.lang.String r0 = r0.group(r11)     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            long r10 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            goto L_0x00f0
        L_0x00e9:
            java.lang.String r0 = "Couldn't find battery stats reset timestamp."
            android.util.Log.w(r5, r0)     // Catch:{ Exception -> 0x00f2, all -> 0x020d }
            r10 = -1
        L_0x00f0:
            r14 = r10
            goto L_0x00fa
        L_0x00f2:
            r0 = move-exception
            java.lang.String r10 = "Fail to get reset time"
            android.util.Log.e(r5, r10, r0)     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            r14 = -1
        L_0x00fa:
            goto L_0x00fc
        L_0x00fb:
        L_0x00fc:
            r10 = 0
            goto L_0x007b
        L_0x00ff:
            r10 = -1
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0205
            defpackage.jjt.a((java.io.Closeable) r2)
            defpackage.jjt.a((java.io.Closeable) r6)
            java.lang.String r0 = r9.a
            r1 = 0
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r0, r1)
            java.lang.String r1 = ":resetMillis"
            long r12 = r0.getLong(r1, r10)
            java.lang.String r1 = r9.i
            java.io.File r10 = r7.getFileStreamPath(r1)
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0139
            java.lang.String r0 = "BatteryStatsDuplicatedDumps"
            hox r0 = r8.c(r0)
            r0.a()
            r22 = r20
            r23 = r21
            r24 = r3
            r26 = r14
            r22.a(r23, r24, r26)
            r1 = 0
            goto L_0x01f7
        L_0x0139:
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x0164
            java.lang.String r1 = "BatteryStatsWrongResetTimer"
            hox r1 = r8.c(r1)
            r1.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 92
            r1.<init>(r2)
            java.lang.String r2 = "Reset timestamp incorrect: last_reset = "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ",new_reset= "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r5, r1)
        L_0x0164:
            java.lang.String r1 = ":dumpMillis"
            r5 = -1
            long r16 = r0.getLong(r1, r5)
            r18 = 0
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0180
            how r0 = defpackage.acrp.a
            java.lang.String r1 = "BatteryStatsLossDuration"
            hpd r0 = r8.b(r1, r0)
            long r1 = r14 - r16
            r0.a(r1)
        L_0x0180:
            r1 = r20
            r2 = r21
            r5 = r14
            r1.a(r2, r3, r5)
            int r0 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f6
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x01ef }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01ef }
            r0.<init>(r10)     // Catch:{ IOException -> 0x01ef }
            r3.<init>(r0)     // Catch:{ IOException -> 0x01ef }
            r1 = r20
            r2 = r21
            r4 = r12
            r6 = r16
            r8 = r27
            avwc r0 = r1.a(r2, r3, r4, r6, r8)     // Catch:{ IOException -> 0x01ef }
            r1 = 5
            java.lang.Object r1 = r0.c(r1)     // Catch:{ IOException -> 0x01ef }
            aucd r1 = (defpackage.aucd) r1     // Catch:{ IOException -> 0x01ef }
            r1.a((defpackage.aucj) r0)     // Catch:{ IOException -> 0x01ef }
            avvz r1 = (defpackage.avvz) r1     // Catch:{ IOException -> 0x01ef }
            avvy r0 = defpackage.avvy.c     // Catch:{ IOException -> 0x01ef }
            aucd r0 = r0.o()     // Catch:{ IOException -> 0x01ef }
            boolean r2 = r0.c     // Catch:{ IOException -> 0x01ef }
            if (r2 != 0) goto L_0x01ba
            goto L_0x01c0
        L_0x01ba:
            r0.c()     // Catch:{ IOException -> 0x01ef }
            r2 = 0
            r0.c = r2     // Catch:{ IOException -> 0x01ef }
        L_0x01c0:
            aucj r2 = r0.b     // Catch:{ IOException -> 0x01ef }
            avvy r2 = (defpackage.avvy) r2     // Catch:{ IOException -> 0x01ef }
            int r3 = r2.a     // Catch:{ IOException -> 0x01ef }
            r3 = r3 | 4
            r2.a = r3     // Catch:{ IOException -> 0x01ef }
            r2.b = r14     // Catch:{ IOException -> 0x01ef }
            boolean r2 = r1.c     // Catch:{ IOException -> 0x01ef }
            if (r2 != 0) goto L_0x01d1
            goto L_0x01d7
        L_0x01d1:
            r1.c()     // Catch:{ IOException -> 0x01ef }
            r2 = 0
            r1.c = r2     // Catch:{ IOException -> 0x01ef }
        L_0x01d7:
            aucj r2 = r1.b     // Catch:{ IOException -> 0x01ef }
            avwc r2 = (defpackage.avwc) r2     // Catch:{ IOException -> 0x01ef }
            aucj r0 = r0.i()     // Catch:{ IOException -> 0x01ef }
            avvy r0 = (defpackage.avvy) r0     // Catch:{ IOException -> 0x01ef }
            avwc r3 = defpackage.avwc.v     // Catch:{ IOException -> 0x01ef }
            r0.getClass()     // Catch:{ IOException -> 0x01ef }
            r2.f = r0     // Catch:{ IOException -> 0x01ef }
            int r0 = r2.a     // Catch:{ IOException -> 0x01ef }
            r0 = r0 | 4
            r2.a = r0     // Catch:{ IOException -> 0x01ef }
            goto L_0x01f7
        L_0x01ef:
            r0 = move-exception
            acrj r1 = new acrj
            r1.<init>((java.lang.Exception) r0)
            throw r1
        L_0x01f6:
            r1 = 0
        L_0x01f7:
            r10.delete()
            if (r1 == 0) goto L_0x0203
            aucj r0 = r1.i()
            avwc r0 = (defpackage.avwc) r0
            return r0
        L_0x0203:
            r1 = 0
            return r1
        L_0x0205:
            acrj r0 = new acrj     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            java.lang.String r1 = "Can't find reset timestamp in the dump!"
            r0.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x0211, all -> 0x020d }
            throw r0     // Catch:{ IOException -> 0x0211, all -> 0x020d }
        L_0x020d:
            r0 = move-exception
            r11 = r2
            r1 = r6
            goto L_0x022e
        L_0x0211:
            r0 = move-exception
            r11 = r2
            r1 = r6
            goto L_0x0224
        L_0x0215:
            r0 = move-exception
            r1 = 0
            r11 = r2
            goto L_0x022e
        L_0x0219:
            r0 = move-exception
            r1 = 0
            r11 = r2
            goto L_0x0224
        L_0x021d:
            r0 = move-exception
            r1 = 0
            r11 = r1
            goto L_0x022e
        L_0x0221:
            r0 = move-exception
            r1 = 0
            r11 = r1
        L_0x0224:
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x022d }
            acrj r2 = new acrj     // Catch:{ all -> 0x022d }
            r2.<init>((java.lang.Exception) r0)     // Catch:{ all -> 0x022d }
            throw r2     // Catch:{ all -> 0x022d }
        L_0x022d:
            r0 = move-exception
        L_0x022e:
            defpackage.jjt.a((java.io.Closeable) r11)
            defpackage.jjt.a((java.io.Closeable) r1)
            goto L_0x0236
        L_0x0235:
            throw r0
        L_0x0236:
            goto L_0x0235
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsa.b(android.content.Context, java.io.InputStream, long, long, hph):avwc");
    }

    public final boolean e() {
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, long j2, long j3) {
        SharedPreferences.Editor edit = context.getSharedPreferences(this.a, 0).edit();
        edit.putLong(":dumpMillis", j2);
        edit.putLong(":resetMillis", j3);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final String[] a(long j2, long j3) {
        return azmj.a.a().d().split(" ");
    }

    public final boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        return azms.a.c().a();
    }
}
