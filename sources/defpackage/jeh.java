package defpackage;

import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: jeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jeh implements RadiosTracingLoggerProvider.Logger {
    protected final String a;
    protected final jie b;

    public jeh() {
        this.a = null;
        this.b = null;
    }

    public final int deleteEntries(String str, long j, long j2) {
        if (isNopLogger()) {
            return 0;
        }
        return this.b.a(this.a, String.valueOf(str).concat(" BETWEEN ? AND ?"), new String[]{String.valueOf(j), String.valueOf(j2)});
    }

    public final boolean isNopLogger() {
        return this.b == null;
    }

    public final void logAsync(Object obj) {
        if (!isNopLogger()) {
            this.b.a(obj);
        }
    }

    public jeh(SQLiteOpenHelper sQLiteOpenHelper, String str, jic jic, ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        String str2 = str;
        this.a = str2;
        this.b = new jie(sQLiteOpenHelper, str2, jic, scheduledExecutorService, j, timeUnit, i);
    }
}
