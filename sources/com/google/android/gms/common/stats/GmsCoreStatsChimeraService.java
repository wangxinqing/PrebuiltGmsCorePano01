package com.google.android.gms.common.stats;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.chimera.Service;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsCoreStatsChimeraService extends Service {
    private static final Comparator b = new jci();
    jfp a;
    private Handler c;

    public static final long a(aoid aoid) {
        if ((aoid.a & 512) == 0) {
            return 0;
        }
        double d = (double) aoid.h;
        double d2 = aoid.k;
        Double.isNaN(d);
        return Math.round(d * d2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x033e A[Catch:{ NumberFormatException -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x034f A[Catch:{ NumberFormatException -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.io.FileDescriptor r20, java.io.PrintWriter r21, java.lang.String[] r22) {
        /*
            r19 = this;
            r0 = r21
            r1 = r22
            jjv r9 = new jjv
            java.lang.String r2 = "  "
            r9.<init>(r0, r2)
            java.lang.String r2 = "GMS Core Stats:"
            r9.println(r2)
            android.content.pm.PackageManager r2 = r19.getPackageManager()
            r3 = 128(0x80, float:1.794E-43)
            java.util.List r2 = r2.getInstalledApplications(r3)
            r9.a()
            java.lang.String r3 = "Client jar version:"
            r9.println(r3)
            r9.a()
            java.util.Comparator r3 = b
            java.util.Collections.sort(r2, r3)
            r9.a()
            java.util.Iterator r2 = r2.iterator()
            r3 = -2
            r4 = -2
        L_0x0033:
            boolean r5 = r2.hasNext()
            r10 = 12
            r11 = -1
            if (r5 == 0) goto L_0x0086
            java.lang.Object r5 = r2.next()
            android.content.pm.ApplicationInfo r5 = (android.content.pm.ApplicationInfo) r5
            android.os.Bundle r6 = r5.metaData
            if (r6 == 0) goto L_0x004f
            android.os.Bundle r6 = r5.metaData
            java.lang.String r7 = "com.google.android.gms.version"
            int r6 = r6.getInt(r7, r11)
            goto L_0x0050
        L_0x004f:
            r6 = -2
        L_0x0050:
            if (r6 == r3) goto L_0x0033
            if (r6 == r11) goto L_0x0033
            if (r4 != r6) goto L_0x0057
            goto L_0x0080
        L_0x0057:
            r9.b()
            if (r6 == r3) goto L_0x0077
            if (r6 == r11) goto L_0x0074
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r10)
            r4.append(r6)
            java.lang.String r7 = ":"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x0079
        L_0x0074:
            java.lang.String r4 = "UNKNOWN_SDK_VERSION:"
            goto L_0x0079
        L_0x0077:
            java.lang.String r4 = "EMPTY_METADATA:"
        L_0x0079:
            r9.println(r4)
            r9.a()
            r4 = r6
        L_0x0080:
            java.lang.String r5 = r5.packageName
            r9.println(r5)
            goto L_0x0033
        L_0x0086:
            r9.b()
            r9.b()
            jdb r2 = defpackage.jdc.a
            r13 = 6
            r14 = 13
            r8 = 2
            r5 = 3
            r4 = 1
            if (r2 == 0) goto L_0x01fd
            jda r2 = defpackage.jda.a()
            jjv r3 = new jjv
            java.lang.String r6 = "  "
            r3.<init>(r0, r6)
            java.lang.String r0 = "Open Events:"
            r3.println(r0)
            r3.a()
            java.util.Map r6 = r2.h
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01fa }
            java.util.Map r11 = r2.h     // Catch:{ all -> 0x01fa }
            java.util.Collection r11 = r11.values()     // Catch:{ all -> 0x01fa }
            r0.<init>(r11)     // Catch:{ all -> 0x01fa }
            monitor-exit(r6)     // Catch:{ all -> 0x01fa }
            int r6 = r0.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r10 = 44
            r11.<init>(r10)
            java.lang.String r10 = "There are "
            r11.append(r10)
            r11.append(r6)
            java.lang.String r6 = " currently open events."
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            r3.println(r6)
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L_0x01f6
            int r6 = r0.size()
            r10 = 0
            r11 = 0
        L_0x00e3:
            if (r10 >= r6) goto L_0x0168
            java.lang.Object r16 = r0.get(r10)
            r15 = r16
            jcy r15 = (defpackage.jcy) r15
            com.google.android.gms.common.stats.StatsEvent r12 = r15.a
            int r7 = r12.b()
            if (r7 == r8) goto L_0x0134
            int r7 = r12.b()
            if (r7 == r5) goto L_0x0131
            int r7 = r12.b()
            r5 = 4
            if (r7 == r5) goto L_0x012e
            int r5 = r12.b()
            if (r5 == r4) goto L_0x012b
            int r5 = r12.b()
            if (r5 == r13) goto L_0x0128
            int r5 = r12.b()
            if (r5 == r14) goto L_0x0125
            int r5 = r12.b()
            r7 = 14
            if (r5 == r7) goto L_0x0136
            int r5 = r12.b()
            r12 = 15
            if (r5 == r12) goto L_0x0136
            goto L_0x0162
        L_0x0125:
            r7 = 14
            goto L_0x0136
        L_0x0128:
            r7 = 14
            goto L_0x0136
        L_0x012b:
            r7 = 14
            goto L_0x0136
        L_0x012e:
            r7 = 14
            goto L_0x0136
        L_0x0131:
            r7 = 14
            goto L_0x0136
        L_0x0134:
            r7 = 14
        L_0x0136:
            if (r11 != 0) goto L_0x0158
            long r11 = r2.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r4 = 81
            r5.<init>(r4)
            java.lang.String r4 = "Connections opened within past "
            r5.append(r4)
            r5.append(r11)
            java.lang.String r4 = " milliseconds but not closed: "
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.println(r4)
            r3.a()
        L_0x0158:
            com.google.android.gms.common.stats.StatsEvent r4 = r15.a
            java.lang.String r4 = r4.toString()
            r3.println(r4)
            r11 = 1
        L_0x0162:
            int r10 = r10 + 1
            r4 = 1
            r5 = 3
            goto L_0x00e3
        L_0x0168:
            r7 = 14
            if (r11 != 0) goto L_0x016d
            goto L_0x0170
        L_0x016d:
            r3.b()
        L_0x0170:
            r3.println()
            int r4 = r0.size()
            r5 = 0
            r6 = 0
        L_0x0179:
            if (r5 >= r4) goto L_0x01f1
            java.lang.Object r10 = r0.get(r5)
            jcy r10 = (defpackage.jcy) r10
            com.google.android.gms.common.stats.StatsEvent r11 = r10.a
            int r12 = r11.b()
            r15 = 7
            if (r12 == r15) goto L_0x01bd
            int r12 = r11.b()
            r15 = 8
            if (r12 == r15) goto L_0x01bd
            int r12 = r11.b()
            r15 = 9
            if (r12 == r15) goto L_0x01bd
            int r12 = r11.b()
            r15 = 10
            if (r12 == r15) goto L_0x01bd
            int r12 = r11.b()
            r15 = 11
            if (r12 == r15) goto L_0x01bd
            int r12 = r11.b()
            r15 = 12
            if (r12 == r15) goto L_0x01bd
            int r11 = r11.b()
            r12 = 16
            if (r11 == r12) goto L_0x01bd
            r15 = 81
            goto L_0x01ec
        L_0x01bd:
            if (r6 != 0) goto L_0x01e0
            long r11 = r2.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r15 = 81
            r6.<init>(r15)
            java.lang.String r7 = "Wakelocks acquired within past "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r7 = " milliseconds but unreleased: "
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.println(r6)
            r3.a()
            goto L_0x01e2
        L_0x01e0:
            r15 = 81
        L_0x01e2:
            com.google.android.gms.common.stats.StatsEvent r6 = r10.a
            java.lang.String r6 = r6.toString()
            r3.println(r6)
            r6 = 1
        L_0x01ec:
            int r5 = r5 + 1
            r7 = 14
            goto L_0x0179
        L_0x01f1:
            if (r6 == 0) goto L_0x01f6
            r3.b()
        L_0x01f6:
            r3.b()
            goto L_0x01fd
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01fa }
            throw r0
        L_0x01fd:
            java.lang.String r0 = "GMS Core Network Usage:"
            r9.println(r0)
            r9.a()
            long r10 = java.lang.System.currentTimeMillis()
            long r17 = defpackage.jed.d(r10)
            java.lang.String r0 = "TTL: Total, B: Bytes, BBg: Bytes Background, BFg: Bytes Foreground, BRx: Bytes Received, BTx: Bytes Transferred, PRx: Packets Received, PTx: Packets Transferred."
            r9.println(r0)
            r2 = -86400000(0xfffffffffad9a400, double:NaN)
            long r5 = r10 + r2
            java.lang.String r4 = "Last 24h:"
            r2 = r19
            r3 = r9
            r0 = 1
            r12 = 0
            r15 = 3
            r15 = 14
            r7 = r17
            r2.a((defpackage.jjv) r3, (java.lang.String) r4, (long) r5, (long) r7)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r10)
            r3 = 11
            r2.set(r3, r12)
            r3 = 12
            r2.set(r3, r12)
            r2.set(r14, r12)
            r2.set(r15, r12)
            r3 = -7
            r2.add(r13, r3)
            long r5 = r2.getTimeInMillis()
            java.lang.String r4 = "Last 7d:"
            r2 = r19
            r3 = r9
            r2.a((defpackage.jjv) r3, (java.lang.String) r4, (long) r5, (long) r7)
            r9.b()
            r9.b()
            boolean r2 = defpackage.axbe.e()
            if (r2 == 0) goto L_0x03b6
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "GMS Core Radio Activity:"
            r9.println(r2)
            r9.a()
            java.lang.String r2 = "Lat = Latency, Med = Median, Std dev = Standard deviation, TTL = Total, Evt = Events"
            r9.println(r2)
            nz r2 = new nz
            r2.<init>()
            if (r1 != 0) goto L_0x0274
            r3 = 2
            r4 = -1
            goto L_0x02de
        L_0x0274:
            r6 = 0
        L_0x0275:
            int r3 = r1.length
            r4 = -1
            int r3 = r3 + r4
            if (r6 >= r3) goto L_0x02dd
            int r3 = r2.h
            r5 = 3
            if (r3 >= r5) goto L_0x02dd
            r3 = r1[r6]
            int r5 = r3.hashCode()
            r7 = -745091864(0xffffffffd396cce8, float:-1.2953657E12)
            if (r5 == r7) goto L_0x02a9
            r7 = -651918950(0xffffffffd924819a, float:-2.89402466E15)
            if (r5 == r7) goto L_0x029f
            r7 = 2120970387(0x7e6b7093, float:7.8238274E37)
            if (r5 == r7) goto L_0x0295
            goto L_0x02b3
        L_0x0295:
            java.lang.String r5 = "--endTimeInMillis"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x02b3
            r8 = 2
            goto L_0x02b4
        L_0x029f:
            java.lang.String r5 = "--startTimeInMillis"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x02b3
            r8 = 1
            goto L_0x02b4
        L_0x02a9:
            java.lang.String r5 = "--networkType"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x02b3
            r8 = 0
            goto L_0x02b4
        L_0x02b3:
            r8 = -1
        L_0x02b4:
            if (r8 == 0) goto L_0x02d1
            if (r8 == r0) goto L_0x02c6
            r3 = 2
            if (r8 == r3) goto L_0x02bc
            goto L_0x02db
        L_0x02bc:
            int r6 = r6 + 1
            r5 = r1[r6]
            java.lang.String r7 = "endTime"
            r2.put(r7, r5)
            goto L_0x02db
        L_0x02c6:
            r3 = 2
            int r6 = r6 + 1
            r5 = r1[r6]
            java.lang.String r7 = "startTime"
            r2.put(r7, r5)
            goto L_0x02db
        L_0x02d1:
            r3 = 2
            int r6 = r6 + 1
            r5 = r1[r6]
            java.lang.String r7 = "networkType"
            r2.put(r7, r5)
        L_0x02db:
            int r6 = r6 + r0
            goto L_0x0275
        L_0x02dd:
            r3 = 2
        L_0x02de:
            int r1 = r2.h
            r5 = -1
            r7 = 3
            if (r1 != r7) goto L_0x0375
            java.lang.String r1 = "startTime"
            java.lang.Object r1 = r2.get(r1)     // Catch:{ NumberFormatException -> 0x0368 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0368 }
            java.lang.String r7 = "endTime"
            java.lang.Object r7 = r2.get(r7)     // Catch:{ NumberFormatException -> 0x0368 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0368 }
            java.lang.String r8 = "networkType"
            java.lang.Object r2 = r2.get(r8)     // Catch:{ NumberFormatException -> 0x0368 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x0368 }
            if (r1 == 0) goto L_0x0360
            if (r7 == 0) goto L_0x0360
            if (r2 == 0) goto L_0x0360
            long r10 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0368 }
            long r6 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x035e }
            int r1 = r2.hashCode()     // Catch:{ NumberFormatException -> 0x035b }
            r5 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r1 == r5) goto L_0x0333
            r5 = 96673(0x179a1, float:1.35468E-40)
            if (r1 == r5) goto L_0x0329
            r3 = 3649301(0x37af15, float:5.11376E-39)
            if (r1 == r3) goto L_0x031f
        L_0x031e:
            goto L_0x033c
        L_0x031f:
            java.lang.String r1 = "wifi"
            boolean r1 = r2.equals(r1)     // Catch:{ NumberFormatException -> 0x035b }
            if (r1 == 0) goto L_0x031e
            r4 = 1
            goto L_0x033c
        L_0x0329:
            java.lang.String r1 = "all"
            boolean r1 = r2.equals(r1)     // Catch:{ NumberFormatException -> 0x035b }
            if (r1 == 0) goto L_0x031e
            r4 = 2
            goto L_0x033c
        L_0x0333:
            java.lang.String r1 = "mobile"
            boolean r1 = r2.equals(r1)     // Catch:{ NumberFormatException -> 0x035b }
            if (r1 == 0) goto L_0x031e
            r4 = 0
        L_0x033c:
            if (r4 == 0) goto L_0x034f
            if (r4 == r0) goto L_0x0343
            r0 = r6
            r5 = r10
            goto L_0x0376
        L_0x0343:
            r1 = 1
            r0 = r9
            r2 = r10
            r4 = r6
            a((defpackage.jjv) r0, (int) r1, (long) r2, (long) r4)     // Catch:{ NumberFormatException -> 0x035b }
            r9.b()     // Catch:{ NumberFormatException -> 0x035b }
            goto L_0x03b6
        L_0x034f:
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r6
            a((defpackage.jjv) r0, (int) r1, (long) r2, (long) r4)     // Catch:{ NumberFormatException -> 0x035b }
            r9.b()     // Catch:{ NumberFormatException -> 0x035b }
            goto L_0x03b6
        L_0x035b:
            r0 = move-exception
            r5 = r6
            goto L_0x036a
        L_0x035e:
            r0 = move-exception
            goto L_0x036a
        L_0x0360:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x0368 }
            java.lang.String r1 = "null"
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x0368 }
            throw r0     // Catch:{ NumberFormatException -> 0x0368 }
        L_0x0368:
            r0 = move-exception
            r10 = r5
        L_0x036a:
            java.lang.String r1 = "GmsCoreStatsService"
            java.lang.String r2 = "Exception thrown while reading args: "
            android.util.Log.e(r1, r2, r0)
            r0 = r5
            r5 = r10
            goto L_0x0376
        L_0x0375:
            r0 = r5
        L_0x0376:
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x037d
            goto L_0x0384
        L_0x037d:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0384
            r10 = r0
            r6 = r5
            goto L_0x0399
        L_0x0384:
            axbe r0 = defpackage.axbe.a
            axbf r0 = r0.a()
            long r0 = r0.i()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            long r0 = java.lang.System.currentTimeMillis()
            r10 = r0
            r6 = r2
        L_0x0399:
            boolean r0 = defpackage.axbe.g()
            if (r0 == 0) goto L_0x03a6
            r1 = 0
            r0 = r9
            r2 = r6
            r4 = r10
            a((defpackage.jjv) r0, (int) r1, (long) r2, (long) r4)
        L_0x03a6:
            boolean r0 = defpackage.axbe.h()
            if (r0 == 0) goto L_0x03b3
            r1 = 1
            r0 = r9
            r2 = r6
            r4 = r10
            a((defpackage.jjv) r0, (int) r1, (long) r2, (long) r4)
        L_0x03b3:
            r9.b()
        L_0x03b6:
            com.google.android.chimera.config.ModuleManager r1 = com.google.android.chimera.config.ModuleManager.get(r19)
            java.lang.String r0 = "Module Sets:"
            r9.println(r0)
            r9.a()
            r2 = 0
            com.google.android.chimera.config.ModuleManager$ConfigInfo r0 = r1.getCurrentConfig()     // Catch:{ InvalidConfigException -> 0x03c8 }
            goto L_0x03d2
        L_0x03c8:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "GmsCoreStatsService"
            java.lang.String r4 = "Unable to get Chimera module config"
            android.util.Log.e(r0, r4, r3)
            r0 = r2
        L_0x03d2:
            if (r0 == 0) goto L_0x0411
            java.util.Collection r0 = r0.moduleSets
            java.util.Iterator r0 = r0.iterator()
        L_0x03da:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0411
            java.lang.Object r3 = r0.next()
            com.google.android.chimera.config.ModuleManager$ModuleSetInfo r3 = (com.google.android.chimera.config.ModuleManager.ModuleSetInfo) r3
            java.lang.String r4 = r3.moduleSetId
            int r3 = r3.moduleSetVariant
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 48
            r6.<init>(r5)
            java.lang.String r5 = "Module Set ID: "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = ", Module Set Variant: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r9.println(r3)
            goto L_0x03da
        L_0x0411:
            java.util.Collection r2 = r1.getAllModules()     // Catch:{ InvalidConfigException -> 0x0416 }
            goto L_0x041f
        L_0x0416:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "GmsCoreStatsService"
            java.lang.String r3 = "Unable to get Chimera module info collection"
            android.util.Log.e(r0, r3, r1)
        L_0x041f:
            if (r2 == 0) goto L_0x0539
            r9.println()
            r9.b()
            java.lang.String r0 = "Chimera Module APKs:"
            r9.println(r0)
            r9.a()
            ou r0 = new ou
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x0438:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0464
            java.lang.Object r2 = r1.next()
            com.google.android.chimera.config.ModuleManager$ModuleInfo r2 = (com.google.android.chimera.config.ModuleManager.ModuleInfo) r2
            java.lang.String r3 = r2.moduleId
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0438
            com.google.android.chimera.config.ModuleManager$ModuleApkInfo r3 = r2.moduleApk
            java.lang.Object r4 = r0.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x045f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
            goto L_0x0460
        L_0x045f:
        L_0x0460:
            r4.add(r2)
            goto L_0x0438
        L_0x0464:
            r6 = 0
        L_0x0465:
            int r1 = r0.h
            if (r6 >= r1) goto L_0x0533
            java.lang.Object r1 = r0.b((int) r6)
            com.google.android.chimera.config.ModuleManager$ModuleApkInfo r1 = (com.google.android.chimera.config.ModuleManager.ModuleApkInfo) r1
            java.lang.Object r2 = r0.c(r6)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.String r3 = r1.apkPackageName
            int r4 = r1.apkVersionCode
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + r15
            r7.<init>(r5)
            r7.append(r3)
            java.lang.String r3 = " ["
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = "]"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = r19.getPackageName()
            java.lang.String r5 = r1.apkPackageName
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x04e2
            java.lang.String r4 = r1.apkVersionName
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x04e2
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r1.apkVersionName
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 3
            int r4 = r4 + r8
            int r4 = r4 + r5
            r7.<init>(r4)
            r7.append(r3)
            java.lang.String r3 = " ["
            r7.append(r3)
            r7.append(r1)
            java.lang.String r1 = "]"
            r7.append(r1)
            java.lang.String r3 = r7.toString()
            goto L_0x04e3
        L_0x04e2:
            r8 = 3
        L_0x04e3:
            r9.println(r3)
            r9.a()
            int r1 = r2.size()
            r3 = 0
        L_0x04ee:
            if (r3 >= r1) goto L_0x0527
            java.lang.Object r4 = r2.get(r3)
            com.google.android.chimera.config.ModuleManager$ModuleInfo r4 = (com.google.android.chimera.config.ModuleManager.ModuleInfo) r4
            java.lang.String r5 = r4.moduleId
            int r4 = r4.moduleVersion
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 15
            int r7 = r7 + r11
            r10.<init>(r7)
            r10.append(r5)
            java.lang.String r5 = " [v"
            r10.append(r5)
            r10.append(r4)
            java.lang.String r4 = "]"
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r9.print(r4)
            r9.println()
            int r3 = r3 + 1
            goto L_0x04ee
        L_0x0527:
            r11 = 15
            r9.b()
            r9.println()
            int r6 = r6 + 1
            goto L_0x0465
        L_0x0533:
            r9.b()
            r9.println()
        L_0x0539:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.GmsCoreStatsChimeraService.dump(java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        if (jda.a().a.d) {
            jfp jfp = new jfp("GmsCoreStatsService", 10);
            this.a = jfp;
            jfp.start();
            this.c = new jcj(this.a);
        }
        int i = Build.VERSION.SDK_INT;
        jes.a();
    }

    public final void onDestroy() {
        super.onDestroy();
        jfp jfp = this.a;
        if (jfp != null) {
            jfp.quit();
        }
        int i = Build.VERSION.SDK_INT;
        jes a2 = jes.a();
        if (a2 != null) {
            a2.b();
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Handler handler;
        if (intent == null || (handler = this.c) == null) {
            return 1;
        }
        handler.sendMessage(Message.obtain(handler, 0, intent));
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        r5 = java.lang.String.valueOf(r5);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 45);
        r7.append("Security exception trying to clear log file: ");
        r7.append(r5);
        android.util.Log.e("GmsCoreStatsService", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0103, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        android.util.Log.w("GmsCoreStatsService", java.lang.String.format(java.util.Locale.getDefault(), "Truncating %s was unsuccessful.", new java.lang.Object[]{r6.getName()}), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011f, code lost:
        if (r6.delete() != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0121, code lost:
        android.util.Log.e("GmsCoreStatsService", java.lang.String.format(java.util.Locale.getDefault(), "Deleting %s was unsuccessful.", new java.lang.Object[]{r6.getName()}));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5 A[SYNTHETIC, Splitter:B:44:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df A[ExcHandler: SecurityException (r5v3 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:16:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105 A[ExcHandler: OverlappingFileLockException (e java.nio.channels.OverlappingFileLockException), Splitter:B:16:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0136 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r12) {
        /*
            java.lang.String r0 = "GmsCoreStatsService"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            agvx r2 = defpackage.jcc.a
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.content.ComponentName r3 = defpackage.jcl.a
            if (r2 == 0) goto L_0x0023
            jby r2 = new jby
            r2.<init>()
            java.util.List r2 = r2.a((android.content.Context) r12)
            r1.addAll(r2)
        L_0x0023:
            agvx r2 = defpackage.jcf.a
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x003d
            jdr r2 = new jdr
            r2.<init>()
            java.util.List r2 = r2.a((android.content.Context) r12)
            r1.addAll(r2)
        L_0x003d:
            agvx r2 = defpackage.jcb.a
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x0057
            jbu r2 = new jbu
            r2.<init>()
            java.util.List r2 = r2.a((android.content.Context) r12)
            r1.addAll(r2)
        L_0x0057:
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x005d:
            r5 = 1
            if (r4 < r2) goto L_0x008e
            agvx r0 = defpackage.jcd.a
            java.lang.Object r0 = r0.c()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "NetworkUsageUploadStats"
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r0, r3)
            java.util.Calendar r0 = defpackage.jii.a()
            r1 = 6
            r0.add(r1, r5)
            android.content.SharedPreferences$Editor r12 = r12.edit()
            long r0 = r0.getTimeInMillis()
            java.lang.String r2 = "timeLastUpdate"
            android.content.SharedPreferences$Editor r12 = r12.putLong(r2, r0)
            r12.apply()
        L_0x008d:
            return
        L_0x008e:
            java.lang.Object r6 = r1.get(r4)
            java.io.File r6 = (java.io.File) r6
            boolean r7 = r6.exists()     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
            if (r7 == 0) goto L_0x00d9
            r7 = 0
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00c3 }
            java.lang.String r9 = "rw"
            r8.<init>(r6, r9)     // Catch:{ all -> 0x00c3 }
            java.nio.channels.FileChannel r9 = r8.getChannel()     // Catch:{ all -> 0x00c1 }
            java.nio.channels.FileLock r7 = r9.lock()     // Catch:{ all -> 0x00c1 }
            r10 = 0
            r9.truncate(r10)     // Catch:{ all -> 0x00c1 }
            if (r7 == 0) goto L_0x00bc
            boolean r9 = r7.isValid()     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
            if (r9 == 0) goto L_0x00bc
            r7.release()     // Catch:{ IOException -> 0x00bb, OverlappingFileLockException -> 0x0105, SecurityException -> 0x00df }
            goto L_0x00bc
        L_0x00bb:
            r7 = move-exception
        L_0x00bc:
            defpackage.jjt.a((java.io.Closeable) r8)     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
            goto L_0x0136
        L_0x00c1:
            r9 = move-exception
            goto L_0x00c6
        L_0x00c3:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L_0x00c6:
            if (r7 == 0) goto L_0x00d3
            boolean r10 = r7.isValid()     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
            if (r10 == 0) goto L_0x00d3
            r7.release()     // Catch:{ IOException -> 0x00d2, OverlappingFileLockException -> 0x0105, SecurityException -> 0x00df }
            goto L_0x00d3
        L_0x00d2:
            r7 = move-exception
        L_0x00d3:
            if (r8 == 0) goto L_0x00d8
            defpackage.jjt.a((java.io.Closeable) r8)     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
        L_0x00d8:
            throw r9     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
        L_0x00d9:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
            r7.<init>()     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
            throw r7     // Catch:{ OverlappingFileLockException -> 0x0105, IOException -> 0x0103, SecurityException -> 0x00df }
        L_0x00df:
            r5 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 45
            r7.<init>(r6)
            java.lang.String r6 = "Security exception trying to clear log file: "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.e(r0, r5)
            goto L_0x0136
        L_0x0103:
            r7 = move-exception
            goto L_0x0106
        L_0x0105:
            r7 = move-exception
        L_0x0106:
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r10 = r6.getName()
            r9[r3] = r10
            java.lang.String r10 = "Truncating %s was unsuccessful."
            java.lang.String r8 = java.lang.String.format(r8, r10, r9)
            android.util.Log.w(r0, r8, r7)
            boolean r7 = r6.delete()
            if (r7 != 0) goto L_0x0136
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r6.getName()
            r5[r3] = r6
            java.lang.String r6 = "Deleting %s was unsuccessful."
            java.lang.String r5 = java.lang.String.format(r7, r6, r5)
            android.util.Log.e(r0, r5)
        L_0x0136:
            int r4 = r4 + 1
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.GmsCoreStatsChimeraService.a(android.content.Context):void");
    }

    static final void a(jjv jjv, int i, long j, long j2) {
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        String str2;
        String a2 = jcm.a(i);
        jjv.println(a2);
        jjv.a();
        List<aoid> a3 = jeo.a(j, j2, i);
        jjv.println(jeo.a);
        if (a3.isEmpty()) {
            jjv.println("No data");
        } else {
            Collections.sort(a3, new jch());
            Collections.reverse(a3);
            for (aoid aoid : a3) {
                Object[] objArr = new Object[12];
                objArr[0] = izi.a(aoid.b);
                String valueOf = String.valueOf(Integer.toHexString(aoid.b));
                objArr[1] = valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
                objArr[2] = a2;
                Long l = null;
                if ((2 & aoid.a) != 0) {
                    num = Integer.valueOf(aoid.c);
                } else {
                    num = null;
                }
                objArr[3] = num;
                if ((aoid.a & 8) != 0) {
                    l = Long.valueOf(aoid.e);
                }
                objArr[4] = l;
                String str3 = " ";
                if ((aoid.a & 16) != 0) {
                    obj = Long.valueOf(aoid.f);
                } else {
                    obj = str3;
                }
                objArr[5] = obj;
                if ((aoid.a & 128) != 0) {
                    obj2 = Long.valueOf(aoid.i);
                } else {
                    obj2 = str3;
                }
                objArr[6] = obj2;
                if ((aoid.a & 32) != 0) {
                    obj3 = Long.valueOf(aoid.g);
                } else {
                    obj3 = str3;
                }
                objArr[7] = obj3;
                if ((aoid.a & 64) != 0) {
                    obj4 = Long.valueOf(a(aoid));
                } else {
                    obj4 = str3;
                }
                objArr[8] = obj4;
                if ((aoid.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    str = String.format("%.0f", new Object[]{Double.valueOf(Math.sqrt(aoid.j))});
                } else {
                    str = str3;
                }
                objArr[9] = str;
                if ((aoid.a & 512) != 0) {
                    str2 = String.format("%.0f", new Object[]{Double.valueOf(aoid.k)});
                } else {
                    str2 = str3;
                }
                objArr[10] = str2;
                if ((aoid.a & 1024) != 0) {
                    str3 = String.format("%.0f", new Object[]{Double.valueOf(aoid.l)});
                }
                objArr[11] = str3;
                jjv.println(String.format("%25.25s\t%10.10s\t%6s\t%5s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%6s\t%6s", objArr));
            }
        }
        jjv.b();
    }

    private final void a(jjv jjv, String str, long j, long j2) {
        jjv.println(str);
        jjv.a();
        if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
            jjv.println(jdy.a);
            a(jjv, jec.b(getContentResolver(), j, j2));
        } else {
            jjv.println(jee.k);
            a(jjv, jec.c(getContentResolver(), j, j2));
        }
        jjv.b();
    }

    private static final void a(jjv jjv, List list) {
        if (!list.isEmpty()) {
            Collections.sort(list, Collections.reverseOrder());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jjv.print(((jef) list.get(i)).b(-1).toString());
            }
        } else {
            jjv.println("No data");
        }
        jjv.println();
    }
}
