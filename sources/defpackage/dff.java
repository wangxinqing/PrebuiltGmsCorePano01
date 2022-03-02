package defpackage;

/* renamed from: dff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dff extends dfw {
    public final aqsr a;

    public dff(aqsr aqsr) {
        if (aqsr != null) {
            this.a = aqsr;
            return;
        }
        throw new NullPointerException("Null screenKey");
    }

    public final aqsr a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfw) {
            return this.a.equals(((dfw) obj).a());
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("CardsScreenBlueprint{screenKey=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
