package defpackage;

import android.os.Bundle;

/* renamed from: afbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afbv {
    private final aelh a;
    private final afbu b;

    public afbv(aelh aelh, afbu afbu) {
        this.a = aelh;
        this.b = afbu;
    }

    public final aorr a(Bundle bundle) {
        if (!((Boolean) this.a.a()).booleanValue()) {
            return aorl.a((Object) null);
        }
        return this.b.a(bundle);
    }
}
