package defpackage;

import java.io.IOException;

/* renamed from: avzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avzh {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    public final String e;

    private avzh(String str) {
        this.e = str;
    }

    public static avzh a(String str) {
        if (str.equals(HTTP_1_0.e)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.e)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.e)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.e)) {
            return SPDY_3;
        }
        String valueOf = String.valueOf(str);
        throw new IOException(valueOf.length() == 0 ? new String("Unexpected protocol: ") : "Unexpected protocol: ".concat(valueOf));
    }

    public final String toString() {
        return this.e;
    }
}
