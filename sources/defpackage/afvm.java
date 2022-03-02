package defpackage;

/* renamed from: afvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afvm implements afvn {
    private static final amzy a = amzy.a("person.email", "person.name", "person.photo", "person.read_only_profile_info");
    private static final aqur b;
    private final aqvz c;

    static {
        aucd o = aqur.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqur aqur = (aqur) o.b;
        "profile-sync-client".getClass();
        aqur.a = "profile-sync-client";
        "1".getClass();
        aqur.b = "1";
        b = (aqur) o.i();
    }

    public afvm(aqvz aqvz) {
        this.c = aqvz;
    }

    static final aqvo a() {
        aqvp a2 = aygz.a.a().a();
        if (a2.equals(aqvp.g)) {
            aqwu aqwu = (aqwu) aqww.d.o();
            aubv aubv = (aubv) aubw.b.o();
            aubv.a((Iterable) a);
            if (aqwu.c) {
                aqwu.c();
                aqwu.c = false;
            }
            aubw aubw = (aubw) aubv.i();
            aubw.getClass();
            ((aqww) aqwu.b).a = aubw;
            aqwu.a(aqwx.ACCOUNT);
            aqwu.a(aqwx.DOMAIN_PROFILE);
            aqwu.a(aqwx.PROFILE);
            if (aygz.a.a().f()) {
                aucd o = aqwv.b.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ((aqwv) o.b).a = 2;
                if (aqwu.c) {
                    aqwu.c();
                    aqwu.c = false;
                }
                aqwv aqwv = (aqwv) o.i();
                aqwv.getClass();
                ((aqww) aqwu.b).c = aqwv;
            }
            aqvo aqvo = (aqvo) aqvp.g.o();
            if (aqvo.c) {
                aqvo.c();
                aqvo.c = false;
            }
            aqww aqww = (aqww) aqwu.i();
            aqww.getClass();
            ((aqvp) aqvo.b).b = aqww;
            if (!sgc.c()) {
                return aqvo;
            }
            aucd o2 = aqwp.d.o();
            aqur aqur = b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqur.getClass();
            ((aqwp) o2.b).a = aqur;
            if (aqvo.c) {
                aqvo.c();
                aqvo.c = false;
            }
            aqwp aqwp = (aqwp) o2.i();
            aqwp.getClass();
            ((aqvp) aqvo.b).d = aqwp;
            return aqvo;
        }
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        return (aqvo) aucd;
    }

    public final aorr a(int i) {
        baaj baaj;
        aqvo a2 = a();
        a2.a("me");
        if (i != 1) {
            aucd o = aqwp.d.o();
            aucd o2 = avkh.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avkh avkh = (avkh) o2.b;
            avkh.b = 2;
            avkh.a = 1 | avkh.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avkh avkh2 = (avkh) o2.i();
            avkh2.getClass();
            ((aqwp) o.b).c = avkh2;
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            aqwp aqwp = (aqwp) o.i();
            aqvp aqvp = aqvp.g;
            aqwp.getClass();
            ((aqvp) a2.b).d = aqwp;
        }
        aqvp aqvp2 = (aqvp) a2.i();
        aqvz aqvz = this.c;
        azxi azxi = aqvz.a;
        baaj baaj2 = aqwa.a;
        if (baaj2 == null) {
            synchronized (aqwa.class) {
                baaj = aqwa.a;
                if (baaj == null) {
                    baag a3 = baaj.a();
                    a3.c = baai.UNARY;
                    a3.d = baaj.a("google.internal.people.v2.InternalPeopleService", "GetPeople");
                    a3.b();
                    a3.a = baoq.a(aqvp.g);
                    a3.b = baoq.a(aqvr.b);
                    baaj = a3.a();
                    aqwa.a = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, aqvz.b), (Object) aqvp2);
    }

    public final aorr a(aqxi aqxi) {
        aucd aucd;
        baaj baaj;
        if (!sgc.c()) {
            aucd = (aucd) aqxi.c(5);
            aucd.a((aucj) aqxi);
            aqwp aqwp = aqxi.d;
            if (aqwp == null) {
                aqwp = aqwp.d;
            }
            aucd aucd2 = (aucd) aqwp.c(5);
            aucd2.a((aucj) aqwp);
            aqur aqur = b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aqur.getClass();
            ((aqwp) aucd2.b).a = aqur;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aqwp aqwp2 = (aqwp) aucd2.i();
            aqxi aqxi2 = aqxi.h;
            aqwp2.getClass();
            ((aqxi) aucd.b).d = aqwp2;
        } else {
            aucd = (aucd) aqxi.c(5);
            aucd.a((aucj) aqxi);
        }
        aqvz aqvz = this.c;
        aqvo a2 = a();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aqvp aqvp = (aqvp) a2.i();
        aqxi aqxi3 = aqxi.h;
        aqvp.getClass();
        ((aqxi) aucd.b).f = aqvp;
        aqxi aqxi4 = (aqxi) aucd.i();
        azxi azxi = aqvz.a;
        baaj baaj2 = aqwa.c;
        if (baaj2 == null) {
            synchronized (aqwa.class) {
                baaj = aqwa.c;
                if (baaj == null) {
                    baag a3 = baaj.a();
                    a3.c = baai.UNARY;
                    a3.d = baaj.a("google.internal.people.v2.InternalPeopleService", "UpdatePersonPhoto");
                    a3.b();
                    a3.a = baoq.a(aqxi.h);
                    a3.b = baoq.a(aqxj.d);
                    baaj = a3.a();
                    aqwa.c = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, aqvz.b), (Object) aqxi4);
    }

    public final aorr a(aqxk aqxk) {
        baaj baaj;
        aqvz aqvz = this.c;
        aucd aucd = (aucd) aqxk.c(5);
        aucd.a((aucj) aqxk);
        aqvo a2 = a();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aqvp aqvp = (aqvp) a2.i();
        aqxk aqxk2 = aqxk.h;
        aqvp.getClass();
        ((aqxk) aucd.b).g = aqvp;
        aqxk aqxk3 = (aqxk) aucd.i();
        azxi azxi = aqvz.a;
        baaj baaj2 = aqwa.b;
        if (baaj2 == null) {
            synchronized (aqwa.class) {
                baaj = aqwa.b;
                if (baaj == null) {
                    baag a3 = baaj.a();
                    a3.c = baai.UNARY;
                    a3.d = baaj.a("google.internal.people.v2.InternalPeopleService", "UpdatePerson");
                    a3.b();
                    a3.a = baoq.a(aqxk.h);
                    a3.b = baoq.a(aqxl.b);
                    baaj = a3.a();
                    aqwa.b = baaj;
                }
            }
            baaj2 = baaj;
        }
        return bapb.a(azxi.a(baaj2, aqvz.b), (Object) aqxk3);
    }
}
