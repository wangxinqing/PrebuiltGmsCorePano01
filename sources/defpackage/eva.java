package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: eva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eva extends fga {
    private final acwd a;
    private final Class b;

    public eva(acwd acwd, Class cls) {
        this.a = acwd;
        this.b = cls;
    }

    public final void a(Bundle bundle) {
        Class cls = this.b;
        Status status = (Status) qbx.a(bundle, "status", Status.class);
        iva.a((Object) status);
        evg evg = new evg(status, amri.c(qbx.a(bundle, "parcelable", cls)));
        if (evg.a.c()) {
            this.a.a((Object) (SafeParcelable) evg.b.b());
        } else {
            this.a.a((Exception) irj.a(evg.a));
        }
    }
}
