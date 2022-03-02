package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: aicr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aicr extends aigg implements aiew, aige {
    private static final amrm g = aicq.a;
    public final aigf a;
    public final aidf b;
    public boolean c = false;
    public boolean d;
    private final aifi h = new aifi();
    private final aifi i = new aifi();
    private final ArrayList j = new ArrayList();
    private boolean k = false;
    private Collection l = Collections.emptyList();
    private boolean m = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicr(aiex aiex, Context context, Looper looper, aidf aidf) {
        super(aiex, new jld(context, looper), jgy.a(context), looper);
        aigf aigf = new aigf(context, looper);
        this.b = aidf;
        this.a = aigf;
    }

    private final void b(boolean z) {
        Collection collection;
        if (!this.d) {
            collection = this.l;
        } else {
            if (!this.k) {
                this.j.ensureCapacity(this.l.size());
                this.k = true;
                long flpThrottleWhenStillIntervalMs = ayaw.a.a().flpThrottleWhenStillIntervalMs();
                for (LocationRequestInternal locationRequestInternal : this.l) {
                    LocationRequest locationRequest = locationRequestInternal.b;
                    if (locationRequest.g <= 0.0f) {
                        if (ayaw.c() && ((long) locationRequest.a) >= ayaw.b() && locationRequest.b < flpThrottleWhenStillIntervalMs) {
                            LocationRequest locationRequest2 = new LocationRequest(locationRequest);
                            locationRequestInternal = LocationRequestInternal.a(locationRequestInternal);
                            locationRequestInternal.a(locationRequest2);
                            locationRequest2.c(flpThrottleWhenStillIntervalMs);
                        }
                        this.j.add(locationRequestInternal);
                    }
                }
            }
            collection = this.j;
        }
        if (this.d && z) {
            i();
            z = false;
        }
        this.e.a(collection, z);
    }

    private final void j() {
        if (this.c && this.m) {
            aigf aigf = this.a;
            if (!aigf.l) {
                aigf.l = true;
                aifw aifw = aigf.e;
                aifw.i = aigf;
                aifw.d();
                aigf.k.e();
                return;
            }
            return;
        }
        aigf aigf2 = this.a;
        if (aigf2.l) {
            aigf2.l = false;
            aigf2.e.e();
            aifz aifz = aigf2.k;
            aifz.a(aifz.a.f);
        }
    }

    public final void a() {
        if (!this.m) {
            this.m = true;
            this.d = false;
            aigf aigf = this.a;
            if (aigf.k != aigf.f) {
                Log.wtf("GCoreFlp", new IllegalStateException("Called setCallback when stationary device helper was enabled."));
            }
            aigf.j = this;
            j();
            b(false);
            super.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.a.k.d();
    }

    /* access modifiers changed from: protected */
    public final Collection d() {
        return this.i.k;
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return this.d;
    }

    public final boolean f() {
        b(false);
        return super.f();
    }

    /* access modifiers changed from: protected */
    public final long g() {
        return Math.max(ayaw.a.a().minSyntheticSmdDeliveryMs(), this.i.f);
    }

    /* access modifiers changed from: protected */
    public final String h() {
        return "activity stationary engine";
    }

    public final void a(Collection collection, boolean z) {
        boolean z2;
        this.i.a(anbs.a((Iterable) collection, aifi.a));
        this.h.a(anbs.a((Iterable) collection, g));
        aigf aigf = this.a;
        double flpSmdSwitchIntervalFactor = ayaw.a.a().flpSmdSwitchIntervalFactor();
        long j2 = this.i.f;
        double d2 = (double) j2;
        Double.isNaN(d2);
        aigf.n = (long) (flpSmdSwitchIntervalFactor * d2);
        long j3 = this.h.f;
        if (j3 > j2 || j3 > ayaw.a.a().flpSmdIntervalThresholdMs()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.c = z2;
        this.l = collection;
        this.j.clear();
        this.k = false;
        j();
        if (this.c || !this.d) {
            b(z);
            return;
        }
        this.d = false;
        f();
    }

    public final void b() {
        if (this.m) {
            this.m = false;
            j();
            b(false);
            super.b();
        }
    }

    public final void a(List list) {
        this.a.b(list);
    }
}
