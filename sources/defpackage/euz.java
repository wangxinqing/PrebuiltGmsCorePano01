package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Collection;

/* renamed from: euz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class euz extends fga {
    private final acwd a;
    private final Class b;

    public euz(acwd acwd, Class cls) {
        this.a = acwd;
        this.b = cls;
    }

    public final void a(Bundle bundle) {
        amzy amzy;
        Class cls = this.b;
        Status status = (Status) qbx.a(bundle, "status", Status.class);
        iva.a((Object) status);
        Bundle bundle2 = bundle.getBundle("parcelables");
        if (bundle2 == null) {
            amzy = amzy.h();
        } else {
            bundle2.setClassLoader(cls.getClassLoader());
            amzy = amzy.a((Collection) bundle2.getParcelableArrayList("parcelables"));
        }
        evf evf = new evf(status, amzy.a((Collection) amzy));
        if (evf.a.c()) {
            this.a.a((Object) evf.b);
        } else {
            this.a.a((Exception) irj.a(evf.a));
        }
    }
}
