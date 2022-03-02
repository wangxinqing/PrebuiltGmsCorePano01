package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.places.signals.SignalManager$GeofenceBroadcastReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: akyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akyn {
    public static final int[] a = {3, 2, 1, 0};
    public static final List b = Collections.emptyList();
    private final long A;
    private final long B;
    public final Context c;
    public final Handler d;
    public final List e;
    public final akxy f;
    public final rom g;
    public final akxz h;
    public final akxr i;
    public final PendingIntent j;
    public final icc k;
    public final BroadcastReceiver l;
    public final roo m;
    public final List n;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = -1;
    public boolean t;
    public long u;
    public long v;
    final reh w = new akyi(this);
    public final rgb x;
    public final akyj y = new akyj(this);
    private final long z;

    public akyn(Context context, Handler handler) {
        Handler handler2;
        rom rom = new rom(context);
        akxy a2 = akxy.a(context, handler);
        akxz akxz = new akxz((WifiManager) context.getSystemService("wifi"));
        ibz ibz = new ibz(context);
        ibz.a(rcd.a);
        akxr akxr = new akxr(context, ibz.b(), rcd.b);
        ibz ibz2 = new ibz(context);
        ibz2.a(ren.a);
        icc b2 = ibz2.b();
        rgb rgb = ren.b;
        this.c = context;
        this.d = handler;
        this.g = rom;
        this.f = a2;
        this.h = akxz;
        this.i = akxr;
        this.x = rgb;
        this.k = b2;
        this.e = new ArrayList();
        this.n = new ArrayList();
        azcf.a.a().L();
        this.z = azcf.a.a().x();
        this.A = azcf.a.a().A();
        this.B = azcf.a.a().z();
        rom rom2 = this.g;
        roo roo = null;
        if (!(rom2 == null || (handler2 = this.d) == null)) {
            roo = new roo(rom2, this.w, handler2.getLooper());
        }
        this.m = roo;
        this.l = new SignalManager$GeofenceBroadcastReceiver(this);
        this.j = PendingIntent.getBroadcast(context, 0, jhg.g("com.google.android.places.action.SIGNAL_MANAGER_GEOFENCE_RESULT"), 134217728);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, jhg.g("com.google.android.location.places.action.SIGNAL_MANAGER_GEOFENCE_RESULT"), 134217728);
        this.k.e();
        njy njy = new njy((Class) getClass(), 14, "SignalManager", "places");
        icc icc = this.k;
        icc.a((ica) new akya(this, icc, njy, broadcast));
        this.c.registerReceiver(this.l, new IntentFilter("com.google.android.places.action.SIGNAL_MANAGER_GEOFENCE_RESULT"), "com.google.android.gms.permission.INTERNAL_BROADCAST", this.d);
    }

    public static final boolean c() {
        return !azcf.g();
    }

    public final long a(int i2) {
        return i2 != 1 ? i2 != 2 ? this.B : this.z : this.A;
    }

    public final void b() {
        this.t = false;
        roo roo = this.m;
        ArrayList arrayList = new ArrayList();
        this.u = Long.MAX_VALUE;
        List list = this.n;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            akym akym = (akym) list.get(i2);
            int i3 = akym.a;
            long j2 = akym.b;
            ClientIdentity clientIdentity = akym.c;
            LocationRequest locationRequest = new LocationRequest();
            if (i3 == 1) {
                locationRequest.c(104);
            } else if (i3 != 2) {
                locationRequest.c(105);
            } else {
                locationRequest.c(102);
            }
            roo roo2 = roo;
            long max = Math.max(j2, azcu.b());
            List list2 = list;
            long max2 = Math.max(j2 / azcf.a.a().y(), azcu.b() / 2);
            locationRequest.c(max);
            locationRequest.b(max2);
            LocationRequestInternal a2 = LocationRequestInternal.a("places_signal_manager", locationRequest);
            a2.a(Arrays.asList(new ClientIdentity[]{clientIdentity}));
            a2.b();
            long j3 = a2.b.c;
            if (j3 < this.u) {
                this.u = j3;
            }
            arrayList.add(a2);
            i2++;
            roo = roo2;
            list = list2;
        }
        roo.a(arrayList, false);
        int i4 = this.s;
        if (i4 == -1 || i4 == 0) {
            this.f.a();
            this.i.a();
            return;
        }
        akxy akxy = this.f;
        if (Log.isLoggable("Places", 4)) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("PlacesBleScanner start() with priority ");
            sb.append(i4);
            alfy.b("Places", sb.toString());
        }
        Map map = akxy.e;
        Integer valueOf = Integer.valueOf(i4);
        if (map.containsKey(valueOf)) {
            int intValue = ((Integer) akxy.e.get(valueOf)).intValue();
            if (akxy.k != intValue) {
                BleSettings bleSettings = null;
                if (intValue != 0) {
                    if (intValue == 1) {
                        bleSettings = akxy.d;
                    } else if (intValue == 2) {
                        bleSettings = akxy.c;
                    } else if (Log.isLoggable("Places", 5)) {
                        alfy.c("Places", "PlacesBleScanner state could not be recognized");
                    }
                }
                if (bleSettings == null || !azav.a.a().c()) {
                    if (Log.isLoggable("Places", 4)) {
                        StringBuilder sb2 = new StringBuilder(64);
                        sb2.append("PlacesBleScanner stopping, cannot scan with priority ");
                        sb2.append(i4);
                        alfy.b("Places", sb2.toString());
                    }
                    akxy.a();
                } else {
                    akxy.f.e();
                    icc icc = akxy.f;
                    icc.a((ica) new akxw(akxy, icc, bleSettings));
                    akxy.k = intValue;
                }
            }
        } else if (Log.isLoggable("Places", 4)) {
            StringBuilder sb3 = new StringBuilder(51);
            sb3.append("No configuration available for priority ");
            sb3.append(i4);
            alfy.b("Places", sb3.toString());
        }
        if (this.n.isEmpty() || !azcf.a.a().F()) {
            this.i.a();
            return;
        }
        akxr akxr = this.i;
        rck rck = new rck();
        ArrayList arrayList2 = new ArrayList();
        List list3 = this.n;
        int size2 = list3.size();
        long j4 = Long.MAX_VALUE;
        for (int i5 = 0; i5 < size2; i5++) {
            akym akym2 = (akym) list3.get(i5);
            j4 = Math.min(j4, akym2.b);
            arrayList2.add(akym2.c);
        }
        long max3 = Math.max(j4, azcf.a.a().C());
        rck.e = "places_signal_manager";
        rck.a(max3);
        rck.c = true;
        rck.d = isb.a(arrayList2);
        ActivityRecognitionRequest a3 = rck.a();
        if (akxr.d) {
            akxr.a.e();
            icc icc2 = akxr.a;
            icc2.a((ica) new akxp(akxr, icc2, a3));
        }
    }

    public final Location a() {
        if (!azcf.g()) {
            return this.g.c();
        }
        return null;
    }

    public final void a(int i2, long j2, ClientIdentity clientIdentity) {
        iva.b(true);
        if (j2 < 0) {
            j2 = a(i2);
        }
        akym akym = new akym(i2, j2, clientIdentity);
        if (!this.n.contains(akym)) {
            this.n.add(akym);
            int i3 = this.s;
            if (i3 == -1 || i2 >= i3) {
                this.s = i2;
            }
            b();
        }
    }

    public final void a(akyl akyl) {
        this.e.add(akyl);
    }

    public final void b(akyl akyl) {
        this.e.remove(akyl);
    }
}
