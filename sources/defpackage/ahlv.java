package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlv extends ahlr {
    final /* synthetic */ ahlw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahlv(ahlw ahlw) {
        super(ahlw);
        this.a = ahlw;
    }

    public final String b() {
        return "WaitingForInVehicle";
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        if (ahlw.b(activityRecognitionResult)) {
            ahlw ahlw = this.a;
            ahlw.a((ahlr) new ahln(ahlw));
        }
    }
}
