package defpackage;

import java.util.List;

/* renamed from: ahhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahhl extends ahhz {
    public final int a;
    public final List b;

    public ahhl(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final int a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahhz) {
            ahhz ahhz = (ahhz) obj;
            return this.a == ahhz.a() && this.b.equals(ahhz.b());
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Violation{violationType=");
        sb.append(i);
        sb.append(", stackTrace=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
