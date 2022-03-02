package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SignatureException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: asiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asiy implements ashv {
    private static final asik a = asik.b();
    private static final byte[] b = "ChangeCipherSpec".getBytes(Charset.forName("UTF-8"));
    private final String c = ((asih) a).a();
    private final ashv d;
    private final byte[] e;
    private ausd f = null;
    private aurx g = null;
    private boolean h;
    private int i;

    public asiy(ashv ashv, byte[] bArr) {
        this.d = ashv;
        this.e = (byte[]) iva.a((Object) bArr);
        this.i = 1;
        this.h = false;
    }

    private final void a(Exception exc) {
        String str;
        g();
        anih anih = (anih) ((anih) asil.a.c()).a("asiy", "a", 182, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        if (this.i != 2) {
            str = "responder";
        } else {
            str = "initiator";
        }
        anih.a("SecureConnectionSpake: Fail to authenticate as %s", (Object) str);
        this.d.a(new byte[0]);
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

    private static final void c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("Connection torn down");
        }
    }

    private final void g() {
        this.f = null;
        this.g = null;
        this.h = false;
    }

    private final void h() {
        if (this.f.b()) {
            ausf ausf = (ausf) this.f;
            if (ausf.e == 10) {
                throw new ausp("Cannot reuse handshake context; is has already been used");
            } else if (ausf.b()) {
                ausf.e = 10;
                this.g = new aury(new SecretKeySpec(ausf.d, "AES"));
                this.f = null;
            } else {
                throw new ausp("Handshake is not complete; cannot create connection context");
            }
        } else {
            throw new IOException("Expected handshake to be complete, but it's not");
        }
    }

    public final String a() {
        return this.c;
    }

    public final void close() {
        this.i = 1;
        g();
        this.d.close();
    }

    public final boolean d() {
        return this.d.d() && this.h;
    }

    public final asfn e() {
        aucd o = asfn.d.o();
        String str = this.c;
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
        asfo.b = 1;
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
        return this.d.f();
    }

    public final void c() {
        if (!d()) {
            if (!this.d.d()) {
                this.d.c();
            }
            if (this.d.f()) {
                this.i = 2;
                byte[] bArr = this.e;
                g();
                this.i = 2;
                try {
                    ausf ausf = new ausf(1, bArr);
                    this.f = ausf;
                    this.d.a(ausf.c());
                    ausd ausd = this.f;
                    byte[] b2 = this.d.b();
                    c(b2);
                    ausd.c(b2);
                    this.d.a(this.f.c());
                    byte[] bArr2 = b;
                    ausd ausd2 = this.f;
                    byte[] b3 = this.d.b();
                    c(b3);
                    if (Arrays.equals(bArr2, ausd2.c(b3))) {
                        h();
                        this.h = true;
                        return;
                    }
                    throw new IOException("Could not get connection confirmation from responder");
                } catch (IllegalStateException e2) {
                    a((Exception) e2);
                } catch (ausp e3) {
                    a((Exception) e3);
                }
            } else {
                this.i = 3;
                byte[] bArr3 = this.e;
                g();
                this.i = 3;
                try {
                    ausf ausf2 = new ausf(5, bArr3);
                    this.f = ausf2;
                    byte[] b4 = this.d.b();
                    c(b4);
                    ausf2.c(b4);
                    this.d.a(this.f.c());
                    ausd ausd3 = this.f;
                    byte[] b5 = this.d.b();
                    c(b5);
                    ausd3.c(b5);
                    ashv ashv = this.d;
                    ausd ausd4 = this.f;
                    byte[] bArr4 = b;
                    int i2 = ((ausf) ausd4).e;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    } else if (i3 == 7) {
                        byte[] a2 = ((ausf) ausd4).a(false, bArr4);
                        ((ausf) ausd4).e = 9;
                        ashv.a(a2);
                        h();
                        this.h = true;
                    } else {
                        String a3 = ause.a(i2);
                        StringBuilder sb = new StringBuilder(a3.length() + 53);
                        sb.append("Cannot send handshake message with payload in state: ");
                        sb.append(a3);
                        throw new ausp(sb.toString());
                    }
                } catch (IllegalStateException e4) {
                    a((Exception) e4);
                } catch (ausp e5) {
                    a((Exception) e5);
                }
            }
        }
    }

    public final byte[] b() {
        if (this.h) {
            return b(this.d.b());
        }
        throw new IOException("Connection is not authenticated");
    }

    public final void a(byte[] bArr) {
        if (this.h) {
            ashv ashv = this.d;
            aurx aurx = this.g;
            if (aurx != null) {
                ashv.a(aurx.a(bArr));
                return;
            }
            throw new IOException("Not connected");
        }
        throw new IOException("Connection is not authenticated");
    }
}
