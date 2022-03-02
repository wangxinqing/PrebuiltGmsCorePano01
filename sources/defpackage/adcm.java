package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheResponse;

/* renamed from: adcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adcm implements icl {
    public final UdcCacheResponse a;
    private final Status b;

    public adcm(Status status, UdcCacheResponse udcCacheResponse) {
        this.b = status;
        this.a = udcCacheResponse;
    }

    public final Status aO() {
        return this.b;
    }
}
