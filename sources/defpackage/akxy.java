package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: akxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxy {
    public static final long a;
    static final long b;
    public static final BleSettings c;
    public static final BleSettings d;
    private static final List o;
    public final Map e;
    public final icc f;
    public final akxo g;
    public final Handler h;
    final gth i = new akxu(this);
    public final Runnable j = new akxv(this);
    public int k = 0;
    public boolean l = false;
    public final gug m;
    public akyj n;
    private final gtu p;

    static {
        long a2 = azav.a.a().a();
        a = a2;
        b = (a2 * 9) / 10;
        gtv gtv = new gtv();
        gtv.b();
        o = gtv.a();
        gtj gtj = new gtj();
        gtj.a(o);
        gtj.a(1);
        gtj.b((int) azav.a.a().b());
        gtj.a(a);
        gtj.a = 2;
        c = gtj.a();
        gtj gtj2 = new gtj();
        gtj2.a(o);
        gtj2.a(1);
        gtj2.b(3);
        gtj2.a = 2;
        d = gtj2.a();
    }

    public akxy(icc icc, gug gug, Handler handler) {
        this.f = icc;
        this.m = gug;
        this.h = handler;
        this.g = new akxo();
        this.p = new gtu();
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        hashMap.put(3, 2);
        if (azav.a.a().d()) {
            this.e.put(2, 1);
            this.e.put(1, 1);
            return;
        }
        this.e.put(2, 0);
        this.e.put(1, 0);
    }

    public static akxy a(Context context, Handler handler) {
        ibz ibz = new ibz(context);
        ibz.a(gtd.a);
        return new akxy(ibz.b(), gtd.b, handler);
    }

    public final akll a(BleSighting bleSighting) {
        gtt a2;
        gti gti = bleSighting.b;
        if (gti == null || (a2 = this.p.a(gti)) == null || !a2.c()) {
            return null;
        }
        Integer a3 = a2.a(bleSighting.d);
        Integer b2 = a2.b(gti);
        aklj aklj = new aklj(a2.a(), a2.a(gti));
        if (aklj.b == null || aklj.a == 0) {
            return null;
        }
        return new akll(aklj, a3, b2, TimeUnit.NANOSECONDS.toMillis(bleSighting.e));
    }

    public final void a() {
        if (this.k != 0) {
            if (Log.isLoggable("Places", 4)) {
                alfy.b("Places", "PlacesBleScanner stop()");
            }
            this.f.e();
            icc icc = this.f;
            icc.a((ica) new akxx(this, icc));
            this.k = 0;
        }
    }

    public final void a(List list) {
        akyj akyj = this.n;
        if (akyj != null) {
            aklk aklk = new aklk(list);
            akyn akyn = akyj.a;
            akyn.q++;
            if (akyn.c()) {
                List list2 = akyn.e;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((akyl) list2.get(i2)).a(aklk);
                }
            }
        } else if (Log.isLoggable("Places", 6)) {
            alfy.a("Places", "Missing BeaconScanCallback in PlacesBleScanner!");
        }
    }
}
