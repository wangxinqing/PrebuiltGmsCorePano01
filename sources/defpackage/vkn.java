package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SendParams;

/* renamed from: vkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkn implements Runnable {
    private final vmt a;
    private final SendParams b;

    public vkn(vmt vmt, SendParams sendParams) {
        this.a = vmt;
        this.b = sendParams;
    }

    public final void run() {
        vmt vmt = this.a;
        SendParams sendParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "send", sendParams.c, new vln(vmt, sendParams));
    }
}
