package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;

/* renamed from: adcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adcf extends adbw {
    final /* synthetic */ adcg a;

    public adcf(adcg adcg) {
        this.a = adcg;
    }

    public final void a(Status status, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable) {
        this.a.a((icl) new adbu(status, deviceDataUploadOptedInAccountsParcelable));
    }
}
