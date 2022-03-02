package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: rfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rfa implements idg {
    private final acwd a;

    public rfa(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        this.a.a((Exception) new ibr(status));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.a;
        if (status.c()) {
            this.a.a((Object) new ick(locationSettingsResult));
        } else if (status.b()) {
            this.a.a((Exception) new icj(status));
        } else {
            this.a.a((Exception) new ibr(status));
        }
    }
}
