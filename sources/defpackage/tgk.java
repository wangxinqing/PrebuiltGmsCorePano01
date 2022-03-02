package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;

/* renamed from: tgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgk {
    long a;
    long b;
    private final SharedPreferences c;

    public tgk(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        SharedPreferences sharedPreferences = context.getSharedPreferences("salter_pref", 0);
        this.c = sharedPreferences;
        this.a = sharedPreferences.getLong("salt_elapsed_realtime_millis", elapsedRealtime);
        this.b = this.c.getLong("salt_last_used_time_millis", elapsedRealtime);
        if (this.c.contains("salt_elapsed_realtime_millis") && this.c.contains("salt_last_used_time_millis")) {
            if (!aynf.a.a().f()) {
                return;
            }
            if (elapsedRealtime >= this.a && elapsedRealtime >= this.b) {
                return;
            }
        }
        a(elapsedRealtime);
    }

    private final void a(long j) {
        this.a = j;
        this.c.edit().putLong("salt_elapsed_realtime_millis", this.a).apply();
        b(j);
    }

    private final void b(long j) {
        this.b = j;
        this.c.edit().putLong("salt_last_used_time_millis", this.b).apply();
    }

    public final long a(String str) {
        if (str == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.b > aynf.a.a().k() || elapsedRealtime - this.a > aynf.a.a().m()) {
            a(elapsedRealtime);
        } else if (elapsedRealtime - this.b > aynf.a.a().l()) {
            b(elapsedRealtime);
        }
        anlj a2 = anln.b().a();
        a2.a((CharSequence) str);
        a2.a(this.a);
        return a2.a().d();
    }
}
