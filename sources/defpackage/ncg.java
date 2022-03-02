package defpackage;

@Deprecated
/* renamed from: ncg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ncg {
    REGISTER("u2f_register_request"),
    SIGN("u2f_sign_request");
    
    public final String c;

    private ncg(String str) {
        this.c = str;
    }

    public final String toString() {
        return this.c;
    }
}
