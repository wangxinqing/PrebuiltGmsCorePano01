package defpackage;

@Deprecated
/* renamed from: ncj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ncj {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");
    
    public final String c;

    private ncj(String str) {
        this.c = str;
    }

    public static ncj a(ncg ncg) {
        int ordinal = ncg.ordinal();
        if (ordinal == 0) {
            return REGISTER;
        }
        if (ordinal == 1) {
            return SIGN;
        }
        throw new ncf(ncg.c);
    }

    public final String toString() {
        return this.c;
    }
}
