package defpackage;

import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.dynamiclinks.service.DynamicLinksApiChimeraService;

/* renamed from: mci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mci extends apwk implements niz {
    private final DynamicLinksApiChimeraService a;
    private final nix b;
    private final String c;
    private final int d;

    public mci(DynamicLinksApiChimeraService dynamicLinksApiChimeraService, nix nix, String str, int i) {
        this.a = dynamicLinksApiChimeraService;
        this.b = nix;
        this.c = str;
        this.d = i;
    }

    public final void a(apwj apwj, Bundle bundle) {
        this.b.a(this.a, new mcj(apwj, this.c, bundle));
    }

    public final void a(apwj apwj, String str) {
        ClientContext clientContext = new ClientContext();
        clientContext.b = Process.myUid();
        clientContext.e = this.c;
        clientContext.f = this.a.getPackageName();
        this.b.a(this.a, new mcl(apwj, str, clientContext, mcg.a(this.a), this.d));
    }
}
