package defpackage;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: wdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wdk extends tjd {
    final /* synthetic */ wdq a;

    public wdk(wdq wdq) {
        this.a = wdq;
    }

    public final void a(String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.a.a((Runnable) new wdj(this, str, payloadTransferUpdate));
    }

    public final void a(String str, tjc tjc) {
        this.a.a((Runnable) new wdi(this, tjc));
    }
}
