package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.FloorChangeEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ahkc extends ahjt {
    private final List k;

    public ahkc(ahix ahix) {
        this(ahix, false);
    }

    /* access modifiers changed from: protected */
    public final void D() {
        j();
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        if (!this.b) {
            this.d.m.a(true);
            if (j == Long.MAX_VALUE) {
                m();
            } else if (!this.j) {
                this.d.b(SystemClock.elapsedRealtime() + j + (d().a / 1000000));
            } else {
                n();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final long b() {
        return 36000000000L;
    }

    public final void c(ActivityRecognitionResult activityRecognitionResult) {
        if (!this.b) {
            int a = activityRecognitionResult.a().a();
            List list = this.k;
            Integer valueOf = Integer.valueOf(a);
            if (!list.contains(valueOf)) {
                this.k.add(valueOf);
            } else {
                return;
            }
        }
        super.c(activityRecognitionResult);
    }

    /* access modifiers changed from: protected */
    public final long e() {
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "FullDetectorInPast";
    }

    public final void h() {
        super.h();
        this.d.m();
    }

    /* access modifiers changed from: protected */
    public final void j() {
        this.k.clear();
        super.j();
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (!this.b) {
            this.d.m.a(false);
            super.k();
        }
    }

    public String p() {
        return "FullDetectingInPastState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final ahjy d() {
        if (!this.d.B.d()) {
            return this.d.K;
        }
        return null;
    }

    protected ahkc(ahix ahix, boolean z) {
        super(ahix, z);
        this.k = new ArrayList();
    }

    public final void b(ActivityRecognitionResult activityRecognitionResult) {
        ativ.a((Object) activityRecognitionResult);
        if (!this.b) {
            this.d.a(activityRecognitionResult);
            e(activityRecognitionResult);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (!this.b) {
            this.d.m.a(false);
            super.a(str);
        }
    }

    public final void a(List list) {
        if (!this.b) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ahjb.a(this.h, (FloorChangeEvent) list.get(i));
            }
            this.f.a(list);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        new Object[1][0] = Boolean.valueOf(z);
        if (this.j && this.d.a(9)) {
            a((ahle) new ahka(this.d));
        }
    }
}
