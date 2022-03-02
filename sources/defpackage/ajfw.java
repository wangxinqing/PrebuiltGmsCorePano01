package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.quake.ealert.LocationListener$1;

/* renamed from: ajfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajfw extends ajgc {
    public static final /* synthetic */ int f = 0;
    public final ajgg a;
    public PendingIntent b;
    public Location c;
    public ajge d;
    public final iby e;
    private final Context h;
    private PendingIntent i;
    private BroadcastReceiver j;
    private ajgw k;

    static {
        jjg.a("EAlert");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfw(ajgd ajgd, Context context) {
        super(ajgd);
        iby c2 = ren.c(context);
        ajgg ajgg = new ajgg(ayab.h(), ayab.b());
        this.h = context;
        this.e = c2;
        this.a = ajgg;
    }

    public final int a() {
        ajge ajge = this.d;
        if (ajge != null) {
            return !ajge.b ? 1 : 3;
        }
        return 2;
    }

    public final void b() {
        this.k = new ajgw(ayab.j());
        this.j = new LocationListener$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.quake.ealert.ACTION_PERIODIC");
        intentFilter.addAction("com.google.android.gms.location.quake.ealert.ACTION_ONESHOT");
        this.h.registerReceiver(this.j, intentFilter);
        this.e.f().a((acvv) new ajfu(this));
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.c(102);
        locationRequest.c(ayab.j());
        locationRequest.b(ayab.i());
        LocationRequestInternal a2 = LocationRequestInternal.a("ealert", locationRequest);
        a2.h = "com.google.android.gms.location";
        a2.a();
        PendingIntent a3 = a("com.google.android.gms.location.quake.ealert.ACTION_PERIODIC");
        this.i = a3;
        this.e.a(a2, a3);
    }

    public final void c() {
        PendingIntent pendingIntent = this.i;
        if (pendingIntent != null) {
            this.e.c(pendingIntent);
        }
        PendingIntent pendingIntent2 = this.b;
        if (pendingIntent2 != null) {
            this.e.c(pendingIntent2);
        }
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            this.h.unregisterReceiver(broadcastReceiver);
        }
    }

    public final Location d() {
        return this.c;
    }

    public final PendingIntent a(String str) {
        return PendingIntent.getBroadcast(this.h, 0, new Intent(str), 134217728);
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.c = location;
            this.k.a(new ajfv(this));
        }
    }
}
