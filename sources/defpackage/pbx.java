package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: pbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbx implements pfa, aeuo, pkd, pkp, afbj, aeqx {
    private static final Object q = new Object();
    private static volatile pbx r;
    private bapu A;
    private bapu B;
    private bapu C;
    private bapu D;
    private bapu E;
    private bapu F;
    private bapu G;
    private bapu H;
    private bapu I;
    private bapu J;
    private bapu K;
    private bapu L;
    private bapu M;
    private bapu N;
    private bapu O;
    private bapu P;
    private bapu Q;
    private bapu R;
    private bapu S;
    private bapu T;
    private bapu U;
    private bapu V;
    private bapu W;
    private bapu X;
    private bapu Y;
    private bapu Z;
    public bapu a;
    private bapu aA;
    private bapu aB;
    private bapu aC;
    private bapu aD;
    private bapu aE;
    private bapu aF;
    private bapu aG;
    private bapu aH;
    private bapu aI;
    private bapu aJ;
    private bapu aK;
    private bapu aL;
    private bapu aM;
    private bapu aN;
    private bapu aO;
    private bapu aP;
    private bapu aQ;
    private bapu aR;
    private bapu aS;
    private bapu aT;
    private bapu aa;
    private bapu ab;
    private bapu ac;
    private bapu ad;
    private bapu ae;
    private bapu af;
    private bapu ag;
    private bapu ah;
    private bapu ai;
    private bapu aj;
    private bapu ak;
    private bapu al;
    private bapu am;
    private bapu an;
    private bapu ao;
    private bapu ap;
    private bapu aq;
    private bapu ar;
    private bapu as;
    private bapu at;
    private bapu au;
    private bapu av;
    private bapu aw;
    private bapu ax;
    private bapu ay;
    private bapu az;
    public bapu b;
    public bapu c;
    public bapu d;
    public bapu e;
    public bapu f;
    public bapu g;
    public bapu h;
    public bapu i;
    public bapu j;
    public bapu k;
    public bapu l;
    public bapu m;
    public bapu n;
    public bapu o;
    public bapu p;
    private bapu s;
    private bapu t;
    private bapu u;
    private bapu v;
    private bapu w;
    private bapu x;
    private bapu y;
    private bapu z;

    public pbx() {
    }

    public static pbx a() {
        if (r == null) {
            synchronized (q) {
                if (r == null) {
                    r = new pbx((byte[]) null);
                }
            }
        }
        return r;
    }

    public final pkt A() {
        return new pkt(awds.b(this.u), awds.b(this.c), awds.b(pda.a), awds.b(this.aQ), awds.b(this.aR), awds.b(this.aS), awds.b(this.aT));
    }

    public final pia B() {
        return pdn.b();
    }

    public final aewt C() {
        return new aewt();
    }

    public final pdg D() {
        return (pdg) this.c.a();
    }

    public final pdh E() {
        return (pdh) this.aA.a();
    }

    public final afgm F() {
        return new afgm();
    }

    public final pdd H() {
        return c();
    }

    public final pia I() {
        return pdp.b();
    }

    public final pdf J() {
        return new pdf();
    }

    public final pic K() {
        return new pic((Context) this.a.a(), (aoru) this.u.a(), (qdc) this.aP.a());
    }

    public final pdc L() {
        return new pdc();
    }

    public final pjj b() {
        return new pjj(this.a, this.s, pkl.a, this.t, pda.a);
    }

    public final pdd c() {
        return new pdd((Context) this.a.a());
    }

    public final afbt e() {
        pji a2 = b().a(pfm.b(), "appsupload-regular");
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final Executor f() {
        return (Executor) this.u.a();
    }

    public final aeva g() {
        return (aeva) this.m.a();
    }

    public final aevl h() {
        return (aevl) this.i.a();
    }

    public final amsv i() {
        return (amsv) this.az.a();
    }

    public final aerk j() {
        return new aeru((Executor) this.u.a(), awds.b(pdi.a), (Context) this.a.a(), awds.b(this.O));
    }

    public final aorr k() {
        return aeqi.a((aeqd) this.f.a());
    }

    public final afeb l() {
        return (afeb) this.h.a();
    }

    public final afgs m() {
        return (afgs) this.b.a();
    }

    public final aeri n() {
        return new pcz();
    }

    public final amsv o() {
        return (amsv) this.aB.a();
    }

    public final Map p() {
        return anaf.a(aukg.FOOTPRINTS, (aerh) this.P.a(), aukg.REGISTRATION, new afaf());
    }

    public final aetj q() {
        return (aetj) this.O.a();
    }

    public final Map r() {
        anab a2 = anaf.a(8);
        a2.a("mdh-channelconfig-refresh", (afbv) this.aC.a());
        a2.a("mdh-wipeout", (afbv) this.aE.a());
        a2.a("mdh-subscription-cleanup", (afbv) this.aG.a());
        a2.a("appsupload-periodic", (afbv) this.aN.a());
        a2.a("appsupload-regular", (afbv) this.aN.a());
        a2.a("mdh-regularsync", (afbv) this.ao.a());
        a2.a("mdh-forcedsync", (afbv) this.aO.a());
        afae afae = new afae(awds.b(pdo.a), awds.b(this.O), (pbw) this.R.a(), (affc) this.l.a(), (afai) this.o.a(), (afeb) this.h.a(), new aezz(pid.b(), new aezu(c(), (Context) this.a.a(), (Executor) this.u.a(), new pcz()), (Executor) this.u.a()));
        new pcz().getClass();
        afbv afbv = new afbv(new afaa(), afae);
        awdx.a((Object) afbv, "Cannot return null from a non-@Nullable @Provides method");
        a2.a("mdh-pn", afbv);
        return a2.a();
    }

    public final Context s() {
        return (Context) this.a.a();
    }

    public final String t() {
        String packageName = ((Context) this.a.a()).getPackageName();
        awdx.a((Object) packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }

    public final String u() {
        return pid.b();
    }

    public final afai v() {
        return (afai) this.o.a();
    }

    public final Executor w() {
        return (Executor) this.u.a();
    }

    public final Context x() {
        return (Context) this.a.a();
    }

    public final pia G() {
        pia pia = phw.e;
        awdx.a((Object) pia, "Cannot return null from a non-@Nullable @Provides method");
        return pia;
    }

    public final aelh d() {
        aelh aelh = pba.w;
        awdx.a((Object) aelh, "Cannot return null from a non-@Nullable @Provides method");
        return aelh;
    }

    public final String y() {
        awdx.a((Object) "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk", "Cannot return null from a non-@Nullable @Provides method");
        return "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk";
    }

    public final String z() {
        awdx.a((Object) "com.google.android.gms", "Cannot return null from a non-@Nullable @Provides method");
        return "com.google.android.gms";
    }

    public pbx(byte[] bArr) {
        bapu a2 = awds.a(ird.a);
        this.a = a2;
        this.s = new pcd(a2);
        this.t = awds.a(pch.a);
        this.u = awds.a(pcf.a);
        this.b = awds.a(new pby(this.a));
        this.v = new pck(this.a);
        this.w = awds.a(new afdv(pdi.a));
        this.x = awds.a(new afhm(pdi.a));
        awdz a3 = awea.a(2, 0);
        a3.b(this.w);
        a3.b(this.x);
        this.y = a3.a();
        this.z = new awdr();
        awdr awdr = new awdr();
        this.A = awdr;
        afdk afdk = new afdk(awdr);
        this.B = afdk;
        this.C = awds.a(afdk);
        awdo a4 = awdv.a(2);
        a4.a(1, this.z);
        a4.a(2, this.C);
        awdv a5 = a4.a();
        this.D = a5;
        afby afby = new afby(a5);
        this.E = afby;
        this.F = awds.a(new afdh(this.y, afby, pdq.a));
        awdz a6 = awea.a(2, 0);
        a6.b(this.z);
        a6.b(this.A);
        this.G = a6.a();
        bapu a7 = awds.a(new pcj(this.a));
        this.c = a7;
        afcb afcb = new afcb(this.G, a7);
        this.H = afcb;
        bapu a8 = awds.a(afcb);
        this.d = a8;
        afcz afcz = new afcz(a8);
        this.I = afcz;
        bapu a9 = awds.a(afcz);
        this.J = a9;
        bapu a10 = awds.a(new pkx(this.a, this.F, a9));
        this.K = a10;
        awdr.a(this.A, awds.a(new pkv(a10, this.a)));
        awdr.a(this.z, awds.a(new afck(pdq.a, this.v, this.A, this.c, this.d)));
        bapu a11 = awds.a(new afcp(this.z));
        this.L = a11;
        this.M = awds.a(new pcc(a11));
        phz phz = new phz(this.a);
        this.N = phz;
        this.O = awds.a(phz);
        this.P = aweb.a(aeuv.a);
        awdo a12 = awdv.a(2);
        a12.a(aukg.FOOTPRINTS, this.P);
        a12.a(aukg.REGISTRATION, afag.a);
        this.Q = a12.a();
        this.R = awds.a(new pcl(this.u));
        bapu a13 = awds.a(new pcm(this.L));
        this.S = a13;
        afeq afeq = new afeq(a13, this.Q);
        this.T = afeq;
        this.U = awds.a(afeq);
        pjk pjk = new pjk(this.a, this.s, pkl.a, this.t, pda.a);
        this.V = pjk;
        this.W = awds.a(new affn(pjk));
        this.e = awds.a(new aeqj(pdk.a, this.a));
        awdt a14 = awdu.a(this);
        this.X = a14;
        this.Y = awds.a(new aeqz(a14));
        this.Z = new aeqk(this.V);
        bapu a15 = awds.a(new aeqf(pdk.a, this.e, this.Y, this.Z, this.c, this.O));
        this.f = a15;
        this.aa = new aeqi(a15);
        this.ab = awds.a(new afbl(this.X));
        this.ac = new aeuq(this.X);
        awdo a16 = awdv.a(2);
        a16.a(aukg.REGISTRATION, this.ab);
        a16.a(aukg.FOOTPRINTS, this.ac);
        this.ad = a16.a();
        this.g = new awdr();
        this.h = new awdr();
        this.ae = new awdr();
        pdr pdr = pdq.a;
        pdn pdn = pdm.a;
        bapu bapu = this.b;
        aevs aevs = new aevs(pdr, pdn, bapu, bapu, this.M, this.ae);
        this.af = aevs;
        this.i = awds.a(aevs);
        bapu a17 = awds.a(new pbz(this.L));
        this.ag = a17;
        this.j = awds.a(new aepr(a17, this.Q, this.a));
        pgu pgu = new pgu(pdm.a, this.h, this.i, this.j, this.c);
        this.ah = pgu;
        this.k = awds.a(new pgc(pgu));
        awdo a18 = awdv.a(2);
        a18.a(auku.SYNC_LATEST_PER_SECONDARY_ID, this.g);
        a18.a(auku.SYNC_FULL_SNAPSHOT, this.k);
        awdv a19 = a18.a();
        this.ai = a19;
        this.aj = new aeut(a19);
        awdo a20 = awdv.a(2);
        a20.a(aukg.REGISTRATION, afam.a);
        a20.a(aukg.FOOTPRINTS, this.aj);
        this.ak = a20.a();
        this.l = new awdr();
        awdr awdr2 = new awdr();
        this.m = awdr2;
        aevk aevk = new aevk(this.O, awdr2, this.i);
        this.al = aevk;
        this.n = aweb.a(aevk);
        this.o = awds.a(new afak(pdo.a, this.h, this.l));
        awdo a21 = awdv.a(2);
        a21.a(aukg.FOOTPRINTS, this.n);
        a21.a(aukg.REGISTRATION, this.o);
        this.am = a21.a();
        this.an = awds.a(new afhl(pdi.a, this.c, this.A, this.Q, this.h, this.l, this.am, this.E, this.d));
        this.ao = awds.a(new affo(this.l));
        bapu bapu2 = this.l;
        bapu bapu3 = bapu2;
        awdr.a(bapu3, awds.a(new affd(this.R, pds.a, this.U, this.W, this.aa, this.ad, this.Q, this.ak, this.h, this.b, this.O, this.an, this.c, this.o, this.ao)));
        this.ap = awds.a(new affp(pds.a, this.l, this.c));
        afap afap = new afap(this.o, this.c);
        this.aq = afap;
        this.ar = awds.a(afap);
        awdz a22 = awea.a(4, 0);
        a22.b(this.ap);
        a22.b(this.g);
        a22.b(this.k);
        a22.b(this.ar);
        this.as = a22.a();
        afdu afdu = new afdu(pdi.a, this.O, this.b, this.A, this.Q, this.c, this.as);
        this.at = afdu;
        awdr.a(this.h, awds.a(afdu));
        pgl pgl = new pgl(pdm.a, this.h, this.m, this.j, this.c);
        this.au = pgl;
        awdr.a(this.g, awds.a(new pgb(pgl)));
        afet afet = new afet(pds.a, this.l, this.c);
        this.av = afet;
        this.aw = awds.a(afet);
        bapu bapu4 = this.ae;
        awdz a23 = awea.a(3, 0);
        a23.b(this.g);
        a23.b(this.k);
        a23.b(this.aw);
        awdr.a(bapu4, a23.a());
        pdr pdr2 = pdq.a;
        pdn pdn2 = pdm.a;
        bapu bapu5 = this.b;
        aevi aevi = new aevi(pdr2, pdn2, bapu5, bapu5, this.M, this.ae, this.aa);
        this.ax = aevi;
        awdr.a(this.m, awds.a(aevi));
        this.ay = awds.a(new pca(this.u));
        this.az = awds.a(new aery(pdi.a, this.ay));
        this.aA = awds.a(pcn.a);
        this.aB = awds.a(new afgg(this.a));
        this.p = aexu.a(pda.a, pdm.a, this.m, this.h);
        this.aC = awds.a(new aeql(this.f));
        pde pde = new pde(this.a);
        this.aD = pde;
        this.aE = awds.a(new afhj(this.an, this.aa, pde, this.u));
        afel afel = new afel(pdi.a, this.O, this.h, this.a, this.R, this.aD, this.aa, this.b, this.c);
        this.aF = afel;
        this.aG = awds.a(new afef(afel));
        this.aH = new pfl(this.a);
        this.aI = new pfo(this.a);
        this.aJ = new pfq(this.a);
        pcb pcb = new pcb(this.a, this.u);
        this.aK = pcb;
        pet pet = new pet(this.a, pcb, this.O, this.u);
        this.aL = pet;
        bapu a24 = awds.a(new pfs(this.aH, this.aD, this.aI, this.O, this.u, this.aJ, pet));
        this.aM = a24;
        this.aN = awds.a(new pfr(a24));
        this.aO = awds.a(new affm(this.l));
        this.aP = awds.a(new pce(this.a));
        this.aQ = new pfp(this.V);
        this.aR = awds.a(new affl(this.V));
        this.aS = new afhk(this.V);
        this.aT = new afee(this.V);
    }
}
