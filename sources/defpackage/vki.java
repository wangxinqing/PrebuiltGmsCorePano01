package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;

/* renamed from: vki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vki implements Runnable {
    private final vmt a;
    private final int b;
    private final RegisterSendSurfaceParams c;
    private final vtx d;
    private final vsh e;

    public vki(vmt vmt, int i, RegisterSendSurfaceParams registerSendSurfaceParams, vtx vtx, vsh vsh) {
        this.a = vmt;
        this.b = i;
        this.c = registerSendSurfaceParams;
        this.d = vtx;
        this.e = vsh;
    }

    public final void run() {
        vmt vmt = this.a;
        int i = this.b;
        RegisterSendSurfaceParams registerSendSurfaceParams = this.c;
        vtx vtx = this.d;
        vsh vsh = this.e;
        if (i != 4) {
            NearbySharingChimeraService.a(vmt.a, "registerSendSurface", registerSendSurfaceParams.d, new vlt(vmt, vtx, vsh, i));
        } else {
            NearbySharingChimeraService.a(vmt.a, "registerExternalSendSurface", registerSendSurfaceParams.d, new vls(vmt, vtx, vsh));
        }
    }
}
