package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: hwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hwp {
    public final Context a;

    public hwp(Context context) {
        this.a = context;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("timing_control_pref", 0);
        long max = Math.max(sharedPreferences.getLong("server_suggested_interval_millis", 0), awtr.a.a().r());
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long currentTimeMillis = System.currentTimeMillis();
        edit.putLong("last_record_wall_time_millis", currentTimeMillis);
        edit.putLong("next_upload_time_millis", currentTimeMillis + max);
        edit.apply();
    }

    public final long b() {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("timing_control_pref", 0);
        if (currentTimeMillis >= sharedPreferences.getLong("last_record_wall_time_millis", 0)) {
            return Math.max(sharedPreferences.getLong("next_upload_time_millis", 0) - currentTimeMillis, 0);
        }
        return 0;
    }
}
