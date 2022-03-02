package com.google.android.gms.common.download;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DownloadAndroidChimeraService extends nio {
    private ipi a;

    public static DownloadAndroidChimeraService provideInstance() {
        iox iox = new iox();
        irc c = ihs.c();
        awdx.a(c);
        iox.a = c;
        if (iox.b == null) {
            iox.b = new iqx((byte[]) null);
        }
        awdx.a((Object) iox.a, irc.class);
        return (DownloadAndroidChimeraService) new ioz().a.a();
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        ioy a2 = this.a.a(new ira(getServiceRequest));
        nit.a(new ipd((nix) a2.b.b.a(), (GetServiceRequest) a2.a.a()));
    }

    public DownloadAndroidChimeraService(ipi ipi) {
        super(43, "com.google.android.gms.common.download.START", (Set) anfv.a, 2, 10);
        this.a = ipi;
    }
}
