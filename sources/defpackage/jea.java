package defpackage;

import android.app.usage.NetworkStatsManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider;
import java.util.Collection;

/* renamed from: jea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jea implements Runnable {
    private static final int[] a = {0, 1};
    private static final int[] b = {0, 1, 2, 3};
    private static final int[] c = {0};
    private static Collection d;
    private final ContentResolver e;
    private final Context f;
    private final NetworkStatsManager g;
    private final int h;
    private long i = 0;
    private long j = 0;
    private boolean k = false;
    private boolean l = false;

    public jea(Context context, int i2, long j2, long j3, boolean z, boolean z2) {
        this.f = context;
        this.e = context.getContentResolver();
        this.h = i2;
        this.i = j2;
        this.j = j3;
        this.k = z;
        this.l = z2;
        this.g = (NetworkStatsManager) this.f.getSystemService(NetworkStatsManager.class);
        d = izi.a().keySet();
    }

    private static final jee a(int i2, int i3, int i4, int i5, long j2, long j3, long j4, long j5, long j6, long j7) {
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        jee jee = new jee(i2, i3, i4, i5);
        jee.r = j2;
        jee.t = j4;
        jee.s = j3;
        jee.u = j5;
        jee.p = j6;
        jee.q = j7;
        return jee;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r51 = this;
            r1 = r51
            boolean r0 = defpackage.jkr.c()
            if (r0 == 0) goto L_0x03ea
            agvx r0 = defpackage.jcd.g
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03ea
            android.content.Context r0 = r1.f
            boolean r0 = r0.isDeviceProtectedStorage()
            java.lang.String r2 = "NetworkUsageDbReporterN"
            if (r0 != 0) goto L_0x03e4
            long r3 = java.lang.System.currentTimeMillis()
            boolean r0 = r1.l
            if (r0 == 0) goto L_0x003d
            android.content.ContentResolver r0 = r1.e
            java.lang.Long r5 = defpackage.jed.b(r3)
            long r5 = r5.longValue()
            java.lang.Long r7 = defpackage.jed.c(r3)
            long r7 = r7.longValue()
            a(r0, r5, r7)
        L_0x003d:
            android.content.Context r0 = r1.f
            long r14 = r1.i
            long r12 = r1.j
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r5 = "phone"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSubscriberId()
            r16 = 0
            android.app.usage.NetworkStats$Bucket r11 = new android.app.usage.NetworkStats$Bucket     // Catch:{ SecurityException -> 0x01a9 }
            r11.<init>()     // Catch:{ SecurityException -> 0x01a9 }
            java.util.Collection r5 = d     // Catch:{ SecurityException -> 0x01a9 }
            java.util.Iterator r17 = r5.iterator()     // Catch:{ SecurityException -> 0x01a9 }
        L_0x0061:
            boolean r5 = r17.hasNext()     // Catch:{ SecurityException -> 0x01a9 }
            if (r5 != 0) goto L_0x006d
            r21 = r3
            r14 = r10
            r3 = r2
            goto L_0x01b9
        L_0x006d:
            java.lang.Object r5 = r17.next()     // Catch:{ SecurityException -> 0x01a9 }
            r18 = r5
            java.lang.Integer r18 = (java.lang.Integer) r18     // Catch:{ SecurityException -> 0x01a9 }
            int r5 = r18.intValue()     // Catch:{ SecurityException -> 0x01a9 }
            boolean r19 = defpackage.izi.b(r5)     // Catch:{ SecurityException -> 0x01a9 }
            if (r19 != 0) goto L_0x0083
            int[] r5 = c     // Catch:{ SecurityException -> 0x01a9 }
            r8 = r5
            goto L_0x0086
        L_0x0083:
            int[] r5 = b     // Catch:{ SecurityException -> 0x01a9 }
            r8 = r5
        L_0x0086:
            int[] r9 = a     // Catch:{ SecurityException -> 0x01a9 }
            int r7 = r9.length     // Catch:{ SecurityException -> 0x01a9 }
            r6 = 0
        L_0x008a:
            if (r6 >= r7) goto L_0x019b
            r5 = r9[r6]     // Catch:{ SecurityException -> 0x01a9 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r5)     // Catch:{ SecurityException -> 0x01a9 }
            int r5 = r8.length     // Catch:{ SecurityException -> 0x01a9 }
            r21 = r3
            r3 = 0
        L_0x0096:
            if (r3 >= r5) goto L_0x0183
            r4 = r8[r3]     // Catch:{ SecurityException -> 0x017f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SecurityException -> 0x017f }
            r23 = r2
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ SecurityException -> 0x017d }
            r2.<init>()     // Catch:{ SecurityException -> 0x017d }
            int r24 = r18.intValue()     // Catch:{ SecurityException -> 0x017d }
            int r25 = r4.intValue()     // Catch:{ SecurityException -> 0x017d }
            if (r25 == 0) goto L_0x00bb
            int r24 = r18.intValue()     // Catch:{ SecurityException -> 0x017d }
            int r25 = r4.intValue()     // Catch:{ SecurityException -> 0x017d }
            int r25 = r25 << 28
            r24 = r24 | r25
        L_0x00bb:
            if (r19 == 0) goto L_0x00c2
            int r4 = r4.intValue()     // Catch:{ SecurityException -> 0x017d }
            goto L_0x00c3
        L_0x00c2:
            r4 = 7
        L_0x00c3:
            r25 = r5
            android.app.usage.NetworkStatsManager r5 = r1.g     // Catch:{ SecurityException -> 0x017d }
            int r26 = r20.intValue()     // Catch:{ SecurityException -> 0x017d }
            r41 = r3
            int r3 = r1.h     // Catch:{ SecurityException -> 0x017d }
            r42 = r25
            r43 = r6
            r6 = r26
            r44 = r7
            r7 = r0
            r46 = r8
            r45 = r9
            r8 = r14
            r47 = r14
            r14 = r10
            r15 = r11
            r10 = r12
            r49 = r12
            r12 = r3
            r13 = r24
            android.app.usage.NetworkStats r3 = r5.queryDetailsForUidTag(r6, r7, r8, r10, r12, r13)     // Catch:{ SecurityException -> 0x017b }
        L_0x00eb:
            boolean r5 = r3.getNextBucket(r15)     // Catch:{ SecurityException -> 0x017b }
            if (r5 == 0) goto L_0x0159
            int r5 = r18.intValue()     // Catch:{ SecurityException -> 0x017b }
            int r6 = r1.h     // Catch:{ SecurityException -> 0x017b }
            int r7 = r20.intValue()     // Catch:{ SecurityException -> 0x017b }
            long r8 = r15.getStartTimeStamp()     // Catch:{ SecurityException -> 0x017b }
            long r29 = r15.getRxBytes()     // Catch:{ SecurityException -> 0x017b }
            long r31 = r15.getRxPackets()     // Catch:{ SecurityException -> 0x017b }
            long r33 = r15.getTxBytes()     // Catch:{ SecurityException -> 0x017b }
            long r35 = r15.getTxPackets()     // Catch:{ SecurityException -> 0x017b }
            long r39 = r15.getEndTimeStamp()     // Catch:{ SecurityException -> 0x017b }
            r25 = r5
            r26 = r6
            r27 = r4
            r28 = r7
            r37 = r8
            jee r10 = a(r25, r26, r27, r28, r29, r31, r33, r35, r37, r39)     // Catch:{ SecurityException -> 0x017b }
            java.lang.Long r8 = defpackage.jed.c(r8)     // Catch:{ SecurityException -> 0x017b }
            long r8 = r8.longValue()     // Catch:{ SecurityException -> 0x017b }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ SecurityException -> 0x017b }
            java.lang.Object r9 = r2.get(r8)     // Catch:{ SecurityException -> 0x017b }
            jee r9 = (defpackage.jee) r9     // Catch:{ SecurityException -> 0x017b }
            if (r9 != 0) goto L_0x0154
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r39 = -9223372036854775808
            r25 = r5
            r26 = r6
            r27 = r4
            r28 = r7
            jee r9 = a(r25, r26, r27, r28, r29, r31, r33, r35, r37, r39)     // Catch:{ SecurityException -> 0x017b }
            r2.put(r8, r9)     // Catch:{ SecurityException -> 0x017b }
            goto L_0x0155
        L_0x0154:
        L_0x0155:
            r9.a((defpackage.jee) r10)     // Catch:{ SecurityException -> 0x017b }
            goto L_0x00eb
        L_0x0159:
            if (r3 == 0) goto L_0x0165
            r3.close()     // Catch:{ SecurityException -> 0x017b }
            java.util.Collection r2 = r2.values()     // Catch:{ SecurityException -> 0x017b }
            r14.addAll(r2)     // Catch:{ SecurityException -> 0x017b }
        L_0x0165:
            int r3 = r41 + 1
            r10 = r14
            r11 = r15
            r2 = r23
            r5 = r42
            r6 = r43
            r7 = r44
            r9 = r45
            r8 = r46
            r14 = r47
            r12 = r49
            goto L_0x0096
        L_0x017b:
            r0 = move-exception
            goto L_0x01af
        L_0x017d:
            r0 = move-exception
            goto L_0x01ae
        L_0x017f:
            r0 = move-exception
            r23 = r2
            goto L_0x01ae
        L_0x0183:
            r23 = r2
            r43 = r6
            r44 = r7
            r46 = r8
            r45 = r9
            r49 = r12
            r47 = r14
            r14 = r10
            r15 = r11
            int r6 = r43 + 1
            r3 = r21
            r14 = r47
            goto L_0x008a
        L_0x019b:
            r23 = r2
            r21 = r3
            r49 = r12
            r47 = r14
            r14 = r10
            r15 = r11
            r14 = r47
            goto L_0x0061
        L_0x01a9:
            r0 = move-exception
            r23 = r2
            r21 = r3
        L_0x01ae:
            r14 = r10
        L_0x01af:
            java.lang.String r2 = "Gmscore does not have permission to view network usage data for a client module"
            r3 = r23
            android.util.Log.e(r3, r2)
            defpackage.apev.a(r0)
        L_0x01b9:
            r0 = 50
            android.content.ContentValues[] r2 = new android.content.ContentValues[r0]
            jdt r4 = new jdt
            r4.<init>()
            int r5 = r14.size()
            r6 = r21
            r8 = 0
            r9 = 0
        L_0x01ca:
            r10 = 0
            if (r8 >= r5) goto L_0x0229
            java.lang.Object r12 = r14.get(r8)
            jee r12 = (defpackage.jee) r12
            android.content.ContentValues r13 = r4.b()
            r23 = r13
            r2[r9] = r13
            int r13 = r12.l
            r24 = r13
            int r13 = r12.m
            r25 = r13
            int r13 = r12.n
            r26 = r13
            int r13 = r12.o
            r27 = r13
            long r28 = r12.c()
            long r0 = r12.s
            r30 = r0
            long r32 = r12.d()
            long r0 = r12.u
            r34 = r0
            long r0 = r12.p
            r38 = r0
            long r0 = r12.q
            r40 = r0
            r42 = 0
            java.lang.Long r43 = java.lang.Long.valueOf(r10)
            r36 = r6
            a(r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42, r43)
            int r9 = r9 + 1
            r0 = 50
            if (r9 != r0) goto L_0x021e
            r1 = r51
            android.content.ContentResolver r6 = r1.e
            a(r6, r2, r4, r0)
            r9 = 0
            goto L_0x0220
        L_0x021e:
            r1 = r51
        L_0x0220:
            int r8 = r8 + 1
            long r6 = java.lang.System.currentTimeMillis()
            r0 = 50
            goto L_0x01ca
        L_0x0229:
            if (r9 <= 0) goto L_0x0232
            android.content.ContentResolver r0 = r1.e
            a(r0, r2, r4, r9)
            r9 = 0
            goto L_0x0233
        L_0x0232:
        L_0x0233:
            boolean r0 = r1.k
            if (r0 != 0) goto L_0x03d8
            android.content.ContentResolver r0 = r1.e
            java.lang.Long r5 = defpackage.jed.c(r6)
            long r10 = r5.longValue()
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0269
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 90
            r0.<init>(r2)
            java.lang.String r2 = "Error in groupData: fromDateTime("
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = ") > toDateTime ("
            r0.append(r2)
            r0.append(r6)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r3, r0)
            return
        L_0x0269:
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r5 = java.lang.String.valueOf(r10)
            r3[r16] = r5
            java.lang.String r5 = java.lang.String.valueOf(r6)
            r6 = 1
            r3[r6] = r5
            android.net.Uri r18 = com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider.k
            r19 = 0
            r20 = 0
            r22 = 0
            r17 = r0
            r21 = r3
            android.database.Cursor r5 = r17.query(r18, r19, r20, r21, r22)
            if (r5 == 0) goto L_0x03d2
            java.lang.String r7 = "_id"
            int r7 = r5.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x03cd }
            java.lang.String r8 = "datetime_updated_androidN"
            int r8 = r5.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x03cd }
            java.lang.String r10 = "from_datetime_updated_androidN"
            int r10 = r5.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x03cd }
            java.lang.String r11 = "to_datetime_updated_androidN"
            int r11 = r5.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x03cd }
            java.lang.String r12 = "tag_androidN"
            int r12 = r5.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x03cd }
            java.lang.String r14 = "uid_androidN"
            int r14 = r5.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x03cd }
            java.lang.String r15 = "device_state_androidN"
            int r15 = r5.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x03cd }
            java.lang.String r6 = "transport_type_androidN"
            int r6 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x03cd }
            java.lang.String r13 = "rxbytes_androidN"
            int r13 = r5.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x03cd }
            r19 = r9
            java.lang.String r9 = "txbytes_androidN"
            int r9 = r5.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x03cd }
            java.lang.String r1 = "rxpackets_androidN"
            int r1 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x03cd }
            r20 = r3
            java.lang.String r3 = "txpackets_androidN"
            int r3 = r5.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x03cd }
            r21 = r0
            java.lang.String r0 = "row_group_count_AndroidN"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03cd }
            r22 = r11
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x03cd }
            r11.<init>()     // Catch:{ all -> 0x03cd }
            r23 = r10
            r10 = r19
            r19 = 0
        L_0x02ec:
            boolean r24 = r5.moveToNext()     // Catch:{ all -> 0x03cd }
            if (r24 == 0) goto L_0x0375
            long r24 = r5.getLong(r7)     // Catch:{ all -> 0x03cd }
            r47 = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x03cd }
            r11.add(r7)     // Catch:{ all -> 0x03cd }
            long r24 = r5.getLong(r0)     // Catch:{ all -> 0x03cd }
            r26 = 1
            int r28 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r28 == 0) goto L_0x0369
            android.content.ContentValues r26 = r4.b()     // Catch:{ all -> 0x03cd }
            r2[r10] = r26     // Catch:{ all -> 0x03cd }
            int r27 = r5.getInt(r12)     // Catch:{ all -> 0x03cd }
            int r28 = r5.getInt(r14)     // Catch:{ all -> 0x03cd }
            int r29 = r5.getInt(r15)     // Catch:{ all -> 0x03cd }
            int r30 = r5.getInt(r6)     // Catch:{ all -> 0x03cd }
            long r31 = r5.getLong(r13)     // Catch:{ all -> 0x03cd }
            long r33 = r5.getLong(r1)     // Catch:{ all -> 0x03cd }
            long r35 = r5.getLong(r9)     // Catch:{ all -> 0x03cd }
            long r37 = r5.getLong(r3)     // Catch:{ all -> 0x03cd }
            long r39 = r5.getLong(r8)     // Catch:{ all -> 0x03cd }
            r24 = r0
            r0 = r23
            long r41 = r5.getLong(r0)     // Catch:{ all -> 0x03cd }
            r23 = r0
            r0 = r22
            long r43 = r5.getLong(r0)     // Catch:{ all -> 0x03cd }
            r45 = 1
            r46 = r7
            a(r26, r27, r28, r29, r30, r31, r33, r35, r37, r39, r41, r43, r45, r46)     // Catch:{ all -> 0x03cd }
            int r10 = r10 + 1
            r7 = 50
            if (r10 == r7) goto L_0x0355
            r18 = r10
            r10 = r21
            goto L_0x035c
        L_0x0355:
            r10 = r21
            a(r10, r2, r4, r7)     // Catch:{ all -> 0x03cd }
            r18 = 0
        L_0x035c:
            r22 = r0
            r21 = r10
            r10 = r18
            r0 = r24
            r7 = r47
            r19 = 1
            goto L_0x02ec
        L_0x0369:
            r24 = r0
            r7 = r21
            r0 = r22
            r0 = r24
            r7 = r47
            goto L_0x02ec
        L_0x0375:
            r7 = r21
            if (r10 <= 0) goto L_0x037c
            a(r7, r2, r4, r10)     // Catch:{ all -> 0x03cd }
        L_0x037c:
            if (r19 == 0) goto L_0x03d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03cd }
            r0.<init>()     // Catch:{ all -> 0x03cd }
            int r1 = r11.size()     // Catch:{ all -> 0x03cd }
            r2 = 0
        L_0x0388:
            if (r2 < r1) goto L_0x03b6
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03cd }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03cd }
            int r1 = r1.length()     // Catch:{ all -> 0x03cd }
            int r1 = r1 + 149
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03cd }
            r2.<init>(r1)     // Catch:{ all -> 0x03cd }
            java.lang.String r1 = "_id IN (SELECT _id FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? AND _id NOT IN ("
            r2.append(r1)     // Catch:{ all -> 0x03cd }
            r2.append(r0)     // Catch:{ all -> 0x03cd }
            java.lang.String r0 = "))"
            r2.append(r0)     // Catch:{ all -> 0x03cd }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x03cd }
            android.net.Uri r1 = com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider.b     // Catch:{ all -> 0x03cd }
            r3 = r20
            r7.delete(r1, r0, r3)     // Catch:{ all -> 0x03cd }
            goto L_0x03d2
        L_0x03b6:
            r3 = r20
            java.lang.Object r4 = r11.get(r2)     // Catch:{ all -> 0x03cd }
            r0.append(r4)     // Catch:{ all -> 0x03cd }
            int r4 = r1 + -1
            if (r2 >= r4) goto L_0x03c8
            java.lang.String r4 = ","
            r0.append(r4)     // Catch:{ all -> 0x03cd }
        L_0x03c8:
            int r2 = r2 + 1
            r20 = r3
            goto L_0x0388
        L_0x03cd:
            r0 = move-exception
            r5.close()
            throw r0
        L_0x03d2:
            if (r5 == 0) goto L_0x03d7
            r5.close()
        L_0x03d7:
            return
        L_0x03d8:
            r1 = r51
            android.content.ContentResolver r0 = r1.e
            long r2 = defpackage.jed.a(r6)
            a(r0, r10, r2)
            return
        L_0x03e4:
            r3 = r2
            java.lang.String r0 = "This task shouldn't run on a Device Protected Storage Context."
            android.util.Log.e(r3, r0)
        L_0x03ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jea.run():void");
    }

    private static final void a(ContentResolver contentResolver, long j2, long j3) {
        if (j2 > j3) {
            StringBuilder sb = new StringBuilder(62);
            sb.append("Error deleting from ");
            sb.append(j2);
            sb.append("- ");
            sb.append(j3);
            Log.e("NetworkUsageDbReporterN", sb.toString());
            return;
        }
        contentResolver.delete(NetworkUsageChimeraContentProvider.b, "_id IN (SELECT _id FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? )", new String[]{String.valueOf(j2), String.valueOf(j3)});
    }

    private static final void a(ContentResolver contentResolver, ContentValues[] contentValuesArr, jdt jdt, int i2) {
        if (contentResolver.bulkInsert(NetworkUsageChimeraContentProvider.i, contentValuesArr) != i2) {
            Log.w("NetworkUsageDbReporterN", "Not all values were updated or inserted.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ContentValues contentValues = contentValuesArr[i3];
            iva.a((Object) contentValues);
            jdt.a(contentValues);
            contentValuesArr[i3] = null;
        }
    }

    public static final void a(ContentValues contentValues, int i2, int i3, int i4, int i5, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, Long l2) {
        ContentValues contentValues2 = contentValues;
        contentValues.put("datetime_updated_androidN", Long.valueOf(j6));
        contentValues.put("from_datetime_updated_androidN", Long.valueOf(j7));
        contentValues.put("to_datetime_updated_androidN", Long.valueOf(j8));
        contentValues.put("tag_androidN", Integer.valueOf(i2));
        contentValues.put("uid_androidN", Integer.valueOf(i3));
        contentValues.put("device_state_androidN", Integer.valueOf(i4));
        contentValues.put("transport_type_androidN", Integer.valueOf(i5));
        contentValues.put("rxbytes_androidN", Long.valueOf(j2));
        contentValues.put("rxpackets_androidN", Long.valueOf(j3));
        contentValues.put("txbytes_androidN", Long.valueOf(j4));
        contentValues.put("txpackets_androidN", Long.valueOf(j5));
        contentValues.put("is_update", Boolean.valueOf(z));
        if (z) {
            contentValues.put("id_update_row", l2);
        }
    }
}
