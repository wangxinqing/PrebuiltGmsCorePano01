package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: jyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyl {
    private static final String a = ("feature_name=?");
    private static final String b = ("last_connection_timestamp>=?");
    private static final String c = ("last_connection_timestamp<?");
    private static final AtomicLong d = new AtomicLong(0);
    private static jyl e;
    private final Context f;
    private final jyt g;

    public jyl(Context context) {
        this.f = context;
        this.g = new jyt(context);
        new jym(this, context);
    }

    public static synchronized jyl a(Context context) {
        jyl jyl;
        synchronized (jyl.class) {
            if (e == null) {
                e = new jyl(context.getApplicationContext());
            }
            jyl = e;
        }
        return jyl;
    }

    private final SQLiteDatabase b() {
        try {
            return this.g.getWritableDatabase();
        } catch (SQLiteException e2) {
            Log.w("DeviceConnectionAgent", "Can't get database for device connection logging.", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(java.lang.String[] r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            ikz r0 = defpackage.jyo.a     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x00ae }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ae }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00ac
            android.database.sqlite.SQLiteDatabase r0 = r13.b()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00a8
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ae }
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x001c:
            int r6 = r14.length     // Catch:{ all -> 0x00ae }
            if (r4 >= r6) goto L_0x0098
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x00ae }
            r6.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = "feature_name"
            r8 = r14[r4]     // Catch:{ all -> 0x00ae }
            r6.put(r7, r8)     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = "last_connection_timestamp"
            java.lang.Long r8 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00ae }
            r6.put(r7, r8)     // Catch:{ all -> 0x00ae }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x00ae }
            r9 = r14[r4]     // Catch:{ all -> 0x00ae }
            r8[r3] = r9     // Catch:{ all -> 0x00ae }
            java.lang.String r9 = "device_features"
            java.lang.String r10 = a     // Catch:{ all -> 0x00ae }
            int r8 = r0.update(r9, r6, r10, r8)     // Catch:{ all -> 0x00ae }
            if (r8 != 0) goto L_0x0074
            java.lang.String r8 = "device_features"
            r9 = 0
            long r8 = r0.insert(r8, r9, r6)     // Catch:{ all -> 0x00ae }
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0072
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = "Insert failed for the following values: "
            int r8 = r6.length()     // Catch:{ all -> 0x00ae }
            if (r8 != 0) goto L_0x0068
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00ae }
            r6.<init>(r7)     // Catch:{ all -> 0x00ae }
            goto L_0x006c
        L_0x0068:
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x00ae }
        L_0x006c:
            java.lang.String r7 = "DeviceConnectionAgent"
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x00ae }
            goto L_0x0095
        L_0x0072:
            r5 = 1
            goto L_0x0095
        L_0x0074:
            if (r8 <= r7) goto L_0x0095
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = "Update affected multiple rows for the following values: "
            int r8 = r6.length()     // Catch:{ all -> 0x00ae }
            if (r8 != 0) goto L_0x008c
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00ae }
            r6.<init>(r7)     // Catch:{ all -> 0x00ae }
            goto L_0x0090
        L_0x008c:
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x00ae }
        L_0x0090:
            java.lang.String r7 = "DeviceConnectionAgent"
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x00ae }
        L_0x0095:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0098:
            if (r5 == 0) goto L_0x00a6
            android.content.Context r14 = r13.f     // Catch:{ all -> 0x00ae }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = "com.google.android.gms.deviceconnection.device_feature_added"
            r0.<init>(r1)     // Catch:{ all -> 0x00ae }
            r14.sendBroadcast(r0)     // Catch:{ all -> 0x00ae }
        L_0x00a6:
            monitor-exit(r13)
            return r3
        L_0x00a8:
            r14 = 8
        L_0x00aa:
            monitor-exit(r13)
            return r14
        L_0x00ac:
            r14 = 3
            goto L_0x00aa
        L_0x00ae:
            r14 = move-exception
            monitor-exit(r13)
            goto L_0x00b2
        L_0x00b1:
            throw r14
        L_0x00b2:
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyl.a(java.lang.String[]):int");
    }

    public final synchronized DataHolder a() {
        DataHolder b2 = DataHolder.b(8);
        String[] strArr = {String.valueOf(System.currentTimeMillis() - ((Long) jyo.b.c()).longValue())};
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longValue = ((Long) jyo.b.c()).longValue();
        long j = d.get();
        if (j <= elapsedRealtime - longValue || j == 0) {
            SQLiteDatabase b3 = b();
            if (b3 == null) {
                return b2;
            }
            try {
                b3.delete("device_features", c, strArr);
                d.set(SystemClock.elapsedRealtime());
            } finally {
                b3.close();
            }
        }
        SQLiteDatabase b4 = b();
        if (b4 == null) {
            return b2;
        }
        return new DataHolder(b4.query("device_features", jyp.a, b, strArr, (String) null, (String) null, "last_connection_timestamp DESC"), (Bundle) null);
    }
}
