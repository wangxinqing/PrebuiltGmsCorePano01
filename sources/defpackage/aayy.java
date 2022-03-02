package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aayy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayy {
    public final SharedPreferences a;

    public aayy(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.snet", 0);
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.a.getLong("snet_event_log_last_timestamp", -1);
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        return this.a.getLong("snet_last_idle_run_timestamp", -1);
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        azft.c();
        return this.a.getBoolean("is_blocked_bal_collection_enabled_for_device", false);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        a("snet_event_log_last_timestamp", j);
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        a("snet_last_idle_run_timestamp", j);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("snet_jpeg_filename", str);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        a("snet_jpeg_previously_tampered", z);
    }

    public final void a(String str, long j) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    public final void a(String str, boolean z) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        a("snet_jpeg_written_to_sdcard", z);
    }
}
