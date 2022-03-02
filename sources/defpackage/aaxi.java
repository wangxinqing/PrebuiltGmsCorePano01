package defpackage;

/* renamed from: aaxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaxi extends aaxl {
    private final String a;
    private final int b;

    public aaxi(String str, int i) {
        if (str != null) {
            this.a = str;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null activityName");
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaxl) {
            aaxl aaxl = (aaxl) obj;
            return this.a.equals(aaxl.a()) && this.b == aaxl.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 68);
        sb.append("BlockedActivityDetails{activityName=");
        sb.append(str);
        sb.append(", activityFrequency=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
