package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;

/* renamed from: tzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzu implements tzs {
    long a;
    private final SharedPreferences b;

    public tzu(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("fast_pair_bloom_filter_pref", 0);
        this.b = sharedPreferences;
        this.a = sharedPreferences.getLong("next_check_millis", SystemClock.elapsedRealtime());
        long a2 = a();
        if (this.a > a2) {
            this.a = a2;
            this.b.edit().putLong("next_check_millis", this.a).apply();
        }
    }

    private static final long a() {
        return SystemClock.elapsedRealtime() + aymt.j();
    }

    public final synchronized void b(String str) {
        this.a = a();
        this.b.edit().putLong("next_check_millis", this.a).apply();
    }

    public final synchronized boolean a(String str) {
        return SystemClock.elapsedRealtime() > this.a;
    }
}
