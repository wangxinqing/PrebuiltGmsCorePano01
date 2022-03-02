package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.location.LocationManager;

/* renamed from: aink  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aink {
    public final Context a;
    public final ContentObserver b;
    private final LocationManager c;

    public aink(Context context, ContentObserver contentObserver) {
        this.a = context;
        this.b = contentObserver;
        this.c = (LocationManager) context.getSystemService("location");
    }

    public final boolean a() {
        try {
            return this.c.isProviderEnabled("network") && aeed.a(this.a.getContentResolver(), "network_location_opt_in", -1) == 1;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final boolean b() {
        try {
            return this.c.isProviderEnabled("gps");
        } catch (NullPointerException e) {
            return false;
        }
    }
}
