package defpackage;

import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;

/* renamed from: abpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abpc implements acvz {
    private final abpf a;
    private final EsimActivationInfo b;
    private final SubscriptionInfo c;

    public abpc(abpf abpf, EsimActivationInfo esimActivationInfo, SubscriptionInfo subscriptionInfo) {
        this.a = abpf;
        this.b = esimActivationInfo;
        this.c = subscriptionInfo;
    }

    public final acwa a(Object obj) {
        abpf abpf = this.a;
        EsimActivationInfo esimActivationInfo = this.b;
        SubscriptionInfo subscriptionInfo = this.c;
        GetEsimConfigResponse getEsimConfigResponse = (GetEsimConfigResponse) obj;
        int i = abpg.b;
        if (getEsimConfigResponse == null) {
            return acws.a((Exception) new NullPointerException("esimConfigResponse is null"));
        }
        String str = getEsimConfigResponse.e;
        if (TextUtils.isEmpty(str)) {
            return acws.a(new Exception("empty activation code"));
        }
        return acws.a((Object) new EsimActivationPayload(str, abpf.a, esimActivationInfo.d, subscriptionInfo.isEmbedded()));
    }
}
