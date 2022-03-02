package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;

/* renamed from: vkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkx implements Runnable {
    private final vmt a;
    private final SetAccountParams b;

    public vkx(vmt vmt, SetAccountParams setAccountParams) {
        this.a = vmt;
        this.b = setAccountParams;
    }

    public final void run() {
        vmt vmt = this.a;
        SetAccountParams setAccountParams = this.b;
        NearbySharingChimeraService.a(vmt.a, "setAccount", setAccountParams.b, new vlg(vmt, setAccountParams));
    }
}
