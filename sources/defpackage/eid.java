package defpackage;

import android.os.Bundle;

/* renamed from: eid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eid {
    private final Bundle a;

    public eid() {
        this(new Bundle());
    }

    public final eie a() {
        return new eie(this.a);
    }

    public final void a(aqll aqll) {
        if (aqll != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("keyTokenRequestOptionsWrapperBundle", aqll.k());
            this.a.putBundle("keyTokenRequestOptionsAuthExtrasBundle", bundle);
        }
    }

    public eid(Bundle bundle) {
        this.a = bundle == null ? new Bundle() : bundle;
    }
}
