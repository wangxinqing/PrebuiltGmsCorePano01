package defpackage;

import android.content.Context;

/* renamed from: mhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mhi {
    private final hol a;
    private String b = null;
    private final aucd c = bid.d.o();

    public mhi(Context context) {
        this.a = new hol(context, "UNICORN_FAMILY_MANAGEMENT", (String) null);
    }

    private final void a(bif bif) {
        aucd o = bim.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bim bim = (bim) o.b;
        bif.getClass();
        bim.e = bif;
        bim.a |= 16;
        bid bid = (bid) this.c.i();
        bid.getClass();
        bim.d = bid;
        bim.a |= 8;
        a((bim) o.i());
    }

    public final void b(int i) {
        aucd o = bin.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bin bin = (bin) o.b;
        bin.b = i - 1;
        bin.a |= 1;
        a((bin) o.i());
    }

    public mhi(Context context, String str, String str2, String str3) {
        this.a = new hol(context, "UNICORN_FAMILY_MANAGEMENT", str);
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        bid bid = (bid) aucd.b;
        str2.getClass();
        bid.a |= 1;
        bid.b = str2;
        aucd aucd2 = this.c;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        bid bid2 = (bid) aucd2.b;
        str3.getClass();
        bid2.a |= 2;
        bid2.c = str3;
    }

    private final void a(bim bim) {
        String str;
        hoi a2 = this.a.a(bim.k());
        if (this.a.i == null && (str = this.b) != null) {
            a2.c(str);
        }
        a2.b();
    }

    public final void a(int i) {
        aucd o = bih.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bih bih = (bih) o.b;
        bih.b = i - 1;
        bih.a |= 1;
        a((bih) o.i());
    }

    public final void a(int i, int i2) {
        aucd o = bif.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bif bif = (bif) o.b;
        bif.b = i - 1;
        int i3 = bif.a | 1;
        bif.a = i3;
        bif.c = i2 - 1;
        bif.a = i3 | 2;
        a((bif) o.i());
    }

    public final void a(int i, int i2, String str) {
        aucd o = bif.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bif bif = (bif) o.b;
        bif.b = i - 1;
        int i3 = bif.a | 1;
        bif.a = i3;
        bif.c = i2 - 1;
        int i4 = i3 | 2;
        bif.a = i4;
        str.getClass();
        bif.a = i4 | 4;
        bif.d = str;
        a((bif) o.i());
    }

    public final void a(bih bih) {
        aucd o = bim.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bim bim = (bim) o.b;
        bih.getClass();
        bim.b = bih;
        bim.a |= 1;
        bid bid = (bid) this.c.i();
        bid.getClass();
        bim.d = bid;
        bim.a |= 8;
        a((bim) o.i());
    }

    public final void a(bin bin) {
        aucd o = bim.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bim bim = (bim) o.b;
        bin.getClass();
        bim.c = bin;
        bim.a |= 2;
        bid bid = (bid) this.c.i();
        bid.getClass();
        bim.d = bid;
        bim.a |= 8;
        a((bim) o.i());
    }

    public final void a(String str, String str2, String str3) {
        this.b = str;
        if (str2 != null) {
            aucd aucd = this.c;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            bid bid = (bid) aucd.b;
            bid bid2 = bid.d;
            str2.getClass();
            bid.a |= 1;
            bid.b = str2;
        } else {
            aucd aucd2 = this.c;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            bid bid3 = (bid) aucd2.b;
            bid bid4 = bid.d;
            bid3.a &= -2;
            bid3.b = bid.d.b;
        }
        if (str3 == null) {
            aucd aucd3 = this.c;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            bid bid5 = (bid) aucd3.b;
            bid5.a &= -3;
            bid5.c = bid.d.c;
            return;
        }
        aucd aucd4 = this.c;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        bid bid6 = (bid) aucd4.b;
        str3.getClass();
        bid6.a |= 2;
        bid6.c = str3;
    }

    public final void a(boolean z, int i) {
        aucd o = big.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        big big = (big) o.b;
        big.b = i - 1;
        big.a |= 1;
        big big2 = (big) o.i();
        if (z) {
            aucd o2 = bin.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            bin bin = (bin) o2.b;
            big2.getClass();
            bin.c = big2;
            bin.a |= 2;
            a((bin) o2.i());
            return;
        }
        aucd o3 = bih.d.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        bih bih = (bih) o3.b;
        big2.getClass();
        bih.c = big2;
        bih.a |= 2;
        a((bih) o3.i());
    }
}
