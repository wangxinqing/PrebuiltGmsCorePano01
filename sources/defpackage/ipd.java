package defpackage;

import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: ipd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ipd extends ipy implements niz {
    private final String a;
    private final nix b;

    public ipd(nix nix, GetServiceRequest getServiceRequest) {
        this.a = getServiceRequest.d;
        this.b = nix;
    }

    public final void a(iqc iqc, DownloadDetails downloadDetails) {
        this.b.a(new ipf(iqc, downloadDetails));
    }

    public final void b(iqc iqc, String str) {
        this.b.a(new ipg(iqc, this.a, str));
    }

    public final void c(iqc iqc, String str) {
        this.b.a(new iph(iqc, str));
    }

    public final void a(iqc iqc, String str) {
        this.b.a(new ipe(iqc, str));
    }
}
