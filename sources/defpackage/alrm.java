package defpackage;

import java.util.Arrays;

/* renamed from: alrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrm {
    public final alrl a;
    public final Object b;

    public alrm(alrl alrl, Object obj) {
        alys.a((Object) alrl, "type cannot be null");
        boolean equals = alrl.equals(alrl.UNKNOWN);
        String valueOf = String.valueOf(alrl);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("We do not support the type: ");
        sb.append(valueOf);
        alys.a(!equals, sb.toString());
        this.a = alrl;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alrm)) {
            return false;
        }
        alrm alrm = (alrm) obj;
        return alyr.a(this.a, alrm.a, this.b, alrm.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
        sb.append("AttributeUpdate [type=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
