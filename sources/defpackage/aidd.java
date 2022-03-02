package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: aidd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aidd implements jio {
    public static final /* synthetic */ int p = 0;
    private static final String[] q = {"android:monitor_location", "android:monitor_location_high_power"};
    private static final String[] r = {"android:monitor_location"};
    private static final String[] s = new String[0];
    public final int a;
    public final String b;
    public final LocationRequestInternal c;
    public final boolean d;
    public final boolean e;
    protected final int f;
    public final aiev g;
    public long h;
    public int i;
    public Location j;
    public long k = 0;
    public boolean l;
    public boolean m;
    final Context n;
    final aicz o;
    private LocationAvailability t;

    public aidd(Context context, int i2, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, aicz aicz) {
        boolean z3 = true;
        this.l = true;
        this.m = true;
        this.n = context;
        if (jkr.h() && z2 && "com.google.android.gms".equals(str) && "com.google.android.gms.location.reporting".equals(locationRequestInternal.h)) {
            if (ajpu.a(context)) {
                ajpz a2 = ajpz.a(context);
                if (!"com.google.android.gms.location.history".equals(a2.a())) {
                    a2.a("com.google.android.gms.location.history");
                }
            }
            ajpu.b(context);
            this.a = ajpu.a;
            ajpu.b(context);
            this.b = ajpu.b;
            locationRequestInternal.a((List) amzy.a((Object) new ClientIdentity(this.a, this.b)));
        } else {
            this.a = i2;
            this.b = str;
        }
        this.c = locationRequestInternal;
        this.i = 0;
        this.j = null;
        this.d = (!z || locationRequestInternal.f) ? false : z3;
        this.e = z2;
        this.o = aicz;
        this.f = new ajqr(context).a(str);
        this.g = new aiev(SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    public abstract int a(LocationAvailability locationAvailability);

    /* access modifiers changed from: protected */
    public abstract int a(List list);

    public abstract boolean a();

    public final boolean a(int i2) {
        if (i2 == 1) {
            return false;
        }
        if (!(i2 == 2 || i2 == 3 || i2 == 4)) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Invalid deliveryResult: ");
            sb.append(i2);
            Log.wtf("GCoreFlp", new IllegalArgumentException(sb.toString()));
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public final boolean b(LocationAvailability locationAvailability) {
        NetworkLocationStatus[] networkLocationStatusArr;
        boolean z = true;
        if (this.e) {
            LocationAvailability locationAvailability2 = this.t;
            if (locationAvailability2 != null && locationAvailability2.a() == locationAvailability.a()) {
                LocationAvailability locationAvailability3 = this.t;
                if (locationAvailability3.b == locationAvailability.b && locationAvailability3.a == locationAvailability.a && ((networkLocationStatusArr = locationAvailability.e) == null || networkLocationStatusArr.length <= 0)) {
                    z = false;
                    this.t = locationAvailability;
                    return z;
                }
            }
        } else {
            LocationAvailability locationAvailability4 = this.t;
            if (locationAvailability4 != null && locationAvailability4.a() == locationAvailability.a()) {
                z = false;
                this.t = locationAvailability;
                return z;
            }
        }
        int a2 = a(locationAvailability);
        if (a(a2)) {
            this.o.a();
        }
        if (a2 != 1) {
            z = false;
        }
        this.t = locationAvailability;
        return z;
    }

    public final void c() {
        this.o.a();
    }

    public final int j() {
        return this.a;
    }

    public final String k() {
        return this.b;
    }

    public final String l() {
        return this.c.k;
    }

    public final String[] m() {
        LocationRequestInternal locationRequestInternal = this.c;
        return !locationRequestInternal.e ? (locationRequestInternal.b.a != 100 || !this.m) ? r : q : s;
    }
}
