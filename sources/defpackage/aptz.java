package defpackage;

import com.google.firebase.auth.EmailAuthCredential;

/* renamed from: aptz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aptz implements aptv {
    private final String a;
    private final String b;
    private final String c;

    static {
        new iwd("EmailLinkSignInRequest", new String[0]);
    }

    public aptz(EmailAuthCredential emailAuthCredential, String str) {
        String str2 = emailAuthCredential.a;
        iva.c(str2);
        this.a = str2;
        String str3 = emailAuthCredential.c;
        iva.c(str3);
        this.b = str3;
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        String str;
        aucd o = allz.f.o();
        String str2 = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        allz allz = (allz) o.b;
        str2.getClass();
        allz.a |= 2;
        allz.c = str2;
        apnf a2 = apnf.a(this.b);
        String str3 = null;
        if (a2 != null) {
            str = a2.a;
        } else {
            str = null;
        }
        if (a2 != null) {
            str3 = a2.b;
        }
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            allz allz2 = (allz) o.b;
            str.getClass();
            allz2.a |= 1;
            allz2.b = str;
        }
        if (str3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            allz allz3 = (allz) o.b;
            str3.getClass();
            allz3.a |= 8;
            allz3.e = str3;
        }
        String str4 = this.c;
        if (str4 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            allz allz4 = (allz) o.b;
            str4.getClass();
            allz4.a |= 4;
            allz4.d = str4;
        }
        return (allz) o.i();
    }
}
