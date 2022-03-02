package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: amrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrr implements Serializable, amrm {
    private static final long serialVersionUID = 0;
    private final List a;

    public amrr(List list) {
        this.a = list;
    }

    public final boolean a(Object obj) {
        for (int i = 0; i < this.a.size(); i++) {
            if (((amrm) this.a.get(i)).a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amrr) {
            return this.a.equals(((amrr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 87855567;
    }

    public final String toString() {
        return amrs.a("or", this.a);
    }
}
