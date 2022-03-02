package defpackage;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersResponse;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;

/* renamed from: abpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abpd implements acvz {
    private final abpf a;
    private final EsimActivationInfo b;
    private final TelephonyManager c;
    private final tas d;

    public abpd(abpf abpf, EsimActivationInfo esimActivationInfo, TelephonyManager telephonyManager, tas tas) {
        this.a = abpf;
        this.b = esimActivationInfo;
        this.c = telephonyManager;
        this.d = tas;
    }

    public final acwa a(Object obj) {
        boolean z;
        abpf abpf = this.a;
        EsimActivationInfo esimActivationInfo = this.b;
        TelephonyManager telephonyManager = this.c;
        tas tas = this.d;
        GetPhoneNumbersResponse getPhoneNumbersResponse = (GetPhoneNumbersResponse) obj;
        int i = abpg.b;
        if (getPhoneNumbersResponse == null) {
            return acws.a((Exception) new NullPointerException("phoneNumbersResponse is null"));
        }
        String str = getPhoneNumbersResponse.b[0];
        String str2 = getPhoneNumbersResponse.a;
        if (TextUtils.isEmpty(str)) {
            return acws.a(new Exception("empty phone number"));
        }
        if (TextUtils.isEmpty(str2)) {
            return acws.a(new Exception("empty request id"));
        }
        abpf.a = str;
        tbd tbd = new tbd();
        GetEsimConfigRequest getEsimConfigRequest = tbd.a;
        getEsimConfigRequest.a = str2;
        getEsimConfigRequest.c = esimActivationInfo.b;
        getEsimConfigRequest.d = esimActivationInfo.c;
        String subscriberId = telephonyManager.getSubscriberId();
        GetEsimConfigRequest getEsimConfigRequest2 = tbd.a;
        getEsimConfigRequest2.e = subscriberId;
        getEsimConfigRequest2.b = abpf.b;
        getEsimConfigRequest2.f = str;
        iva.b(true, "Need a non-null request for getEsimConfig().");
        if (getEsimConfigRequest2.a != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Need a non-null request_id.");
        iha b2 = ihb.b();
        b2.a = new tan(getEsimConfigRequest2);
        b2.b = new Feature[]{taj.a};
        return tas.b(b2.a());
    }
}
