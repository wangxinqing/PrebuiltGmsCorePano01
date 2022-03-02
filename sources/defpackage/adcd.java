package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;

/* renamed from: adcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adcd extends adbw {
    final /* synthetic */ adce a;

    public adcd(adce adce) {
        this.a = adce;
    }

    public final void a(Status status, DeviceDataUploadOptInFlags deviceDataUploadOptInFlags) {
        this.a.a((icl) new adbt(status, deviceDataUploadOptInFlags));
    }
}
