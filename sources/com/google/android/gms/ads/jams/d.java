package com.google.android.gms.ads.jams;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class d {
    public final SharedPreferences a;
    public final Context b;

    public final SharedPreferences a(String str) {
        Context context = this.b;
        String valueOf = String.valueOf(str);
        return context.getSharedPreferences(valueOf.length() == 0 ? new String("jams.prefs.") : "jams.prefs.".concat(valueOf), 0);
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return a().size();
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.a.getBoolean("negotiation_enabled", false);
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.a.getBoolean("non_default_account_enabled", false);
    }

    /* access modifiers changed from: package-private */
    public final long e() {
        return this.a.getLong("retry_count", 0);
    }

    public d(Context context) {
        this.a = context.getSharedPreferences("jams.prefs.default", 0);
        this.b = context;
    }

    /* access modifiers changed from: package-private */
    public final Set a() {
        return this.a.getStringSet("all_account_names", new HashSet());
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        this.a.edit().putLong("retry_count", j).apply();
    }
}
