package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

/* renamed from: abpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abpe implements acvz {
    private final abpf a;
    private final tas b;

    public abpe(abpf abpf, tas tas) {
        this.a = abpf;
        this.b = tas;
    }

    public final acwa a(Object obj) {
        boolean z;
        abpf abpf = this.a;
        tas tas = this.b;
        CheckAuthStatusResponse checkAuthStatusResponse = (CheckAuthStatusResponse) obj;
        int i = abpg.b;
        if (checkAuthStatusResponse == null) {
            return acws.a((Exception) new NullPointerException("Auth status is null"));
        }
        UserKey userKey = checkAuthStatusResponse.e;
        String str = checkAuthStatusResponse.a;
        if (userKey == null) {
            return acws.a(new Exception("user key is null"));
        }
        if (TextUtils.isEmpty(str)) {
            return acws.a(new Exception("empty request id"));
        }
        abpf.b = userKey;
        GetPhoneNumbersRequest getPhoneNumbersRequest = new tbg().a;
        getPhoneNumbersRequest.a = str;
        getPhoneNumbersRequest.b = userKey;
        iva.b(true, "Need a non-null request for getPhoneNumbers().");
        if (getPhoneNumbersRequest.a != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Need a non-null request_id.");
        iha b2 = ihb.b();
        b2.a = new tam(getPhoneNumbersRequest);
        b2.b = new Feature[]{taj.a};
        return tas.b(b2.a());
    }
}
