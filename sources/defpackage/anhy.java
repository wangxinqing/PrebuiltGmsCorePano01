package defpackage;

/* renamed from: anhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anhy {
    public static final anhy a = new anhw();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogSite{ class=");
        sb.append(a());
        sb.append(", method=");
        sb.append(b());
        sb.append(", line=");
        sb.append(c());
        if (d() != null) {
            sb.append(", file=");
            sb.append(d());
        }
        sb.append(" }");
        return sb.toString();
    }
}
