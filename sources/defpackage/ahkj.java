package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Date;

/* renamed from: ahkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ahkj extends ahle implements ajbh {
    public ahkj(ahix ahix) {
        super(ahix);
    }

    /* access modifiers changed from: protected */
    public final void D() {
        if (this.d.f()) {
            a((ahle) new ahkb(this.d));
        }
    }

    public final void E() {
        b(axwx.a.a().motionClearsDeepStillState());
    }

    /* access modifiers changed from: protected */
    public final void a(aibl aibl, aibl aibl2) {
        if (aibl2.b == 2 && aibl2.a >= 0.7d) {
            this.d.a(false, true);
            this.d.a(false);
            c(39);
        }
    }

    public void b(boolean z) {
        String p = p();
        StringBuilder sb = new StringBuilder(String.valueOf(p).length() + 40);
        sb.append(p);
        sb.append(": onTrigger: clearDeepStillHistory=");
        sb.append(z);
        sb.toString();
        this.d.a(false, true);
        if (z) {
            this.d.y.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void c(boolean z) {
        if (!z) {
            b(false);
        }
    }

    public void g() {
        super.g();
        this.d.g();
        if (this.d.d()) {
            ahkf ahkf = new ahkf(this.d, this.g);
            if (!ayfc.a.a().sleepDetectionAlarmAllowIdle()) {
                this.d.a(new aiac(ahkf.c(), 1));
                return;
            }
            ahix ahix = this.d;
            long c = ahkf.c();
            ahix.t = new aiac(c, 0);
            String valueOf = String.valueOf(new Date(ajbt.e() + c));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Allow-while-idle alarm set to: ");
            sb.append(c);
            sb.append(" ");
            sb.append(valueOf);
            sb.toString();
            ajbg ajbg = ahix.k;
            ajbe ajbe = ajbe.ACTIVITY_DETECTION;
            aizx aizx = ahix.W.c;
            ajbg.a(ajbe, c);
        }
    }

    public abstract String p();

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        this.d.a(new ActivityRecognitionResult(new DetectedActivity(3, 100), System.currentTimeMillis(), SystemClock.elapsedRealtime(), ahnk.SMD_GOUDA.am, (Bundle) null));
        if (this.j) {
            this.d.a(false);
        }
        if (!this.d.a()) {
            c(39);
        }
    }
}
