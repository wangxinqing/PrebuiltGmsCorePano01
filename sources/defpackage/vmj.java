package defpackage;

import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: vmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vmj implements Runnable {
    private final vmk a;
    private final OnTransferUpdateParams b;
    private final String c;
    private final vtx d;

    public vmj(vmk vmk, OnTransferUpdateParams onTransferUpdateParams, String str, vtx vtx) {
        this.a = vmk;
        this.b = onTransferUpdateParams;
        this.c = str;
        this.d = vtx;
    }

    public final void run() {
        vmk vmk = this.a;
        OnTransferUpdateParams onTransferUpdateParams = this.b;
        String str = this.c;
        vtx vtx = this.d;
        if (onTransferUpdateParams.b.a == 2) {
            vmk.b.b.c.w.a(onTransferUpdateParams.a, str);
        }
        vtx.a(onTransferUpdateParams.a, onTransferUpdateParams.b);
    }
}
