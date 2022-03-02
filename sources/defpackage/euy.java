package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: euy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class euy extends fga {
    private final acwd a;

    public euy(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Bundle bundle) {
        euf euf = new euf((Status) ivy.a((byte[]) iva.a((Object) bundle.getByteArray("status")), Status.CREATOR), bundle.getBoolean("boolean"));
        if (euf.a.c()) {
            this.a.a((Object) Boolean.valueOf(euf.b));
        } else {
            this.a.a((Exception) irj.a(euf.a));
        }
    }
}
