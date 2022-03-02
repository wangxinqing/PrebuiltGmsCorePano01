package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.location.quake.LocationDataListenerOld$1;
import java.util.concurrent.TimeUnit;

/* renamed from: ajde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajde extends ajfq {
    public static final /* synthetic */ int a = 0;
    private static final long b = TimeUnit.MINUTES.toMillis(1);
    private final Context c;
    private final rom d;
    private final ajgg e;
    private PendingIntent f;
    private PendingIntent h;
    private BroadcastReceiver i;
    private Location j;
    private Location k;
    private Location l;
    private Long m;
    private ajge n = ajge.a;
    private boolean o = true;
    private Location p;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajde(Context context, ajgd ajgd) {
        super(ajgd);
        this.c = context;
        this.d = new rom(context);
        this.e = new ajgg(ayek.k(), ayek.j());
    }

    private final PendingIntent a(String str) {
        return PendingIntent.getBroadcast(this.c, 0, new Intent(str), 134217728);
    }

    public final void b() {
        this.i = new LocationDataListenerOld$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.quake.ACTION_ONESHOT");
        intentFilter.addAction("com.google.android.gms.location.quake.ACTION_PASSIVE");
        this.c.registerReceiver(this.i, intentFilter);
        this.d.a();
        a(this.d.c());
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.c(105);
        locationRequest.c(ayek.u());
        locationRequest.b(ayek.t());
        a(locationRequest, "com.google.android.gms.location.quake.ACTION_PASSIVE");
        LocationRequest locationRequest2 = new LocationRequest();
        locationRequest2.c(100);
        locationRequest2.c(0);
        locationRequest2.b(0);
        locationRequest2.b(1);
        locationRequest2.d(0);
        locationRequest2.a(b);
        a(locationRequest2, "com.google.android.gms.location.quake.ACTION_ONESHOT");
    }

    public final void c() {
        PendingIntent pendingIntent = this.f;
        if (pendingIntent != null) {
            this.d.a(pendingIntent);
        }
        PendingIntent pendingIntent2 = this.h;
        if (pendingIntent2 != null) {
            this.d.a(pendingIntent2);
        }
        this.d.b();
        BroadcastReceiver broadcastReceiver = this.i;
        if (broadcastReceiver != null) {
            this.c.unregisterReceiver(broadcastReceiver);
        }
    }

    public final Location d() {
        return this.j;
    }

    public final Location e() {
        return this.k;
    }

    public final Location f() {
        return this.l;
    }

    public final Long g() {
        return this.m;
    }

    public final ajge h() {
        Location location = this.p;
        Location location2 = this.j;
        if (location == location2) {
            return this.n;
        }
        if (location2 != null) {
            this.n = this.e.a(location2, ayek.s());
            this.p = this.j;
        } else {
            this.n = ajge.a;
        }
        ajge ajge = this.n;
        int i2 = ajge.c;
        Long.toHexString(ajge.d);
        ajge ajge2 = this.n;
        boolean z = ajge2.b;
        return ajge2;
    }

    public final boolean i() {
        return h().b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.google.android.gms.location.LocationRequest r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "qaccelmonitor"
            com.google.android.gms.location.internal.LocationRequestInternal r4 = com.google.android.gms.location.internal.LocationRequestInternal.a(r0, r4)
            java.lang.String r0 = "com.google.android.gms.location"
            r4.h = r0
            r4.a()
            int r0 = r5.hashCode()
            r1 = 996145535(0x3b5ff97f, float:0.003417581)
            r2 = 1
            if (r0 == r1) goto L_0x0027
            r1 = 1524400710(0x5adc8246, float:3.1033866E16)
            if (r0 == r1) goto L_0x001d
            goto L_0x0031
        L_0x001d:
            java.lang.String r0 = "com.google.android.gms.location.quake.ACTION_PASSIVE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0027:
            java.lang.String r0 = "com.google.android.gms.location.quake.ACTION_ONESHOT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0031
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = -1
        L_0x0032:
            if (r0 == 0) goto L_0x003e
            if (r0 == r2) goto L_0x0037
            return
        L_0x0037:
            android.app.PendingIntent r5 = r3.a((java.lang.String) r5)
            r3.f = r5
            goto L_0x0044
        L_0x003e:
            android.app.PendingIntent r5 = r3.a((java.lang.String) r5)
            r3.h = r5
        L_0x0044:
            rom r0 = r3.d
            r0.a((com.google.android.gms.location.internal.LocationRequestInternal) r4, (android.app.PendingIntent) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajde.a(com.google.android.gms.location.LocationRequest, java.lang.String):void");
    }

    public final int a() {
        if (this.j != null) {
            return h().b ? 3 : 1;
        }
        return 2;
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.j = location;
            if (rev.i(location) == 1) {
                if (ayek.h()) {
                    this.m = Long.valueOf(location.getTime() - System.currentTimeMillis());
                }
                this.k = location;
            } else {
                this.l = location;
            }
            if (this.o) {
                this.g.a();
                this.o = false;
            }
        }
    }
}
