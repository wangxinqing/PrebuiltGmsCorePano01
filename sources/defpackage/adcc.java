package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;

/* renamed from: adcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adcc extends adcj {
    final /* synthetic */ UdcCacheRequest a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adcc(icc icc, UdcCacheRequest udcCacheRequest) {
        super(icc);
        this.a = udcCacheRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(adca adca) {
        adca.a((adbx) new adcb(this), this.a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new adcm(status, (UdcCacheResponse) null);
    }
}
