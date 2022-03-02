package defpackage;

import android.content.Context;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: yil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yil implements agwa {
    private final Context a;

    public yil(Context context) {
        this.a = context;
    }

    public final String a() {
        return zok.b(this.a).a;
    }

    public final void a(zoa zoa) {
        if (azaf.e()) {
            zol.a(zoa, this.a);
        } else {
            zol.a(new PseudonymousIdToken(((znr) zoa).a), this.a);
        }
    }
}
