package defpackage;

import android.content.Context;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;

/* renamed from: adjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjg extends iby {
    private static final ibq a = new ibq("SystemUpdate.API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new adiw();

    protected adjg(Context context) {
        super(context, a, (ibm) null, ibx.a);
    }

    public final acwa a() {
        return a((ihb) new adjc());
    }

    public final void b(adil adil) {
        ige a2 = igf.a(adil, this.h, adil.class.getSimpleName());
        igc igc = a2.b;
        iva.a((Object) igc, (Object) "Key must not be null");
        a((igi) new adjd(a2, adil), (ihg) new adje(igc, adil));
    }

    public final acwa p() {
        return a((ihb) new adiv());
    }

    public final void q() {
        b((ihb) new adiz());
    }

    public final void r() {
        b((ihb) new adit());
    }

    public final acwa a(adil adil) {
        return a(igf.a(adil, adil.class.getSimpleName()));
    }

    public final acwa a(ConfigUpdateOptions configUpdateOptions) {
        return b((ihb) new adiu(configUpdateOptions));
    }

    public final void a(ActivityStatus activityStatus) {
        b((ihb) new adjb(activityStatus));
    }

    public final void a(DownloadOptions downloadOptions) {
        b((ihb) new adix(downloadOptions));
    }

    public final void b(DownloadOptions downloadOptions) {
        b((ihb) new adja(downloadOptions));
    }

    public final void a(InstallationOptions installationOptions) {
        b((ihb) new adiy(installationOptions));
    }

    public final void b(InstallationOptions installationOptions) {
        b((ihb) new adis(installationOptions));
    }
}
