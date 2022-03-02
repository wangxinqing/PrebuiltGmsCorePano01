package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: rfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rfh extends rcc {
    final /* synthetic */ ActivityRecognitionRequest a;
    final /* synthetic */ PendingIntent b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfh(icc icc, ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent) {
        super(icc);
        this.a = activityRecognitionRequest;
        this.b = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((rgu) ibf).a(this.a, this.b, (idg) this);
    }
}
