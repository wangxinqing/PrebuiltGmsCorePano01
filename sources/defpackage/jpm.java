package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: jpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jpm {
    public final SharedPreferences a;

    public jpm(Context context) {
        this.a = new jpo(context).a;
    }

    public final long a(long j) {
        return this.a.getLong("clear_interactions_service_last_run_timestamp", j);
    }

    public final void a(boolean z, long j, boolean z2, long j2, boolean z3, boolean z4, boolean z5) {
        this.a.edit().putBoolean("clear_interactions_service_enabled", z).putLong("clear_interactions_service_period_seconds", j).putBoolean("clear_interactions_service_use_flex", z2).putLong("clear_interactions_service_flex_seconds", j2).putBoolean("clear_interactions_service_requires_charging", z3).putBoolean("clear_interactions_service_requires_device_idle", z4).putBoolean("clear_interactions_service_persist_task", z5).apply();
    }
}
