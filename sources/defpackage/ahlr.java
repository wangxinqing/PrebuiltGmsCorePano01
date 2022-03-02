package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahlr {
    final /* synthetic */ ahlw e;

    public ahlr(ahlw ahlw) {
        this.e = ahlw;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public void a(ahlr ahlr) {
        ahlw ahlw = this.e;
        if (ahlw.f != -1) {
            ahlw.b.a(ajbe.VEHICLE_EXIT_DETECTOR);
            ahlw.f = -1;
        }
    }

    public void a(ActivityRecognitionResult activityRecognitionResult) {
    }

    public abstract String b();

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        if (!z) {
            ahlw ahlw = this.e;
            ahlw.a((ahlr) new ahlq(ahlw));
        }
    }
}
