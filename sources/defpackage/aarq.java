package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aarq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aarq {
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final PackageManager c;

    public aarq(Context context) {
        this.a = PreferenceManager.getDefaultSharedPreferences(context);
        this.b = context.getSharedPreferences("com.google.android.gms.safetynet", 0);
        this.c = context.getPackageManager();
    }

    public static void a(SharedPreferences sharedPreferences, String str, long j) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("snet_safe_browsing_last_update_time_ms_");
        sb.append(i);
        return sb.toString();
    }

    public final long c() {
        return this.a.getLong("snet_safe_browsing_next_allowed_time_to_update_ms", 0);
    }

    public final Set d() {
        return new HashSet(this.a.getStringSet("snet_upload_requested_apks", Collections.emptySet()));
    }

    protected static final void a(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public final long b() {
        return this.a.getLong("snet_safe_browsing_last_update_time_ms", 0);
    }

    public final void c(int i) {
        a("snet_safe_browsing_num_consecutive_update_errors", i);
    }

    public final long a(int i) {
        return this.a.getLong(b(i), 0);
    }

    public final String a() {
        return this.a.getString("snet_saved_package_url", "");
    }

    public final void a(long j) {
        a("snet_safe_browsing_next_allowed_time_to_update_ms", j);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    public final void a(String str, long j) {
        a(this.a, str, j);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2) {
        a(this.a, str, str2);
    }

    public final void a(String str, Set set) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putStringSet(str, set);
        edit.commit();
    }
}
