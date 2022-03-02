package defpackage;

/* renamed from: bati  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bati implements batz {
    public final batz b;

    public bati(batz batz) {
        if (batz != null) {
            this.b = batz;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void a(batd batd, long j) {
        throw null;
    }

    public final bauc bu() {
        return this.b.bu();
    }

    public void close() {
        this.b.close();
    }

    public void flush() {
        this.b.flush();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(obj).length());
        sb.append(simpleName);
        sb.append("(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
