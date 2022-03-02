package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: cff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cff extends reh {
    protected static cff f;
    public final cer a = new cer(awvb.ba, awvb.aZ, awvb.aY, false);
    public final rom b;
    public final roo c;
    public long d = cbi.i().a();
    protected final HashSet e = new HashSet();

    protected cff(Context context) {
        rom rom = new rom(context);
        this.b = rom;
        rom.a();
        this.c = new roo(this.b, (reh) this, Looper.getMainLooper());
    }

    public static cff a() {
        if (f == null) {
            Context g = cbi.g();
            if (g == null) {
                ((anih) ((anih) bxk.a.b()).a("cff", "a", 49, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SingletonLocationProducer] Failed to get chimera context.");
                g = cbi.f();
            }
            cff cff = new cff(g);
            f = cff;
            new Object[1][0] = cff;
        }
        return f;
    }

    public final void b() {
        new Object[1][0] = Integer.valueOf(this.a.a.size());
        ArrayList arrayList = new ArrayList(this.a.a.size() + 1);
        int a2 = this.a.a();
        long b2 = this.a.b();
        Object[] objArr = {Integer.valueOf(a2), Long.valueOf(b2)};
        LocationRequest a3 = LocationRequest.a();
        a3.c(a2);
        a3.c(b2);
        arrayList.add(LocationRequestInternal.a("SingletonLocationProducer", a3));
        for (cas cas : this.a.a) {
            this.a.a(cas.g());
            Object[] objArr2 = {Integer.valueOf(this.a.d), Long.valueOf(this.a.e), cas.b};
            LocationRequest a4 = LocationRequest.a();
            a4.c(this.a.d);
            a4.c(this.a.e);
            LocationRequestInternal a5 = LocationRequestInternal.a("SingletonLocationProducer", a4);
            car car = cas.b;
            a5.a(Collections.singletonList(new ClientIdentity(car.b, car.a())));
            arrayList.add(a5);
        }
        this.c.a(arrayList, false);
    }

    public final void a(Location location) {
        this.d = location.getTime();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((rei) it.next()).a(location);
        }
    }

    public final void a(LocationResult locationResult) {
        cbi.k().a(new cfe(this, locationResult), bvq.a("SingletonLocationProducer_onLocationChanged"));
    }
}
