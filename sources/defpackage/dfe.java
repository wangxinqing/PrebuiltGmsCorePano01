package defpackage;

/* renamed from: dfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dfe extends dfo {
    public final aqsr a;

    public dfe(aqsr aqsr) {
        if (aqsr != null) {
            this.a = aqsr;
            return;
        }
        throw new NullPointerException("Null bottomNavKey");
    }

    public final aqsr a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfo) {
            return this.a.equals(((dfo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        aqsr aqsr = this.a;
        int i = aqsr.S;
        if (i == 0) {
            i = aueh.a.a((Object) aqsr).a(aqsr);
            aqsr.S = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("BottomNavFrameBlueprint{bottomNavKey=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
