package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheResponse;

/* renamed from: adcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adcb extends adbw {
    final /* synthetic */ adcc a;

    public adcb(adcc adcc) {
        this.a = adcc;
    }

    public final void a(Status status, UdcCacheResponse udcCacheResponse) {
        this.a.a((icl) new adcm(status, udcCacheResponse));
    }
}
