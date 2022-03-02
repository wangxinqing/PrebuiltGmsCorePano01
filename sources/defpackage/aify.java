package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.location.LocationAvailability;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aify  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aify extends aics implements jky, aiew {
    private final aidf a;
    private final jkz b;
    private long c = 0;
    private boolean d;
    private Collection f = Collections.emptyList();
    private aiew g;

    public aify(aiex aiex, Context context, Handler handler, aidf aidf) {
        super(aiex);
        this.a = aidf;
        this.b = new jkz(context, handler);
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            super.a();
            this.b.a((jky) this);
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            this.b.a();
            super.b();
        }
    }

    public final void e() {
    }

    public final void a(aiew aiew) {
        this.g = aiew;
        super.a((aiew) this);
    }

    public final void d() {
        if (!ayew.a.a().flpScreenOnLocationEnabled()) {
            return;
        }
        if (this.c == 0 || SystemClock.elapsedRealtime() - this.c >= ayew.a.a().flpMinimumScreenOnLocationRequestTimeDeltaMillis()) {
            Location a2 = a(false);
            if (a2 != null) {
                int i = Build.VERSION.SDK_INT;
                if (SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(a2.getElapsedRealtimeNanos()) < ayew.b()) {
                    return;
                }
            }
            this.c = SystemClock.elapsedRealtime();
            this.a.a(36);
            a(this.f, true);
        }
    }

    public final void e(List list) {
        aiew aiew = this.g;
        if (aiew != null) {
            aiew.e(list);
        }
    }

    public final void a(LocationAvailability locationAvailability) {
        aiew aiew = this.g;
        if (aiew != null) {
            aiew.a(locationAvailability);
        }
    }

    public final void a(Collection collection, boolean z) {
        this.f = collection;
        super.a(collection, z);
    }
}
