package defpackage;

import java.util.List;

/* renamed from: afho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afho extends afhr {
    public final List a;

    public afho(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afhr) {
            return this.a.equals(((afhr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("LatestFootprintsFilter{secondaryIdMatchers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
