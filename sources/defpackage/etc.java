package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest;

/* renamed from: etc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class etc extends etk {
    final /* synthetic */ NotifyCompletionRequest a;

    public etc(NotifyCompletionRequest notifyCompletionRequest) {
        this.a = notifyCompletionRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(eua eua) {
        etz etz = this.c;
        NotifyCompletionRequest notifyCompletionRequest = this.a;
        Parcel aQ = eua.aQ();
        bhx.a(aQ, (IInterface) etz);
        bhx.a(aQ, (Parcelable) notifyCompletionRequest);
        eua.b(9, aQ);
    }
}
