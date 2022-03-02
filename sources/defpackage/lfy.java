package defpackage;

/* renamed from: lfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lfy implements lfl {
    private final lgg a;
    private aucd b = ambi.f.o();

    static {
        new ith("ImpressionBinaryDiffUpl", "");
    }

    public lfy(lgg lgg) {
        this.a = lgg;
    }

    private final void b() {
        iva.a((Object) this.b, (Object) "Builder can only be used once.");
    }

    public final void a() {
        boolean z;
        b();
        lgg lgg = this.a;
        ambi ambi = (ambi) this.b.i();
        lgg.c();
        if ((((ambj) lgg.a.b).a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't set binaryDiffUploadDetails more than once");
        aucd aucd = lgg.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambj ambj = (ambj) aucd.b;
        ambj ambj2 = ambj.f;
        ambi.getClass();
        ambj.d = ambi;
        ambj.a |= 4;
        this.b = null;
    }

    public final void b(int i) {
        boolean z;
        b();
        if ((((ambi) this.b.b).a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setDiffScriptStreamingTime() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambi ambi = (ambi) aucd.b;
        ambi ambi2 = ambi.f;
        ambi.a |= 16;
        ambi.e = i;
    }

    public final /* bridge */ /* synthetic */ void c(int i) {
        b();
        iva.a(!((((ambi) this.b.b).a & 4) != 0), (Object) "Can't call setFailure() twice");
        switch (i) {
            case 1:
                aucd aucd = this.b;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                ambi ambi = (ambi) aucd.b;
                ambi ambi2 = ambi.f;
                ambi.c = 1;
                ambi.a |= 4;
                return;
            case 2:
                aucd aucd2 = this.b;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                ambi ambi3 = (ambi) aucd2.b;
                ambi ambi4 = ambi.f;
                ambi3.c = 2;
                ambi3.a |= 4;
                return;
            case 3:
                aucd aucd3 = this.b;
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                ambi ambi5 = (ambi) aucd3.b;
                ambi ambi6 = ambi.f;
                ambi5.c = 3;
                ambi5.a |= 4;
                return;
            case 4:
                aucd aucd4 = this.b;
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                ambi ambi7 = (ambi) aucd4.b;
                ambi ambi8 = ambi.f;
                ambi7.c = 4;
                ambi7.a |= 4;
                return;
            case 5:
                aucd aucd5 = this.b;
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                ambi ambi9 = (ambi) aucd5.b;
                ambi ambi10 = ambi.f;
                ambi9.c = 5;
                ambi9.a |= 4;
                return;
            case 6:
                aucd aucd6 = this.b;
                if (aucd6.c) {
                    aucd6.c();
                    aucd6.c = false;
                }
                ambi ambi11 = (ambi) aucd6.b;
                ambi ambi12 = ambi.f;
                ambi11.c = 6;
                ambi11.a |= 4;
                return;
            case 7:
                aucd aucd7 = this.b;
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                ambi ambi13 = (ambi) aucd7.b;
                ambi ambi14 = ambi.f;
                ambi13.c = 7;
                ambi13.a |= 4;
                return;
            default:
                aucd aucd8 = this.b;
                if (aucd8.c) {
                    aucd8.c();
                    aucd8.c = false;
                }
                ambi ambi15 = (ambi) aucd8.b;
                ambi ambi16 = ambi.f;
                ambi15.c = 8;
                ambi15.a |= 4;
                return;
        }
    }

    public final void a(int i) {
        boolean z;
        b();
        if ((((ambi) this.b.b).a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setBaseHashComputationTime() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambi ambi = (ambi) aucd.b;
        ambi ambi2 = ambi.f;
        ambi.a |= 8;
        ambi.d = i;
    }

    public final /* bridge */ /* synthetic */ void a(long j) {
        boolean z;
        b();
        if (((((ambi) this.b.b).a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z, (Object) "Can't call setUploadSizeBytes() twice");
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambi ambi = (ambi) aucd.b;
        ambi ambi2 = ambi.f;
        ambi.a = 1 | ambi.a;
        ambi.b = j;
    }
}
