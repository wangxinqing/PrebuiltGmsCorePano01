package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: akxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akxp extends akhl {
    final /* synthetic */ ActivityRecognitionRequest b;
    final /* synthetic */ akxr c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akxp(akxr akxr, icc icc, ActivityRecognitionRequest activityRecognitionRequest) {
        super(icc);
        this.c = akxr;
        this.b = activityRecognitionRequest;
    }

    /* access modifiers changed from: protected */
    public final icf a() {
        akxr akxr = this.c;
        rfj rfj = akxr.e;
        icc icc = akxr.a;
        return icc.b((idf) new rfh(icc, this.b, akxr.b()));
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status = (Status) icl;
        super.a((icl) status);
        if (status.c()) {
            this.c.c = true;
        }
    }
}
