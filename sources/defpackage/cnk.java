package defpackage;

import java.util.Map;

/* renamed from: cnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cnk extends cns {
    public final Map a;
    private final cpp b;

    public cnk(cpp cpp, Map map) {
        if (cpp != null) {
            this.b = cpp;
            if (map != null) {
                this.a = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final cpp a() {
        return this.b;
    }

    public final Map b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cns) {
            cns cns = (cns) obj;
            return this.b.equals(cns.a()) && this.a.equals(cns.b());
        }
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("SchedulerConfig{clock=");
        sb.append(valueOf);
        sb.append(", values=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
