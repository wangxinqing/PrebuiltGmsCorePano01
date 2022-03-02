package defpackage;

import java.util.Collections;

/* renamed from: alyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alyx {
    public final amid a = amie.b();
    private final String b;
    private int c = 0;
    private amir d;
    private amik e;

    public alyx(String str) {
        this.b = str;
    }

    private final void a(amiw amiw) {
        this.a.a(amiw);
    }

    private final void b(amiw amiw) {
        amid amid = this.a;
        amid.a.set(amid.a() - 1, amiw);
    }

    public final void a(int i) {
        this.c += i;
        this.d = null;
        this.e = null;
    }

    public final void a(alyx alyx) {
        int i;
        int i2 = 0;
        for (amiw amiw : Collections.unmodifiableList(alyx.a.a)) {
            amiv amiv = amiv.KIND_NOT_SET;
            int ordinal = amiw.b.ordinal();
            if (ordinal == 3) {
                i = amiw.b().b;
            } else if (ordinal == 5) {
                i = amiw.c().b;
            } else {
                throw new IllegalArgumentException();
            }
            if (i2 < i) {
                int i3 = i - i2;
                a(i3);
                i2 += i3;
            }
            int ordinal2 = amiw.b.ordinal();
            if (ordinal2 == 3) {
                amir b2 = amiw.b();
                this.e = null;
                amir amir = this.d;
                if (amir == null) {
                    amiq c2 = b2.c();
                    c2.a = this.c;
                    amir a2 = c2.a();
                    this.d = a2;
                    a(aluv.a(this.b, a2));
                } else {
                    amiq c3 = amir.c();
                    if (!b2.b().isEmpty()) {
                        c3.a(b2.b());
                    } else {
                        String valueOf = String.valueOf(this.d.d);
                        String valueOf2 = String.valueOf(b2.d);
                        c3.c = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                    }
                    amir a3 = c3.a();
                    this.d = a3;
                    b(aluv.a(this.b, a3));
                }
                int a4 = aluv.a(b2);
                this.c += a4;
                i2 += a4;
            } else if (ordinal2 == 5) {
                b(amiw.c().c - amiw.c().b);
            } else {
                throw new IllegalArgumentException();
            }
        }
        int i4 = alyx.c;
        if (i2 < i4) {
            a(i4 - i2);
        }
    }

    public final void b(int i) {
        this.d = null;
        amik amik = this.e;
        if (amik == null) {
            amij b2 = amik.b();
            int i2 = this.c;
            b2.a = i2;
            b2.b = i2 + i;
            amik a2 = b2.a();
            this.e = a2;
            a(aluv.a(this.b, a2));
            return;
        }
        amij a3 = amik.a();
        a3.b = this.e.c + i;
        amik a4 = a3.a();
        this.e = a4;
        b(aluv.a(this.b, a4));
    }

    public final void a(alzb alzb) {
        if (!alzb.c()) {
            this.e = null;
            amir amir = this.d;
            if (amir == null) {
                amiq d2 = amir.d();
                d2.a = this.c;
                alzb.a(d2);
                amir a2 = d2.a();
                this.d = a2;
                a(aluv.a(this.b, a2));
            } else {
                amiq c2 = amir.c();
                alzb.a(c2);
                amir a3 = c2.a();
                this.d = a3;
                b(aluv.a(this.b, a3));
            }
            this.c += alzb.b();
            return;
        }
        throw new IllegalArgumentException("valuesToInsert must not be empty");
    }
}
