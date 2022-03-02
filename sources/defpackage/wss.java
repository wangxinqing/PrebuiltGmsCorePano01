package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: wss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wss {
    private static wss b;
    public final SharedPreferences a;

    protected wss() {
        this((SharedPreferences) null);
    }

    public static final String a(String str, String str2) {
        return String.format("last_sanity_check_%s_%s", new Object[]{ycm.b(str2), ycm.b(str)});
    }

    public static String a(boolean z) {
        return !z ? "last_default_account_avatar_update_time" : "last_default_page_avatar_update_time";
    }

    public static final String d(String str, String str2) {
        String valueOf = String.valueOf(str2);
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    public final int b(String str, String str2) {
        return this.a.getInt(a("sync_status_code_", str, str2), 0);
    }

    public final int c() {
        return this.a.getInt("show_sync_error_notification", 0);
    }

    public final int e(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("sync_backoff_sec_") : "sync_backoff_sec_".concat(valueOf), 0);
    }

    public final int f(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("sync_failures_") : "sync_failures_".concat(valueOf), 0);
    }

    public final int g(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_sync_failures_") : "focus_sync_failures_".concat(valueOf), 0);
    }

    public final void h(String str) {
        iva.b((String) null);
        iva.c(str);
        String valueOf = String.valueOf(str);
        String lowerCase = (valueOf.length() == 0 ? new String("_") : "_".concat(valueOf)).toLowerCase();
        SharedPreferences.Editor edit = this.a.edit();
        for (String next : this.a.getAll().keySet()) {
            if (next.toLowerCase().endsWith(lowerCase)) {
                edit.remove(next);
            } else if (ayrw.b()) {
                String valueOf2 = String.valueOf(lowerCase);
                String valueOf3 = String.valueOf(ampw.a("_com.android.contacts"));
                if (ampw.a(next).endsWith(valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3))) {
                    edit.remove(next);
                }
            }
        }
        edit.commit();
    }

    public final void i(String str) {
        iva.b((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.remove(valueOf.length() == 0 ? new String("focus_first_full_sync_start_timestamp_") : "focus_first_full_sync_start_timestamp_".concat(valueOf)).commit();
    }

    public final void j(String str) {
        iva.b((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.remove(valueOf.length() == 0 ? new String("focus_first_full_sync_finish_timestamp_") : "focus_first_full_sync_finish_timestamp_".concat(valueOf)).commit();
    }

    public final int k(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_first_full_sync_failed_times_") : "focus_first_full_sync_failed_times_".concat(valueOf), 0);
    }

    public final boolean l(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("focus_progress_notification_dismissed_") : "focus_progress_notification_dismissed_".concat(valueOf), false);
    }

    public final void m(String str) {
        iva.a((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("focus_progress_notification_dismissed_") : "focus_progress_notification_dismissed_".concat(valueOf), true).apply();
    }

    public final boolean n(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("focus_seen_device_contacts_before_") : "focus_seen_device_contacts_before_".concat(valueOf), false);
    }

    public final int o(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        int a2 = xjv.a(sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_first_full_sync_status_") : "focus_first_full_sync_status_".concat(valueOf), 0));
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    public wss(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final int c(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getInt(valueOf.length() == 0 ? new String("focus_total_cancel_count_since_page_size_change_or_success_") : "focus_total_cancel_count_since_page_size_change_or_success_".concat(valueOf), 0);
    }

    public final void d(String str) {
        iva.b((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_total_cancel_count_since_page_size_change_or_success_") : "focus_total_cancel_count_since_page_size_change_or_success_".concat(valueOf), 0).commit();
    }

    public final void e(String str, int i) {
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_last_device_contact_and_group_migrate_status_") : "focus_last_device_contact_and_group_migrate_status_".concat(valueOf), i - 1).apply();
    }

    private static final String a(String str, String str2, String str3) {
        String d = d(str, str2);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + String.valueOf(str3).length());
        sb.append(d);
        sb.append("_");
        sb.append(str3);
        return sb.toString();
    }

    public final long b() {
        return this.a.getLong("avatar_fetch_delay_until_sec", 0);
    }

    public final String c(String str, String str2) {
        return this.a.getString(a("sync_status_message_", str, str2), "");
    }

    public final long b(boolean z) {
        return this.a.getLong(a(z), 0);
    }

    public final void d(String str, int i) {
        iva.b((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_first_full_sync_status_") : "focus_first_full_sync_status_".concat(valueOf), i - 1).commit();
    }

    public static synchronized wss a(Context context) {
        wss wss;
        synchronized (wss.class) {
            if (b == null) {
                b = new wss(context.getSharedPreferences("gms.people", 0));
            }
            wss = b;
        }
        return wss;
    }

    public final void b(long j) {
        this.a.edit().putLong("focus_sync_permission_denied_notify_time", j).commit();
    }

    public final void c(String str, int i) {
        iva.b((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_sync_backoff_sec_") : "focus_sync_backoff_sec_".concat(valueOf), i).commit();
    }

    public final void a() {
        iva.b((String) null);
        this.a.edit().putBoolean("is_first_sync", false).commit();
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("focus_continuous_cancel_count_since_page_size_change_") : "focus_continuous_cancel_count_since_page_size_change_".concat(valueOf), 0).commit();
    }

    public final void a(int i) {
        iva.b((String) null);
        this.a.edit().putInt("avatar_fetch_backoff_sec", i).commit();
    }

    public final void b(String str, int i) {
        iva.b((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("sync_failures_") : "sync_failures_".concat(valueOf), i).commit();
    }

    public final void c(boolean z) {
        iva.b((String) null);
        this.a.edit().putBoolean("force_verbose_log", z).commit();
    }

    public final void a(long j) {
        iva.b((String) null);
        this.a.edit().putLong("avatar_fetch_delay_until_sec", j).commit();
    }

    public final void b(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, long j2) {
        iva.b((String) null);
        this.a.edit().putBoolean("backup_and_sync_opt_in_validator_enabled", z).putLong("backup_and_sync_opt_in_validator_periodic_interval_seconds", j).putBoolean("backup_and_sync_opt_in_validator_requires_charging", z2).putBoolean("backup_and_sync_opt_in_validator_requires_device_idle", z3).putBoolean("backup_and_sync_opt_in_validator_persisted", z4).putBoolean("backup_and_sync_opt_in_validator_use_flex", z5).putLong("backup_and_sync_opt_in_validator_flex_seconds", j2).commit();
    }

    public final void a(String str, int i) {
        iva.b((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putInt(valueOf.length() == 0 ? new String("sync_backoff_sec_") : "sync_backoff_sec_".concat(valueOf), i).commit();
    }

    public final void a(String str, long j) {
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putLong(valueOf.length() == 0 ? new String("focus_first_full_sync_failure_notification_last_show_timestamp_") : "focus_first_full_sync_failure_notification_last_show_timestamp_".concat(valueOf), j).apply();
    }

    public final void a(String str, String str2, int i, String str3) {
        this.a.edit().putInt(a("sync_status_code_", str, str2), i).putString(a("sync_status_message_", str, str2), str3).apply();
    }

    public final void a(String str, boolean z) {
        iva.b((String) null);
        SharedPreferences.Editor edit = this.a.edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("focus_sync_write_cp2_per_each_contact_") : "focus_sync_write_cp2_per_each_contact_".concat(valueOf), z).commit();
    }

    public final void a(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, long j2) {
        iva.b((String) null);
        this.a.edit().putBoolean("deleted_null_contacts_cleanup_enabled", z).putLong("deleted_null_contacts_cleanup_periodic_interval_seconds", j).putBoolean("deleted_null_contacts_cleanup_requires_charging", z2).putBoolean("deleted_null_contacts_cleanup_requires_device_idle", z3).putBoolean("deleted_null_contacts_cleanup_persisted", z4).putBoolean("deleted_null_contacts_cleanup_use_flex", z5).putLong("deleted_null_contacts_cleanup_flex_seconds", j2).commit();
    }

    public final boolean a(String str) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf(str);
        return sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("focus_conditionally_reduce_page_size_enabled_") : "focus_conditionally_reduce_page_size_enabled_".concat(valueOf), false);
    }
}
