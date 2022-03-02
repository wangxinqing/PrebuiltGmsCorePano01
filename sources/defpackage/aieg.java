package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: aieg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aieg extends jip {
    final /* synthetic */ aiei a;
    private boolean b = false;
    private boolean g = false;
    private long h = Long.MAX_VALUE;
    private long i = Long.MAX_VALUE;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aieg(aiei aiei, Context context, Handler handler, jkn jkn) {
        super(aiei.a, context, handler, aiei.t, aiei.g, jkn);
        this.a = aiei;
        a(aiei.b);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        boolean z;
        long j;
        String[] strArr;
        boolean z2;
        if (this.a.z != axxg.b()) {
            aiei aiei = this.a;
            if (aiei.z) {
                aiei.b();
            } else {
                aiei.a();
            }
            for (aidd aidd : c()) {
                aidd.l = this.a.a(aidd);
            }
        }
        int i3 = i2 & 5;
        if (i3 == 0 || !this.b) {
            z = false;
        } else {
            if (i3 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = this.a.v.a(this.g, this.h, z2, this.i);
        }
        aiei aiei2 = this.a;
        aiei2.e.a(aiei2.c(), z);
        this.b = false;
        this.g = false;
        long j2 = Long.MAX_VALUE;
        this.h = Long.MAX_VALUE;
        this.i = Long.MAX_VALUE;
        if ((i2 & 40) != 0) {
            for (aidd b2 : d()) {
                b2.b(aiei.c);
            }
        }
        aiei aiei3 = this.a;
        if (aiei3.y) {
            if (aiei3.j.c().isEmpty() && this.a.j.d().isEmpty()) {
                aiei aiei4 = this.a;
                aiei4.y = false;
                aiei4.A.a();
                aiei4.k.a((rni) aiei4);
                aiei4.k.a((rnh) aiei4);
                if (aiei4.z) {
                    aiei4.b();
                }
                aiei4.j.a(aiei.b);
            }
        } else if (!aiei3.j.c().isEmpty() || !this.a.j.d().isEmpty()) {
            aiei aiei5 = this.a;
            aiei5.y = true;
            aiei5.A.a(aiei5.p.c);
            if (ayap.n()) {
                aiei5.k.a((rni) aiei5, aiei5.p.a());
            } else {
                aiei5.k.a((rnh) aiei5, aiei5.p.a());
            }
            aieg aieg = aiei5.j;
            if (aiei5.k.a("gps")) {
                strArr = aiei.a;
            } else {
                strArr = aiei.b;
            }
            aieg.a(strArr);
            if (!aiei5.z && axxg.b()) {
                aiei5.a();
            }
        }
        if ((i2 & 7) != 0) {
            aiei aiei6 = this.a;
            LocationRequestInternal locationRequestInternal = null;
            for (aidd aidd2 : aiei6.j.c()) {
                LocationRequestInternal locationRequestInternal2 = aidd2.c;
                long j3 = locationRequestInternal2.b.e;
                if (j3 < j2) {
                    locationRequestInternal = locationRequestInternal2;
                }
                if (j3 < j2) {
                    j2 = j3;
                }
            }
            if (locationRequestInternal != null) {
                if (j2 == 0) {
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = j2;
                }
                aiei6.o.a("com.google.android.gms.location.fused.EXPIRATION_ALARM", 3, j, (jgw) aiei6.n, aiei6.m, isb.a(locationRequestInternal.c));
                return;
            }
            aiei6.o.a((jgw) aiei6.n);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(jio jio) {
        long j;
        long j2;
        long j3;
        Location a2;
        aidd aidd = (aidd) jio;
        LocationRequest locationRequest = aidd.c.b;
        if (locationRequest.a != 105) {
            this.b = true;
            boolean z = aidd.l;
            this.g = z;
            if (!z) {
                j2 = ajpl.a(locationRequest.c());
            } else {
                j2 = locationRequest.b;
            }
            this.h = Math.min(this.h, j2);
            if (ayap.a.a().supportMaxLocationAge()) {
                long min = Math.min(aidd.c.l, this.i);
                this.i = min;
                j3 = min;
            } else {
                this.i = Long.MAX_VALUE;
                j3 = Long.MAX_VALUE;
            }
            if (!this.a.v.a(this.g, this.h, false, j3) && (a2 = this.a.a(aidd.a, aidd.b, aidd.c.k, aidd.d, aidd.e, false)) != null) {
                this.a.a(Collections.singletonList(a2), aidd);
                aidd.b(this.a.a(aidd.a, aidd.b, aidd.d));
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        Location a3 = this.a.a(aidd.a, aidd.b, aidd.c.k, aidd.d, false, false);
        if (a3 != null) {
            j = TimeUnit.NANOSECONDS.toMillis(a3.getElapsedRealtimeNanos());
        } else {
            j = SystemClock.elapsedRealtime();
        }
        aidd.k = j - ayap.a.a().flpAllowedDeliveryAgeMs();
        aiei aiei = this.a;
        LocationRequestInternal locationRequestInternal = aidd.c;
        for (ClientIdentity clientIdentity : locationRequestInternal.c) {
            LocationRequest locationRequest2 = locationRequestInternal.b;
            aiei.q.a(new aieh(clientIdentity.b, locationRequest2.a, locationRequestInternal.d), locationRequest2.b);
        }
        aidf aidf = this.a.u;
        aidf.a(6, aidf.k.a((Object) aidd.c.c));
    }

    public final void c(Object obj) {
        if (ayap.a.a().bugfixReleaseClientResource()) {
            aidd aidd = (aidd) super.a(obj);
            if (aidd != null) {
                aidd.b();
                return;
            }
            return;
        }
        aidd aidd2 = (aidd) super.a(obj);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(jio jio) {
        aidd aidd = (aidd) jio;
        aiei aiei = this.a;
        LocationRequestInternal locationRequestInternal = aidd.c;
        for (ClientIdentity clientIdentity : locationRequestInternal.c) {
            LocationRequest locationRequest = locationRequestInternal.b;
            aiei.q.b(new aieh(clientIdentity.b, locationRequest.a, locationRequestInternal.d), locationRequest.b);
        }
        aidf aidf = this.a.u;
        aidf.a(7, aidf.k.a((Object) aidd.c.c));
    }
}
