package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersResponse;

/* renamed from: tat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class tat extends bhw implements IInterface {
    public tat() {
        super("com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionCallbacks");
    }

    public void a(Status status, CheckAuthStatusResponse checkAuthStatusResponse) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, GetEsimConfigResponse getEsimConfigResponse) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, GetPhoneNumbersResponse getPhoneNumbersResponse) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((Status) bhx.a(parcel, Status.CREATOR), (CheckAuthStatusResponse) bhx.a(parcel, CheckAuthStatusResponse.CREATOR));
            return true;
        } else if (i == 3) {
            a((Status) bhx.a(parcel, Status.CREATOR), (GetPhoneNumbersResponse) bhx.a(parcel, GetPhoneNumbersResponse.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR), (GetEsimConfigResponse) bhx.a(parcel, GetEsimConfigResponse.CREATOR));
            return true;
        }
    }
}
