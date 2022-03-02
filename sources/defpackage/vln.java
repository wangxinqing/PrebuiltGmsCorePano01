package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SendParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vln implements Callable {
    private final vmt a;
    private final SendParams b;

    public vln(vmt vmt, SendParams sendParams) {
        this.a = vmt;
        this.b = sendParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        SendParams sendParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        ShareTarget shareTarget = sendParams.a;
        Intent intent = sendParams.b;
        Charset charset = NearbySharingChimeraService.a;
        return Integer.valueOf(nearbySharingChimeraService.a(shareTarget, intent));
    }
}
