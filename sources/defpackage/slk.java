package defpackage;

/* renamed from: slk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class slk extends sls {
    public final slq a;
    private final slr b;

    public slk(slq slq, slr slr) {
        if (slq != null) {
            this.a = slq;
            if (slr != null) {
                this.b = slr;
                return;
            }
            throw new NullPointerException("Null scheduleType");
        }
        throw new NullPointerException("Null taskId");
    }

    public final slq a() {
        return this.a;
    }

    public final slr b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sls) {
            sls sls = (sls) obj;
            return this.a.equals(sls.a()) && this.b.equals(sls.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
