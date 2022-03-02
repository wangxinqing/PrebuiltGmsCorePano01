package defpackage;

import com.google.android.gms.mdisync.internal.SyncRequest;

/* renamed from: sky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sky implements afun {
    private final skz a;
    private final slh b;

    public sky(skz skz, slh slh) {
        this.a = skz;
        this.b = slh;
    }

    public final aorr a() {
        skz skz = this.a;
        slh slh = this.b;
        SyncRequest syncRequest = skz.a;
        return slh.a(syncRequest.a, syncRequest.b);
    }
}
