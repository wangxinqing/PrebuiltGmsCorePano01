package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;

/* renamed from: vjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjw implements Runnable {
    private final NearbySharingChimeraService.AnonymousClass3 a;
    private final Context b;

    public vjw(NearbySharingChimeraService.AnonymousClass3 r1, Context context) {
        this.a = r1;
        this.b = context;
    }

    public final void run() {
        NearbySharingChimeraService.AnonymousClass3 r0 = this.a;
        Context context = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
        boolean a2 = wia.a(context);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.b(a2);
    }
}
