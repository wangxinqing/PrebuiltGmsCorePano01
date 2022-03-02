package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.location.quake.LocationDataListener$1;
import java.util.concurrent.TimeUnit;

/* renamed from: ajdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajdd extends ajfq {
    public static final /* synthetic */ int a = 0;
    private static final long b = TimeUnit.MINUTES.toMillis(1);
    private final Context c;
    private final ajgg d;
    private PendingIntent e;
    private PendingIntent f;
    private BroadcastReceiver h;
    private Location i;
    private Location j;
    private Location k;
    private Long l;
    private ajge m = ajge.a;
    private boolean n = true;
    private Location o;
    private final iby p;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajdd(Context context, ajgd ajgd) {
        super(ajgd);
        this.c = context;
        this.p = ren.c(context);
        this.d = new ajgg(ayek.k(), ayek.j());
    }

    private final PendingIntent a(String str) {
        return PendingIntent.getBroadcast(this.c, 0, new Intent(str), 134217728);
    }

    public final void b() {
        this.h = new LocationDataListener$1(this, "location");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.quake.ACTION_ONESHOT");
        intentFilter.addAction("com.google.android.gms.location.quake.ACTION_PASSIVE");
        this.c.registerReceiver(this.h, intentFilter);
        this.p.f().a((acvv) new ajdc(this));
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
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            this.p.c(pendingIntent);
        }
        PendingIntent pendingIntent2 = this.f;
        if (pendingIntent2 != null) {
            this.p.c(pendingIntent2);
        }
        BroadcastReceiver broadcastReceiver = this.h;
        if (broadcastReceiver != null) {
            this.c.unregisterReceiver(broadcastReceiver);
        }
    }

    public final Location d() {
        return this.i;
    }

    public final Location e() {
        return this.j;
    }

    public final Location f() {
        return this.k;
    }

    public final Long g() {
        return this.l;
    }

    public final ajge h() {
        Location location = this.o;
        Location location2 = this.i;
        if (location == location2) {
            return this.m;
        }
        if (location2 != null) {
            this.m = this.d.a(location2, ayek.s());
            this.o = this.i;
        } else {
            this.m = ajge.a;
        }
        ajge ajge = this.m;
        int i2 = ajge.c;
        Long.toHexString(ajge.d);
        ajge ajge2 = this.m;
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
            r3.e = r5
            goto L_0x0044
        L_0x003e:
            android.app.PendingIntent r5 = r3.a((java.lang.String) r5)
            r3.f = r5
        L_0x0044:
            iby r0 = r3.p
            r0.a((com.google.android.gms.location.internal.LocationRequestInternal) r4, (android.app.PendingIntent) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdd.a(com.google.android.gms.location.LocationRequest, java.lang.String):void");
    }

    public final int a() {
        if (this.i != null) {
            return h().b ? 3 : 1;
        }
        return 2;
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.i = location;
            if (rev.i(location) == 1) {
                if (ayek.h()) {
                    this.l = Long.valueOf(location.getTime() - System.currentTimeMillis());
                }
                this.j = location;
            } else {
                this.k = location;
            }
            if (this.n) {
                this.g.a();
                this.n = false;
            }
        }
    }
}
