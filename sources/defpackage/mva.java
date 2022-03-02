package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: mva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mva extends mvc {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mva(icc icc, Bundle bundle, long j) {
        super(icc);
        this.a = bundle;
        this.b = j;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        mye mye = (mye) ibf;
        try {
            Bundle bundle = this.a;
            long j = this.b;
            myo.a(bundle);
            ((mym) mye.x()).a(bundle, j);
            a((icl) Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            c(mvd.a);
        }
    }
}
