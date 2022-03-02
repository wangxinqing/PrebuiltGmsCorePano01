package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: amrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrn implements Serializable, amrm {
    private static final long serialVersionUID = 0;
    private final List a;

    public amrn(List list) {
        this.a = list;
    }

    public final boolean a(Object obj) {
        for (int i = 0; i < this.a.size(); i++) {
            if (!((amrm) this.a.get(i)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amrn) {
            return this.a.equals(((amrn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        return amrs.a("and", this.a);
    }
}
