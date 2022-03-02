package defpackage;

/* renamed from: lfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lfw implements lfj {
    private static final ith a = new ith("ImpressionAppInfoBuilde", "");
    private final aucd b;
    private aucd c = amcu.e.o();

    public lfw(aucd aucd) {
        this.b = aucd;
    }

    private final void b() {
        iva.a((Object) this.c, (Object) "Builder can only be used once.");
    }

    public final void a() {
        b();
        aucd aucd = this.b;
        aucd aucd2 = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amcu amcu = (amcu) aucd2.i();
        ambk ambk2 = ambk.K;
        amcu.getClass();
        ambk.c = amcu;
        ambk.a |= 1;
        this.c = null;
    }

    public final void b(String str) {
        b();
        try {
            aucd aucd = this.c;
            long parseLong = Long.parseLong(str);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            amcu amcu = (amcu) aucd.b;
            amcu amcu2 = amcu.e;
            amcu.a |= 1;
            amcu.b = parseLong;
        } catch (NumberFormatException e) {
            a.b("Non-numeric sdkAppId value. Unable to log.");
        }
    }

    public final void a(int i) {
        b();
        if (i == 0) {
            aucd aucd = this.c;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            amcu amcu = (amcu) aucd.b;
            amcu amcu2 = amcu.e;
            amcu.c = 1;
            amcu.a |= 2;
        } else if (i == 1) {
            aucd aucd2 = this.c;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            amcu amcu3 = (amcu) aucd2.b;
            amcu amcu4 = amcu.e;
            amcu3.c = 2;
            amcu3.a |= 2;
        } else if (i != 2) {
            a.b("ImpressionAppInfoBuilde", "Unknown proxy: %d", Integer.valueOf(i));
            aucd aucd3 = this.c;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            amcu amcu5 = (amcu) aucd3.b;
            amcu amcu6 = amcu.e;
            amcu5.c = 0;
            amcu5.a |= 2;
        } else {
            aucd aucd4 = this.c;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            amcu amcu7 = (amcu) aucd4.b;
            amcu amcu8 = amcu.e;
            amcu7.c = 3;
            amcu7.a |= 2;
        }
    }

    public final void a(String str) {
        b();
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amcu amcu = (amcu) aucd.b;
        amcu amcu2 = amcu.e;
        str.getClass();
        amcu.a |= 4;
        amcu.d = str;
    }
}
