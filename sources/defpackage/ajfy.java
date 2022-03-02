package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.quake.ealert.LocationListenerOld$1;

/* renamed from: ajfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajfy extends ajgc {
    public static final /* synthetic */ int d = 0;
    public final ajgg a;
    public Location b;
    public ajge c;
    private final Context e;
    private final rom f;
    private PendingIntent h;
    private PendingIntent i;
    private BroadcastReceiver j;
    private ajgw k;

    static {
        jjg.a("EAlert");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfy(ajgd ajgd, Context context) {
        super(ajgd);
        rom rom = new rom(context);
        ajgg ajgg = new ajgg(ayab.h(), ayab.b());
        this.e = context;
        this.f = rom;
        this.a = ajgg;
    }

    private final PendingIntent a(String str) {
        return PendingIntent.getBroadcast(this.e, 0, new Intent(str), 134217728);
    }

    public final int a() {
        ajge ajge = this.c;
        if (ajge != null) {
            return !ajge.b ? 1 : 3;
        }
        return 2;
    }

    public final void b() {
        this.k = new ajgw(ayab.j());
        this.j = new LocationListenerOld$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.quake.ealert.ACTION_PERIODIC");
        intentFilter.addAction("com.google.android.gms.location.quake.ealert.ACTION_ONESHOT");
        this.e.registerReceiver(this.j, intentFilter);
        this.f.a();
        a(this.f.c());
        if (this.b == null) {
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.c(100);
            locationRequest.c(0);
            locationRequest.b(0);
            locationRequest.b(1);
            locationRequest.d(0);
            locationRequest.a(ayab.j());
            LocationRequestInternal a2 = LocationRequestInternal.a("ealert", locationRequest);
            a2.h = "com.google.android.gms.location";
            a2.a();
            PendingIntent a3 = a("com.google.android.gms.location.quake.ealert.ACTION_ONESHOT");
            this.i = a3;
            this.f.a(a2, a3);
        }
        LocationRequest locationRequest2 = new LocationRequest();
        locationRequest2.c(102);
        locationRequest2.c(ayab.j());
        locationRequest2.b(ayab.i());
        LocationRequestInternal a4 = LocationRequestInternal.a("ealert", locationRequest2);
        a4.h = "com.google.android.gms.location";
        a4.a();
        PendingIntent a5 = a("com.google.android.gms.location.quake.ealert.ACTION_PERIODIC");
        this.h = a5;
        this.f.a(a4, a5);
    }

    public final void c() {
        PendingIntent pendingIntent = this.h;
        if (pendingIntent != null) {
            this.f.a(pendingIntent);
        }
        PendingIntent pendingIntent2 = this.i;
        if (pendingIntent2 != null) {
            this.f.a(pendingIntent2);
        }
        this.f.b();
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            this.e.unregisterReceiver(broadcastReceiver);
        }
    }

    public final Location d() {
        return this.b;
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.b = location;
            this.k.a(new ajfx(this));
        }
    }
}
