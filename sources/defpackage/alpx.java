package defpackage;

/* renamed from: alpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpx {
    public final String a;
    public final long b;

    public alpx(String str, long j) {
        this.a = str;
        this.b = j;
        if (str.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alpx) {
            alpx alpx = (alpx) obj;
            return this.a.equals(alpx.a) && this.b == alpx.b;
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 74);
        sb.append("ContinuationToken [channelSid=");
        sb.append(str);
        sb.append(", mostRecentEnvelopeId=");
        sb.append(j);
        sb.append("]");
        return sb.toString();
    }
}
