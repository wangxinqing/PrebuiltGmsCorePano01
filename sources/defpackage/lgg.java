package defpackage;

import java.util.List;

/* renamed from: lgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lgg implements lfp {
    private static final ith b = new ith("ImpressionUploadDetails", "");
    public aucd a = ambj.f.o();
    private final lgc c;
    private boolean d;

    public lgg(lgc lgc) {
        this.c = lgc;
    }

    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        c();
        if ((((ambj) this.a.b).a & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z, (Object) "Call setFileSizeBytes()");
        if ((((ambj) this.a.b).a & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2, (Object) "Call setMethod()");
        lgc lgc = this.c;
        ambj ambj = (ambj) this.a.i();
        lgc.k();
        if ((((ambk) lgc.e.b).a & 268435456) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.a(true ^ z3, (Object) "Can't set uploadDetails more than once");
        aucd aucd = lgc.e;
        iva.a((Object) ambj);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        ambj.getClass();
        ambk.E = ambj;
        ambk.a |= 268435456;
        this.a = null;
    }

    public final void c() {
        iva.a((Object) (ambj) this.a.i(), (Object) "Builder can only be used once.");
    }

    public final /* bridge */ /* synthetic */ lfl a() {
        return new lfy(this);
    }

    public final /* bridge */ /* synthetic */ void a(int i) {
        boolean z;
        c();
        if ((((ambj) this.a.b).a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setUploadMethod() twice");
        if (i == 1) {
            aucd aucd = this.a;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ambj ambj = (ambj) aucd.b;
            ambj ambj2 = ambj.f;
            ambj.c = 3;
            ambj.a |= 2;
        } else if (i == 2) {
            aucd aucd2 = this.a;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ambj ambj3 = (ambj) aucd2.b;
            ambj ambj4 = ambj.f;
            ambj3.c = 2;
            ambj3.a |= 2;
        } else if (i != 3) {
            b.b("ImpressionUploadDetails", "Unknown upload method: %d", Integer.valueOf(i));
            aucd aucd3 = this.a;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            ambj ambj5 = (ambj) aucd3.b;
            ambj ambj6 = ambj.f;
            ambj5.c = 0;
            ambj5.a |= 2;
        } else {
            aucd aucd4 = this.a;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            ambj ambj7 = (ambj) aucd4.b;
            ambj ambj8 = ambj.f;
            ambj7.c = 1;
            ambj7.a |= 2;
        }
    }

    public final /* bridge */ /* synthetic */ void a(long j) {
        boolean z;
        c();
        if (((((ambj) this.a.b).a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z, (Object) "Can't call setFileSizeBytes() twice");
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambj ambj = (ambj) aucd.b;
        ambj ambj2 = ambj.f;
        ambj.a = 1 | ambj.a;
        ambj.b = j;
    }

    public final /* bridge */ /* synthetic */ void a(List list) {
        c();
        iva.a(!this.d, (Object) "Can't call setUploadIds() twice");
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambj ambj = ambj.f;
        ((ambj) aucd.b).e = aucj.s();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambj ambj2 = (ambj) aucd.b;
        if (!ambj2.e.a()) {
            ambj2.e = aucj.a(ambj2.e);
        }
        auab.a((Iterable) list, (List) ambj2.e);
        this.d = true;
    }
}
