package defpackage;

/* renamed from: cmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cmr extends cmw {
    private final long a;
    private final int b;

    public cmr(int i, long j) {
        this.b = i;
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmw) {
            cmw cmw = (cmw) obj;
            return this.b == cmw.b() && this.a == cmw.a();
        }
    }

    public final int hashCode() {
        int i = this.b;
        long j = this.a;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK";
        long j = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 68);
        sb.append("BackendResponse{status=");
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
