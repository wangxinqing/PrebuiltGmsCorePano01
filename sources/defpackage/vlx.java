package defpackage;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlx implements Callable {
    private final vmt a;
    private final SetEnabledParams b;

    public vlx(vmt vmt, SetEnabledParams setEnabledParams) {
        this.a = vmt;
        this.b = setEnabledParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        SetEnabledParams setEnabledParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        boolean z = setEnabledParams.a;
        Charset charset = NearbySharingChimeraService.a;
        return Integer.valueOf(nearbySharingChimeraService.d(z));
    }
}
