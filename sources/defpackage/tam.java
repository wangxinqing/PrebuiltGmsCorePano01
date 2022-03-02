package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;

/* renamed from: tam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tam implements igp {
    private final GetPhoneNumbersRequest a;

    public tam(GetPhoneNumbersRequest getPhoneNumbersRequest) {
        this.a = getPhoneNumbersRequest;
    }

    public final void a(Object obj, Object obj2) {
        GetPhoneNumbersRequest getPhoneNumbersRequest = this.a;
        taq taq = new taq((acwd) obj2);
        tau tau = (tau) ((tav) obj).x();
        Parcel aQ = tau.aQ();
        bhx.a(aQ, (IInterface) taq);
        bhx.a(aQ, (Parcelable) getPhoneNumbersRequest);
        tau.b(3, aQ);
    }
}
