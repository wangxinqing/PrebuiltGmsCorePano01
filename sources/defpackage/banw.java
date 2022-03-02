package defpackage;

/* renamed from: banw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum banw {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String e;

    private banw(String str) {
        this.e = str;
    }

    public static banw a(String str) {
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected TLS version: ") : "Unexpected TLS version: ".concat(valueOf));
    }
}
