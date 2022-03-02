package defpackage;

import java.util.Map;

/* renamed from: ahhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahhk extends ahhq {
    public final Map a() {
        return null;
    }

    public final Class b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahhq) {
            ahhq ahhq = (ahhq) obj;
            return ahhq.a() == null && ahhq.b() == null;
        }
    }

    public final int hashCode() {
        return -721379959;
    }

    public final String toString() {
        String valueOf = String.valueOf((Object) null);
        String valueOf2 = String.valueOf((Object) null);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("StrictModeVmConfig{maxInstanceLimits=");
        sb.append(valueOf);
        sb.append(", leakDetector=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
