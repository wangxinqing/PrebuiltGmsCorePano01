package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.Iterator;
import java.util.List;

/* renamed from: aigu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aigu implements aifv, jlp {
    public final aign a = new aigp(this);
    public final aign b = new aigr(this);
    public final aign c = new aigs(this);
    public aign d = this.i;
    public aigt e;
    public boolean f;
    public String g;
    public Location h;
    private final aign i = new aigo(this);
    private final aign j = new aigq(this);
    private final jlq k;
    private final aifw l;
    private final aidg m;
    private long n = -1;

    public aigu(Context context, Looper looper) {
        aifw aifw = new aifw(looper, context);
        jlq jlq = new jlq(context);
        this.l = aifw;
        this.k = jlq;
        this.m = new aidg(new qvr(looper), aieo.a(context));
    }

    public final void a() {
        if (this.d == this.i) {
            aifw aifw = this.l;
            aifw.i = this;
            aifw.d();
            this.k.a(this);
            a(this.a);
        }
    }

    public final void a(List list) {
    }

    public final void a(NetworkLocationStatus[] networkLocationStatusArr) {
    }

    public final void b() {
        if (this.d != this.i) {
            this.l.e();
            this.k.a();
            a(this.i);
        }
    }

    public final void d() {
    }

    public final void b(ActivityRecognitionResult activityRecognitionResult) {
        int a2 = activityRecognitionResult.a().a();
        if (a2 == 0 || a2 == 1) {
            a(this.j);
        }
    }

    public final void a(aign aign) {
        aign aign2 = this.d;
        if (aign2 != aign) {
            aign2.b();
            this.d = aign;
            aign.a();
        }
    }

    public final void b(boolean z, String str) {
        this.f = z;
        this.n = z ? SystemClock.elapsedRealtime() : -1;
        this.g = str;
        this.h = null;
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        this.d.a(activityRecognitionResult);
    }

    public final boolean b(List list) {
        Location location = (Location) anbs.d(list);
        if (location.hasSpeed() && ((double) location.getSpeed()) > ayaw.d()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            if (rev.i(location2) != 2) {
                int i2 = Build.VERSION.SDK_INT;
                if (location2.getElapsedRealtimeNanos() / 1000000 < this.n) {
                    continue;
                } else {
                    Location location3 = this.h;
                    if (location3 == null) {
                        this.h = location2;
                    } else if (location3.distanceTo(location2) > this.h.getAccuracy() + location2.getAccuracy() + 150.0f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(boolean z, String str) {
        this.m.a(28, new aigm(this, z, str));
    }
}
