package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: alrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrq {
    public final List a;
    public final alrp b;

    public alrq(List list, alrp alrp) {
        this.a = list;
        this.b = alrp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        alrq alrq = (alrq) obj;
        return alyr.a(this.b, alrq.b, this.a, alrq.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
        sb.append("Type: ");
        sb.append(valueOf);
        sb.append(", snapshot: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
