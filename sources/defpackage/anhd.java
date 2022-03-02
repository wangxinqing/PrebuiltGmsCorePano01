package defpackage;

import java.util.Set;

/* renamed from: anhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class anhd extends angw implements Set {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public Set a() {
        return (Set) super.a();
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    public anhd(Set set, Object obj) {
        super(set, obj);
    }
}
