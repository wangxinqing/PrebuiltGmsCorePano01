package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlo extends ahlr {
    final /* synthetic */ ahlw a;
    private long b;
    private boolean c;

    public ahlo(ahlw ahlw) {
        this(ahlw, false);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        aizy aizy = this.a.a;
        this.b = SystemClock.elapsedRealtime();
        ahix ahix = this.a.c;
        StringBuilder sb = new StringBuilder(59);
        sb.append("addLowPowerTiltDetectionInternalClient 30000");
        sb.toString();
        if (!ahix.aa && ahix.R.isEmpty() && ahix.az.b()) {
            ahix.az.a(ahix);
        }
        ahix.R.add(30000L);
        boolean z = true;
        ahix.b(true, false);
        aiap aiap = this.a.c.F.b;
        if (aiap != null) {
            if (aiap.a().isEmpty() && !this.c) {
                z = false;
            }
            this.c = z;
        }
    }

    public final String b() {
        return "InVehicle";
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.c = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahlo(ahlw ahlw, boolean z) {
        super(ahlw);
        this.a = ahlw;
        this.b = -1;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public final void a(ahlr ahlr) {
        super.a(ahlr);
        ahix ahix = this.a.c;
        StringBuilder sb = new StringBuilder(62);
        sb.append("removeLowPowerTiltDetectionInternalClient 30000");
        sb.toString();
        ahix.R.remove(30000L);
        if (ahix.R.isEmpty() && ahix.az.b()) {
            ahix.az.a();
        }
        ahix.b(false, false);
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        if (ahlw.a(activityRecognitionResult)) {
            this.a.a(this.c);
        } else if (activityRecognitionResult.a().a() == 5) {
            ahlw ahlw = this.a;
            ahlw.a((ahlr) new ahlp(ahlw, this.c));
        } else if (!ahlw.b(activityRecognitionResult)) {
            aizy aizy = this.a.a;
            if (SystemClock.elapsedRealtime() - this.b > 900000) {
                ahlw ahlw2 = this.a;
                ahlw2.a((ahlr) new ahlv(ahlw2));
            }
        } else {
            aizy aizy2 = this.a.a;
            this.b = SystemClock.elapsedRealtime();
        }
    }
}
