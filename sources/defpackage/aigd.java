package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aigd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigd extends aifz {
    final /* synthetic */ aigf b;
    private long c;
    private Location d = null;
    private int e;
    private boolean f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aigd(aigf aigf) {
        super(aigf);
        this.b = aigf;
    }

    /* access modifiers changed from: protected */
    public final void a(aifz aifz) {
        if (aifz == this.b.f || !ayaw.a.a().ignoreSmdForThrottling()) {
            super.a(aifz);
        }
    }

    public final void b() {
        this.c = 0;
        this.e = 0;
        this.d = null;
        this.f = false;
    }

    public final void c() {
        this.d = null;
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        this.f = false;
        int a = activityRecognitionResult.a().a();
        if (a == 0 || a == 1) {
            a(this.b.i);
        } else if (a == 3) {
            this.f = true;
        }
    }

    public final void a(List list) {
        int i = Build.VERSION.SDK_INT;
        float sigmaScaleDistanceThreshold = (float) ayaw.a.a().sigmaScaleDistanceThreshold();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Location location = (Location) it.next();
            int i2 = rev.i(location);
            if (i2 != 2) {
                if (this.d != null && atiu.a(Integer.valueOf(i2), Integer.valueOf(rev.i(this.d)))) {
                    float accuracy = this.d.getAccuracy();
                    float accuracy2 = location.getAccuracy();
                    if (i2 == 3) {
                        accuracy2 = Math.max(30.0f, accuracy2);
                        accuracy = Math.max(30.0f, accuracy);
                    }
                    float distanceTo = this.d.distanceTo(location);
                    if (location.getSpeed() < 1.0f && distanceTo <= (accuracy2 + accuracy) * sigmaScaleDistanceThreshold) {
                        this.e++;
                    }
                }
                this.d = location;
                int i3 = Build.VERSION.SDK_INT;
                this.c = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
                this.e = 1;
            }
        }
        if (aigf.a((Location) list.get(list.size() - 1))) {
            a(this.b.i);
        } else if (((long) this.e) >= ayaw.a.a().numStillLocationsThreshold()) {
            if (SystemClock.elapsedRealtime() - this.c >= ayaw.a.a().minStillTimeMs()) {
                if (this.b.m >= 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    aigf aigf = this.b;
                    if (elapsedRealtime - aigf.m <= aigf.n) {
                        return;
                    }
                }
                aigf aigf2 = this.b;
                aigf2.a = 2;
                a(aigf2.h);
            }
        } else if (this.f) {
            aigf aigf3 = this.b;
            aigf3.a = 1;
            a(aigf3.h);
        }
    }
}
