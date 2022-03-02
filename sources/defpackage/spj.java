package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: spj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class spj extends syx {
    public static final String[] a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    public static final String[] d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] f = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] g = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] h = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final syt i = new syt(A());
    private final spi k = new spi(this, z(), f());

    public spj(sze sze) {
        super(sze);
    }

    static final void a(ContentValues contentValues, String str, Object obj) {
        iva.c(str);
        iva.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    public final List b(String str, String str2, String str3) {
        iva.c(str);
        h();
        q();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return b(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.szi c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            defpackage.iva.c(r19)
            defpackage.iva.c(r20)
            r18.h()
            r18.q()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.e()     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            java.lang.String r11 = "user_attributes"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0087, all -> 0x0083 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007f, all -> 0x007b }
            if (r0 == 0) goto L_0x0073
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007f, all -> 0x007b }
            r11 = r18
            java.lang.Object r7 = r11.a((android.database.Cursor) r10, (int) r2)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ SQLiteException -> 0x0071 }
            szi r0 = new szi     // Catch:{ SQLiteException -> 0x0071 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0071 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0071 }
            if (r1 == 0) goto L_0x006b
            sut r1 = r18.E()     // Catch:{ SQLiteException -> 0x0071 }
            sur r1 = r1.c     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x0071 }
            r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x0071 }
        L_0x006b:
            if (r10 == 0) goto L_0x0070
            r10.close()
        L_0x0070:
            return r0
        L_0x0071:
            r0 = move-exception
            goto L_0x008b
        L_0x0073:
            r11 = r18
            if (r10 == 0) goto L_0x007a
            r10.close()
        L_0x007a:
            return r9
        L_0x007b:
            r0 = move-exception
            r11 = r18
            goto L_0x00a9
        L_0x007f:
            r0 = move-exception
            r11 = r18
            goto L_0x008b
        L_0x0083:
            r0 = move-exception
            r11 = r18
            goto L_0x00aa
        L_0x0087:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x008b:
            sut r1 = r18.E()     // Catch:{ all -> 0x00a8 }
            sur r1 = r1.c     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r19)     // Catch:{ all -> 0x00a8 }
            suk r4 = r18.y()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r4.c(r8)     // Catch:{ all -> 0x00a8 }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x00a7
            r10.close()
        L_0x00a7:
            return r9
        L_0x00a8:
            r0 = move-exception
        L_0x00a9:
            r9 = r10
        L_0x00aa:
            if (r9 == 0) goto L_0x00af
            r9.close()
        L_0x00af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.c(java.lang.String, java.lang.String):szi");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel d(java.lang.String r32, java.lang.String r33) {
        /*
            r31 = this;
            r7 = r33
            defpackage.iva.c(r32)
            defpackage.iva.c(r33)
            r31.h()
            r31.q()
            android.database.sqlite.SQLiteDatabase r9 = r31.e()     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            r0 = 11
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "origin"
            r1 = 0
            r11[r1] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "value"
            r2 = 1
            r11[r2] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "active"
            r3 = 2
            r11[r3] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "trigger_event_name"
            r4 = 3
            r11[r4] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "trigger_timeout"
            r5 = 4
            r11[r5] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "timed_out_event"
            r6 = 5
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "creation_timestamp"
            r15 = 6
            r11[r15] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "triggered_event"
            r14 = 7
            r11[r14] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "triggered_timestamp"
            r13 = 8
            r11[r13] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "time_to_live"
            r12 = 9
            r11[r12] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r0 = "expired_event"
            r10 = 10
            r11[r10] = r0     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            r0[r1] = r32     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            r0[r2] = r7     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            java.lang.String r16 = "conditional_properties"
            java.lang.String r17 = "app_id=? and name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r8 = 10
            r10 = r16
            r8 = 9
            r12 = r17
            r8 = 8
            r13 = r0
            r0 = 7
            r14 = r18
            r8 = 6
            r15 = r19
            r16 = r20
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x0136, all -> 0x0131 }
            boolean r10 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x012d, all -> 0x0129 }
            if (r10 == 0) goto L_0x0120
            java.lang.String r10 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x012d, all -> 0x0129 }
            r11 = r31
            java.lang.Object r12 = r11.a((android.database.Cursor) r9, (int) r2)     // Catch:{ SQLiteException -> 0x011e }
            int r3 = r9.getInt(r3)     // Catch:{ SQLiteException -> 0x011e }
            if (r3 == 0) goto L_0x0090
            r22 = 1
            goto L_0x0092
        L_0x0090:
            r22 = 0
        L_0x0092:
            java.lang.String r23 = r9.getString(r4)     // Catch:{ SQLiteException -> 0x011e }
            long r25 = r9.getLong(r5)     // Catch:{ SQLiteException -> 0x011e }
            szg r1 = r31.o()     // Catch:{ SQLiteException -> 0x011e }
            byte[] r2 = r9.getBlob(r6)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator r3 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r1 = r1.a((byte[]) r2, (android.os.Parcelable.Creator) r3)     // Catch:{ SQLiteException -> 0x011e }
            r24 = r1
            com.google.android.gms.measurement.internal.EventParcel r24 = (com.google.android.gms.measurement.internal.EventParcel) r24     // Catch:{ SQLiteException -> 0x011e }
            long r13 = r9.getLong(r8)     // Catch:{ SQLiteException -> 0x011e }
            szg r1 = r31.o()     // Catch:{ SQLiteException -> 0x011e }
            byte[] r0 = r9.getBlob(r0)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator r2 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r0 = r1.a((byte[]) r0, (android.os.Parcelable.Creator) r2)     // Catch:{ SQLiteException -> 0x011e }
            r27 = r0
            com.google.android.gms.measurement.internal.EventParcel r27 = (com.google.android.gms.measurement.internal.EventParcel) r27     // Catch:{ SQLiteException -> 0x011e }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011e }
            r0 = 9
            long r28 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011e }
            szg r0 = r31.o()     // Catch:{ SQLiteException -> 0x011e }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator r2 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r0 = r0.a((byte[]) r1, (android.os.Parcelable.Creator) r2)     // Catch:{ SQLiteException -> 0x011e }
            r30 = r0
            com.google.android.gms.measurement.internal.EventParcel r30 = (com.google.android.gms.measurement.internal.EventParcel) r30     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.UserAttributeParcel r19 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ SQLiteException -> 0x011e }
            r1 = r19
            r2 = r33
            r5 = r12
            r6 = r10
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x011e }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r0 = new com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel     // Catch:{ SQLiteException -> 0x011e }
            r16 = r0
            r17 = r32
            r18 = r10
            r20 = r13
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x011e }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x011e }
            if (r1 == 0) goto L_0x0118
            sut r1 = r31.E()     // Catch:{ SQLiteException -> 0x011e }
            sur r1 = r1.c     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r32)     // Catch:{ SQLiteException -> 0x011e }
            suk r4 = r31.y()     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r4 = r4.c(r7)     // Catch:{ SQLiteException -> 0x011e }
            r1.a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x011e }
        L_0x0118:
            if (r9 == 0) goto L_0x011d
            r9.close()
        L_0x011d:
            return r0
        L_0x011e:
            r0 = move-exception
            goto L_0x013a
        L_0x0120:
            r11 = r31
            if (r9 == 0) goto L_0x0127
        L_0x0124:
            r9.close()
        L_0x0127:
            r1 = 0
            return r1
        L_0x0129:
            r0 = move-exception
            r11 = r31
            goto L_0x0155
        L_0x012d:
            r0 = move-exception
            r11 = r31
            goto L_0x013a
        L_0x0131:
            r0 = move-exception
            r11 = r31
            r8 = 0
            goto L_0x0156
        L_0x0136:
            r0 = move-exception
            r11 = r31
            r9 = 0
        L_0x013a:
            sut r1 = r31.E()     // Catch:{ all -> 0x0154 }
            sur r1 = r1.c     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r32)     // Catch:{ all -> 0x0154 }
            suk r4 = r31.y()     // Catch:{ all -> 0x0154 }
            java.lang.String r4 = r4.c(r7)     // Catch:{ all -> 0x0154 }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x0154 }
            if (r9 == 0) goto L_0x0127
            goto L_0x0124
        L_0x0154:
            r0 = move-exception
        L_0x0155:
            r8 = r9
        L_0x0156:
            if (r8 == 0) goto L_0x015b
            r8.close()
        L_0x015b:
            goto L_0x015d
        L_0x015c:
            throw r0
        L_0x015d:
            goto L_0x015c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel");
    }

    /* access modifiers changed from: protected */
    public final long e(String str, String str2) {
        long a2;
        String str3 = str;
        String str4 = str2;
        iva.c(str);
        iva.c(str2);
        h();
        q();
        SQLiteDatabase e2 = e();
        e2.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(str2.length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                a2 = a(sb.toString(), new String[]{str3}, -1);
                if (a2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (e2.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        E().c.a("Failed to insert column (got -1). appId", sut.a(str), str4);
                        e2.endTransaction();
                        return -1;
                    }
                    a2 = 0;
                }
            } catch (SQLiteException e3) {
                e = e3;
                try {
                    E().c.a("Error inserting column. appId", sut.a(str), str4, e);
                    e2.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    e2.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + a2));
                if (((long) e2.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    E().c.a("Failed to update column (got 0). appId", sut.a(str), str4);
                    e2.endTransaction();
                    return -1;
                }
                e2.setTransactionSuccessful();
                e2.endTransaction();
                return a2;
            } catch (SQLiteException e4) {
                e = e4;
                j = a2;
                E().c.a("Error inserting column. appId", sut.a(str), str4, e);
                e2.endTransaction();
                return j;
            }
        } catch (SQLiteException e5) {
            e = e5;
            E().c.a("Error inserting column. appId", sut.a(str), str4, e);
            e2.endTransaction();
            return j;
        } catch (Throwable th2) {
            th = th2;
            e2.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final String f() {
        v();
        return "google_app_measurement.db";
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String g() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.e()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0026, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            goto L_0x003e
        L_0x0026:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0029:
            sut r3 = r6.E()     // Catch:{ all -> 0x003a }
            sur r3 = r3.c     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.g():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        h();
        q();
        if (l()) {
            long a2 = w().g.a();
            long b2 = A().b();
            long abs = Math.abs(b2 - a2);
            v();
            if (abs > ((Long) sud.y.a()).longValue()) {
                w().g.a(b2);
                h();
                q();
                if (l()) {
                    SQLiteDatabase e2 = e();
                    v();
                    int delete = e2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(A().a()), String.valueOf(spg.n())});
                    if (delete > 0) {
                        E().k.a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final boolean l() {
        return z().getDatabasePath(f()).exists();
    }

    public final void f(String str, String str2) {
        iva.c(str);
        iva.c(str2);
        h();
        q();
        try {
            e().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            E().c.a("Error deleting conditional property", sut.a(str), y().c(str2), e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.e()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r5)     // Catch:{ SQLiteException -> 0x0028, all -> 0x0026 }
            boolean r5 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0024 }
            if (r5 == 0) goto L_0x001a
            r5 = 0
            long r4 = r1.getLong(r5)     // Catch:{ SQLiteException -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r1.close()
        L_0x0019:
            return r4
        L_0x001a:
            android.database.sqlite.SQLiteException r5 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0024 }
            java.lang.String r0 = "Database returned empty set"
            r5.<init>(r0)     // Catch:{ SQLiteException -> 0x0024 }
            throw r5     // Catch:{ SQLiteException -> 0x0024 }
        L_0x0022:
            r4 = move-exception
            goto L_0x0035
        L_0x0024:
            r5 = move-exception
            goto L_0x0029
        L_0x0026:
            r4 = move-exception
            goto L_0x0035
        L_0x0028:
            r5 = move-exception
        L_0x0029:
            sut r0 = r3.E()     // Catch:{ all -> 0x0022 }
            sur r0 = r0.c     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "Database error"
            r0.a(r2, r4, r5)     // Catch:{ all -> 0x0022 }
            throw r5     // Catch:{ all -> 0x0022 }
        L_0x0035:
            if (r1 == 0) goto L_0x003a
            r1.close()
        L_0x003a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.a(java.lang.String, java.lang.String[]):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List b(java.lang.String r39, java.lang.String[] r40) {
        /*
            r38 = this;
            r38.h()
            r38.q()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1001"
            android.database.sqlite.SQLiteDatabase r1 = r38.e()     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            r2 = 13
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "app_id"
            r11 = 0
            r3[r11] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "origin"
            r12 = 1
            r3[r12] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "name"
            r13 = 2
            r3[r13] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "value"
            r14 = 3
            r3[r14] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "active"
            r15 = 4
            r3[r15] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "trigger_event_name"
            r8 = 5
            r3[r8] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "trigger_timeout"
            r7 = 6
            r3[r7] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "timed_out_event"
            r6 = 7
            r3[r6] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "creation_timestamp"
            r5 = 8
            r3[r5] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "triggered_event"
            r4 = 9
            r3[r4] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "triggered_timestamp"
            r10 = 10
            r3[r10] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "time_to_live"
            r10 = 11
            r3[r10] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "expired_event"
            r10 = 12
            r3[r10] = r2     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            r38.v()     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            java.lang.String r2 = "conditional_properties"
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            r10 = 9
            r4 = r39
            r10 = 8
            r5 = r40
            r10 = 7
            r6 = r19
            r10 = 6
            r7 = r20
            r10 = 5
            r8 = r21
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x015b, all -> 0x0156 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0151, all -> 0x014c }
            if (r2 == 0) goto L_0x0144
        L_0x0081:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x0151, all -> 0x014c }
            r38.v()     // Catch:{ SQLiteException -> 0x0151, all -> 0x014c }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 >= r3) goto L_0x0126
            java.lang.String r24 = r1.getString(r11)     // Catch:{ SQLiteException -> 0x0151, all -> 0x014c }
            java.lang.String r25 = r1.getString(r12)     // Catch:{ SQLiteException -> 0x0151, all -> 0x014c }
            java.lang.String r3 = r1.getString(r13)     // Catch:{ SQLiteException -> 0x0151, all -> 0x014c }
            r8 = r38
            java.lang.Object r6 = r8.a((android.database.Cursor) r1, (int) r14)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            int r2 = r1.getInt(r15)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            if (r2 == 0) goto L_0x00a7
            r29 = 1
            goto L_0x00a9
        L_0x00a7:
            r29 = 0
        L_0x00a9:
            java.lang.String r30 = r1.getString(r10)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r9 = 6
            long r32 = r1.getLong(r9)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            szg r2 = r38.o()     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r7 = 7
            byte[] r4 = r1.getBlob(r7)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            android.os.Parcelable$Creator r5 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            android.os.Parcelable r2 = r2.a((byte[]) r4, (android.os.Parcelable.Creator) r5)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r31 = r2
            com.google.android.gms.measurement.internal.EventParcel r31 = (com.google.android.gms.measurement.internal.EventParcel) r31     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r4 = 8
            long r27 = r1.getLong(r4)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            szg r2 = r38.o()     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r5 = 9
            byte[] r4 = r1.getBlob(r5)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            android.os.Parcelable$Creator r5 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            android.os.Parcelable r2 = r2.a((byte[]) r4, (android.os.Parcelable.Creator) r5)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r34 = r2
            com.google.android.gms.measurement.internal.EventParcel r34 = (com.google.android.gms.measurement.internal.EventParcel) r34     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r4 = 10
            long r16 = r1.getLong(r4)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r5 = 11
            long r35 = r1.getLong(r5)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            szg r2 = r38.o()     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r9 = 12
            byte[] r4 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            android.os.Parcelable$Creator r5 = com.google.android.gms.measurement.internal.EventParcel.CREATOR     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            android.os.Parcelable r2 = r2.a((byte[]) r4, (android.os.Parcelable.Creator) r5)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r37 = r2
            com.google.android.gms.measurement.internal.EventParcel r37 = (com.google.android.gms.measurement.internal.EventParcel) r37     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r26 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r2 = r26
            r18 = 11
            r19 = 10
            r21 = 9
            r22 = 8
            r4 = r16
            r16 = 7
            r7 = r25
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r2 = new com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r23 = r2
            r23.<init>(r24, r25, r26, r27, r29, r30, r31, r32, r34, r35, r37)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r0.add(r2)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            if (r2 != 0) goto L_0x0081
            goto L_0x013a
        L_0x0126:
            r8 = r38
            sut r2 = r38.E()     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            sur r2 = r2.c     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r38.v()     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            java.lang.String r4 = "Read more than the max allowed conditional properties, ignoring extra"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r2.a(r4, r3)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
        L_0x013a:
            if (r1 == 0) goto L_0x013f
            r1.close()
        L_0x013f:
            return r0
        L_0x0140:
            r0 = move-exception
            goto L_0x014f
        L_0x0142:
            r0 = move-exception
            goto L_0x0154
        L_0x0144:
            r8 = r38
            if (r1 == 0) goto L_0x014b
            r1.close()
        L_0x014b:
            return r0
        L_0x014c:
            r0 = move-exception
            r8 = r38
        L_0x014f:
            r10 = r1
            goto L_0x0175
        L_0x0151:
            r0 = move-exception
            r8 = r38
        L_0x0154:
            r10 = r1
            goto L_0x015f
        L_0x0156:
            r0 = move-exception
            r8 = r38
            r10 = 0
            goto L_0x0175
        L_0x015b:
            r0 = move-exception
            r8 = r38
            r10 = 0
        L_0x015f:
            sut r1 = r38.E()     // Catch:{ all -> 0x0174 }
            sur r1 = r1.c     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = "Error querying conditional user property value"
            r1.a(r2, r0)     // Catch:{ all -> 0x0174 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0174 }
            if (r10 == 0) goto L_0x0173
            r10.close()
        L_0x0173:
            return r0
        L_0x0174:
            r0 = move-exception
        L_0x0175:
            if (r10 == 0) goto L_0x017a
            r10.close()
        L_0x017a:
            goto L_0x017c
        L_0x017b:
            throw r0
        L_0x017c:
            goto L_0x017b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.b(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.e()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0026, all -> 0x0024 }
            boolean r4 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r4 == 0) goto L_0x001a
            r4 = 0
            long r3 = r1.getLong(r4)     // Catch:{ SQLiteException -> 0x0022 }
            if (r1 == 0) goto L_0x0019
            r1.close()
        L_0x0019:
            return r3
        L_0x001a:
            if (r1 == 0) goto L_0x001f
            r1.close()
        L_0x001f:
            return r5
        L_0x0020:
            r3 = move-exception
            goto L_0x0033
        L_0x0022:
            r4 = move-exception
            goto L_0x0027
        L_0x0024:
            r3 = move-exception
            goto L_0x0033
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            sut r5 = r2.E()     // Catch:{ all -> 0x0020 }
            sur r5 = r5.c     // Catch:{ all -> 0x0020 }
            java.lang.String r6 = "Database error"
            r5.a(r6, r3, r4)     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.close()
        L_0x0038:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.a(java.lang.String, java.lang.String[], long):long");
    }

    public final void c() {
        q();
        e().setTransactionSuccessful();
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        q();
        h();
        iva.c(str);
        try {
            SQLiteDatabase e2 = e();
            String[] strArr = {str};
            int delete = e2.delete("events", "app_id=?", strArr) + e2.delete("user_attributes", "app_id=?", strArr) + e2.delete("conditional_properties", "app_id=?", strArr) + e2.delete("apps", "app_id=?", strArr) + e2.delete("raw_events", "app_id=?", strArr) + e2.delete("raw_events_metadata", "app_id=?", strArr) + e2.delete("event_filters", "app_id=?", strArr) + e2.delete("property_filters", "app_id=?", strArr) + e2.delete("audience_filter_values", "app_id=?", strArr);
            if (delete > 0) {
                E().k.a("Deleted application data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e3) {
            E().c.a("Error deleting application data. appId, error", sut.a(str), e3);
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase e() {
        h();
        try {
            return this.k.getWritableDatabase();
        } catch (SQLiteException e2) {
            E().f.a("Error opening database", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object a(Cursor cursor, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        int type = cursor.getType(i2);
        if (type == 0) {
            E().c.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                E().c.a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            E().c.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    public final void d() {
        q();
        e().endTransaction();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.lang.String r23) {
        /*
            r22 = this;
            defpackage.iva.c(r23)
            r22.h()
            r22.q()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1000"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r22.e()     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            r2 = 4
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            java.lang.String r2 = "name"
            r11 = 0
            r3[r11] = r2     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            java.lang.String r2 = "origin"
            r12 = 1
            r3[r12] = r2     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            java.lang.String r2 = "set_timestamp"
            r13 = 2
            r3[r13] = r2     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            java.lang.String r2 = "value"
            r14 = 3
            r3[r14] = r2     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            r5[r11] = r23     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            r22.v()     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            java.lang.String r2 = "user_attributes"
            java.lang.String r4 = "app_id=?"
            r6 = 0
            r7 = 0
            java.lang.String r8 = "rowid"
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009d }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0099, all -> 0x0095 }
            if (r2 == 0) goto L_0x008d
        L_0x0045:
            java.lang.String r18 = r1.getString(r11)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0095 }
            java.lang.String r2 = r1.getString(r12)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0095 }
            if (r2 == 0) goto L_0x0053
            r17 = r2
            goto L_0x0057
        L_0x0053:
            java.lang.String r2 = ""
            r17 = r2
        L_0x0057:
            long r19 = r1.getLong(r13)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0095 }
            r2 = r22
            java.lang.Object r21 = r2.a((android.database.Cursor) r1, (int) r14)     // Catch:{ SQLiteException -> 0x008b }
            if (r21 == 0) goto L_0x0070
            szi r3 = new szi     // Catch:{ SQLiteException -> 0x008b }
            r15 = r3
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch:{ SQLiteException -> 0x008b }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x008b }
            goto L_0x007f
        L_0x0070:
            sut r3 = r22.E()     // Catch:{ SQLiteException -> 0x008b }
            sur r3 = r3.c     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r23)     // Catch:{ SQLiteException -> 0x008b }
            r3.a(r4, r5)     // Catch:{ SQLiteException -> 0x008b }
        L_0x007f:
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x008b }
            if (r3 != 0) goto L_0x0045
            if (r1 == 0) goto L_0x008a
            r1.close()
        L_0x008a:
            return r0
        L_0x008b:
            r0 = move-exception
            goto L_0x00a5
        L_0x008d:
            r2 = r22
            if (r1 == 0) goto L_0x0094
            r1.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            r2 = r22
            goto L_0x00bb
        L_0x0099:
            r0 = move-exception
            r2 = r22
            goto L_0x00a5
        L_0x009d:
            r0 = move-exception
            r2 = r22
            goto L_0x00bc
        L_0x00a1:
            r0 = move-exception
            r2 = r22
            r1 = r10
        L_0x00a5:
            sut r3 = r22.E()     // Catch:{ all -> 0x00ba }
            sur r3 = r3.c     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r23)     // Catch:{ all -> 0x00ba }
            r3.a(r4, r5, r0)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00b9
            r1.close()
        L_0x00b9:
            return r10
        L_0x00ba:
            r0 = move-exception
        L_0x00bb:
            r10 = r1
        L_0x00bc:
            if (r10 == 0) goto L_0x00c1
            r10.close()
        L_0x00c1:
            goto L_0x00c3
        L_0x00c2:
            throw r0
        L_0x00c3:
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sou b(java.lang.String r25) {
        /*
            r24 = this;
            r1 = r25
            defpackage.iva.c(r25)
            r24.h()
            r24.q()
            android.database.sqlite.SQLiteDatabase r3 = r24.e()     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            r0 = 29
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "app_instance_id"
            r11 = 0
            r5[r11] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "gmp_app_id"
            r12 = 1
            r5[r12] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "resettable_device_id_hash"
            r13 = 2
            r5[r13] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "last_bundle_index"
            r14 = 3
            r5[r14] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "last_bundle_start_timestamp"
            r15 = 4
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "last_bundle_end_timestamp"
            r10 = 5
            r5[r10] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "app_version"
            r9 = 6
            r5[r9] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "app_store"
            r8 = 7
            r5[r8] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "gmp_version"
            r7 = 8
            r5[r7] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "dev_cert_hash"
            r6 = 9
            r5[r6] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "measurement_enabled"
            r4 = 10
            r5[r4] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "day"
            r2 = 11
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "daily_public_events_count"
            r2 = 12
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "daily_events_count"
            r2 = 13
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "daily_conversions_count"
            r2 = 14
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "config_fetched_time"
            r16 = 15
            r5[r16] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "failed_config_fetch_time"
            r16 = 16
            r5[r16] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "app_version_int"
            r2 = 17
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "firebase_instance_id"
            r17 = 18
            r5[r17] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "daily_error_events_count"
            r17 = 19
            r5[r17] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "daily_realtime_events_count"
            r17 = 20
            r5[r17] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "health_monitor_sample"
            r17 = 21
            r5[r17] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "android_id"
            r2 = 22
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "adid_reporting_enabled"
            r2 = 23
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "ssaid_reporting_enabled"
            r2 = 24
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "admob_app_id"
            r18 = 25
            r5[r18] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "dynamite_version"
            r2 = 26
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "safelisted_events"
            r2 = 27
            r5[r2] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r0 = "ga_app_id"
            r19 = 28
            r5[r19] = r0     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            r0[r11] = r1     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            java.lang.String r19 = "apps"
            java.lang.String r20 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r2 = 10
            r4 = r19
            r2 = 9
            r6 = r20
            r2 = 8
            r7 = r0
            r0 = 7
            r8 = r21
            r2 = 6
            r9 = r22
            r0 = 5
            r10 = r23
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0302, all -> 0x02fd }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x02f9, all -> 0x02f5 }
            if (r4 == 0) goto L_0x02ec
            sou r4 = new sou     // Catch:{ SQLiteException -> 0x02f9, all -> 0x02f5 }
            r5 = r24
            sze r6 = r5.j     // Catch:{ SQLiteException -> 0x02ea }
            svv r6 = r6.g     // Catch:{ SQLiteException -> 0x02ea }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x02ea }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x02ea }
            r4.a((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x02ea }
            java.lang.String r6 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x02ea }
            r4.b((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x02ea }
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x02ea }
            r4.d((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x02ea }
            long r6 = r3.getLong(r14)     // Catch:{ SQLiteException -> 0x02ea }
            r4.g((long) r6)     // Catch:{ SQLiteException -> 0x02ea }
            long r6 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x02ea }
            r4.a((long) r6)     // Catch:{ SQLiteException -> 0x02ea }
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.b((long) r6)     // Catch:{ SQLiteException -> 0x02ea }
            java.lang.String r0 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x02ea }
            r4.f((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 7
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.g((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 8
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.d((long) r6)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 9
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.e((long) r6)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 10
            boolean r2 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x014b
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r0 != 0) goto L_0x014b
            r0 = 0
            goto L_0x014c
        L_0x014b:
            r0 = 1
        L_0x014c:
            r4.a((boolean) r0)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 11
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            svv r0 = r4.a     // Catch:{ SQLiteException -> 0x02ea }
            r0.p()     // Catch:{ SQLiteException -> 0x02ea }
            boolean r0 = r4.k     // Catch:{ SQLiteException -> 0x02ea }
            long r8 = r4.d     // Catch:{ SQLiteException -> 0x02ea }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0164
            r2 = 1
            goto L_0x0165
        L_0x0164:
            r2 = 0
        L_0x0165:
            r0 = r0 | r2
            r4.k = r0     // Catch:{ SQLiteException -> 0x02ea }
            r4.d = r6     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 12
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            svv r0 = r4.a     // Catch:{ SQLiteException -> 0x02ea }
            r0.p()     // Catch:{ SQLiteException -> 0x02ea }
            boolean r0 = r4.k     // Catch:{ SQLiteException -> 0x02ea }
            long r8 = r4.e     // Catch:{ SQLiteException -> 0x02ea }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x017f
            r2 = 1
            goto L_0x0180
        L_0x017f:
            r2 = 0
        L_0x0180:
            r0 = r0 | r2
            r4.k = r0     // Catch:{ SQLiteException -> 0x02ea }
            r4.e = r6     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 13
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            svv r0 = r4.a     // Catch:{ SQLiteException -> 0x02ea }
            r0.p()     // Catch:{ SQLiteException -> 0x02ea }
            boolean r0 = r4.k     // Catch:{ SQLiteException -> 0x02ea }
            long r8 = r4.f     // Catch:{ SQLiteException -> 0x02ea }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x019a
            r2 = 1
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            r0 = r0 | r2
            r4.k = r0     // Catch:{ SQLiteException -> 0x02ea }
            r4.f = r6     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 14
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            svv r0 = r4.a     // Catch:{ SQLiteException -> 0x02ea }
            r0.p()     // Catch:{ SQLiteException -> 0x02ea }
            boolean r0 = r4.k     // Catch:{ SQLiteException -> 0x02ea }
            long r8 = r4.g     // Catch:{ SQLiteException -> 0x02ea }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01b5
            r2 = 1
            goto L_0x01b6
        L_0x01b5:
            r2 = 0
        L_0x01b6:
            r0 = r0 | r2
            r4.k = r0     // Catch:{ SQLiteException -> 0x02ea }
            r4.g = r6     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 15
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.h((long) r6)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 16
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.i(r6)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 17
            boolean r2 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x01db
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x02ea }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x02ea }
            goto L_0x01de
        L_0x01db:
            r6 = -2147483648(0xffffffff80000000, double:NaN)
        L_0x01de:
            r4.c((long) r6)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 18
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.e((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 19
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            svv r0 = r4.a     // Catch:{ SQLiteException -> 0x02ea }
            r0.p()     // Catch:{ SQLiteException -> 0x02ea }
            boolean r0 = r4.k     // Catch:{ SQLiteException -> 0x02ea }
            long r8 = r4.h     // Catch:{ SQLiteException -> 0x02ea }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01ff
            r2 = 1
            goto L_0x0200
        L_0x01ff:
            r2 = 0
        L_0x0200:
            r0 = r0 | r2
            r4.k = r0     // Catch:{ SQLiteException -> 0x02ea }
            r4.h = r6     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 20
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            svv r0 = r4.a     // Catch:{ SQLiteException -> 0x02ea }
            r0.p()     // Catch:{ SQLiteException -> 0x02ea }
            boolean r0 = r4.k     // Catch:{ SQLiteException -> 0x02ea }
            long r8 = r4.i     // Catch:{ SQLiteException -> 0x02ea }
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x021a
            r2 = 1
            goto L_0x021b
        L_0x021a:
            r2 = 0
        L_0x021b:
            r0 = r0 | r2
            r4.k = r0     // Catch:{ SQLiteException -> 0x02ea }
            r4.i = r6     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 21
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.h((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x02ea }
            spg r0 = r24.v()     // Catch:{ SQLiteException -> 0x02ea }
            suc r2 = defpackage.sud.aQ     // Catch:{ SQLiteException -> 0x02ea }
            boolean r0 = r0.a((defpackage.suc) r2)     // Catch:{ SQLiteException -> 0x02ea }
            if (r0 != 0) goto L_0x0247
            r0 = 22
            boolean r2 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x0242
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            goto L_0x0244
        L_0x0242:
            r6 = 0
        L_0x0244:
            r4.j(r6)     // Catch:{ SQLiteException -> 0x02ea }
        L_0x0247:
            r0 = 23
            boolean r2 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x0258
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r0 != 0) goto L_0x0258
            r0 = 0
            goto L_0x0259
        L_0x0258:
            r0 = 1
        L_0x0259:
            r4.b((boolean) r0)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 24
            boolean r2 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x026c
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r0 != 0) goto L_0x026c
            r0 = 0
            goto L_0x026d
        L_0x026c:
            r0 = 1
        L_0x026d:
            r4.c((boolean) r0)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x02ea }
            r4.c((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 26
            boolean r2 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x0286
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x02ea }
            goto L_0x0288
        L_0x0286:
            r6 = 0
        L_0x0288:
            r4.f((long) r6)     // Catch:{ SQLiteException -> 0x02ea }
            r0 = 27
            boolean r2 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x02c5
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x02ea }
            java.lang.String r2 = ","
            r6 = -1
            java.lang.String[] r0 = r0.split(r2, r6)     // Catch:{ SQLiteException -> 0x02ea }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x02ea }
            svv r2 = r4.a     // Catch:{ SQLiteException -> 0x02ea }
            r2.p()     // Catch:{ SQLiteException -> 0x02ea }
            java.util.List r2 = r4.c     // Catch:{ SQLiteException -> 0x02ea }
            int r6 = defpackage.szj.a     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x02b0
            if (r0 != 0) goto L_0x02b0
            goto L_0x02c5
        L_0x02b0:
            if (r2 == 0) goto L_0x02b8
            boolean r2 = r2.equals(r0)     // Catch:{ SQLiteException -> 0x02ea }
            if (r2 != 0) goto L_0x02c5
        L_0x02b8:
            r4.k = r12     // Catch:{ SQLiteException -> 0x02ea }
            if (r0 == 0) goto L_0x02c2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02ea }
            r2.<init>(r0)     // Catch:{ SQLiteException -> 0x02ea }
            goto L_0x02c3
        L_0x02c2:
            r2 = 0
        L_0x02c3:
            r4.c = r2     // Catch:{ SQLiteException -> 0x02ea }
        L_0x02c5:
            defpackage.ayjy.c()     // Catch:{ SQLiteException -> 0x02ea }
            svv r0 = r4.a     // Catch:{ SQLiteException -> 0x02ea }
            r0.p()     // Catch:{ SQLiteException -> 0x02ea }
            r4.k = r11     // Catch:{ SQLiteException -> 0x02ea }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x02ea }
            if (r0 == 0) goto L_0x02e4
            sut r0 = r24.E()     // Catch:{ SQLiteException -> 0x02ea }
            sur r0 = r0.c     // Catch:{ SQLiteException -> 0x02ea }
            java.lang.String r2 = "Got multiple records for app, expected one. appId"
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r25)     // Catch:{ SQLiteException -> 0x02ea }
            r0.a(r2, r6)     // Catch:{ SQLiteException -> 0x02ea }
        L_0x02e4:
            if (r3 == 0) goto L_0x02e9
            r3.close()
        L_0x02e9:
            return r4
        L_0x02ea:
            r0 = move-exception
            goto L_0x0306
        L_0x02ec:
            r5 = r24
            if (r3 == 0) goto L_0x02f3
        L_0x02f0:
            r3.close()
        L_0x02f3:
            r1 = 0
            return r1
        L_0x02f5:
            r0 = move-exception
            r5 = r24
            goto L_0x0319
        L_0x02f9:
            r0 = move-exception
            r5 = r24
            goto L_0x0306
        L_0x02fd:
            r0 = move-exception
            r5 = r24
            r2 = 0
            goto L_0x031a
        L_0x0302:
            r0 = move-exception
            r5 = r24
            r3 = 0
        L_0x0306:
            sut r2 = r24.E()     // Catch:{ all -> 0x0318 }
            sur r2 = r2.c     // Catch:{ all -> 0x0318 }
            java.lang.String r4 = "Error querying app. appId"
            java.lang.Object r1 = defpackage.sut.a((java.lang.String) r25)     // Catch:{ all -> 0x0318 }
            r2.a(r4, r1, r0)     // Catch:{ all -> 0x0318 }
            if (r3 == 0) goto L_0x02f3
            goto L_0x02f0
        L_0x0318:
            r0 = move-exception
        L_0x0319:
            r2 = r3
        L_0x031a:
            if (r2 == 0) goto L_0x031f
            r2.close()
        L_0x031f:
            goto L_0x0321
        L_0x0320:
            throw r0
        L_0x0321:
            goto L_0x0320
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.b(java.lang.String):sou");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0103, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0104, code lost:
        r9 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010c, code lost:
        r9 = r17;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0111, code lost:
        r9 = r17;
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0129, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0132, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            defpackage.iva.c(r18)
            r17.h()
            r17.q()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1001"
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0110, all -> 0x010b }
            r11 = 3
            r1.<init>(r11)     // Catch:{ SQLiteException -> 0x0110, all -> 0x010b }
            r12 = r18
            r1.add(r12)     // Catch:{ SQLiteException -> 0x0107, all -> 0x010b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0107, all -> 0x010b }
            java.lang.String r3 = "app_id=?"
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0107, all -> 0x010b }
            boolean r3 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x0107, all -> 0x010b }
            if (r3 != 0) goto L_0x0033
            r13 = r19
            r1.add(r13)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r3 = " and origin=?"
            r2.append(r3)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            goto L_0x0035
        L_0x0033:
            r13 = r19
        L_0x0035:
            boolean r3 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            if (r3 == 0) goto L_0x003c
            goto L_0x004e
        L_0x003c:
            java.lang.String r3 = java.lang.String.valueOf(r20)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r4 = "*"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            r1.add(r3)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r3 = " and name glob ?"
            r2.append(r3)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
        L_0x004e:
            int r3 = r1.size()     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            r5 = r1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            android.database.sqlite.SQLiteDatabase r1 = r17.e()     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r4 = "name"
            r14 = 0
            r3[r14] = r4     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r4 = "set_timestamp"
            r15 = 1
            r3[r15] = r4     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r4 = "value"
            r8 = 2
            r3[r8] = r4     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r4 = "origin"
            r3[r11] = r4     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r4 = r2.toString()     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            r17.v()     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            java.lang.String r2 = "user_attributes"
            r6 = 0
            r7 = 0
            java.lang.String r16 = "rowid"
            r10 = 2
            r8 = r16
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0103, all -> 0x010b }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            if (r2 == 0) goto L_0x00f3
        L_0x008f:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r17.v()     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 >= r3) goto L_0x00d9
            java.lang.String r5 = r1.getString(r14)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            long r6 = r1.getLong(r15)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r9 = r17
            java.lang.Object r8 = r9.a((android.database.Cursor) r1, (int) r10)     // Catch:{ SQLiteException -> 0x00d7 }
            java.lang.String r13 = r1.getString(r11)     // Catch:{ SQLiteException -> 0x00d7 }
            if (r8 == 0) goto L_0x00be
            szi r4 = new szi     // Catch:{ SQLiteException -> 0x00d7 }
            r2 = r4
            r3 = r18
            r10 = r4
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x00d7 }
            r0.add(r10)     // Catch:{ SQLiteException -> 0x00d7 }
            r5 = r20
            goto L_0x00cf
        L_0x00be:
            sut r2 = r17.E()     // Catch:{ SQLiteException -> 0x00d7 }
            sur r2 = r2.c     // Catch:{ SQLiteException -> 0x00d7 }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r18)     // Catch:{ SQLiteException -> 0x00d7 }
            r5 = r20
            r2.a(r3, r4, r13, r5)     // Catch:{ SQLiteException -> 0x00d7 }
        L_0x00cf:
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x00d7 }
            if (r2 == 0) goto L_0x00ed
            r10 = 2
            goto L_0x008f
        L_0x00d7:
            r0 = move-exception
            goto L_0x0118
        L_0x00d9:
            r9 = r17
            sut r2 = r17.E()     // Catch:{ SQLiteException -> 0x00d7 }
            sur r2 = r2.c     // Catch:{ SQLiteException -> 0x00d7 }
            r17.v()     // Catch:{ SQLiteException -> 0x00d7 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00d7 }
            r2.a(r4, r3)     // Catch:{ SQLiteException -> 0x00d7 }
        L_0x00ed:
            if (r1 == 0) goto L_0x00f2
            r1.close()
        L_0x00f2:
            return r0
        L_0x00f3:
            r9 = r17
            if (r1 == 0) goto L_0x00fa
            r1.close()
        L_0x00fa:
            return r0
        L_0x00fb:
            r0 = move-exception
            r9 = r17
            goto L_0x012f
        L_0x00ff:
            r0 = move-exception
            r9 = r17
            goto L_0x0118
        L_0x0103:
            r0 = move-exception
            r9 = r17
            goto L_0x0117
        L_0x0107:
            r0 = move-exception
            r9 = r17
            goto L_0x0115
        L_0x010b:
            r0 = move-exception
            r9 = r17
            r10 = 0
            goto L_0x0130
        L_0x0110:
            r0 = move-exception
            r9 = r17
            r12 = r18
        L_0x0115:
            r13 = r19
        L_0x0117:
            r1 = 0
        L_0x0118:
            sut r2 = r17.E()     // Catch:{ all -> 0x012e }
            sur r2 = r2.c     // Catch:{ all -> 0x012e }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r18)     // Catch:{ all -> 0x012e }
            r2.a(r3, r4, r13, r0)     // Catch:{ all -> 0x012e }
            if (r1 == 0) goto L_0x012c
            r1.close()
        L_0x012c:
            r1 = 0
            return r1
        L_0x012e:
            r0 = move-exception
        L_0x012f:
            r10 = r1
        L_0x0130:
            if (r10 == 0) goto L_0x0135
            r10.close()
        L_0x0135:
            goto L_0x0137
        L_0x0136:
            throw r0
        L_0x0137:
            goto L_0x0136
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void b() {
        q();
        e().beginTransaction();
    }

    public final void b(String str, String str2) {
        iva.c(str);
        iva.c(str2);
        h();
        q();
        try {
            int delete = e().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            if (ayjn.b()) {
                if (this.j.d().b(str, sud.aJ)) {
                    return;
                }
            }
            E().k.a("Deleted user attribute rows", Integer.valueOf(delete));
        } catch (SQLiteException e2) {
            if (!ayjn.b() || !this.j.d().b(str, sud.aJ)) {
                E().c.a("Error deleting user attribute. appId", sut.a(str), y().c(str2), e2);
            } else {
                E().c.a("Error deleting user property. appId", sut.a(str), y().c(str2), e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sph a(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r22 = this;
            java.lang.String r0 = "daily_realtime_events_count"
            java.lang.String r1 = "daily_error_events_count"
            java.lang.String r2 = "daily_conversions_count"
            java.lang.String r3 = "daily_public_events_count"
            java.lang.String r4 = "daily_events_count"
            java.lang.String r5 = "day"
            defpackage.iva.c(r25)
            r22.h()
            r22.q()
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]
            r8 = 0
            r7[r8] = r25
            sph r9 = new sph
            r9.<init>()
            android.database.sqlite.SQLiteDatabase r15 = r22.e()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            r11 = 6
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            r13[r8] = r5     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            r13[r6] = r4     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            r14 = 2
            r13[r14] = r3     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            r12 = 3
            r13[r12] = r2     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            r11 = 4
            r13[r11] = r1     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            r10 = 5
            r13[r10] = r0     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            r10[r8] = r25     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            java.lang.String r16 = "apps"
            java.lang.String r17 = "app_id=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r11 = r15
            r12 = r16
            r14 = r17
            r21 = r15
            r15 = r10
            r16 = r18
            r17 = r19
            r18 = r20
            android.database.Cursor r10 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0110 }
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x010e }
            if (r11 != 0) goto L_0x0072
            sut r0 = r22.E()     // Catch:{ SQLiteException -> 0x010e }
            sur r0 = r0.f     // Catch:{ SQLiteException -> 0x010e }
            java.lang.String r1 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r2 = defpackage.sut.a((java.lang.String) r25)     // Catch:{ SQLiteException -> 0x010e }
            r0.a(r1, r2)     // Catch:{ SQLiteException -> 0x010e }
            if (r10 == 0) goto L_0x0071
            r10.close()
        L_0x0071:
            return r9
        L_0x0072:
            long r11 = r10.getLong(r8)     // Catch:{ SQLiteException -> 0x010e }
            int r8 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x009d
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x010e }
            r9.b = r11     // Catch:{ SQLiteException -> 0x010e }
            r6 = 2
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x010e }
            r9.a = r11     // Catch:{ SQLiteException -> 0x010e }
            r6 = 3
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x010e }
            r9.c = r11     // Catch:{ SQLiteException -> 0x010e }
            r6 = 4
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x010e }
            r9.d = r11     // Catch:{ SQLiteException -> 0x010e }
            r6 = 5
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x010e }
            r9.e = r11     // Catch:{ SQLiteException -> 0x010e }
        L_0x009d:
            if (r28 == 0) goto L_0x00a5
            long r11 = r9.b     // Catch:{ SQLiteException -> 0x010e }
            long r11 = r11 + r26
            r9.b = r11     // Catch:{ SQLiteException -> 0x010e }
        L_0x00a5:
            if (r29 == 0) goto L_0x00ad
            long r11 = r9.a     // Catch:{ SQLiteException -> 0x010e }
            long r11 = r11 + r26
            r9.a = r11     // Catch:{ SQLiteException -> 0x010e }
        L_0x00ad:
            if (r30 == 0) goto L_0x00b5
            long r11 = r9.c     // Catch:{ SQLiteException -> 0x010e }
            long r11 = r11 + r26
            r9.c = r11     // Catch:{ SQLiteException -> 0x010e }
        L_0x00b5:
            if (r31 == 0) goto L_0x00bd
            long r11 = r9.d     // Catch:{ SQLiteException -> 0x010e }
            long r11 = r11 + r26
            r9.d = r11     // Catch:{ SQLiteException -> 0x010e }
        L_0x00bd:
            if (r32 != 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            long r11 = r9.e     // Catch:{ SQLiteException -> 0x010e }
            long r11 = r11 + r26
            r9.e = r11     // Catch:{ SQLiteException -> 0x010e }
        L_0x00c6:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x010e }
            r6.<init>()     // Catch:{ SQLiteException -> 0x010e }
            java.lang.Long r8 = java.lang.Long.valueOf(r23)     // Catch:{ SQLiteException -> 0x010e }
            r6.put(r5, r8)     // Catch:{ SQLiteException -> 0x010e }
            long r11 = r9.a     // Catch:{ SQLiteException -> 0x010e }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x010e }
            r6.put(r3, r5)     // Catch:{ SQLiteException -> 0x010e }
            long r11 = r9.b     // Catch:{ SQLiteException -> 0x010e }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x010e }
            r6.put(r4, r3)     // Catch:{ SQLiteException -> 0x010e }
            long r3 = r9.c     // Catch:{ SQLiteException -> 0x010e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x010e }
            r6.put(r2, r3)     // Catch:{ SQLiteException -> 0x010e }
            long r2 = r9.d     // Catch:{ SQLiteException -> 0x010e }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x010e }
            r6.put(r1, r2)     // Catch:{ SQLiteException -> 0x010e }
            long r1 = r9.e     // Catch:{ SQLiteException -> 0x010e }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x010e }
            r6.put(r0, r1)     // Catch:{ SQLiteException -> 0x010e }
            java.lang.String r0 = "apps"
            java.lang.String r1 = "app_id=?"
            r2 = r21
            r2.update(r0, r6, r1, r7)     // Catch:{ SQLiteException -> 0x010e }
            if (r10 == 0) goto L_0x010d
            r10.close()
        L_0x010d:
            return r9
        L_0x010e:
            r0 = move-exception
            goto L_0x0115
        L_0x0110:
            r0 = move-exception
            r10 = 0
            goto L_0x012b
        L_0x0113:
            r0 = move-exception
            r10 = 0
        L_0x0115:
            sut r1 = r22.E()     // Catch:{ all -> 0x012a }
            sur r1 = r1.c     // Catch:{ all -> 0x012a }
            java.lang.String r2 = "Error updating daily counts. appId"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r25)     // Catch:{ all -> 0x012a }
            r1.a(r2, r3, r0)     // Catch:{ all -> 0x012a }
            if (r10 == 0) goto L_0x0129
            r10.close()
        L_0x0129:
            return r9
        L_0x012a:
            r0 = move-exception
        L_0x012b:
            if (r10 == 0) goto L_0x0130
            r10.close()
        L_0x0130:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.a(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):sph");
    }

    public final sph a(long j, String str, boolean z, boolean z2) {
        return a(j, str, 1, false, false, z, false, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.spp a(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r15 = r30
            r14 = r31
            defpackage.iva.c(r30)
            defpackage.iva.c(r31)
            r29.h()
            r29.q()
            spg r0 = r29.v()
            suc r1 = defpackage.sud.ae
            boolean r0 = r0.b(r15, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 8
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "lifetime_count"
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "current_bundle_count"
            r6 = 1
            r3[r6] = r4
            java.lang.String r4 = "last_fire_timestamp"
            r7 = 2
            r3[r7] = r4
            java.lang.String r4 = "last_bundled_timestamp"
            r8 = 3
            r3[r8] = r4
            java.lang.String r4 = "last_bundled_day"
            r9 = 4
            r3[r9] = r4
            java.lang.String r4 = "last_sampled_complex_event_id"
            r10 = 5
            r3[r10] = r4
            java.lang.String r4 = "last_sampling_rate"
            r11 = 6
            r3[r11] = r4
            java.lang.String r4 = "last_exempt_from_sampling"
            r12 = 7
            r3[r12] = r4
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.<init>(r3)
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = "current_session_count"
            r1.add(r3)
        L_0x0056:
            r18 = 0
            android.database.sqlite.SQLiteDatabase r19 = r29.e()     // Catch:{ SQLiteException -> 0x0158, all -> 0x0156 }
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0158, all -> 0x0156 }
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch:{ SQLiteException -> 0x0158, all -> 0x0156 }
            r21 = r1
            java.lang.String[] r21 = (java.lang.String[]) r21     // Catch:{ SQLiteException -> 0x0158, all -> 0x0156 }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0158, all -> 0x0156 }
            r1[r5] = r15     // Catch:{ SQLiteException -> 0x0158, all -> 0x0156 }
            r1[r6] = r14     // Catch:{ SQLiteException -> 0x0158, all -> 0x0156 }
            java.lang.String r20 = "events"
            java.lang.String r22 = "app_id=? and name=?"
            r24 = 0
            r25 = 0
            r26 = 0
            r23 = r1
            android.database.Cursor r13 = r19.query(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x0158, all -> 0x0156 }
            boolean r1 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            if (r1 == 0) goto L_0x0142
            long r16 = r13.getLong(r5)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            long r19 = r13.getLong(r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            long r21 = r13.getLong(r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            boolean r1 = r13.isNull(r8)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r3 = 0
            if (r1 != 0) goto L_0x009d
            long r7 = r13.getLong(r8)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r23 = r7
            goto L_0x009f
        L_0x009d:
            r23 = r3
        L_0x009f:
            boolean r1 = r13.isNull(r9)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            if (r1 != 0) goto L_0x00b1
            long r7 = r13.getLong(r9)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r25 = r1
            goto L_0x00b3
        L_0x00b1:
            r25 = r18
        L_0x00b3:
            boolean r1 = r13.isNull(r10)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            if (r1 != 0) goto L_0x00c5
            long r7 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r26 = r1
            goto L_0x00c7
        L_0x00c5:
            r26 = r18
        L_0x00c7:
            boolean r1 = r13.isNull(r11)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            if (r1 != 0) goto L_0x00d9
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r27 = r1
            goto L_0x00db
        L_0x00d9:
            r27 = r18
        L_0x00db:
            boolean r1 = r13.isNull(r12)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            if (r1 != 0) goto L_0x00f6
            long r7 = r13.getLong(r12)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r9 = 1
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x00ee
            r5 = 1
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r28 = r1
            goto L_0x00f8
        L_0x00f6:
            r28 = r18
        L_0x00f8:
            if (r0 == 0) goto L_0x0106
            boolean r0 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            if (r0 != 0) goto L_0x0106
            long r0 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r8 = r0
            goto L_0x0107
        L_0x0106:
            r8 = r3
        L_0x0107:
            spp r0 = new spp     // Catch:{ SQLiteException -> 0x0150, all -> 0x014a }
            r1 = r0
            r2 = r30
            r3 = r31
            r4 = r16
            r6 = r19
            r10 = r21
            r19 = r13
            r12 = r23
            r14 = r25
            r15 = r26
            r16 = r27
            r17 = r28
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0140, all -> 0x013e }
            boolean r1 = r19.moveToNext()     // Catch:{ SQLiteException -> 0x0140, all -> 0x013e }
            if (r1 == 0) goto L_0x0138
            sut r1 = r29.E()     // Catch:{ SQLiteException -> 0x0140, all -> 0x013e }
            sur r1 = r1.c     // Catch:{ SQLiteException -> 0x0140, all -> 0x013e }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r30)     // Catch:{ SQLiteException -> 0x0140, all -> 0x013e }
            r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x0140, all -> 0x013e }
        L_0x0138:
            if (r19 == 0) goto L_0x013d
            r19.close()
        L_0x013d:
            return r0
        L_0x013e:
            r0 = move-exception
            goto L_0x014d
        L_0x0140:
            r0 = move-exception
            goto L_0x0153
        L_0x0142:
            r19 = r13
            if (r19 == 0) goto L_0x0149
            r19.close()
        L_0x0149:
            return r18
        L_0x014a:
            r0 = move-exception
            r19 = r13
        L_0x014d:
            r18 = r19
            goto L_0x017d
        L_0x0150:
            r0 = move-exception
            r19 = r13
        L_0x0153:
            r13 = r19
            goto L_0x015b
        L_0x0156:
            r0 = move-exception
            goto L_0x017d
        L_0x0158:
            r0 = move-exception
            r13 = r18
        L_0x015b:
            sut r1 = r29.E()     // Catch:{ all -> 0x017a }
            sur r1 = r1.c     // Catch:{ all -> 0x017a }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r30)     // Catch:{ all -> 0x017a }
            suk r4 = r29.y()     // Catch:{ all -> 0x017a }
            r5 = r31
            java.lang.String r4 = r4.a((java.lang.String) r5)     // Catch:{ all -> 0x017a }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x017a }
            if (r13 == 0) goto L_0x0179
            r13.close()
        L_0x0179:
            return r18
        L_0x017a:
            r0 = move-exception
            r18 = r13
        L_0x017d:
            if (r18 == 0) goto L_0x0182
            r18.close()
        L_0x0182:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.a(java.lang.String, java.lang.String):spp");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02eb, code lost:
        r12 = r2;
        r2 = r20;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:35:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r20, long r21, long r23, defpackage.szd r25) {
        /*
            r19 = this;
            r1 = r25
            defpackage.iva.a((java.lang.Object) r25)
            r19.h()
            r19.q()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r0 = r19.e()     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            boolean r3 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r4 = ""
            r12 = -1
            r14 = 2
            r15 = 1
            r11 = 0
            if (r3 != 0) goto L_0x007a
            int r3 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x002c
            java.lang.String[] r3 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r3[r11] = r20     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r5 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r3[r15] = r5     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            goto L_0x0030
        L_0x002c:
            java.lang.String[] r3 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r3[r11] = r20     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
        L_0x0030:
            int r5 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            java.lang.String r4 = " and rowid <= ?"
        L_0x0037:
            int r5 = r4.length()     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            int r5 = r5 + 84
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r6.<init>(r5)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r5 = "select metadata_fingerprint from raw_events where app_id = ?"
            r6.append(r5)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r6.append(r4)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r4 = " order by rowid limit 1;"
            r6.append(r4)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r4 = r6.toString()     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            android.database.Cursor r2 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0074, all -> 0x0071 }
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0074, all -> 0x0071 }
            r2.close()     // Catch:{ SQLiteException -> 0x0074, all -> 0x0071 }
            r16 = r2
            r17 = r3
            r2 = r20
            goto L_0x00d2
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.close()
        L_0x0070:
            return
        L_0x0071:
            r0 = move-exception
            goto L_0x030c
        L_0x0074:
            r0 = move-exception
            r12 = r2
            r2 = r20
            goto L_0x02f5
        L_0x007a:
            int r3 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x008d
            java.lang.String[] r3 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r5 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r3[r11] = r5     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r5 = java.lang.String.valueOf(r21)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r3[r15] = r5     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            goto L_0x0095
        L_0x008d:
            java.lang.String[] r3 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r5 = java.lang.String.valueOf(r21)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r3[r11] = r5     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
        L_0x0095:
            int r5 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            java.lang.String r4 = "rowid <= ? and "
        L_0x009c:
            int r5 = r4.length()     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            int r5 = r5 + 148
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r6.<init>(r5)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r5 = "select app_id, metadata_fingerprint from raw_events where "
            r6.append(r5)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            r6.append(r4)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r6.append(r4)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            java.lang.String r4 = r6.toString()     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            android.database.Cursor r2 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x02f1, all -> 0x02ef }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x02ea, all -> 0x02e8 }
            if (r3 == 0) goto L_0x02e2
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x02ea, all -> 0x02e8 }
            java.lang.String r4 = r2.getString(r15)     // Catch:{ SQLiteException -> 0x02de, all -> 0x02e8 }
            r2.close()     // Catch:{ SQLiteException -> 0x02de, all -> 0x02e8 }
            r16 = r2
            r2 = r3
            r17 = r4
        L_0x00d2:
            java.lang.String[] r5 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02da, all -> 0x02d6 }
            java.lang.String r3 = "metadata"
            r5[r11] = r3     // Catch:{ SQLiteException -> 0x02da, all -> 0x02d6 }
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x02da, all -> 0x02d6 }
            r7[r11] = r2     // Catch:{ SQLiteException -> 0x02da, all -> 0x02d6 }
            r7[r15] = r17     // Catch:{ SQLiteException -> 0x02da, all -> 0x02d6 }
            java.lang.String r4 = "raw_events_metadata"
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r18 = "2"
            r3 = r0
            r14 = 0
            r11 = r18
            android.database.Cursor r11 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x02da, all -> 0x02d6 }
            boolean r3 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            if (r3 != 0) goto L_0x010b
            sut r0 = r19.E()     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            sur r0 = r0.c     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            java.lang.String r1 = "Raw event metadata record is missing. appId"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r0.a(r1, r3)     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            if (r11 == 0) goto L_0x010a
            r11.close()
        L_0x010a:
            return
        L_0x010b:
            byte[] r3 = r11.getBlob(r14)     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            tad r4 = defpackage.tad.P     // Catch:{ IOException -> 0x02b3 }
            aucd r4 = r4.o()     // Catch:{ IOException -> 0x02b3 }
            audw r3 = defpackage.szg.a((defpackage.audw) r4, (byte[]) r3)     // Catch:{ IOException -> 0x02b3 }
            aucd r3 = (defpackage.aucd) r3     // Catch:{ IOException -> 0x02b3 }
            aucj r3 = r3.i()     // Catch:{ IOException -> 0x02b3 }
            tad r3 = (defpackage.tad) r3     // Catch:{ IOException -> 0x02b3 }
            boolean r4 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            if (r4 != 0) goto L_0x0129
            goto L_0x0138
        L_0x0129:
            sut r4 = r19.E()     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            sur r4 = r4.f     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            java.lang.String r5 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r4.a(r5, r6)     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
        L_0x0138:
            r11.close()     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r1.a = r3     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r10 = 3
            int r3 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0157
            java.lang.String r3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r4[r14] = r2     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r4[r15] = r17     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            java.lang.String r5 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r6 = 2
            r4[r6] = r5     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r6 = r3
            r7 = r4
            goto L_0x0162
        L_0x0157:
            java.lang.String r3 = "app_id = ? and metadata_fingerprint = ?"
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r5[r14] = r2     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r5[r15] = r17     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            r6 = r3
            r7 = r5
        L_0x0162:
            r3 = 4
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            java.lang.String r3 = "rowid"
            r5[r14] = r3     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            java.lang.String r3 = "name"
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            java.lang.String r3 = "timestamp"
            r4 = 2
            r5[r4] = r3     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            java.lang.String r3 = "data"
            r5[r10] = r3     // Catch:{ SQLiteException -> 0x02d3, all -> 0x02cf }
            java.lang.String r4 = "raw_events"
            r8 = 0
            r9 = 0
            java.lang.String r12 = "rowid"
            r13 = 0
            r3 = r0
            r15 = 3
            r10 = r12
            r12 = r11
            r11 = r13
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x02cd, all -> 0x02cb }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r0 == 0) goto L_0x0297
        L_0x018c:
            long r4 = r3.getLong(r14)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            byte[] r0 = r3.getBlob(r15)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            szz r6 = defpackage.szz.g     // Catch:{ IOException -> 0x0279 }
            aucd r6 = r6.o()     // Catch:{ IOException -> 0x0279 }
            audw r0 = defpackage.szg.a((defpackage.audw) r6, (byte[]) r0)     // Catch:{ IOException -> 0x0279 }
            aucd r0 = (defpackage.aucd) r0     // Catch:{ IOException -> 0x0279 }
            r6 = 1
            java.lang.String r7 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            boolean r6 = r0.c     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r6 != 0) goto L_0x01ab
            goto L_0x01b0
        L_0x01ab:
            r0.c()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r0.c = r14     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
        L_0x01b0:
            aucj r6 = r0.b     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            szz r6 = (defpackage.szz) r6     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r7.getClass()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r8 = r6.a     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r9 = 1
            r8 = r8 | r9
            r6.a = r8     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r6.c = r7     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r6 = 2
            long r7 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            boolean r6 = r0.c     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r6 != 0) goto L_0x01c9
            goto L_0x01ce
        L_0x01c9:
            r0.c()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r0.c = r14     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
        L_0x01ce:
            aucj r6 = r0.b     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            szz r6 = (defpackage.szz) r6     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r9 = r6.a     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r10 = 2
            r9 = r9 | r10
            r6.a = r9     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r6.d = r7     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            aucj r0 = r0.i()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            szz r0 = (defpackage.szz) r0     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.util.List r6 = r1.c     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r6 != 0) goto L_0x01ee
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r6.<init>()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r1.c = r6     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
        L_0x01ee:
            java.util.List r6 = r1.b     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r6 != 0) goto L_0x01f9
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r6.<init>()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r1.b = r6     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
        L_0x01f9:
            java.util.List r6 = r1.c     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r6 = r6.size()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r6 <= 0) goto L_0x0215
            java.util.List r6 = r1.c     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.lang.Object r6 = r6.get(r14)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            szz r6 = (defpackage.szz) r6     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            long r6 = defpackage.szd.a(r6)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            long r8 = defpackage.szd.a(r0)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0273
        L_0x0215:
            long r6 = r1.d     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r8 = r0.U     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r9 = -1
            if (r8 != r9) goto L_0x0228
            aueh r8 = defpackage.aueh.a     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            aueq r8 = r8.a((java.lang.Object) r0)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r8 = r8.b(r0)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r0.U = r8     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
        L_0x0228:
            long r8 = (long) r8     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            long r6 = r6 + r8
            sze r8 = r1.e     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r8.d()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            suc r8 = defpackage.sud.i     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.lang.Object r8 = r8.a()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r8 = r8.intValue()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r8 = java.lang.Math.max(r14, r8)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            long r8 = (long) r8     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto L_0x0273
            r1.d = r6     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.util.List r6 = r1.c     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r6.add(r0)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.util.List r0 = r1.b     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.util.List r0 = r1.c     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r0 = r0.size()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            sze r4 = r1.e     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r4.d()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            suc r4 = defpackage.sud.j     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.lang.Object r4 = r4.a()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            int r4 = r4.intValue()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r5 = 1
            int r4 = java.lang.Math.max(r5, r4)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r0 >= r4) goto L_0x0273
            goto L_0x028b
        L_0x0273:
            if (r3 == 0) goto L_0x0278
            r3.close()
        L_0x0278:
            return
        L_0x0279:
            r0 = move-exception
            r5 = 1
            r10 = 2
            sut r4 = r19.E()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            sur r4 = r4.c     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r7 = defpackage.sut.a((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r4.a(r6, r7, r0)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
        L_0x028b:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r0 != 0) goto L_0x018c
            if (r3 == 0) goto L_0x0309
            r3.close()
            return
        L_0x0297:
            sut r0 = r19.E()     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            sur r0 = r0.f     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            java.lang.String r1 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            r0.a(r1, r4)     // Catch:{ SQLiteException -> 0x02b0, all -> 0x02ac }
            if (r3 == 0) goto L_0x02ab
            r3.close()
        L_0x02ab:
            return
        L_0x02ac:
            r0 = move-exception
            r2 = r3
            goto L_0x030c
        L_0x02b0:
            r0 = move-exception
            r12 = r3
            goto L_0x02f5
        L_0x02b3:
            r0 = move-exception
            r12 = r11
            sut r1 = r19.E()     // Catch:{ SQLiteException -> 0x02cd, all -> 0x02cb }
            sur r1 = r1.c     // Catch:{ SQLiteException -> 0x02cd, all -> 0x02cb }
            java.lang.String r3 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x02cd, all -> 0x02cb }
            r1.a(r3, r4, r0)     // Catch:{ SQLiteException -> 0x02cd, all -> 0x02cb }
            if (r12 == 0) goto L_0x02ca
            r12.close()
            return
        L_0x02ca:
            return
        L_0x02cb:
            r0 = move-exception
            goto L_0x02d1
        L_0x02cd:
            r0 = move-exception
            goto L_0x02f5
        L_0x02cf:
            r0 = move-exception
            r12 = r11
        L_0x02d1:
            r2 = r12
            goto L_0x030c
        L_0x02d3:
            r0 = move-exception
            r12 = r11
            goto L_0x02f5
        L_0x02d6:
            r0 = move-exception
            r2 = r16
            goto L_0x030c
        L_0x02da:
            r0 = move-exception
            r12 = r16
            goto L_0x02f5
        L_0x02de:
            r0 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x02f5
        L_0x02e2:
            if (r2 == 0) goto L_0x02e7
            r2.close()
        L_0x02e7:
            return
        L_0x02e8:
            r0 = move-exception
            goto L_0x030c
        L_0x02ea:
            r0 = move-exception
            r12 = r2
            r2 = r20
            goto L_0x02f5
        L_0x02ef:
            r0 = move-exception
            goto L_0x030c
        L_0x02f1:
            r0 = move-exception
            r12 = r2
            r2 = r20
        L_0x02f5:
            sut r1 = r19.E()     // Catch:{ all -> 0x030a }
            sur r1 = r1.c     // Catch:{ all -> 0x030a }
            java.lang.String r3 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r2 = defpackage.sut.a((java.lang.String) r2)     // Catch:{ all -> 0x030a }
            r1.a(r3, r2, r0)     // Catch:{ all -> 0x030a }
            if (r12 == 0) goto L_0x0309
            r12.close()
        L_0x0309:
            return
        L_0x030a:
            r0 = move-exception
            r2 = r12
        L_0x030c:
            if (r2 == 0) goto L_0x0311
            r2.close()
        L_0x0311:
            goto L_0x0313
        L_0x0312:
            throw r0
        L_0x0313:
            goto L_0x0312
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.a(java.lang.String, long, long, szd):void");
    }

    public final void a(String str, Long l, long j, szz szz) {
        h();
        q();
        iva.a((Object) szz);
        iva.c(str);
        iva.a((Object) l);
        byte[] k2 = szz.k();
        E().k.a("Saving complex main event, appId, data size", y().a(str), Integer.valueOf(k2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", k2);
        try {
            if (e().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) == -1) {
                E().c.a("Failed to insert complex main event (got -1). appId", sut.a(str));
            }
        } catch (SQLiteException e2) {
            E().c.a("Error storing complex main event. appId", sut.a(str), e2);
        }
    }

    public final void a(List list) {
        iva.a((Object) list);
        h();
        q();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(")");
        int delete = e().delete("raw_events", sb.toString(), (String[]) null);
        if (delete != list.size()) {
            E().c.a("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final void a(sou sou) {
        iva.a((Object) sou);
        h();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", sou.a());
        contentValues.put("app_instance_id", sou.b());
        contentValues.put("gmp_app_id", sou.c());
        contentValues.put("resettable_device_id_hash", sou.e());
        contentValues.put("last_bundle_index", Long.valueOf(sou.p()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(sou.g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(sou.h()));
        contentValues.put("app_version", sou.i());
        contentValues.put("app_store", sou.k());
        contentValues.put("gmp_version", Long.valueOf(sou.l()));
        contentValues.put("dev_cert_hash", Long.valueOf(sou.m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(sou.o()));
        sou.a.p();
        contentValues.put("day", Long.valueOf(sou.d));
        sou.a.p();
        contentValues.put("daily_public_events_count", Long.valueOf(sou.e));
        sou.a.p();
        contentValues.put("daily_events_count", Long.valueOf(sou.f));
        sou.a.p();
        contentValues.put("daily_conversions_count", Long.valueOf(sou.g));
        contentValues.put("config_fetched_time", Long.valueOf(sou.q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(sou.r()));
        contentValues.put("app_version_int", Long.valueOf(sou.j()));
        contentValues.put("firebase_instance_id", sou.f());
        sou.a.p();
        contentValues.put("daily_error_events_count", Long.valueOf(sou.h));
        sou.a.p();
        contentValues.put("daily_realtime_events_count", Long.valueOf(sou.i));
        contentValues.put("health_monitor_sample", sou.t());
        contentValues.put("android_id", Long.valueOf(sou.u()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(sou.v()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(sou.w()));
        contentValues.put("admob_app_id", sou.d());
        contentValues.put("dynamite_version", Long.valueOf(sou.n()));
        if (sou.y() != null) {
            if (sou.y().size() == 0) {
                E().f.a("Safelisted events should not be an empty list. appId", sou.a());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", sou.y()));
            }
        }
        ayjy.c();
        try {
            SQLiteDatabase e2 = e();
            if (((long) e2.update("apps", contentValues, "app_id = ?", new String[]{sou.a()})) == 0 && e2.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                E().c.a("Failed to insert/update app (got -1). appId", sut.a(sou.a()));
            }
        } catch (SQLiteException e3) {
            E().c.a("Error storing app. appId", sut.a(sou.a()), e3);
        }
    }

    public final void a(spp spp) {
        long j;
        iva.a((Object) spp);
        h();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", spp.a);
        contentValues.put("name", spp.b);
        contentValues.put("lifetime_count", Long.valueOf(spp.c));
        contentValues.put("current_bundle_count", Long.valueOf(spp.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(spp.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(spp.g));
        contentValues.put("last_bundled_day", spp.h);
        contentValues.put("last_sampled_complex_event_id", spp.i);
        contentValues.put("last_sampling_rate", spp.j);
        if (v().b(spp.a, sud.ae)) {
            contentValues.put("current_session_count", Long.valueOf(spp.e));
        }
        Boolean bool = spp.k;
        if (bool == null || !bool.booleanValue()) {
            j = null;
        } else {
            j = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j);
        try {
            if (e().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                E().c.a("Failed to insert/update event aggregates (got -1). appId", sut.a(spp.a));
            }
        } catch (SQLiteException e2) {
            E().c.a("Error storing event aggregates. appId", sut.a(spp.a), e2);
        }
    }

    public final boolean a(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        iva.a((Object) conditionalUserPropertyParcel);
        h();
        q();
        if (c(conditionalUserPropertyParcel.a, conditionalUserPropertyParcel.c.b) == null) {
            long a2 = a("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{conditionalUserPropertyParcel.a});
            v();
            if (a2 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", conditionalUserPropertyParcel.a);
        contentValues.put("origin", conditionalUserPropertyParcel.b);
        contentValues.put("name", conditionalUserPropertyParcel.c.b);
        a(contentValues, "value", conditionalUserPropertyParcel.c.a());
        contentValues.put("active", Boolean.valueOf(conditionalUserPropertyParcel.e));
        contentValues.put("trigger_event_name", conditionalUserPropertyParcel.f);
        contentValues.put("trigger_timeout", Long.valueOf(conditionalUserPropertyParcel.h));
        contentValues.put("timed_out_event", x().a((Parcelable) conditionalUserPropertyParcel.g));
        contentValues.put("creation_timestamp", Long.valueOf(conditionalUserPropertyParcel.d));
        contentValues.put("triggered_event", x().a((Parcelable) conditionalUserPropertyParcel.i));
        contentValues.put("triggered_timestamp", Long.valueOf(conditionalUserPropertyParcel.c.c));
        contentValues.put("time_to_live", Long.valueOf(conditionalUserPropertyParcel.j));
        contentValues.put("expired_event", x().a((Parcelable) conditionalUserPropertyParcel.k));
        try {
            if (e().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                E().c.a("Failed to insert/update conditional user property (got -1)", sut.a(conditionalUserPropertyParcel.a));
            }
        } catch (SQLiteException e2) {
            E().c.a("Error storing conditional user property", sut.a(conditionalUserPropertyParcel.a), e2);
        }
        return true;
    }

    public final boolean a(spo spo, long j, boolean z) {
        h();
        q();
        iva.a((Object) spo);
        iva.c(spo.a);
        aucd o = szz.g.o();
        long j2 = spo.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        szz szz = (szz) o.b;
        szz.a |= 4;
        szz.e = j2;
        Iterator it = spo.f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            aucd o2 = tab.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            tab tab = (tab) o2.b;
            str.getClass();
            tab.a = 1 | tab.a;
            tab.b = str;
            o().b(o2, spo.f.a(str));
            o.p(o2);
        }
        byte[] k2 = ((szz) o.i()).k();
        if (!ayjn.b() || !v().b(spo.a, sud.aJ)) {
            E().k.a("Saving event, name, data size", y().a(spo.b), Integer.valueOf(k2.length));
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", spo.a);
        contentValues.put("name", spo.b);
        contentValues.put("timestamp", Long.valueOf(spo.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", k2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (e().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            E().c.a("Failed to insert raw event (got -1). appId", sut.a(spo.a));
            return false;
        } catch (SQLiteException e2) {
            E().c.a("Error storing raw event. appId", sut.a(spo.a), e2);
            return false;
        }
    }

    public final boolean a(szi szi) {
        iva.a((Object) szi);
        h();
        q();
        if (c(szi.a, szi.c) == null) {
            if (szj.a(szi.c)) {
                long a2 = a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{szi.a});
                v();
                ayib.c();
                if (a2 >= 25) {
                    return false;
                }
            } else if (!v().b(szi.a, sud.U)) {
                long a3 = a("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{szi.a, szi.b});
                v();
                if (a3 >= 25) {
                    return false;
                }
            } else if (!"_npa".equals(szi.c)) {
                long a4 = a("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{szi.a, szi.b});
                v();
                if (a4 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", szi.a);
        contentValues.put("origin", szi.b);
        contentValues.put("name", szi.c);
        contentValues.put("set_timestamp", Long.valueOf(szi.d));
        a(contentValues, "value", szi.e);
        try {
            if (e().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                E().c.a("Failed to insert/update user property (got -1). appId", sut.a(szi.a));
            }
        } catch (SQLiteException e2) {
            E().c.a("Error storing user property. appId", sut.a(szi.a), e2);
        }
        return true;
    }
}
