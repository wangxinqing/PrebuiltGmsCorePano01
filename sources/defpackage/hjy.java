package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: hjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjy extends hjt {
    private final Class a;
    private final acwd b;

    public hjy(Class cls, acwd acwd) {
        this.a = cls;
        this.b = acwd;
    }

    public final void a(Bundle bundle) {
        hkb hkb = new hkb((Status) qbx.a(bundle, "status", Status.class), qbx.a(bundle, "parcelable", this.a));
        if (hkb.a.c()) {
            this.b.a((Object) hkb.b);
        } else {
            this.b.a((Exception) irj.a(hkb.a));
        }
    }
}
