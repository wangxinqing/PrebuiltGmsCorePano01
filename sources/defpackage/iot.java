package defpackage;

import android.content.Context;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: iot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iot implements agwa {
    private final Context a;

    public iot(Context context) {
        this.a = context;
    }

    public final String a() {
        return zok.b(this.a).a;
    }

    public final void a(zoa zoa) {
        if (azaf.e()) {
            zol.a(zoa, this.a, (hph) null);
        } else {
            zol.a(new PseudonymousIdToken(((znr) zoa).a), this.a, (hph) null);
        }
    }
}
