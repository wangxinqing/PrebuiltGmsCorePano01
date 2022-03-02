package defpackage;

/* renamed from: banv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum banv {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    public final String e;

    private banv(String str) {
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
