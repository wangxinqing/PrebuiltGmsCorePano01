package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.update.InstallationOptions;

/* renamed from: adis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adis extends ihb {
    final /* synthetic */ InstallationOptions a;

    public adis(InstallationOptions installationOptions) {
        this.a = installationOptions;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ((adif) ((adnr) ibf).x()).b(this.a);
        ihd.a(Status.a, acwd);
    }
}
