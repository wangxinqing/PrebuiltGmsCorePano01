package defpackage;

import com.google.android.gms.mdisync.internal.SyncRequest;

/* renamed from: skx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class skx implements afuq {
    private final skz a;
    private final slh b;

    public skx(skz skz, slh slh) {
        this.a = skz;
        this.b = slh;
    }

    public final aorr a(afxv afxv) {
        skz skz = this.a;
        slh slh = this.b;
        SyncRequest syncRequest = skz.a;
        return slh.b(syncRequest.a, syncRequest.b);
    }
}
