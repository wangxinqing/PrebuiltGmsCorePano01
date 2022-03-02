package defpackage;

/* renamed from: afoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afoy implements aoqb {
    private final afpf a;
    private final boolean b;
    private final aflf c;

    public afoy(afpf afpf, boolean z, aflf aflf) {
        this.a = afpf;
        this.b = z;
        this.c = aflf;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        boolean z = this.b;
        aflf aflf = this.c;
        aflg aflg = (aflg) obj;
        if (aflg == null) {
            aflg = aflg.c;
        }
        aucd aucd = (aucd) aflg.c(5);
        aucd.a((aucj) aflg);
        if (z) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aflg aflg2 = (aflg) aucd.b;
            aflg2.a |= 1;
            aflg2.b = true;
        } else {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aflg aflg3 = (aflg) aucd.b;
            aflg3.a |= 1;
            aflg3.b = false;
            aucd aucd2 = (aucd) aflf.c(5);
            aucd2.a((aucj) aflf);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aflf aflf2 = (aflf) aucd2.b;
            aflf aflf3 = aflf.f;
            aflf2.a |= 8;
            aflf2.e = false;
            aflf aflf4 = (aflf) aucd2.i();
            afkr a2 = afpf.d.a(aflf4);
            if (a2 != null) {
                aflb aflb = a2.i;
                if (aflb == null) {
                    aflb = aflb.f;
                }
                int a3 = afkw.a(aflb.e);
                if (a3 != 0 && a3 == 2 && !afpf.d.b(aflf4)) {
                    afpf.b.b(1036);
                }
            }
            aucd aucd3 = (aucd) aflf.c(5);
            aucd3.a((aucj) aflf);
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            aflf aflf5 = (aflf) aucd3.b;
            aflf5.a |= 8;
            aflf5.e = true;
            aflf aflf6 = (aflf) aucd3.i();
            afkr a4 = afpf.d.a(aflf6);
            if (a4 != null) {
                aflb aflb2 = a4.i;
                if (aflb2 == null) {
                    aflb2 = aflb.f;
                }
                int a5 = afkw.a(aflb2.e);
                if (a5 != 0 && a5 == 2 && !afpf.d.b(aflf6)) {
                    afpf.b.b(1036);
                }
            }
        }
        afpi afpi = afpf.d;
        return aorl.a((Object) Boolean.valueOf(afst.a(afst.a(afpi.a, "gms_icing_mdd_group_key_properties", afpi.b), afpi.d(aflf), (audx) (aflg) aucd.i())));
    }
}
