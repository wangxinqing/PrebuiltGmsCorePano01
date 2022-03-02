package defpackage;

import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.common.stats.radio.NetworkActivityContract;
import com.google.android.gms.common.stats.radio.NetworkActivityDbHelper;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: jej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jej extends jeh implements RadiosTracingLoggerProvider.NetworkActivityLogger {
    private static final jic c = jei.a;

    public jej() {
    }

    public final List getEvents(long j, long j2, int i, int i2) {
        jie jie;
        Cursor a;
        Throwable th;
        boolean z;
        if (isNopLogger()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            a = this.b.a(NetworkActivityContract.NetworkActivityColumns.TABLE_NAME, new String[]{"event_time_ms", "network_type", "tag", "device_state", NetworkActivityContract.NetworkActivityColumns.IS_NETWORK_ACTIVE}, "network_type = ? AND event_time_ms BETWEEN ? AND ?", new String[]{String.valueOf(i), String.valueOf(j), String.valueOf(j2)}, "event_time_ms ASC", i2 >= 0 ? String.valueOf(i2) : null);
            if (a != null) {
                int columnIndexOrThrow = a.getColumnIndexOrThrow("event_time_ms");
                int columnIndexOrThrow2 = a.getColumnIndexOrThrow("network_type");
                int columnIndexOrThrow3 = a.getColumnIndexOrThrow("tag");
                int columnIndexOrThrow4 = a.getColumnIndexOrThrow("device_state");
                int columnIndexOrThrow5 = a.getColumnIndexOrThrow(NetworkActivityContract.NetworkActivityColumns.IS_NETWORK_ACTIVE);
                while (a.moveToNext()) {
                    long j3 = a.getLong(columnIndexOrThrow);
                    int i3 = a.getInt(columnIndexOrThrow2);
                    int i4 = a.getInt(columnIndexOrThrow3);
                    int i5 = a.getInt(columnIndexOrThrow4);
                    if (a.getInt(columnIndexOrThrow5) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new NetworkActivityEvent(j3, i3, i4, i5, z));
                }
            }
            if (a != null) {
                a.close();
            }
            jie = this.b;
        } catch (IllegalArgumentException e) {
            try {
                Log.e("tag", "Unable to query radio logs: ", e);
                jie = this.b;
            } catch (Throwable th2) {
                this.b.a();
                throw th2;
            }
        } catch (Throwable th3) {
            apev.a(th, th3);
        }
        jie.a();
        return arrayList;
        throw th;
    }

    public jej(NetworkActivityDbHelper networkActivityDbHelper, ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        super(networkActivityDbHelper, NetworkActivityContract.NetworkActivityColumns.TABLE_NAME, c, scheduledExecutorService, j, timeUnit, i);
    }

    public final List getEvents(long j, long j2, int i, int i2, int i3, int i4) {
        String str;
        jie jie;
        Cursor a;
        Throwable th;
        boolean z;
        if (isNopLogger()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"event_time_ms", "network_type", "tag", "device_state", NetworkActivityContract.NetworkActivityColumns.IS_NETWORK_ACTIVE};
        String[] strArr2 = {String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(j), String.valueOf(j2)};
        if (i4 >= 0) {
            str = String.valueOf(i4);
        } else {
            str = null;
        }
        try {
            a = this.b.a(NetworkActivityContract.NetworkActivityColumns.TABLE_NAME, strArr, "network_type = ? AND tag = ? AND device_state = ? AND event_time_ms BETWEEN ? AND ?", strArr2, "event_time_ms ASC", str);
            if (a != null) {
                int columnIndexOrThrow = a.getColumnIndexOrThrow("event_time_ms");
                int columnIndexOrThrow2 = a.getColumnIndexOrThrow("network_type");
                int columnIndexOrThrow3 = a.getColumnIndexOrThrow("tag");
                int columnIndexOrThrow4 = a.getColumnIndexOrThrow("device_state");
                int columnIndexOrThrow5 = a.getColumnIndexOrThrow(NetworkActivityContract.NetworkActivityColumns.IS_NETWORK_ACTIVE);
                while (a.moveToNext()) {
                    long j3 = a.getLong(columnIndexOrThrow);
                    int i5 = a.getInt(columnIndexOrThrow2);
                    int i6 = a.getInt(columnIndexOrThrow3);
                    int i7 = a.getInt(columnIndexOrThrow4);
                    if (a.getInt(columnIndexOrThrow5) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new NetworkActivityEvent(j3, i5, i6, i7, z));
                }
            }
            if (a != null) {
                a.close();
            }
            jie = this.b;
        } catch (IllegalArgumentException e) {
            try {
                Log.e("tag", "Unable to query radio logs: ", e);
                jie = this.b;
            } catch (Throwable th2) {
                this.b.a();
                throw th2;
            }
        } catch (Throwable th3) {
            apev.a(th, th3);
        }
        jie.a();
        return arrayList;
        throw th;
    }
}
