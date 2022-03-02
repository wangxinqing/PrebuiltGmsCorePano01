package defpackage;

/* renamed from: avws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class avws extends Exception {
    private final Throwable a;

    public avws() {
        this.a = null;
    }

    public final Throwable getCause() {
        return this.a;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(super.toString());
        Throwable th = this.a;
        if (th != null) {
            String valueOf2 = String.valueOf(th.toString());
            str = valueOf2.length() == 0 ? new String(" ") : " ".concat(valueOf2);
        } else {
            str = "";
        }
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf3);
    }

    public avws(String str) {
        super(str);
        this.a = null;
    }

    public avws(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
