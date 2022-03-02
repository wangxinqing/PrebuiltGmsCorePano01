package defpackage;

import android.location.Location;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.location.LocationAvailability;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: aimv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aimv extends aimp {
    final /* synthetic */ aing d;
    private int e;
    private boolean f = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aimv(aing aing, aiml aiml) {
        super(aing, aiml);
        this.d = aing;
    }

    public final aoaq a() {
        return aoaq.FAST_MOVING_ACTIVITY;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return !this.b.b(150000.0d / h()) ? 300 : -1;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        if (this.f && this.e == 2) {
            return -1;
        }
        if (this.b.a()) {
            return 60;
        }
        if (!this.b.b(150000.0d / h())) {
            return Math.max(20, Math.min(1800, this.b.a));
        }
        return 1800;
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int i = this.b.b;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public final String g() {
        return "FastMovingActivityState";
    }

    /* access modifiers changed from: protected */
    public final double h() {
        double d2;
        boolean a = this.b.c.a(SystemClock.elapsedRealtime(), 360000, 180000, 3);
        if (!a) {
            aikc aikc = this.b.c;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int size = aikc.a.size() - 1;
            Pair pair = null;
            Pair pair2 = null;
            while (true) {
                if (size < 0) {
                    break;
                }
                Pair pair3 = (Pair) aikc.a.get(size);
                if (((Location) pair3.second).getAccuracy() <= 80.0f) {
                    if (pair2 == null) {
                        pair2 = pair3;
                    } else if (((Long) pair2.first).longValue() - ((Long) pair3.first).longValue() >= 10000) {
                        pair = pair3;
                        break;
                    }
                }
                size--;
            }
            d2 = 22.22d;
            if (pair2 != null && pair != null && elapsedRealtime - ((Long) pair2.first).longValue() <= 150000 && ((Long) pair2.first).longValue() - ((Long) pair.first).longValue() <= 150000) {
                double b = aell.b(((Location) pair2.second).getLatitude(), ((Location) pair2.second).getLongitude(), ((Location) pair.second).getLatitude(), ((Location) pair.second).getLongitude());
                double longValue = (double) (((Long) pair2.first).longValue() - ((Long) pair.first).longValue());
                Double.isNaN(longValue);
                double d3 = longValue / 1000.0d;
                if (d3 >= 10.0d) {
                    d2 = Math.min(22.22d, Math.max(9.72d, b / d3));
                    boolean z = aikq.a;
                }
            }
        } else {
            d2 = 1.5d;
        }
        if (a) {
            boolean z2 = aikq.a;
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    public final void i() {
        if (!this.f || this.e != 2) {
            this.e = 3;
            return;
        }
        this.e = 3;
        this.b.m.a();
        aucd aucd = this.d.D;
        if (aucd != null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoal aoal = (aoal) aucd.b;
            aoal aoal2 = aoal.g;
            aoal.a |= 8;
            aoal.e = false;
        }
        d(true);
    }

    public final void k() {
        super.k();
        boolean b = aycg.b();
        this.f = b;
        if (b) {
            this.e = !this.d.x.b() ? 3 : 1;
        }
    }

    public final void l() {
        if (this.f) {
            this.b.m.a();
            aucd aucd = this.d.D;
            if (aucd != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoal aoal = (aoal) aucd.b;
                aoal aoal2 = aoal.g;
                aoal.a |= 8;
                aoal.e = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(LocationAvailability locationAvailability) {
        if (this.e != 2) {
            super.a(locationAvailability);
        }
    }

    /* access modifiers changed from: protected */
    public final void d(boolean z) {
        if (this.f) {
            int i = 3;
            if (this.e != 3) {
                aiml aiml = this.b;
                aime aime = aiml.m;
                List b = aiml.b(50);
                Pair pair = this.b.c.b;
                if (b == null || pair == null) {
                    this.e = 1;
                } else {
                    boolean a = aime.a(b, (Location) pair.second, z);
                    aucd aucd = this.d.D;
                    if (aucd != null) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aoal aoal = (aoal) aucd.b;
                        aoal aoal2 = aoal.g;
                        aoal.a |= 8;
                        aoal.e = true;
                    }
                    if (a) {
                        i = 2;
                    }
                    this.e = i;
                }
            }
        }
        super.d(z);
    }

    public final void a(PrintWriter printWriter) {
        super.a(printWriter);
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "HARDWARE_GEOFENCE_STATE_NOT_AVAILABLE" : "HARDWARE_GEOFENCE_STATE_IN_USE" : "HARDWARE_GEOFENCE_STATE_NOT_ATTEMPTED";
        printWriter.print(str.length() == 0 ? new String("\n    Using hardware geofencing=") : "\n    Using hardware geofencing=".concat(str));
    }

    /* access modifiers changed from: protected */
    public final boolean a(boolean z) {
        if (!this.f || aycg.a.a().useHardwareGeofenceWhenUnavailable()) {
            return false;
        }
        if (!z) {
            if (this.e == 2) {
                this.e = 3;
                this.b.m.a();
                aucd aucd = this.d.D;
                if (aucd != null) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aoal aoal = (aoal) aucd.b;
                    aoal aoal2 = aoal.g;
                    aoal.a |= 8;
                    aoal.e = false;
                }
                d(true);
            }
        } else if (this.e != 2) {
            this.e = 1;
            d(true);
        }
        return true;
    }
}
