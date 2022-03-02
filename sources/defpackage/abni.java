package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

/* renamed from: abni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abni implements icl {
    public final Status a;
    public final AdvertisingInfo b;

    public abni(Status status, AdvertisingInfo advertisingInfo) {
        this.a = status;
        this.b = advertisingInfo;
    }

    public final Status aO() {
        return this.a;
    }
}
