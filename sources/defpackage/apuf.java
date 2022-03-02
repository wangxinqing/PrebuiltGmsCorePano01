package defpackage;

/* renamed from: apuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum apuf {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE("authorization_code");
    
    public final String c;

    private apuf(String str) {
        this.c = str;
    }

    public final String toString() {
        return this.c;
    }
}
