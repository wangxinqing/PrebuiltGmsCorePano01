package defpackage;

import android.text.TextUtils;

/* renamed from: nzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzg {
    public final String a;
    public final int b;

    public nzg(oll oll) {
        this.a = oll.b;
        this.b = oll.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nzg) {
            nzg nzg = (nzg) obj;
            if (this.b != nzg.b || !TextUtils.equals(this.a, nzg.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return str != null ? str.hashCode() * this.b : this.b;
    }
}
