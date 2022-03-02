package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;

/* renamed from: tal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tal implements igp {
    private final CheckAuthStatusRequest a;

    public tal(CheckAuthStatusRequest checkAuthStatusRequest) {
        this.a = checkAuthStatusRequest;
    }

    public final void a(Object obj, Object obj2) {
        CheckAuthStatusRequest checkAuthStatusRequest = this.a;
        tap tap = new tap((acwd) obj2);
        tau tau = (tau) ((tav) obj).x();
        Parcel aQ = tau.aQ();
        bhx.a(aQ, (IInterface) tap);
        bhx.a(aQ, (Parcelable) checkAuthStatusRequest);
        tau.b(2, aQ);
    }
}
