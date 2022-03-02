package defpackage;

import java.util.List;

/* renamed from: aest  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aest extends aetc {
    private final List b;
    private final aesm c;

    public aest(List list, aesm aesm) {
        if (list != null) {
            this.b = list;
            if (aesm != null) {
                this.c = aesm;
                return;
            }
            throw new NullPointerException("Null syncStatus");
        }
        throw new NullPointerException("Null footprints");
    }

    public final List a() {
        return this.b;
    }

    public final aesm b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aetc) {
            aetc aetc = (aetc) obj;
            return this.b.equals(aetc.a()) && this.c.equals(aetc.b());
        }
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("CoreMdhFootprintsReadResult{footprints=");
        sb.append(valueOf);
        sb.append(", syncStatus=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
