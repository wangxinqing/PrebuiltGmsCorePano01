package defpackage;

import android.os.Bundle;

/* renamed from: qwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qwd {
    public final boolean a;
    private final boolean b;

    public qwd(qwc qwc) {
        this.b = qwc.a;
        this.a = qwc.b;
    }

    public static qwd a(Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new qwc().a();
        }
        qwc qwc = new qwc();
        qwc.a = true;
        qwc.b = bundle.getBoolean("a");
        return qwc.a();
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        if (this.b) {
            bundle.putBoolean("a", this.a);
        }
        return bundle;
    }
}
