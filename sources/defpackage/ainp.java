package defpackage;

import android.hardware.location.GeofenceHardwareRequest;
import android.location.Location;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ainp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ainp implements aime {
    public final int a;
    aimh b;
    final ArrayList c = new ArrayList(Collections.nCopies(50, (Object) null));
    public final aing d;
    final ainm e = new ainm(this);
    final aino f = new aino(this);
    private final ainn g;

    public ainp(aing aing, int i) {
        ainn ainn = new ainn();
        i = i != 0 ? 1 : i;
        StringBuilder sb = new StringBuilder(39);
        sb.append("Unsupported monitoring type ");
        sb.append(i);
        iva.b(true, sb.toString());
        this.d = aing;
        this.a = i;
        this.g = ainn;
    }

    private final void c() {
        synchronized (this.c) {
            for (int i = 0; i < 50; i++) {
                this.c.set(i, (Object) null);
            }
        }
    }

    public final void a(aimh aimh) {
        boolean z = aikq.a;
        if (aimh != null) {
            aimh aimh2 = this.b;
            if (aimh2 == null || aimh.a != aimh2.a) {
                this.b = aimh;
                try {
                    aimh.a.registerForMonitorStateChangeCallback(this.a, this.f);
                    return;
                } catch (SecurityException e2) {
                }
            } else {
                return;
            }
        }
        this.b = null;
    }

    public final boolean b() {
        aimh aimh = this.b;
        if (aimh == null) {
            return false;
        }
        try {
            int[] monitoringTypes = aimh.a.getMonitoringTypes();
            int length = monitoringTypes.length;
            int i = 0;
            while (i < length) {
                int i2 = monitoringTypes[i];
                int i3 = this.a;
                if (i2 != i3) {
                    i++;
                } else if (this.b.a(i3) != 2) {
                    return true;
                } else {
                    boolean z = aikq.a;
                    return false;
                }
            }
            boolean z2 = aikq.a;
            return false;
        } catch (SecurityException e2) {
            boolean z3 = aikq.a;
            return false;
        }
    }

    public final void a(PrintWriter printWriter) {
        boolean z;
        printWriter.print("Dump of hardware geofencing:");
        int i = this.a;
        StringBuilder sb = new StringBuilder(80);
        sb.append("\n    Class is RealBlockingGeofenceHardware, monitoringType=");
        sb.append(i);
        sb.append(", limit=50");
        printWriter.print(sb.toString());
        boolean b2 = b();
        int i2 = 0;
        if (!b()) {
            z = false;
        } else if (this.b.a(this.a) != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean b3 = aycg.b();
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("\n    Supported=");
        sb2.append(b2);
        sb2.append(", available=");
        sb2.append(z);
        sb2.append(", enabled on this device=");
        sb2.append(b3);
        printWriter.print(sb2.toString());
        printWriter.print("\n    Registered geofences:");
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                aijt aijt = (aijt) it.next();
                if (aijt != null) {
                    String valueOf = String.valueOf(aijt);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb3.append("\n        id=");
                    sb3.append(i3);
                    sb3.append(" ");
                    sb3.append(valueOf);
                    printWriter.print(sb3.toString());
                    i2++;
                }
                i3++;
            }
            if (i2 == 0) {
                printWriter.print("\n    <none>");
            }
        }
    }

    public final boolean a() {
        if (!b()) {
            return false;
        }
        c();
        ainm ainm = this.e;
        if (ainm.b == null || ainm.b.getCount() == 0) {
            ainm.b = new CountDownLatch(50);
            for (int i = 0; i < 50; i++) {
                try {
                    aimh aimh = this.b;
                    if (aimh.a.removeGeofence(i, this.a)) {
                    }
                } catch (IllegalArgumentException e2) {
                    boolean z = aikq.a;
                } catch (SecurityException e3) {
                    boolean z2 = aikq.a;
                }
                this.e.b.countDown();
            }
            try {
                this.e.b.await(10000, TimeUnit.MILLISECONDS);
                boolean z3 = aikq.a;
                return true;
            } catch (InterruptedException e4) {
                return true;
            }
        } else {
            if (Log.isLoggable("GeofenceHardware", 6)) {
                aikq.b("GeofenceHardware", "Ongoing remove geofence operation.");
            }
            return false;
        }
    }

    public final boolean a(List list, Location location, boolean z) {
        boolean z2;
        int i;
        GeofenceHardwareRequest geofenceHardwareRequest;
        List list2 = list;
        boolean z3 = false;
        if (this.g.c || !b()) {
            return false;
        }
        if (!z && this.c.containsAll(list2)) {
            boolean z4 = aikq.a;
            return true;
        }
        ainn ainn = this.g;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        iva.b(ainn.b.size() == 0 || elapsedRealtime >= ((Long) ainn.b.getLast()).longValue(), "Unable to add events in the past.");
        if (ainn.b.size() >= 4) {
            ainn.b.removeFirst();
        }
        ainn.b.add(Long.valueOf(elapsedRealtime));
        if (ainn.b.size() >= 4) {
            z2 = elapsedRealtime - ((Long) ainn.b.getFirst()).longValue() <= ainn.a;
        } else {
            z2 = false;
        }
        ainn.c = z2;
        if (!a()) {
            return false;
        }
        int min = Math.min(50, list.size());
        ainm ainm = this.e;
        if (ainm.a == null || ainm.a.getCount() == 0) {
            ainm.a = new CountDownLatch(min);
            ainm.c.clear();
            int i2 = 0;
            while (i2 < min) {
                aijt aijt = (aijt) list2.get(i2);
                if (i2 != 49) {
                    boolean z5 = aikq.a;
                    ParcelableGeofence parcelableGeofence = aijt.a;
                    i = min;
                    geofenceHardwareRequest = GeofenceHardwareRequest.createCircularGeofence(parcelableGeofence.d, parcelableGeofence.e, (double) parcelableGeofence.f);
                    geofenceHardwareRequest.setLastTransition(4);
                    geofenceHardwareRequest.setMonitorTransitions(7);
                    geofenceHardwareRequest.setNotificationResponsiveness(9000);
                    geofenceHardwareRequest.setUnknownTimer(9000);
                } else {
                    i = min;
                    geofenceHardwareRequest = GeofenceHardwareRequest.createCircularGeofence(location.getLatitude(), location.getLongitude(), aijt.b());
                    geofenceHardwareRequest.setLastTransition(4);
                    geofenceHardwareRequest.setMonitorTransitions(7);
                    geofenceHardwareRequest.setNotificationResponsiveness(9000);
                    geofenceHardwareRequest.setUnknownTimer(9000);
                    boolean z6 = aikq.a;
                }
                synchronized (this.c) {
                    this.c.set(i2, aijt);
                }
                try {
                    if (this.b.a.addGeofence(i2, this.a, geofenceHardwareRequest, this.e)) {
                        continue;
                        i2++;
                        min = i;
                    }
                } catch (SecurityException e2) {
                    boolean z7 = aikq.a;
                }
                ainm ainm2 = this.e;
                synchronized (ainm2.c) {
                    ainm2.c.put(i2, 5);
                }
                ainm2.a.countDown();
                i2++;
                min = i;
            }
            try {
                ainm ainm3 = this.e;
                if (ainm3.a.await(10000, TimeUnit.MILLISECONDS)) {
                    synchronized (ainm3.c) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < ainm3.c.size()) {
                                if (ainm3.c.valueAt(i3) != 0) {
                                    break;
                                }
                                i3++;
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                    }
                } else {
                    boolean z8 = aikq.a;
                    ainm3.a = null;
                }
            } catch (InterruptedException e3) {
            }
        } else if (Log.isLoggable("GeofenceHardware", 6)) {
            aikq.b("GeofenceHardware", "Ongoing add geofence operation.");
        }
        if (!z3) {
            boolean z9 = aikq.a;
            a();
            c();
        }
        return z3;
    }
}
