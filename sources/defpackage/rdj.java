package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* renamed from: rdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rdj extends rgd {
    final /* synthetic */ acwd a;

    public rdj(acwd acwd) {
        this.a = acwd;
    }

    public final void a() {
    }

    public final void a(FusedLocationProviderResult fusedLocationProviderResult) {
        Status status = fusedLocationProviderResult.b;
        if (status == null) {
            this.a.b((Exception) new ibr(new Status(8, "Got null status from location service")));
        } else if (status.i == 0) {
            this.a.a((Object) true);
        } else {
            this.a.b((Exception) irj.a(status));
        }
    }
}
