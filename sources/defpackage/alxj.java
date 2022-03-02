package defpackage;

/* renamed from: alxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alxj {
    public final String a;

    public alxj(String str) {
        alys.a((Object) str, "sessionId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alxj) {
            return this.a.equals(((alxj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("SessionLeaveEvent [sessionId=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
