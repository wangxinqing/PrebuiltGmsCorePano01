package defpackage;

/* renamed from: alpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpv {
    public final Exception a;
    public final int b;
    public final alpx c;
    public final int d;

    public alpv(int i, Exception exc, int i2, alpx alpx) {
        this.d = i;
        this.a = exc;
        this.b = i2;
        this.c = alpx;
        if (exc == null) {
            throw null;
        }
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN_SID" : "INVALID_RESPONSE" : "SERVER_BACKOFF" : "SERVER_ERROR" : "NETWORK";
        String valueOf = String.valueOf(this.a);
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 59 + String.valueOf(valueOf).length());
        sb.append("BindErrorEvent [errorType=");
        sb.append(str);
        sb.append(", cause=");
        sb.append(valueOf);
        sb.append(", statusCode=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public alpv(int i, Exception exc, alpx alpx) {
        this(i, exc, -1, alpx);
    }
}
