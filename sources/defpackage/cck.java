package defpackage;

import java.util.HashSet;

/* renamed from: cck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cck {
    public final ccv a;
    public final HashSet b = new HashSet();

    public cck(ccv ccv) {
        iva.a((Object) ccv);
        this.a = ccv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cck) {
            return this.a.equals(((cck) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
