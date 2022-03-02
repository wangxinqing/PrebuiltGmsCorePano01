package defpackage;

/* renamed from: alqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqi {
    public final alqh a;
    public final Exception b;
    public final int c;
    public final int d;

    public alqi(alqh alqh, int i, Exception exc, int i2) {
        this.a = alqh;
        this.b = exc;
        this.d = i;
        this.c = i2;
        if (alqh == null) {
            throw null;
        } else if (alqh != alqh.FAIL) {
            if (exc != null || i != 0) {
                throw new IllegalArgumentException("failureCause and errorType must not be set when result is not FAIL");
            }
        } else if (exc == null || i == 0) {
            throw new NullPointerException("failureCause and errorType must be set when result is FAIL");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof alqi)) {
            alqi alqi = (alqi) obj;
            if (this.d == alqi.d) {
                Exception exc = this.b;
                if (exc != null) {
                    if (!exc.equals(alqi.b)) {
                        return false;
                    }
                } else if (alqi.b != null) {
                    return false;
                }
                if (this.a == alqi.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        int i3 = (i + 31) * 31;
        Exception exc = this.b;
        int hashCode = (i3 + (exc != null ? exc.hashCode() : 0)) * 31;
        alqh alqh = this.a;
        if (alqh != null) {
            i2 = alqh.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        if (this.b != null) {
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42 + String.valueOf(valueOf2).length());
            sb.append("TestCompleteEvent [status=");
            sb.append(valueOf);
            sb.append(", failureCause=");
            sb.append(valueOf2);
            sb.append("]");
            return sb.toString();
        }
        String valueOf3 = String.valueOf(this.a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
        sb2.append("TestCompleteEvent [status=");
        sb2.append(valueOf3);
        sb2.append("]");
        return sb2.toString();
    }
}
