package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.geofencer.service.LocationDetector$Receiver;
import com.google.android.location.internal.PendingIntentCallbackChimeraService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ainj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ainj {
    public volatile boolean a = false;
    public final aing b;
    public final Object c = new Object();
    final PendingIntent d;
    final LocationDetector$Receiver e = new LocationDetector$Receiver(this);
    public int f = -1;
    public Collection g = null;
    long h = -1;
    public boolean i = false;
    public final aikk j;
    private final Context k;
    private final jbs l;
    private final rom m;
    private final int n;
    private final String o;
    private PendingIntent p;

    public ainj(Context context, aing aing, rom rom, aikk aikk) {
        this.k = context;
        this.b = aing;
        this.l = new jbs(context);
        this.m = rom;
        rom.a();
        this.j = aikk;
        Intent a2 = PendingIntentCallbackChimeraService.a(this.k);
        a2.setPackage(this.k.getPackageName());
        a2.setAction("com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT");
        this.d = PendingIntent.getService(this.k, 0, a2, 134217728);
        alv.a(context).a(this.e, new IntentFilter(asvl.a("com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT")));
        this.k.getApplicationContext().registerReceiver(this.e, new IntentFilter("com.google.android.location.intent.action.END_LOCATION_BURST"));
        this.n = context.getApplicationInfo().uid;
        this.o = context.getPackageName();
    }

    public final void a() {
        synchronized (this.c) {
            this.f = -1;
            if (this.i) {
                a(true);
            }
            this.m.a(this.d);
            aiko.a.b(-693738864, this.f);
        }
    }

    public final void a(int i2, boolean z, Collection collection, boolean z2) {
        Collection collection2;
        int i3;
        Collection collection3;
        int i4 = i2;
        StringBuilder sb = new StringBuilder(56);
        sb.append("Location update interval should be positive: ");
        sb.append(i4);
        irk.a(true, (Object) sb.toString());
        if (collection == null) {
            boolean z3 = aikq.a;
            collection2 = Collections.singletonList(new ClientIdentity(this.n, this.o));
        } else {
            collection2 = collection;
        }
        synchronized (this.c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int throttledGeofenceLocationIntervalSeconds = (int) axxg.a.a().throttledGeofenceLocationIntervalSeconds();
            if (!z2 && axxg.b() && i4 < throttledGeofenceLocationIntervalSeconds) {
                i4 = throttledGeofenceLocationIntervalSeconds;
            } else if (i4 < 60) {
                long j2 = this.h;
                if (j2 >= 0) {
                    if (elapsedRealtime - j2 < 1140000) {
                        if (!this.i) {
                            boolean z4 = aikq.a;
                            i4 = 60;
                        }
                    }
                }
                i4 = Math.max(30, i4);
            }
            if (z || (i3 = this.f) == -1 || Math.abs(i4 - i3) > 4 || (collection3 = this.g) == null || collection3.size() != collection2.size() || !this.g.containsAll(collection2)) {
                this.f = i4;
                if (i4 < 60 && !this.i) {
                    boolean z5 = aikq.a;
                    irk.a(this.p == null);
                    irk.a(!this.i);
                    this.i = true;
                    this.h = elapsedRealtime;
                    Intent intent = new Intent("com.google.android.location.intent.action.END_LOCATION_BURST");
                    intent.setPackage(this.k.getPackageName());
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.k, 0, intent, 134217728);
                    this.p = broadcast;
                    this.l.a("LocationDetector", 2, elapsedRealtime + 180000, broadcast, "com.google.android.gms");
                } else if (i4 >= 60 && this.i) {
                    a(true);
                }
                this.g = collection2;
                int i5 = this.f;
                LocationRequest a2 = LocationRequest.a();
                a2.c(((long) i5) * 1000);
                a2.b(ayca.a.a().geofencerFastestLocationIntervalMillis());
                a2.c(102);
                LocationRequestInternal a3 = LocationRequestInternal.a("geofencing", a2);
                a3.a((List) new ArrayList(collection2));
                a3.h = "com.google.android.gms.location.geofencing";
                a3.a();
                a3.b();
                this.m.a(a3, this.d);
                aikk aikk = this.j;
                if (aikk != null) {
                    aikk.a();
                    aucd aucd = aikk.n;
                    int i6 = ((aoak) aucd.b).b + 1;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aoak aoak = (aoak) aucd.b;
                    aoak aoak2 = aoak.h;
                    aoak.a = 1 | aoak.a;
                    aoak.b = i6;
                }
                aiko.a.b(-2123990287, this.f);
            } else {
                boolean z6 = aikq.a;
            }
        }
    }

    public final void a(boolean z) {
        boolean z2;
        if (this.p != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        irk.a(z2);
        irk.a(this.i);
        boolean z3 = aikq.a;
        this.i = false;
        if (z) {
            this.l.a(this.p);
        }
        this.p = null;
    }
}
