package defpackage;

import android.util.Base64;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Arrays;

/* renamed from: asix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asix implements ashv {
    private static final asik a = asik.b();
    private static final byte[] b = "ChangeCipherSpec".getBytes(Charset.forName("UTF-8"));
    private static final byte[] c = "CONFIRM".getBytes(Charset.forName("UTF-8"));
    private final String d = ((asih) a).a();
    private final ashv e;
    private ausd f = null;
    private aurx g = null;
    private int h = 1;
    private int i = 1;

    public asix(ashv ashv) {
        this.e = ashv;
    }

    private final void a(Exception exc) {
        String str;
        l();
        anih anih = (anih) ((anih) asil.a.c()).a("asix", "a", 242, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        if (this.h != 2) {
            str = "responder";
        } else {
            str = "initiator";
        }
        anih.a("SecureConnectionEcdh: Fail to authenticate as %s", (Object) str);
        this.e.a(new byte[0]);
        throw new IOException(exc);
    }

    private final byte[] b(byte[] bArr) {
        try {
            aurx aurx = this.g;
            if (aurx != null) {
                return aurx.b(bArr);
            }
            throw new IOException("Not connected");
        } catch (SignatureException e2) {
            throw new IOException(e2);
        }
    }

    private final byte[] c(byte[] bArr) {
        aurx aurx = this.g;
        if (aurx != null) {
            return aurx.a(bArr);
        }
        throw new IOException("Not connected");
    }

    private static final void d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("Connection torn down");
        }
    }

    private final void l() {
        this.f = null;
        this.g = null;
        this.i = 1;
    }

    private final void m() {
        if (this.f.b()) {
            int i2 = this.i;
            if (i2 == 2) {
                this.g = this.f.d();
                this.f = null;
                return;
            }
            String a2 = asiw.a(i2);
            StringBuilder sb = new StringBuilder(a2.length() + 40);
            sb.append("Cannot upgrade conneciton; wrong state: ");
            sb.append(a2);
            throw new IOException(sb.toString());
        }
        throw new IOException("Expected handshake to be complete, but it's not");
    }

    private final boolean n() {
        return this.i == 3;
    }

    public final String a() {
        return this.d;
    }

    public final void close() {
        this.h = 1;
        l();
        this.e.close();
    }

    public final asfn e() {
        aucd o = asfn.d.o();
        String str = this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfn asfn = (asfn) o.b;
        str.getClass();
        asfn.a |= 1;
        asfn.b = str;
        aucf aucf = (aucf) asfo.c.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asfo asfo = (asfo) aucf.b;
        asfo.b = 2;
        asfo.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfn asfn2 = (asfn) o.b;
        asfo asfo2 = (asfo) aucf.i();
        asfo2.getClass();
        asfn2.c = asfo2;
        asfn2.a |= 2;
        return (asfn) o.i();
    }

    public final boolean f() {
        return this.e.f();
    }

    public final boolean g() {
        return Arrays.equals(c, b(this.e.b()));
    }

    public final void h() {
        this.e.a(c(c));
    }

    public final String i() {
        aurx aurx = this.g;
        if (aurx != null) {
            int i2 = this.i;
            if (i2 == 2) {
                try {
                    return Base64.encodeToString(aurx.a(), 3);
                } catch (NoSuchAlgorithmException e2) {
                    throw new IOException(e2);
                }
            } else {
                String a2 = asiw.a(i2);
                StringBuilder sb = new StringBuilder(a2.length() + 43);
                sb.append("Cannot get verification code; wrong state: ");
                sb.append(a2);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            throw new IllegalStateException("Cannot get verification code; no connection");
        }
    }

    public final void j() {
        if (this.g != null) {
            int i2 = this.i;
            if (i2 == 2) {
                this.i = 3;
                return;
            }
            String a2 = asiw.a(i2);
            StringBuilder sb = new StringBuilder(a2.length() + 44);
            sb.append("Cannot verify connection code; wrong state: ");
            sb.append(a2);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Cannot set connection as verified; null connection");
    }

    public final boolean k() {
        return this.e.d() && this.i == 2;
    }

    public final boolean d() {
        return this.e.d() && n();
    }

    public final void c() {
        byte[] bArr;
        if (!d()) {
            if (!this.e.d()) {
                this.e.c();
            }
            if (this.e.f()) {
                this.h = 2;
                l();
                this.h = 2;
                try {
                    ausc ausc = new ausc(1);
                    this.f = ausc;
                    ashv ashv = this.e;
                    int i2 = ausc.c;
                    int i3 = i2 - 1;
                    if (i2 != 0) {
                        if (i3 == 0) {
                            ausc.c = 2;
                            aucd o = ausj.d.o();
                            autx a2 = autq.a(ausc.a.getPublic());
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            ausj ausj = (ausj) o.b;
                            a2.getClass();
                            ausj.b = a2;
                            int i4 = 1 | ausj.a;
                            ausj.a = i4;
                            int i5 = ausc.b;
                            ausj.a = i4 | 2;
                            ausj.c = i5;
                            bArr = ((ausj) o.i()).k();
                        } else if (i3 == 3) {
                            bArr = ausc.b(new byte[0]);
                            ausc.c = 5;
                        } else {
                            String a3 = ausb.a(i2);
                            StringBuilder sb = new StringBuilder(a3.length() + 34);
                            sb.append("Cannot get next message in state: ");
                            sb.append(a3);
                            throw new ausp(sb.toString());
                        }
                        ashv.a(bArr);
                        byte[] bArr2 = b;
                        ausd ausd = this.f;
                        byte[] b2 = this.e.b();
                        d(b2);
                        if (Arrays.equals(bArr2, ausd.c(b2))) {
                            this.i = 2;
                            m();
                            return;
                        }
                        throw new IOException("Could not get connection confirmation from responder");
                    }
                    throw null;
                } catch (IllegalStateException e2) {
                    a((Exception) e2);
                } catch (ausp e3) {
                    a((Exception) e3);
                }
            } else {
                this.h = 3;
                l();
                this.h = 3;
                try {
                    ausc a4 = ausc.a();
                    this.f = a4;
                    byte[] b3 = this.e.b();
                    d(b3);
                    a4.c(b3);
                    this.e.a(this.f.a(b));
                    this.i = 2;
                    m();
                } catch (IllegalStateException e4) {
                    a((Exception) e4);
                } catch (ausp e5) {
                    a((Exception) e5);
                }
            }
        }
    }

    public final byte[] b() {
        if (n()) {
            return b(this.e.b());
        }
        throw new IOException("Connection is not authenticated");
    }

    public final void a(byte[] bArr) {
        if (n()) {
            this.e.a(c(bArr));
            return;
        }
        throw new IOException("Connection is not authenticated");
    }
}
