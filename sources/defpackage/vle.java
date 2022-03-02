package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vle implements Callable {
    private final vmt a;
    private final SetVisibilityParams b;

    public vle(vmt vmt, SetVisibilityParams setVisibilityParams) {
        this.a = vmt;
        this.b = setVisibilityParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        SetVisibilityParams setVisibilityParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        int i = setVisibilityParams.a;
        Charset charset = NearbySharingChimeraService.a;
        return Integer.valueOf(nearbySharingChimeraService.a(i));
    }
}
