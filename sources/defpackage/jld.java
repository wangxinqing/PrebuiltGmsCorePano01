package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: jld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jld {
    public volatile jlc a;
    private final Context b;
    private final ContentObserver c;

    public jld(Context context, Looper looper) {
        this.b = context;
        this.c = new jlb(this, "location", "SettingsListener", new qvr(looper));
    }

    public final void a() {
        this.b.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("location_providers_allowed"), true, this.c);
        c();
    }

    public final void b() {
        this.b.getContentResolver().unregisterContentObserver(this.c);
    }

    public final void c() {
        jlc jlc = this.a;
        if (jlc != null) {
            boolean isLocationProviderEnabled = Settings.Secure.isLocationProviderEnabled(this.b.getContentResolver(), "gps");
            boolean z = true;
            if (!Settings.Secure.isLocationProviderEnabled(this.b.getContentResolver(), "network") || aeed.a(this.b.getContentResolver(), "network_location_opt_in", -1) != 1) {
                z = false;
            }
            jlc.a(isLocationProviderEnabled, z);
        }
    }
}
