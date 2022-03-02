package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import java.util.List;

/* renamed from: acsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsp extends acsr {
    public static acsp a = null;
    private static final anax f = anax.a(6, 5, 3, 4, 1);
    private int g;

    private final avuy a(boolean z, boolean z2) {
        boolean z3 = z;
        boolean z4 = z2;
        aucd o = avuy.e.o();
        if (this.g <= 0) {
            this.g = 100;
        }
        acsm a2 = acsm.a((Context) ihs.b());
        for (int i : acsr.e) {
            String a3 = a(i, z3, z4, false);
            float b = ((float) ((azpj.b() ? a2.b(a3) : d.getInt(a3, 0)) * 100)) / ((float) this.g);
            String a4 = a(i, z3, z4, true);
            int b2 = azpj.b() ? a2.b(a4) : d.getInt(a4, 0);
            aucd o2 = avux.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avux avux = (avux) o2.b;
            int i2 = avux.a | 1;
            avux.a = i2;
            avux.b = b;
            avux.a = i2 | 2;
            avux.c = b2;
            avux avux2 = (avux) o2.i();
            if (i == 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avuy avuy = (avuy) o.b;
                avux2.getClass();
                avuy.b = avux2;
                avuy.a |= 1;
            } else if (i == 1) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avuy avuy2 = (avuy) o.b;
                avux2.getClass();
                avuy2.d = avux2;
                avuy2.a |= 4;
            } else if (i != 2) {
                Log.e("EastworldBattery", "EastworldBatteryProcessor got invalid session type.");
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avuy avuy3 = (avuy) o.b;
                avux2.getClass();
                avuy3.c = avux2;
                avuy3.a |= 2;
            }
        }
        return (avuy) o.i();
    }

    static String a(int i, boolean z, boolean z2, boolean z3) {
        return String.valueOf((i * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS) + ((z ? 1 : 0) * true) + ((z2 ? 1 : 0) * true) + (z3 ? 1 : 0));
    }

    private static final void a(int i) {
        if (azpj.b()) {
            acsm a2 = acsm.a((Context) ihs.b());
            ContentValues contentValues = new ContentValues();
            contentValues.put("counter_val", 0);
            String[] strArr = new String[8];
            List a3 = acsm.a(i);
            for (int i2 = 0; i2 < 8; i2++) {
                strArr[i2] = String.valueOf(a3.get(i2));
            }
            try {
                a2.getWritableDatabase().update("battery_counter", contentValues, "counter_key IN(?, ?, ?, ?, ?, ?, ?, ?)", strArr);
            } catch (SQLiteException e) {
            }
        } else {
            SharedPreferences.Editor edit = d.edit();
            amzt j = amzy.j();
            j.c(a(i, true, true, true));
            j.c(a(i, false, true, true));
            j.c(a(i, true, false, true));
            j.c(a(i, false, false, true));
            j.c(a(i, true, true, false));
            j.c(a(i, false, true, false));
            j.c(a(i, true, false, false));
            j.c(a(i, false, false, false));
            amzy a4 = j.a();
            int size = a4.size();
            for (int i3 = 0; i3 < size; i3++) {
                edit.putInt((String) a4.get(i3), 0);
            }
            edit.apply();
        }
    }

    private static final void a(long j, long j2, int i, boolean z, boolean z2) {
        if (azpj.b()) {
            acsm a2 = acsm.a((Context) ihs.b());
            try {
                int a3 = a2.a("event_count");
                ContentValues contentValues = new ContentValues();
                Long valueOf = Long.valueOf(j);
                contentValues.put("elapsed_time", valueOf);
                contentValues.put("wallclock_time", Long.valueOf(j2));
                contentValues.put("battery_level", Integer.valueOf(i));
                contentValues.put("on_battery", Integer.valueOf(z ? 1 : 0));
                contentValues.put("screen_on", Integer.valueOf(z2 ? 1 : 0));
                contentValues.put("event_count", Integer.valueOf(a3 + 1));
                contentValues.put("last_event_time", valueOf);
                a2.getWritableDatabase().update("battery_status", contentValues, (String) null, (String[]) null);
            } catch (SQLiteException e) {
            }
        } else {
            SharedPreferences.Editor edit = d.edit();
            edit.putLong(":batteryElapsedTimeLatestStatus", j);
            edit.putLong(":batteryWallTimeLatestStatus", j2);
            edit.putInt(":batteryLevelLatestStatus", i);
            edit.putBoolean(":onBatteryLatestStatus", z);
            edit.putBoolean(":screenOnOffLatestStatus", z2);
            edit.putInt(":batteryProcessedEventCount", d.getInt(":batteryProcessedEventCount", 0) + 1);
            edit.putLong(":batteryLastEventTime", SystemClock.elapsedRealtime());
            edit.apply();
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r1v5, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r32v6 */
    /* JADX WARNING: type inference failed for: r32v13 */
    /* JADX WARNING: type inference failed for: r32v22 */
    /* JADX WARNING: type inference failed for: r32v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0651  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0713 A[SYNTHETIC, Splitter:B:244:0x0713] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0764  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02a0 A[SYNTHETIC, Splitter:B:91:0x02a0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r39, boolean r40, boolean r41, defpackage.aucd r42) {
        /*
            r38 = this;
            r1 = r38
            r2 = r39
            r3 = r42
            java.lang.String r4 = "event_count"
            aznr r0 = defpackage.aznr.a
            azns r0 = r0.a()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0025
            hph r0 = c
            java.lang.String r2 = "DisabledEastworldProcessorEastworldBattery"
            hox r0 = r0.c(r2)
            r0.a()
            hph r0 = c
            r0.d()
            return
        L_0x0025:
            anax r0 = f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r39)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0797
            ihs r0 = defpackage.ihs.b()
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r12 = java.lang.System.currentTimeMillis()
            android.content.IntentFilter r7 = new android.content.IntentFilter
            java.lang.String r8 = "android.intent.action.BATTERY_CHANGED"
            r7.<init>(r8)
            r14 = 0
            android.content.Intent r7 = r0.registerReceiver(r14, r7)
            java.lang.String r8 = "level"
            r15 = -1
            int r9 = r7.getIntExtra(r8, r15)
            java.lang.String r8 = "scale"
            int r8 = r7.getIntExtra(r8, r15)
            r1.g = r8
            boolean r8 = defpackage.azpj.b()
            if (r8 == 0) goto L_0x0067
            acsm r8 = defpackage.acsm.a((android.content.Context) r0)
            boolean r8 = r8.b()
            goto L_0x006f
        L_0x0067:
            android.content.SharedPreferences r8 = d
            java.lang.String r10 = ":batteryElapsedTimeLatestStatus"
            boolean r8 = r8.contains(r10)
        L_0x006f:
            java.lang.String r11 = "battery_status"
            java.lang.String r10 = ":bootTimesSinceReset"
            java.lang.String r14 = "last_event_time"
            java.lang.String r15 = "on_battery"
            r18 = r10
            java.lang.String r10 = "screen_on"
            r19 = r4
            java.lang.String r4 = "battery_level"
            java.lang.String r1 = "wallclock_time"
            r20 = r9
            java.lang.String r9 = "elapsed_time"
            java.lang.String r3 = "boot_count"
            r21 = r11
            if (r8 != 0) goto L_0x0182
            java.lang.String r0 = "status"
            r8 = -1
            int r0 = r7.getIntExtra(r0, r8)
            java.lang.String r11 = "level"
            int r11 = r7.getIntExtra(r11, r8)
            r7 = 2
            if (r0 != r7) goto L_0x009d
            r0 = 1
            goto L_0x00a3
        L_0x009d:
            r7 = 5
            if (r0 == r7) goto L_0x00a2
            r0 = 0
            goto L_0x00a3
        L_0x00a2:
            r0 = 1
        L_0x00a3:
            hph r7 = c
            int r7 = defpackage.acso.a((defpackage.hph) r7)
            boolean r8 = defpackage.azpj.b()
            if (r8 == 0) goto L_0x014d
            ihs r8 = defpackage.ihs.b()
            acsm r8 = defpackage.acsm.a((android.content.Context) r8)
            r23 = r14
            r14 = 5
            if (r2 != r14) goto L_0x00be
            r2 = 1
            goto L_0x00bf
        L_0x00be:
            r2 = 0
        L_0x00bf:
            boolean r14 = r8.b()
            if (r14 != 0) goto L_0x0181
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x014b }
            r14.<init>()     // Catch:{ SQLiteException -> 0x014b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x014b }
            r14.put(r9, r5)     // Catch:{ SQLiteException -> 0x014b }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x014b }
            r14.put(r1, r6)     // Catch:{ SQLiteException -> 0x014b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteException -> 0x014b }
            r14.put(r4, r1)     // Catch:{ SQLiteException -> 0x014b }
            r1 = 1
            r0 = r0 ^ r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x014b }
            r14.put(r15, r0)     // Catch:{ SQLiteException -> 0x014b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x014b }
            r14.put(r10, r0)     // Catch:{ SQLiteException -> 0x014b }
            r1 = 0
            int r0 = java.lang.Math.max(r7, r1)     // Catch:{ SQLiteException -> 0x014b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x014b }
            r14.put(r3, r0)     // Catch:{ SQLiteException -> 0x014b }
            r11 = r23
            r14.put(r11, r5)     // Catch:{ SQLiteException -> 0x014b }
            android.database.sqlite.SQLiteDatabase r0 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x014b }
            r7 = r21
            r1 = 0
            r0.insert(r7, r1, r14)     // Catch:{ SQLiteException -> 0x014b }
            int[] r1 = defpackage.acsr.e     // Catch:{ SQLiteException -> 0x014b }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x014b }
            r3 = 0
        L_0x010e:
            if (r3 >= r2) goto L_0x0181
            r4 = r1[r3]     // Catch:{ SQLiteException -> 0x014b }
            java.util.List r4 = defpackage.acsm.a((int) r4)     // Catch:{ SQLiteException -> 0x014b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SQLiteException -> 0x014b }
        L_0x011a:
            boolean r5 = r4.hasNext()     // Catch:{ SQLiteException -> 0x014b }
            if (r5 == 0) goto L_0x0147
            java.lang.Object r5 = r4.next()     // Catch:{ SQLiteException -> 0x014b }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ SQLiteException -> 0x014b }
            int r5 = r5.intValue()     // Catch:{ SQLiteException -> 0x014b }
            r14.clear()     // Catch:{ SQLiteException -> 0x014b }
            java.lang.String r6 = "counter_key"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x014b }
            r14.put(r6, r5)     // Catch:{ SQLiteException -> 0x014b }
            java.lang.String r5 = "counter_val"
            r15 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x014b }
            r14.put(r5, r6)     // Catch:{ SQLiteException -> 0x014b }
            java.lang.String r5 = "battery_counter"
            r6 = 0
            r0.insert(r5, r6, r14)     // Catch:{ SQLiteException -> 0x014b }
            goto L_0x011a
        L_0x0147:
            r15 = 0
            int r3 = r3 + 1
            goto L_0x010e
        L_0x014b:
            r0 = move-exception
            return
        L_0x014d:
            r15 = 0
            r1 = 1
            r10 = r0 ^ 1
            r1 = 5
            if (r2 != r1) goto L_0x0157
            r22 = 1
            goto L_0x0159
        L_0x0157:
            r22 = 0
        L_0x0159:
            r0 = r7
            r7 = r12
            r9 = r11
            r14 = r18
            r1 = 0
            r11 = r22
            a(r5, r7, r9, r10, r11)
            int[] r2 = defpackage.acsr.e
            int r3 = r2.length
            r11 = 0
        L_0x0168:
            if (r11 >= r3) goto L_0x0172
            r1 = r2[r11]
            a(r1)
            int r11 = r11 + 1
            goto L_0x0168
        L_0x0172:
            if (r0 < 0) goto L_0x0181
            android.content.SharedPreferences r1 = d
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putInt(r14, r0)
            r1.apply()
            return
        L_0x0181:
            return
        L_0x0182:
            r11 = r14
            r14 = r18
            r7 = r21
            r8 = 0
            boolean r18 = defpackage.azpj.b()
            java.lang.String r8 = "last_upload_wallclock_time"
            if (r18 == 0) goto L_0x031b
            acsm r0 = defpackage.acsm.a((android.content.Context) r0)
            r18 = r11
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            r2 = 7
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x02ac }
            r21 = 0
            r2[r21] = r9     // Catch:{ SQLiteException -> 0x02ac }
            r22 = 1
            r2[r22] = r1     // Catch:{ SQLiteException -> 0x02ac }
            r16 = 2
            r2[r16] = r4     // Catch:{ SQLiteException -> 0x02ac }
            r24 = 3
            r2[r24] = r10     // Catch:{ SQLiteException -> 0x02ac }
            r23 = 4
            r2[r23] = r15     // Catch:{ SQLiteException -> 0x02ac }
            r17 = 5
            r2[r17] = r3     // Catch:{ SQLiteException -> 0x02ac }
            r25 = 6
            r2[r25] = r8     // Catch:{ SQLiteException -> 0x02ac }
            android.database.sqlite.SQLiteDatabase r25 = r0.getReadableDatabase()     // Catch:{ SQLiteException -> 0x02ac }
            java.lang.String r26 = "battery_status"
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r27 = r2
            android.database.Cursor r2 = r25.query(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ SQLiteException -> 0x02ac }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0294 }
            if (r0 == 0) goto L_0x0260
            int r0 = r2.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0294 }
            long r25 = r2.getLong(r0)     // Catch:{ all -> 0x0294 }
            int r0 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0294 }
            long r27 = r2.getLong(r0)     // Catch:{ all -> 0x0294 }
            int r0 = r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0294 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0294 }
            r29 = r12
            int r12 = r2.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x025a }
            int r12 = r2.getInt(r12)     // Catch:{ all -> 0x025a }
            if (r12 <= 0) goto L_0x01fc
            r12 = 1
            goto L_0x01fd
        L_0x01fc:
            r12 = 0
        L_0x01fd:
            int r13 = r2.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x025a }
            int r13 = r2.getInt(r13)     // Catch:{ all -> 0x025a }
            if (r13 <= 0) goto L_0x020a
            r13 = 1
            goto L_0x020b
        L_0x020a:
            r13 = 0
        L_0x020b:
            r31 = r7
            int r7 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0256 }
            int r7 = r2.getInt(r7)     // Catch:{ all -> 0x0256 }
            r32 = r5
            int r5 = r2.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0254 }
            long r5 = r2.getLong(r5)     // Catch:{ all -> 0x0254 }
            r34 = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0292 }
            r11.put(r9, r14)     // Catch:{ all -> 0x0292 }
            java.lang.Long r14 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x0292 }
            r11.put(r1, r14)     // Catch:{ all -> 0x0292 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0292 }
            r11.put(r4, r0)     // Catch:{ all -> 0x0292 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0292 }
            r11.put(r10, r0)     // Catch:{ all -> 0x0292 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0292 }
            r11.put(r15, r0)     // Catch:{ all -> 0x0292 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0292 }
            r11.put(r3, r0)     // Catch:{ all -> 0x0292 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0292 }
            r11.put(r8, r0)     // Catch:{ all -> 0x0292 }
            goto L_0x028b
        L_0x0254:
            r0 = move-exception
            goto L_0x029b
        L_0x0256:
            r0 = move-exception
            r32 = r5
            goto L_0x029b
        L_0x025a:
            r0 = move-exception
            r32 = r5
            r31 = r7
            goto L_0x029b
        L_0x0260:
            r32 = r5
            r31 = r7
            r29 = r12
            r34 = r14
            r5 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0292 }
            r11.put(r9, r0)     // Catch:{ all -> 0x0292 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0292 }
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0292 }
            r11.put(r4, r6)     // Catch:{ all -> 0x0292 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0292 }
            r11.put(r10, r7)     // Catch:{ all -> 0x0292 }
            r11.put(r15, r7)     // Catch:{ all -> 0x0292 }
            r11.put(r3, r6)     // Catch:{ all -> 0x0292 }
            r11.put(r8, r0)     // Catch:{ all -> 0x0292 }
        L_0x028b:
            if (r2 != 0) goto L_0x028e
            goto L_0x02d8
        L_0x028e:
            r2.close()     // Catch:{ SQLiteException -> 0x02aa }
            goto L_0x02d8
        L_0x0292:
            r0 = move-exception
            goto L_0x029d
        L_0x0294:
            r0 = move-exception
            r32 = r5
            r31 = r7
            r29 = r12
        L_0x029b:
            r34 = r14
        L_0x029d:
            r5 = r0
            if (r2 == 0) goto L_0x02a9
            r2.close()     // Catch:{ all -> 0x02a4 }
            goto L_0x02a9
        L_0x02a4:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r2)     // Catch:{ SQLiteException -> 0x02aa }
        L_0x02a9:
            throw r5     // Catch:{ SQLiteException -> 0x02aa }
        L_0x02aa:
            r0 = move-exception
            goto L_0x02b5
        L_0x02ac:
            r0 = move-exception
            r32 = r5
            r31 = r7
            r29 = r12
            r34 = r14
        L_0x02b5:
            r2 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r11.put(r9, r0)
            r11.put(r1, r0)
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r11.put(r4, r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r11.put(r10, r6)
            r11.put(r15, r6)
            r11.put(r3, r5)
            r11.put(r8, r0)
        L_0x02d8:
            java.lang.Integer r0 = r11.getAsInteger(r4)
            int r0 = r0.intValue()
            java.lang.Boolean r2 = r11.getAsBoolean(r10)
            boolean r2 = r2.booleanValue()
            java.lang.Boolean r4 = r11.getAsBoolean(r15)
            boolean r4 = r4.booleanValue()
            java.lang.Long r5 = r11.getAsLong(r9)
            long r5 = r5.longValue()
            java.lang.Long r1 = r11.getAsLong(r1)
            long r9 = r1.longValue()
            java.lang.Integer r1 = r11.getAsInteger(r3)
            int r1 = r1.intValue()
            java.lang.Long r7 = r11.getAsLong(r8)
            long r11 = r7.longValue()
            r13 = r11
            r11 = r9
            r9 = r5
            r5 = r34
            r6 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            goto L_0x0365
        L_0x031b:
            r32 = r5
            r31 = r7
            r18 = r11
            r29 = r12
            r34 = r14
            android.content.SharedPreferences r0 = d
            java.lang.String r1 = ":batteryLevelLatestStatus"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            android.content.SharedPreferences r1 = d
            java.lang.String r4 = ":screenOnOffLatestStatus"
            boolean r1 = r1.getBoolean(r4, r2)
            android.content.SharedPreferences r4 = d
            java.lang.String r5 = ":onBatteryLatestStatus"
            boolean r4 = r4.getBoolean(r5, r2)
            android.content.SharedPreferences r2 = d
            java.lang.String r5 = ":batteryElapsedTimeLatestStatus"
            r6 = -1
            long r9 = r2.getLong(r5, r6)
            android.content.SharedPreferences r2 = d
            java.lang.String r5 = ":batteryWallTimeLatestStatus"
            long r11 = r2.getLong(r5, r6)
            android.content.SharedPreferences r2 = d
            r5 = r34
            r13 = 0
            int r2 = r2.getInt(r5, r13)
            android.content.SharedPreferences r13 = d
            java.lang.String r14 = ":batteryLastPeriodicUploadWallclockTime"
            long r6 = r13.getLong(r14, r6)
            r13 = r6
            r6 = r4
            r4 = r1
            r1 = r0
        L_0x0365:
            hph r0 = c
            int r0 = defpackage.acso.a((defpackage.hph) r0)
            if (r2 != r0) goto L_0x0373
            long r2 = r32 - r9
            int r0 = (int) r2
            r2 = r31
            goto L_0x03b4
        L_0x0373:
            if (r0 >= 0) goto L_0x0378
            r2 = r31
            goto L_0x03b1
        L_0x0378:
            boolean r2 = defpackage.azpj.b()
            if (r2 == 0) goto L_0x03a3
            ihs r2 = defpackage.ihs.b()
            acsm r2 = defpackage.acsm.a((android.content.Context) r2)
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x039f }
            r5.<init>()     // Catch:{ SQLiteException -> 0x039f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x039f }
            r5.put(r3, r0)     // Catch:{ SQLiteException -> 0x039f }
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch:{ SQLiteException -> 0x039f }
            r2 = r31
            r3 = 0
            r0.update(r2, r5, r3, r3)     // Catch:{ SQLiteException -> 0x039d }
            goto L_0x03b1
        L_0x039d:
            r0 = move-exception
            goto L_0x03b1
        L_0x039f:
            r0 = move-exception
            r2 = r31
            goto L_0x03b1
        L_0x03a3:
            r2 = r31
            android.content.SharedPreferences r3 = d
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r3.putInt(r5, r0)
            r3.apply()
        L_0x03b1:
            long r9 = r29 - r11
            int r0 = (int) r9
        L_0x03b4:
            if (r0 >= 0) goto L_0x03ea
            hph r0 = c
            java.lang.String r1 = "EastworldBatteryProcessorInvalidTimestamp"
            hox r0 = r0.c(r1)
            r0.a()
            hph r0 = c
            r0.d()
            r3 = r42
            aucj r0 = r3.b
            avvf r0 = (defpackage.avvf) r0
            int r0 = r0.g
            r1 = 1
            int r0 = r0 + r1
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x03d5
            goto L_0x03db
        L_0x03d5:
            r42.c()
            r1 = 0
            r3.c = r1
        L_0x03db:
            aucj r1 = r3.b
            avvf r1 = (defpackage.avvf) r1
            avvf r2 = defpackage.avvf.h
            int r2 = r1.a
            r2 = r2 | 8
            r1.a = r2
            r1.g = r0
            return
        L_0x03ea:
            r3 = r42
            int r9 = r20 - r1
            boolean r1 = defpackage.azpj.b()
            if (r1 == 0) goto L_0x044e
            ihs r1 = defpackage.ihs.b()
            acsm r1 = defpackage.acsm.a((android.content.Context) r1)
            android.database.sqlite.SQLiteDatabase r5 = r1.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0449 }
            r5.beginTransaction()     // Catch:{ SQLiteException -> 0x0449 }
            int[] r7 = defpackage.acsr.e     // Catch:{ all -> 0x0440 }
            int r10 = r7.length     // Catch:{ all -> 0x0440 }
            r11 = 0
        L_0x0407:
            if (r11 >= r10) goto L_0x0434
            r12 = r7[r11]     // Catch:{ all -> 0x0440 }
            r31 = r2
            r15 = 1
            int r2 = defpackage.acsm.a(r12, r4, r6, r15)     // Catch:{ all -> 0x043e }
            java.lang.String r15 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x043e }
            int r15 = r1.b(r15)     // Catch:{ all -> 0x043e }
            int r15 = r15 + r0
            r1.a(r2, r15)     // Catch:{ all -> 0x043e }
            r2 = 0
            int r12 = defpackage.acsm.a(r12, r4, r6, r2)     // Catch:{ all -> 0x043e }
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x043e }
            int r2 = r1.b(r2)     // Catch:{ all -> 0x043e }
            int r2 = r2 + r9
            r1.a(r12, r2)     // Catch:{ all -> 0x043e }
            int r11 = r11 + 1
            r2 = r31
            goto L_0x0407
        L_0x0434:
            r31 = r2
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x043e }
            r5.endTransaction()     // Catch:{ SQLiteException -> 0x0447 }
            r15 = 0
            goto L_0x0483
        L_0x043e:
            r0 = move-exception
            goto L_0x0443
        L_0x0440:
            r0 = move-exception
            r31 = r2
        L_0x0443:
            r5.endTransaction()     // Catch:{ SQLiteException -> 0x0447 }
            throw r0     // Catch:{ SQLiteException -> 0x0447 }
        L_0x0447:
            r0 = move-exception
            goto L_0x044c
        L_0x0449:
            r0 = move-exception
            r31 = r2
        L_0x044c:
            r15 = 0
            goto L_0x0483
        L_0x044e:
            r31 = r2
            android.content.SharedPreferences r1 = d
            android.content.SharedPreferences$Editor r1 = r1.edit()
            int[] r2 = defpackage.acsr.e
            int r5 = r2.length
            r11 = 0
        L_0x045a:
            if (r11 >= r5) goto L_0x047f
            r7 = r2[r11]
            r10 = 1
            java.lang.String r12 = a((int) r7, (boolean) r4, (boolean) r6, (boolean) r10)
            android.content.SharedPreferences r10 = d
            r15 = 0
            int r10 = r10.getInt(r12, r15)
            int r10 = r10 + r0
            r1.putInt(r12, r10)
            java.lang.String r7 = a((int) r7, (boolean) r4, (boolean) r6, (boolean) r15)
            android.content.SharedPreferences r10 = d
            int r10 = r10.getInt(r7, r15)
            int r10 = r10 + r9
            r1.putInt(r7, r10)
            int r11 = r11 + 1
            goto L_0x045a
        L_0x047f:
            r15 = 0
            r1.apply()
        L_0x0483:
            avvh r0 = defpackage.avvh.a(r39)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L_0x04f4
            r2 = 3
            if (r0 == r2) goto L_0x04e1
            r7 = 4
            if (r0 == r7) goto L_0x04cf
            r5 = 5
            if (r0 == r5) goto L_0x04bd
            r5 = 6
            if (r0 == r5) goto L_0x04ab
            java.lang.String r0 = "EastworldBattery"
            java.lang.String r4 = "EastworldBatteryProcessor got invalid action in intent."
            android.util.Log.e(r0, r4)
            r15 = r8
            r35 = r18
            r2 = r31
            r1 = 0
            r4 = 1
            r12 = 3
            goto L_0x050b
        L_0x04ab:
            if (r4 != 0) goto L_0x04b9
            hph r0 = c
            java.lang.String r4 = "EastworldProcessorInvalidScreenState"
            hox r0 = r0.c(r4)
            r0.a()
            goto L_0x04ba
        L_0x04b9:
        L_0x04ba:
            r10 = r6
            r11 = 0
            goto L_0x04f8
        L_0x04bd:
            if (r4 == 0) goto L_0x04cb
            hph r0 = c
            java.lang.String r4 = "EastworldProcessorInvalidScreenState"
            hox r0 = r0.c(r4)
            r0.a()
            goto L_0x04cc
        L_0x04cb:
        L_0x04cc:
            r10 = r6
            r11 = 1
            goto L_0x04f8
        L_0x04cf:
            if (r6 == 0) goto L_0x04dd
            hph r0 = c
            java.lang.String r5 = "EastworldProcessorInvalidBatteryChargerState"
            hox r0 = r0.c(r5)
            r0.a()
            goto L_0x04de
        L_0x04dd:
        L_0x04de:
            r11 = r4
            r10 = 1
            goto L_0x04f8
        L_0x04e1:
            r7 = 4
            if (r6 != 0) goto L_0x04f0
            hph r0 = c
            java.lang.String r5 = "EastworldProcessorInvalidBatteryChargerState"
            hox r0 = r0.c(r5)
            r0.a()
            goto L_0x04f1
        L_0x04f0:
        L_0x04f1:
            r11 = r4
            r10 = 0
            goto L_0x04f8
        L_0x04f4:
            r2 = 3
            r7 = 4
            r11 = r4
            r10 = r6
        L_0x04f8:
            r5 = r32
            r15 = r8
            r2 = r31
            r4 = 4
            r9 = 0
            r12 = 3
            r7 = r29
            r1 = 0
            r9 = r20
            r35 = r18
            r4 = 1
            a(r5, r7, r9, r10, r11)
        L_0x050b:
            java.lang.String r5 = "last_upload_elapsed_time"
            java.lang.String r6 = "log_upload_count"
            r7 = r39
            if (r7 != r4) goto L_0x0651
            long r7 = r29 - r13
            aznr r0 = defpackage.aznr.a
            azns r0 = r0.a()
            long r9 = r0.a()
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x064e
            avvl r0 = defpackage.avvl.j
            aucd r0 = r0.o()
            boolean r7 = r0.c
            if (r7 == 0) goto L_0x0532
            r0.c()
            r0.c = r1
        L_0x0532:
            aucj r7 = r0.b
            avvl r7 = (defpackage.avvl) r7
            r7.b = r12
            int r8 = r7.a
            r8 = r8 | r4
            r7.a = r8
            r9 = r38
            avuy r7 = r9.a(r4, r4)
            boolean r8 = r0.c
            if (r8 != 0) goto L_0x0548
            goto L_0x054d
        L_0x0548:
            r0.c()
            r0.c = r1
        L_0x054d:
            aucj r8 = r0.b
            avvl r8 = (defpackage.avvl) r8
            r7.getClass()
            r8.f = r7
            int r7 = r8.a
            r7 = r7 | 32
            r8.a = r7
            avuy r7 = r9.a(r1, r4)
            boolean r8 = r0.c
            if (r8 != 0) goto L_0x0565
            goto L_0x056a
        L_0x0565:
            r0.c()
            r0.c = r1
        L_0x056a:
            aucj r8 = r0.b
            avvl r8 = (defpackage.avvl) r8
            r7.getClass()
            r8.e = r7
            int r7 = r8.a
            r7 = r7 | 16
            r8.a = r7
            avuy r7 = r9.a(r4, r1)
            boolean r8 = r0.c
            if (r8 != 0) goto L_0x0582
            goto L_0x0587
        L_0x0582:
            r0.c()
            r0.c = r1
        L_0x0587:
            aucj r8 = r0.b
            avvl r8 = (defpackage.avvl) r8
            r7.getClass()
            r8.h = r7
            int r7 = r8.a
            r7 = r7 | 128(0x80, float:1.794E-43)
            r8.a = r7
            avuy r7 = r9.a(r1, r1)
            boolean r8 = r0.c
            if (r8 != 0) goto L_0x059f
            goto L_0x05a4
        L_0x059f:
            r0.c()
            r0.c = r1
        L_0x05a4:
            aucj r8 = r0.b
            avvl r8 = (defpackage.avvl) r8
            r7.getClass()
            r8.g = r7
            int r7 = r8.a
            r7 = r7 | 64
            r8.a = r7
            aucj r7 = r0.i()
            avvl r7 = (defpackage.avvl) r7
            int r8 = r7.U
            r10 = -1
            if (r8 != r10) goto L_0x05cb
            aueh r8 = defpackage.aueh.a
            aueq r8 = r8.a((java.lang.Object) r7)
            int r8 = r8.b(r7)
            r7.U = r8
            goto L_0x05cc
        L_0x05cb:
        L_0x05cc:
            aznq r7 = defpackage.aznq.a
            aznx r7 = r7.a()
            long r10 = r7.c()
            int r7 = (int) r10
            java.lang.String r10 = "EastworldBattery"
            java.lang.String r11 = "EASTWORLD_BATTERY"
            defpackage.acsr.a(r0, r10, r11, r7, r3)
            a(r1)
            long r10 = java.lang.System.currentTimeMillis()
            long r13 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = defpackage.azpj.b()
            if (r0 == 0) goto L_0x0622
            ihs r0 = defpackage.ihs.b()
            acsm r0 = defpackage.acsm.a((android.content.Context) r0)
            int r7 = r0.a((java.lang.String) r6)
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.put(r5, r13)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r12.put(r15, r10)
            int r7 = r7 + r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.put(r6, r7)
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0620 }
            r7 = 0
            r0.update(r2, r12, r7, r7)     // Catch:{ SQLiteException -> 0x0620 }
            goto L_0x0643
        L_0x0620:
            r0 = move-exception
            goto L_0x0643
        L_0x0622:
            android.content.SharedPreferences r0 = d
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = ":batteryLastPeriodicUploadWallclockTime"
            r0.putLong(r2, r10)
            java.lang.String r2 = ":batteryLastPeriodicUploadElapsedTime"
            r0.putLong(r2, r13)
            android.content.SharedPreferences r2 = d
            java.lang.String r7 = ":batteryLogsUploadedCount"
            int r2 = r2.getInt(r7, r1)
            int r2 = r2 + r4
            java.lang.String r7 = ":batteryLogsUploadedCount"
            r0.putInt(r7, r2)
            r0.apply()
        L_0x0643:
            boolean r0 = defpackage.aznq.e()
            if (r0 != 0) goto L_0x0653
            r2 = 4
            defpackage.acso.a(r3, r8, r2)
            goto L_0x0653
        L_0x064e:
            r9 = r38
            goto L_0x0653
        L_0x0651:
            r9 = r38
        L_0x0653:
            if (r40 == 0) goto L_0x0659
            r2 = 2
            a(r2)
        L_0x0659:
            if (r41 != 0) goto L_0x065c
            goto L_0x0660
        L_0x065c:
            a(r4)
        L_0x0660:
            boolean r0 = defpackage.azpj.b()
            if (r0 == 0) goto L_0x0764
            ihs r0 = defpackage.ihs.b()
            acsm r0 = defpackage.acsm.a((android.content.Context) r0)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            r7 = 5
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0723 }
            r7[r1] = r19     // Catch:{ SQLiteException -> 0x0723 }
            r8 = r35
            r7[r4] = r8     // Catch:{ SQLiteException -> 0x071f }
            r4 = 2
            r7[r4] = r6     // Catch:{ SQLiteException -> 0x071f }
            r4 = 3
            r7[r4] = r5     // Catch:{ SQLiteException -> 0x071f }
            r4 = 4
            r7[r4] = r15     // Catch:{ SQLiteException -> 0x071f }
            android.database.sqlite.SQLiteDatabase r25 = r0.getReadableDatabase()     // Catch:{ SQLiteException -> 0x071f }
            java.lang.String r26 = "battery_status"
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r27 = r7
            android.database.Cursor r4 = r25.query(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ SQLiteException -> 0x071f }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x070d }
            if (r0 == 0) goto L_0x06ef
            r7 = r19
            int r0 = r4.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x070b }
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x070b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x070b }
            r2.put(r7, r0)     // Catch:{ all -> 0x070b }
            int r0 = r4.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x070b }
            long r10 = r4.getLong(r0)     // Catch:{ all -> 0x070b }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x070b }
            r2.put(r8, r0)     // Catch:{ all -> 0x070b }
            int r0 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x070b }
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x070b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x070b }
            r2.put(r6, r0)     // Catch:{ all -> 0x070b }
            int r0 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x070b }
            long r10 = r4.getLong(r0)     // Catch:{ all -> 0x070b }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x070b }
            r2.put(r5, r0)     // Catch:{ all -> 0x070b }
            int r0 = r4.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x070b }
            long r10 = r4.getLong(r0)     // Catch:{ all -> 0x070b }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x070b }
            r2.put(r15, r0)     // Catch:{ all -> 0x070b }
            goto L_0x0704
        L_0x06ef:
            r7 = r19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x070b }
            r2.put(r7, r0)     // Catch:{ all -> 0x070b }
            r2.put(r8, r0)     // Catch:{ all -> 0x070b }
            r2.put(r6, r0)     // Catch:{ all -> 0x070b }
            r2.put(r5, r0)     // Catch:{ all -> 0x070b }
            r2.put(r15, r0)     // Catch:{ all -> 0x070b }
        L_0x0704:
            if (r4 != 0) goto L_0x0707
            goto L_0x073b
        L_0x0707:
            r4.close()     // Catch:{ SQLiteException -> 0x071d }
            goto L_0x073b
        L_0x070b:
            r0 = move-exception
            goto L_0x0710
        L_0x070d:
            r0 = move-exception
            r7 = r19
        L_0x0710:
            r10 = r0
            if (r4 == 0) goto L_0x071c
            r4.close()     // Catch:{ all -> 0x0717 }
            goto L_0x071c
        L_0x0717:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r10, (java.lang.Throwable) r4)     // Catch:{ SQLiteException -> 0x071d }
        L_0x071c:
            throw r10     // Catch:{ SQLiteException -> 0x071d }
        L_0x071d:
            r0 = move-exception
            goto L_0x0728
        L_0x071f:
            r0 = move-exception
            r7 = r19
            goto L_0x0728
        L_0x0723:
            r0 = move-exception
            r7 = r19
            r8 = r35
        L_0x0728:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.put(r7, r0)
            r2.put(r8, r0)
            r2.put(r6, r0)
            r2.put(r5, r0)
            r2.put(r15, r0)
        L_0x073b:
            java.lang.Integer r0 = r2.getAsInteger(r7)
            int r0 = r0.intValue()
            java.lang.Integer r1 = r2.getAsInteger(r6)
            int r1 = r1.intValue()
            java.lang.Integer r4 = r2.getAsInteger(r8)
            int r4 = r4.intValue()
            long r6 = (long) r4
            java.lang.Long r2 = r2.getAsLong(r5)
            long r4 = r2.longValue()
            r36 = r4
            r4 = r1
            r5 = r6
            r7 = r36
            goto L_0x078b
        L_0x0764:
            android.content.SharedPreferences r0 = d
            java.lang.String r2 = ":batteryProcessedEventCount"
            int r0 = r0.getInt(r2, r1)
            android.content.SharedPreferences r2 = d
            java.lang.String r4 = ":batteryLogsUploadedCount"
            int r1 = r2.getInt(r4, r1)
            android.content.SharedPreferences r2 = d
            r4 = 0
            java.lang.String r6 = ":batteryLastEventTime"
            long r4 = r2.getLong(r6, r4)
            android.content.SharedPreferences r2 = d
            r6 = 0
            java.lang.String r8 = ":batteryLastPeriodicUploadElapsedTime"
            long r6 = r2.getLong(r8, r6)
            r7 = r6
            r5 = r4
            r4 = r1
        L_0x078b:
            r2 = r42
            r3 = r0
            defpackage.acso.a(r2, r3, r4, r5, r7)
            hph r0 = c
            r0.d()
            return
        L_0x0797:
            r9 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsp.a(int, boolean, boolean, aucd):void");
    }
}
