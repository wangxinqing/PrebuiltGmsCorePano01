package defpackage;

/* renamed from: batj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class batj implements baua {
    private final baua a;

    public batj(baua baua) {
        if (baua != null) {
            this.a = baua;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final bauc bu() {
        return this.a.bu();
    }

    public long c(batd batd, long j) {
        return this.a.c(batd, j);
    }

    public void close() {
        this.a.close();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String obj = this.a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(obj).length());
        sb.append(simpleName);
        sb.append("(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
