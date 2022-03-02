package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: alrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrk {
    public final List a;

    public alrk(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alrk)) {
            return false;
        }
        return alyr.a(this.a, ((alrk) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeEvent [updatedAttributes [");
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                sb.append(this.a.get(size));
                if (size == 0) {
                    sb.append("]");
                } else {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
