package defpackage;

import com.google.ads.afma.proto2api.h;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aucd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aucd extends auab implements audy {
    public final aucj a;
    public aucj b;
    public boolean c;

    public aucd() {
        this((aucj) bbm.b);
    }

    public aucd(char[] cArr, boolean[][] zArr) {
        this((aucj) anpi.j);
    }

    public aucd(byte[][] bArr, int[][] iArr) {
        this((aucj) auhj.f);
    }

    public aucd(byte[][][] bArr, short[] sArr, byte[] bArr2) {
        this((aucj) aokw.e);
    }

    public aucd(float[][][] fArr, int[] iArr, byte[] bArr) {
        this((aucj) aolh.f);
    }

    public aucd(int[][][] iArr, float[][][] fArr) {
        this((aucj) amfr.b);
    }

    public aucd(short[][][] sArr, float[] fArr) {
        this((aucj) xol.w);
    }

    public aucd(boolean[][][] zArr, short[][][] sArr) {
        this((aucj) avsf.c);
    }

    public aucd(boolean[][][] zArr, boolean[][][] zArr2) {
        this((aucj) aoku.f);
    }

    private static final void a(aucj aucj, aucj aucj2) {
        aueh.a.a((Object) aucj).b(aucj, aucj2);
    }

    public vig A(int i) {
        return (vig) ((vih) this.b).a.get(i);
    }

    public afyq B(int i) {
        return (afyq) ((afys) this.b).b.get(i);
    }

    public afyr C(int i) {
        return (afyr) ((afys) this.b).e.get(i);
    }

    public final void D(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfk hfk = (hfk) this.b;
        hfk hfk2 = hfk.g;
        hfk.a();
        auab.a(iterable, (List) hfk.c);
    }

    public final void E(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfk hfk = (hfk) this.b;
        hfk hfk2 = hfk.g;
        if (!hfk.d.a()) {
            hfk.d = aucj.a(hfk.d);
        }
        auab.a(iterable, (List) hfk.d);
    }

    public final void F(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        hhp hhp = (hhp) this.b;
        hhp hhp2 = hhp.f;
        hhp.a();
        auab.a(iterable, (List) hhp.d);
    }

    public void G(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        nxa nxa = (nxa) this.b;
        nxa nxa2 = nxa.g;
        if (!nxa.e.a()) {
            nxa.e = aucj.a(nxa.e);
        }
        auab.a(iterable, (List) nxa.e);
    }

    public void H(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        okm okm = (okm) this.b;
        okm okm2 = okm.e;
        if (!okm.c.a()) {
            okm.c = aucj.a(okm.c);
        }
        auab.a(iterable, (List) okm.c);
    }

    public void I(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqy oqy = (oqy) this.b;
        auct auct = oqy.i;
        if (!oqy.j.a()) {
            oqy.j = aucj.a(oqy.j);
        }
        auab.a(iterable, (List) oqy.j);
    }

    public void J(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqy oqy = (oqy) this.b;
        auct auct = oqy.i;
        if (!oqy.h.a()) {
            oqy.h = aucj.a(oqy.h);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            oqy.h.d(((oqx) it.next()).d);
        }
    }

    public void K(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        osz osz = (osz) this.b;
        osz osz2 = osz.s;
        osz.b();
        auab.a(iterable, (List) osz.k);
    }

    public void L(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        otg otg = (otg) this.b;
        otg otg2 = otg.h;
        if (!otg.b.a()) {
            otg.b = aucj.a(otg.b);
        }
        auab.a(iterable, (List) otg.b);
    }

    public void M(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        oul oul = (oul) this.b;
        oul oul2 = oul.v;
        if (!oul.c.a()) {
            oul.c = aucj.a(oul.c);
        }
        auab.a(iterable, (List) oul.c);
    }

    public void N(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        oul oul = (oul) this.b;
        oul oul2 = oul.v;
        oul.b();
        auab.a(iterable, (List) oul.d);
    }

    public void O(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        oul oul = (oul) this.b;
        oul oul2 = oul.v;
        if (!oul.r.a()) {
            oul.r = aucj.a(oul.r);
        }
        auab.a(iterable, (List) oul.r);
    }

    public void P(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        oul oul = (oul) this.b;
        oul oul2 = oul.v;
        if (!oul.e.a()) {
            oul.e = aucj.a(oul.e);
        }
        auab.a(iterable, (List) oul.e);
    }

    public void Q(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        ouc ouc = (ouc) this.b;
        ouc ouc2 = ouc.g;
        ouc.a();
        auab.a(iterable, (List) ouc.c);
    }

    public void R(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        qit qit = (qit) this.b;
        qit qit2 = qit.d;
        qit.b();
        auab.a(iterable, (List) qit.b);
    }

    public void S(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        qit qit = (qit) this.b;
        qit qit2 = qit.d;
        qit.c();
        auab.a(iterable, (List) qit.c);
    }

    public void T(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        qit qit = (qit) this.b;
        qit qit2 = qit.d;
        qit.a();
        auab.a(iterable, (List) qit.a);
    }

    public void U(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        tab tab = (tab) this.b;
        tab tab2 = tab.g;
        tab.a();
        auab.a(iterable, (List) tab.f);
    }

    public void V(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        tad tad = (tad) this.b;
        tad tad2 = tad.P;
        if (!tad.C.a()) {
            tad.C = aucj.a(tad.C);
        }
        auab.a(iterable, (List) tad.C);
    }

    public void W(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        taf taf = (taf) this.b;
        taf taf2 = taf.e;
        if (!taf.b.a()) {
            taf.b = aucj.a(taf.b);
        }
        auab.a(iterable, (List) taf.b);
    }

    public void X(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        taf taf = (taf) this.b;
        taf taf2 = taf.e;
        if (!taf.a.a()) {
            taf.a = aucj.a(taf.a);
        }
        auab.a(iterable, (List) taf.a);
    }

    public void Y(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        tag tag = (tag) this.b;
        tag tag2 = tag.d;
        tag.a();
        auab.a(iterable, (List) tag.c);
    }

    public void Z(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        tzf tzf = (tzf) this.b;
        auct auct = tzf.u;
        if (!tzf.t.a()) {
            tzf.t = aucj.a(tzf.t);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            tzf.t.d(((asql) it.next()).a());
        }
    }

    public void aa(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        tzi tzi = (tzi) this.b;
        auct auct = tzi.m;
        if (!tzi.l.a()) {
            tzi.l = aucj.a(tzi.l);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            tzi.l.d(((avbl) it.next()).d);
        }
    }

    public void ab(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        uaj uaj = (uaj) this.b;
        uaj uaj2 = uaj.K;
        uaj.a();
        auab.a(iterable, (List) uaj.C);
    }

    public void ac(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        vho vho = (vho) this.b;
        vho vho2 = vho.b;
        vho.a();
        auab.a(iterable, (List) vho.a);
    }

    public void ad(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        xno xno = (xno) this.b;
        xno xno2 = xno.o;
        if (!xno.b.a()) {
            xno.b = aucj.a(xno.b);
        }
        auab.a(iterable, (List) xno.b);
    }

    public void ae(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        xom xom = (xom) this.b;
        xom xom2 = xom.d;
        if (!xom.c.a()) {
            xom.c = aucj.a(xom.c);
        }
        auab.a(iterable, (List) xom.c);
    }

    public void af(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aatt aatt = (aatt) this.b;
        aatt aatt2 = aatt.P;
        if (!aatt.M.a()) {
            aatt.M = aucj.a(aatt.M);
        }
        auab.a(iterable, (List) aatt.M);
    }

    public void ag(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aavs aavs = (aavs) this.b;
        aavs aavs2 = aavs.e;
        if (!aavs.b.a()) {
            aavs.b = aucj.a(aavs.b);
        }
        auab.a(iterable, (List) aavs.b);
    }

    public void ah(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        adqq adqq = (adqq) this.b;
        adqq adqq2 = adqq.d;
        if (!adqq.b.a()) {
            adqq.b = aucj.a(adqq.b);
        }
        auab.a(iterable, (List) adqq.b);
    }

    public void ai(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        amgi amgi = (amgi) this.b;
        amgi amgi2 = amgi.D;
        if (!amgi.C.a()) {
            amgi.C = aucj.a(amgi.C);
        }
        auab.a(iterable, (List) amgi.C);
    }

    public void aj(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        anpy anpy = (anpy) this.b;
        anpy anpy2 = anpy.f;
        if (!anpy.e.a()) {
            anpy.e = aucj.a(anpy.e);
        }
        auab.a(iterable, (List) anpy.e);
    }

    public void ak(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        ansk ansk = (ansk) this.b;
        ansk ansk2 = ansk.g;
        ansk.a();
        auab.a(iterable, (List) ansk.f);
    }

    public final boolean az() {
        throw null;
    }

    public final bpf b(int i) {
        return (bpf) ((bpd) this.b).e.get(i);
    }

    public final bpd c(int i) {
        return (bpd) ((bpe) this.b).c.get(i);
    }

    public final bpf d(int i) {
        return (bpf) ((bpe) this.b).d.get(i);
    }

    /* renamed from: e */
    public final aucd clone() {
        aucd aucd = (aucd) this.a.c(5);
        aucd.a(h());
        return aucd;
    }

    /* renamed from: f */
    public aucj h() {
        if (!this.c) {
            aucj aucj = this.b;
            aueh.a.a((Object) aucj).d(aucj);
            this.c = true;
        }
        return this.b;
    }

    /* renamed from: g */
    public final aucj i() {
        aucj f = h();
        if (f.az()) {
            return f;
        }
        throw new aufe();
    }

    public final /* bridge */ /* synthetic */ audx j() {
        return this.a;
    }

    public final ansk k() {
        return (ansk) ((hfg) this.b).a.get(0);
    }

    public final brg l(int i) {
        return (brg) ((brl) this.b).n.get(i);
    }

    public final brb m(int i) {
        return (brb) ((brl) this.b).p.get(i);
    }

    public final brc n(int i) {
        return (brc) ((brl) this.b).s.get(i);
    }

    public final brr o(int i) {
        return (brr) ((brl) this.b).t.get(i);
    }

    public final hhe p(int i) {
        return (hhe) ((hhf) this.b).c.get(i);
    }

    public void q(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovo ovo = (ovo) this.b;
        ovo ovo2 = ovo.f;
        ovo.a |= 2;
        ovo.c = i;
    }

    public void r(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovo ovo = (ovo) this.b;
        ovo ovo2 = ovo.f;
        ovo.a |= 4;
        ovo.e = i;
    }

    public void s(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovn ovn = (ovn) this.b;
        ovn ovn2 = ovn.h;
        ovn.a |= 8;
        ovn.e = i;
    }

    public void t(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovn ovn = (ovn) this.b;
        ovn ovn2 = ovn.h;
        ovn.c = i - 1;
        ovn.a |= 2;
    }

    public pqq u(int i) {
        return (pqq) ((pqr) this.b).a.get(i);
    }

    public tab v(int i) {
        return (tab) ((szz) this.b).b.get(i);
    }

    public void w(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        szz szz = (szz) this.b;
        szz szz2 = szz.g;
        szz.a();
        szz.b.remove(i);
    }

    public szz x(int i) {
        return (szz) ((tad) this.b).d.get(i);
    }

    public tah y(int i) {
        return (tah) ((tad) this.b).e.get(i);
    }

    public void z(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        vhk vhk = (vhk) this.b;
        vhk vhk2 = vhk.l;
        if (!vhk.g.a()) {
            vhk.g = aucj.a(vhk.g);
        }
        vhk.g.d(i);
    }

    public aucd(aucj aucj) {
        this.a = aucj;
        this.b = (aucj) aucj.c(4);
        this.c = false;
    }

    public final brq h(int i) {
        return (brq) ((brl) this.b).i.get(i);
    }

    public final bro i(int i) {
        return (bro) ((brl) this.b).j.get(i);
    }

    public final brn j(int i) {
        return (brn) ((brl) this.b).k.get(i);
    }

    public final void A(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfg hfg = (hfg) this.b;
        hfg hfg2 = hfg.d;
        hfg.a();
        auab.a(iterable, (List) hfg.a);
    }

    public final void B(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfg hfg = (hfg) this.b;
        hfg hfg2 = hfg.d;
        hfg.b();
        auab.a(iterable, (List) hfg.b);
    }

    public final void C(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfk hfk = (hfk) this.b;
        hfk hfk2 = hfk.g;
        if (!hfk.e.a()) {
            hfk.e = aucj.a(hfk.e);
        }
        auab.a(iterable, (List) hfk.e);
    }

    public qjd a(int i, qjd qjd) {
        Map unmodifiableMap = Collections.unmodifiableMap(((qjm) this.b).a);
        Integer valueOf = Integer.valueOf(i);
        return unmodifiableMap.containsKey(valueOf) ? (qjd) unmodifiableMap.get(valueOf) : qjd;
    }

    public final void b() {
        if (this.c) {
            c();
            this.c = false;
        }
    }

    public void c() {
        aucj aucj = (aucj) this.b.c(4);
        a(aucj, this.b);
        this.b = aucj;
    }

    public void d(auay auay) {
        if (this.c) {
            c();
            this.c = false;
        }
        qix qix = (qix) this.b;
        qix qix2 = qix.b;
        auay.getClass();
        if (!qix.a.a()) {
            qix.a = aucj.a(qix.a);
        }
        qix.a.add(auay);
    }

    public final brf f(int i) {
        return (brf) ((brg) this.b).c.get(i);
    }

    public final bqz k(int i) {
        return (bqz) ((brl) this.b).m.get(i);
    }

    public void l() {
        if (this.c) {
            c();
            this.c = false;
        }
        plh plh = plh.b;
        ((plh) this.b).a = true;
    }

    public void m(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqk oqk = (oqk) this.b;
        oqh oqh = (oqh) aucd.i();
        oqk oqk2 = oqk.e;
        oqh.getClass();
        oqk.a();
        oqk.a.add(oqh);
    }

    public void n(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovo ovo = (ovo) this.b;
        ovn ovn = (ovn) aucd.i();
        ovo ovo2 = ovo.f;
        ovn.getClass();
        if (!ovo.d.a()) {
            ovo.d = aucj.a(ovo.d);
        }
        ovo.d.add(ovn);
    }

    public void o(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovp ovp = (ovp) this.b;
        ovo ovo = (ovo) aucd.i();
        ovp ovp2 = ovp.c;
        ovo.getClass();
        ovp.a();
        ovp.a.add(ovo);
    }

    public void p(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        szz szz = (szz) this.b;
        tab tab = (tab) aucd.i();
        szz szz2 = szz.g;
        tab.getClass();
        szz.a();
        szz.b.add(tab);
    }

    public final void u(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        brl.b();
        auab.a(iterable, (List) brl.j);
    }

    public final void v(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        if (!brl.f.a()) {
            brl.f = aucj.a(brl.f);
        }
        auab.a(iterable, (List) brl.f);
    }

    public final void x(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        brl.i();
        auab.a(iterable, (List) brl.t);
    }

    public final void y(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        hac hac = (hac) this.b;
        hac hac2 = hac.r;
        if (!hac.p.a()) {
            hac.p = aucj.a(hac.p);
        }
        auab.a(iterable, (List) hac.p);
    }

    public aucd(byte[] bArr) {
        this((aucj) atwd.h);
    }

    public void b(int i, aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        tad tad = (tad) this.b;
        szz szz = (szz) aucd.i();
        tad tad2 = tad.P;
        szz.getClass();
        tad.a();
        tad.d.set(i, szz);
    }

    public void c(int i, aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        vih vih = (vih) this.b;
        vig vig = (vig) aucd.i();
        vih vih2 = vih.b;
        vig.getClass();
        vih.a();
        vih.a.set(i, vig);
    }

    public final bre e(int i) {
        return (bre) ((brf) this.b).c.get(i);
    }

    public final brm g(int i) {
        return (brm) ((brl) this.b).h.get(i);
    }

    public void h(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        afjx afjx = (afjx) this.b;
        afjw afjw = (afjw) aucd.i();
        afjx afjx2 = afjx.e;
        afjw.getClass();
        if (!afjx.d.a()) {
            afjx.d = aucj.a(afjx.d);
        }
        afjx.d.add(afjw);
    }

    public void i(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        agxe agxe = (agxe) this.b;
        agxf agxf = (agxf) aucd.i();
        agxe agxe2 = agxe.g;
        agxf.getClass();
        if (!agxe.f.a()) {
            agxe.f = aucj.a(agxe.f);
        }
        agxe.f.add(agxf);
    }

    public void j(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        amgi amgi = (amgi) this.b;
        amfz amfz = (amfz) aucd.i();
        amgi amgi2 = amgi.D;
        amfz.getClass();
        amgi.a();
        amgi.d.add(amfz);
    }

    public void q(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        tac tac = (tac) this.b;
        tad tad = (tad) aucd.i();
        tac tac2 = tac.b;
        tad.getClass();
        if (!tac.a.a()) {
            tac.a = aucj.a(tac.a);
        }
        tac.a.add(tad);
    }

    public void r(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        tad tad = (tad) this.b;
        szz szz = (szz) aucd.i();
        tad tad2 = tad.P;
        szz.getClass();
        tad.a();
        tad.d.add(szz);
    }

    public void s(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        vih vih = (vih) this.b;
        vig vig = (vig) aucd.i();
        vih vih2 = vih.b;
        vig.getClass();
        vih.a();
        vih.a.add(vig);
    }

    public final void t(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        brl.c();
        auab.a(iterable, (List) brl.k);
    }

    public aucd(byte[] bArr, byte[] bArr2) {
        this((aucj) aqqs.b);
    }

    public void f(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        aats aats = (aats) this.b;
        aatr aatr = (aatr) aucd.i();
        aats aats2 = aats.e;
        aatr.getClass();
        if (!aats.d.a()) {
            aats.d = aucj.a(aats.d);
        }
        aats.d.add(aatr);
    }

    public void k(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        amhf amhf = (amhf) this.b;
        amhe amhe = (amhe) aucd.i();
        amhf amhf2 = amhf.b;
        amhe.getClass();
        if (!amhf.a.a()) {
            amhf.a = aucj.a(amhf.a);
        }
        amhf.a.add(amhe);
    }

    public final void w(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        brl.a();
        auab.a(iterable, (List) brl.i);
    }

    public aucd(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this((aucj) aohl.u);
    }

    public void a(int i, afyq afyq) {
        if (this.c) {
            c();
            this.c = false;
        }
        afys afys = (afys) this.b;
        afys afys2 = afys.f;
        afyq.getClass();
        afys.a();
        afys.b.set(i, afyq);
    }

    public void e(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        aate aate = (aate) this.b;
        aatk aatk = (aatk) aucd.i();
        aate aate2 = aate.c;
        aatk.getClass();
        if (!aate.a.a()) {
            aate.a = aucj.a(aate.a);
        }
        aate.a.add(aatk);
    }

    public void g(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        aatt aatt = (aatt) this.b;
        aatj aatj = (aatj) aucd.i();
        aatt aatt2 = aatt.P;
        aatj.getClass();
        if (!aatt.u.a()) {
            aatt.u = aucj.a(aatt.u);
        }
        aatt.u.add(aatj);
    }

    public final void l(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfg hfg = (hfg) this.b;
        ansk ansk = (ansk) aucd.i();
        hfg hfg2 = hfg.d;
        ansk.getClass();
        hfg.a();
        hfg.a.add(ansk);
    }

    public aucd(byte[] bArr, char[] cArr) {
        this((aucj) apfo.h);
    }

    public final void m(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brf brf = (brf) this.b;
        brf brf2 = brf.d;
        brf.a();
        auab.a(iterable, (List) brf.c);
    }

    public final void o(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        brl.d();
        auab.a(iterable, (List) brl.m);
    }

    public final void p(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        brl.f();
        auab.a(iterable, (List) brl.p);
    }

    public final void z(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfg hfg = (hfg) this.b;
        hfg hfg2 = hfg.d;
        hfg.c();
        auab.a(iterable, (List) hfg.c);
    }

    public aucd(byte[] bArr, char[] cArr, byte[] bArr2) {
        this((aucj) aaud.b);
    }

    public void b(int i, qjd qjd) {
        qjd.getClass();
        if (this.c) {
            c();
            this.c = false;
        }
        qjm qjm = qjm.c;
        ((qjm) this.b).a().put(Integer.valueOf(i), qjd);
    }

    public final void c(auay auay) {
        if (this.c) {
            c();
            this.c = false;
        }
        lyd lyd = (lyd) this.b;
        lyd lyd2 = lyd.p;
        auay.getClass();
        if (!lyd.i.a()) {
            lyd.i = aucj.a(lyd.i);
        }
        lyd.i.add(auay);
    }

    public final void j(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        boe boe = (boe) this.b;
        boe boe2 = boe.b;
        boe.a();
        auab.a(iterable, (List) boe.a);
    }

    public final void r(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        if (!brl.g.a()) {
            brl.g = aucj.a(brl.g);
        }
        auab.a(iterable, (List) brl.g);
    }

    public final void s(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        if (!brl.h.a()) {
            brl.h = aucj.a(brl.h);
        }
        auab.a(iterable, (List) brl.h);
    }

    public aucd(byte[] bArr, float[] fArr) {
        this((aucj) aoaa.m);
    }

    public aucd(byte[] bArr, int[] iArr) {
        this((aucj) plg.l);
    }

    public void a(int i, afyr afyr) {
        if (this.c) {
            c();
            this.c = false;
        }
        afys afys = (afys) this.b;
        afys afys2 = afys.f;
        afyr.getClass();
        afys.b();
        afys.e.set(i, afyr);
    }

    public void d(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqh oqh = (oqh) this.b;
        oqf oqf = (oqf) aucd.i();
        oqh oqh2 = oqh.c;
        oqf.getClass();
        oqh.a();
        oqh.a.add(oqf);
    }

    public final void l(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        bpe bpe = (bpe) this.b;
        bpe bpe2 = bpe.f;
        bpe.a();
        auab.a(iterable, (List) bpe.c);
    }

    public final void n(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brg brg = (brg) this.b;
        brg brg2 = brg.d;
        brg.a();
        auab.a(iterable, (List) brg.c);
    }

    public aucd(byte[] bArr, int[] iArr, byte[] bArr2) {
        this((aucj) atkz.h);
    }

    public final void h(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        if (!bci.n.a()) {
            bci.n = aucj.a(bci.n);
        }
        auab.a(iterable, (List) bci.n);
    }

    public final void i(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        bod bod = (bod) this.b;
        bod bod2 = bod.b;
        if (!bod.a.a()) {
            bod.a = aucj.a(bod.a);
        }
        auab.a(iterable, (List) bod.a);
    }

    public final void q(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        brl brl = (brl) this.b;
        brl brl2 = brl.v;
        brl.e();
        auab.a(iterable, (List) brl.n);
    }

    public aucd(byte[] bArr, short[] sArr) {
        this((aucj) auxk.c);
    }

    public void b(long j) {
        if (this.c) {
            c();
            this.c = false;
        }
        adqv adqv = (adqv) this.b;
        adqv adqv2 = adqv.g;
        if (!adqv.e.a()) {
            adqv.e = aucj.a(adqv.e);
        }
        adqv.e.a(j);
    }

    public final void f(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        haa haa = (haa) this.b;
        haa haa2 = haa.y;
        str.getClass();
        if (!haa.p.a()) {
            haa.p = aucj.a(haa.p);
        }
        haa.p.add(str);
    }

    public final void k(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        bpe bpe = (bpe) this.b;
        bpe bpe2 = bpe.f;
        bpe.b();
        auab.a(iterable, (List) bpe.d);
    }

    public void m(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovn ovn = (ovn) this.b;
        ovn ovn2 = ovn.h;
        str.getClass();
        ovn.a |= 1;
        ovn.b = str;
    }

    public void o(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        vig vig = (vig) this.b;
        vig vig2 = vig.l;
        str.getClass();
        if (!vig.e.a()) {
            vig.e = aucj.a(vig.e);
        }
        vig.e.add(str);
    }

    public void p(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        vig vig = (vig) this.b;
        vig vig2 = vig.l;
        str.getClass();
        if (!vig.f.a()) {
            vig.f = aucj.a(vig.f);
        }
        vig.f.add(str);
    }

    public aucd(byte[] bArr, short[] sArr, byte[] bArr2) {
        this((aucj) qit.d);
    }

    public final void e(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        gzr gzr = (gzr) this.b;
        gzr gzr2 = gzr.A;
        str.getClass();
        gzr.d();
        gzr.p.add(str);
    }

    public final void g(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        had had = (had) this.b;
        had had2 = had.o;
        str.getClass();
        if (!had.d.a()) {
            had.d = aucj.a(had.d);
        }
        had.d.add(str);
    }

    public void j(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        oql oql = (oql) this.b;
        oql oql2 = oql.f;
        str.getClass();
        oql.a();
        oql.b.add(str);
    }

    public aucd(byte[] bArr, boolean[] zArr) {
        this((aucj) asss.d);
    }

    public final void a(int i, aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        hhf hhf = (hhf) this.b;
        hhe hhe = (hhe) aucd.i();
        hhf hhf2 = hhf.d;
        hhe.getClass();
        hhf.a();
        hhf.c.set(i, hhe);
    }

    public final void d(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        gzr gzr = (gzr) this.b;
        gzr gzr2 = gzr.A;
        str.getClass();
        gzr.b();
        gzr.e.add(str);
    }

    public aucd(byte[] bArr, boolean[] zArr, byte[] bArr2) {
        this((aucj) aqxf.e);
    }

    public final void c(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        had had = (had) this.b;
        har har = (har) aucd.i();
        had had2 = had.o;
        har.getClass();
        had.a();
        had.m.add(har);
    }

    public void l(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovn ovn = (ovn) this.b;
        ovn ovn2 = ovn.h;
        str.getClass();
        ovn.a |= 4;
        ovn.d = str;
    }

    public void n(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovp ovp = (ovp) this.b;
        ovp ovp2 = ovp.c;
        str.getClass();
        if (!ovp.b.a()) {
            ovp.b = aucj.a(ovp.b);
        }
        ovp.b.add(str);
    }

    public aucd(byte[] bArr, byte[][] bArr2) {
        this((aucj) avva.g);
    }

    public aucd(byte[] bArr, char[][] cArr) {
        this((aucj) avol.e);
    }

    public void k(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovo ovo = (ovo) this.b;
        ovo ovo2 = ovo.f;
        str.getClass();
        ovo.a |= 1;
        ovo.b = str;
    }

    public aucd(byte[] bArr, float[][] fArr) {
        this((aucj) xnq.h);
    }

    public final void a(int i, bpd bpd) {
        if (this.c) {
            c();
            this.c = false;
        }
        bpe bpe = (bpe) this.b;
        bpe bpe2 = bpe.f;
        bpd.getClass();
        bpe.a();
        bpe.c.set(i, bpd);
    }

    public final void b(auay auay) {
        if (this.c) {
            c();
            this.c = false;
        }
        h hVar = (h) this.b;
        h hVar2 = h.e;
        auay.getClass();
        if (!hVar.b.a()) {
            hVar.b = aucj.a(hVar.b);
        }
        hVar.b.add(auay);
    }

    public void h(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        nwq nwq = (nwq) this.b;
        nwq nwq2 = nwq.i;
        str.getClass();
        if (!nwq.b.a()) {
            nwq.b = aucj.a(nwq.b);
        }
        nwq.b.add(str);
    }

    public void i(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        oql oql = (oql) this.b;
        oql oql2 = oql.f;
        str.getClass();
        if (!oql.c.a()) {
            oql.c = aucj.a(oql.c);
        }
        oql.c.add(str);
    }

    public aucd(byte[] bArr, int[][] iArr) {
        this((aucj) aquv.b);
    }

    public final void c(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        gzr gzr = (gzr) this.b;
        gzr gzr2 = gzr.A;
        str.getClass();
        gzr.a();
        gzr.d.add(str);
    }

    public aucd(byte[] bArr, short[][] sArr) {
        this((aucj) atch.h);
    }

    public aucd(byte[] bArr, boolean[][] zArr) {
        this((aucj) ambj.f);
    }

    public aucd(byte[] bArr, byte[][][] bArr2) {
        this((aucj) asmo.b);
    }

    public final void a(int i, bpf bpf) {
        if (this.c) {
            c();
            this.c = false;
        }
        bpd bpd = (bpd) this.b;
        bpd bpd2 = bpd.j;
        bpf.getClass();
        bpd.a();
        bpd.e.set(i, bpf);
    }

    public aucd(byte[] bArr, char[][][] cArr) {
        this((aucj) osz.s);
    }

    public aucd(byte[] bArr, float[][][] fArr) {
        this((aucj) arfw.g);
    }

    public aucd(byte[] bArr, int[][][] iArr) {
        this((aucj) auyh.a);
    }

    /* renamed from: b */
    public final void a(aubc aubc, aubs aubs) {
        if (this.c) {
            c();
            this.c = false;
        }
        try {
            aueh.a.a((Object) this.b).a(this.b, aubd.a(aubc), aubs);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public aucd(byte[] bArr, short[][][] sArr) {
        this((aucj) anpd.q);
    }

    public void a(int i, tab tab) {
        if (this.c) {
            c();
            this.c = false;
        }
        szz szz = (szz) this.b;
        szz szz2 = szz.g;
        tab.getClass();
        szz.a();
        szz.b.set(i, tab);
    }

    public aucd(byte[] bArr, boolean[][][] zArr) {
        this((aucj) auuq.d);
    }

    public aucd(char[] cArr) {
        this((aucj) aumd.h);
    }

    public aucd(char[] cArr, byte[] bArr) {
        this((aucj) aqxm.c);
    }

    public aucd(char[] cArr, byte[] bArr, byte[] bArr2) {
        this((aucj) anzo.i);
    }

    public void a(int i, tah tah) {
        if (this.c) {
            c();
            this.c = false;
        }
        tad tad = (tad) this.b;
        tad tad2 = tad.P;
        tah.getClass();
        tad.b();
        tad.e.set(i, tah);
    }

    public final void b(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        gzr gzr = (gzr) this.b;
        gzr gzr2 = gzr.A;
        str.getClass();
        gzr.c();
        gzr.m.add(str);
    }

    public aucd(char[] cArr, char[] cArr2) {
        this((aucj) anzy.p);
    }

    public aucd(char[] cArr, char[] cArr2, byte[] bArr) {
        this((aucj) amfi.c);
    }

    public aucd(char[] cArr, float[] fArr) {
        this((aucj) antc.f);
    }

    public aucd(char[] cArr, int[] iArr) {
        this((aucj) adqv.g);
    }

    public final void a(long j) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        if (!bci.o.a()) {
            bci.o = aucj.a(bci.o);
        }
        bci.o.a(j);
    }

    public void b(oql oql) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqk oqk = (oqk) this.b;
        oqk oqk2 = oqk.e;
        oql.getClass();
        oqk.b();
        oqk.b.add(oql);
    }

    public aucd(char[] cArr, int[] iArr, byte[] bArr) {
        this((aucj) aulo.b);
    }

    public aucd(char[] cArr, short[] sArr) {
        this((aucj) szz.g);
    }

    public aucd(char[] cArr, short[] sArr, byte[] bArr) {
        this((aucj) ailr.e);
    }

    public aucd(char[] cArr, boolean[] zArr) {
        this((aucj) asfa.f);
    }

    /* renamed from: b */
    public final void a(byte[] bArr, int i, aubs aubs) {
        if (this.c) {
            c();
            this.c = false;
        }
        try {
            aueh.a.a((Object) this.b).a(this.b, bArr, 0, i, new auah(aubs));
        } catch (auda e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw auda.a();
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        }
    }

    public aucd(char[] cArr, boolean[] zArr, byte[] bArr) {
        this((aucj) armc.f);
    }

    public aucd(char[] cArr, byte[][] bArr) {
        this((aucj) aasm.l);
    }

    public final void a(long j, hgt hgt) {
        hgt.getClass();
        if (this.c) {
            c();
            this.c = false;
        }
        hgv hgv = (hgv) this.b;
        hgv hgv2 = hgv.b;
        audr audr = hgv.a;
        if (!audr.a) {
            hgv.a = audr.a();
        }
        hgv.a.put(Long.valueOf(j), hgt);
    }

    public aucd(char[] cArr, char[][] cArr2) {
        this((aucj) xme.l);
    }

    public aucd(char[] cArr, float[][] fArr) {
        this((aucj) auye.b);
    }

    public aucd(char[] cArr, int[][] iArr) {
        this((aucj) arej.c);
    }

    public aucd(char[] cArr, short[][] sArr) {
        this((aucj) atyw.j);
    }

    public void a(aavi aavi) {
        if (this.c) {
            c();
            this.c = false;
        }
        aavk aavk = (aavk) this.b;
        aavk aavk2 = aavk.e;
        aavi.getClass();
        if (!aavk.d.a()) {
            aavk.d = aucj.a(aavk.d);
        }
        aavk.d.d(aavi.d);
    }

    public aucd(char[] cArr, byte[][][] bArr) {
        this((aucj) atcr.e);
    }

    public aucd(char[] cArr, char[][][] cArr2) {
        this((aucj) aquw.d);
    }

    public aucd(char[] cArr, float[][][] fArr) {
        this((aucj) atsu.e);
    }

    public aucd(char[] cArr, int[][][] iArr) {
        this((aucj) tzf.A);
    }

    public aucd(char[] cArr, short[][][] sArr) {
        this((aucj) aqdg.d);
    }

    public aucd(char[] cArr, boolean[][][] zArr) {
        this((aucj) qiq.h);
    }

    public void a(afjf afjf) {
        if (this.c) {
            c();
            this.c = false;
        }
        afjh afjh = (afjh) this.b;
        afjh afjh2 = afjh.h;
        afjf.getClass();
        afjh.a();
        afjh.g.add(afjf);
    }

    public aucd(float[] fArr) {
        this((aucj) vig.l);
    }

    public aucd(float[] fArr, byte[] bArr) {
        this((aucj) atay.j);
    }

    public aucd(float[] fArr, byte[] bArr, byte[] bArr2) {
        this((aucj) atvv.g);
    }

    public aucd(float[] fArr, char[] cArr) {
        this((aucj) aral.b);
    }

    public void a(afkn afkn) {
        if (this.c) {
            c();
            this.c = false;
        }
        afkr afkr = (afkr) this.b;
        afkr afkr2 = afkr.m;
        afkn.getClass();
        if (!afkr.j.a()) {
            afkr.j = aucj.a(afkr.j);
        }
        afkr.j.add(afkn);
    }

    public aucd(float[] fArr, char[] cArr, byte[] bArr) {
        this((aucj) opz.d);
    }

    public aucd(float[] fArr, float[] fArr2) {
        this((aucj) atop.m);
    }

    public aucd(float[] fArr, int[] iArr) {
        this((aucj) szl.i);
    }

    public aucd(float[] fArr, int[] iArr, byte[] bArr) {
        this((aucj) airl.b);
    }

    public aucd(float[] fArr, short[] sArr) {
        this((aucj) amln.i);
    }

    public aucd(float[] fArr, short[] sArr, byte[] bArr) {
        this((aucj) uaj.K);
    }

    public aucd(float[] fArr, boolean[] zArr) {
        this((aucj) plf.i);
    }

    public void a(afyq afyq) {
        if (this.c) {
            c();
            this.c = false;
        }
        afys afys = (afys) this.b;
        afys afys2 = afys.f;
        afyq.getClass();
        afys.a();
        afys.b.add(afyq);
    }

    public aucd(float[] fArr, boolean[] zArr, byte[] bArr) {
        this((aucj) asrl.e);
    }

    public aucd(float[] fArr, byte[][] bArr) {
        this((aucj) aoak.h);
    }

    public aucd(float[] fArr, char[][] cArr) {
        this((aucj) aasr.c);
    }

    public aucd(float[] fArr, float[][] fArr2) {
        this((aucj) amap.l);
    }

    public void a(afyr afyr) {
        if (this.c) {
            c();
            this.c = false;
        }
        afys afys = (afys) this.b;
        afys afys2 = afys.f;
        afyr.getClass();
        afys.b();
        afys.e.add(afyr);
    }

    public aucd(float[] fArr, int[][] iArr) {
        this((aucj) atck.j);
    }

    public aucd(float[] fArr, short[][] sArr) {
        this((aucj) avos.b);
    }

    public aucd(float[] fArr, boolean[][] zArr) {
        this((aucj) oma.q);
    }

    public aucd(float[] fArr, byte[][][] bArr) {
        this((aucj) afkr.m);
    }

    public void a(ailt ailt) {
        if (this.c) {
            c();
            this.c = false;
        }
        ailw ailw = (ailw) this.b;
        ailw ailw2 = ailw.d;
        ailt.getClass();
        if (!ailw.c.a()) {
            ailw.c = aucj.a(ailw.c);
        }
        ailw.c.add(ailt);
    }

    public aucd(float[] fArr, char[][][] cArr) {
        this((aucj) asld.c);
    }

    public aucd(float[] fArr, float[][][] fArr2) {
        this((aucj) aulz.b);
    }

    public aucd(float[] fArr, int[][][] iArr) {
        this((aucj) aqls.c);
    }

    public aucd(float[] fArr, short[][][] sArr) {
        this((aucj) aqva.d);
    }

    public aucd(float[] fArr, boolean[][][] zArr) {
        this((aucj) auyk.k);
    }

    public aucd(int[] iArr) {
        this((aucj) aavs.e);
    }

    public aucd(int[] iArr, byte[] bArr) {
        this((aucj) asrw.f);
    }

    public void a(ajci ajci) {
        if (this.c) {
            c();
            this.c = false;
        }
        ajcd ajcd = (ajcd) this.b;
        ajcd ajcd2 = ajcd.f;
        ajci.getClass();
        if (!ajcd.b.a()) {
            ajcd.b = aucj.a(ajcd.b);
        }
        ajcd.b.add(ajci);
    }

    public aucd(int[] iArr, byte[] bArr, byte[] bArr2) {
        this((aucj) aqxk.h);
    }

    public aucd(int[] iArr, char[] cArr) {
        this((aucj) aoia.o);
    }

    public aucd(int[] iArr, char[] cArr, byte[] bArr) {
        this((aucj) aqoo.b);
    }

    public aucd(int[] iArr, float[] fArr) {
        this((aucj) aqrf.d);
    }

    public aucd(int[] iArr, int[] iArr2) {
        this((aucj) vnl.f);
    }

    public aucd(int[] iArr, int[] iArr2, byte[] bArr) {
        this((aucj) auvn.b);
    }

    public aucd(int[] iArr, short[] sArr) {
        this((aucj) aasp.f);
    }

    public final void a(ansk ansk) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfg hfg = (hfg) this.b;
        hfg hfg2 = hfg.d;
        ansk.getClass();
        hfg.a();
        hfg.a.add(ansk);
    }

    public aucd(int[] iArr, short[] sArr, byte[] bArr) {
        this((aucj) xon.b);
    }

    public aucd(int[] iArr, boolean[] zArr) {
        this((aucj) atwh.d);
    }

    public aucd(int[] iArr, boolean[] zArr, byte[] bArr) {
        this((aucj) nxa.g);
    }

    public aucd(int[] iArr, byte[][] bArr) {
        this((aucj) amhf.b);
    }

    public aucd(int[] iArr, char[][] cArr) {
        this((aucj) tab.g);
    }

    public aucd(int[] iArr, float[][] fArr) {
        this((aucj) barw.h);
    }

    public aucd(int[] iArr, int[][] iArr2) {
        this((aucj) astm.e);
    }

    public final void a(aucj aucj) {
        if (this.c) {
            c();
            this.c = false;
        }
        a(this.b, aucj);
    }

    public aucd(int[] iArr, short[][] sArr) {
        this((aucj) pqr.c);
    }

    public aucd(int[] iArr, boolean[][] zArr) {
        this((aucj) aoei.w);
    }

    public aucd(int[] iArr, byte[][][] bArr) {
        this((aucj) aupt.b);
    }

    public final void a(bbm bbm) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bbm.getClass();
        if (!bci.l.a()) {
            bci.l = aucj.a(bci.l);
        }
        bci.l.add(bbm);
    }

    public aucd(int[] iArr, char[][][] cArr) {
        this((aucj) atqo.d);
    }

    public aucd(int[] iArr, float[][][] fArr) {
        this((aucj) asqu.i);
    }

    public aucd(int[] iArr, int[][][] iArr2) {
        this((aucj) amdq.b);
    }

    public aucd(int[] iArr, short[][][] sArr) {
        this((aucj) anvq.e);
    }

    public aucd(int[] iArr, boolean[][][] zArr) {
        this((aucj) avsh.d);
    }

    public aucd(short[] sArr) {
        this((aucj) ovn.h);
    }

    public aucd(short[] sArr, byte[] bArr) {
        this((aucj) atok.e);
    }

    public final void a(bbn bbn) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bbn.getClass();
        if (!bci.k.a()) {
            bci.k = aucj.a(bci.k);
        }
        bci.k.add(bbn);
    }

    public aucd(short[] sArr, byte[] bArr, byte[] bArr2) {
        this((aucj) aotp.f);
    }

    public aucd(short[] sArr, char[] cArr) {
        this((aucj) anss.g);
    }

    public aucd(short[] sArr, char[] cArr, byte[] bArr) {
        this((aucj) ansb.e);
    }

    public aucd(short[] sArr, float[] fArr) {
        this((aucj) aoik.b);
    }

    public aucd(short[] sArr, int[] iArr) {
        this((aucj) avit.b);
    }

    public aucd(short[] sArr, int[] iArr, byte[] bArr) {
        this((aucj) ova.b);
    }

    public aucd(short[] sArr, short[] sArr2) {
        this((aucj) avvf.h);
    }

    public final void a(bbp bbp) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bbp.getClass();
        if (!bci.i.a()) {
            bci.i = aucj.a(bci.i);
        }
        bci.i.add(bbp);
    }

    public aucd(short[] sArr, short[] sArr2, byte[] bArr) {
        this((aucj) avsi.e);
    }

    public aucd(short[] sArr, boolean[] zArr) {
        this((aucj) atbn.f);
    }

    public aucd(short[] sArr, boolean[] zArr, byte[] bArr) {
        this((aucj) atvc.b);
    }

    public aucd(short[] sArr, byte[][] bArr) {
        this((aucj) ajkb.d);
    }

    public aucd(short[] sArr, char[][] cArr) {
        this((aucj) auxl.d);
    }

    public aucd(short[] sArr, float[][] fArr) {
        this((aucj) tae.b);
    }

    public aucd(short[] sArr, int[][] iArr) {
        this((aucj) atqm.d);
    }

    public final void a(bbs bbs) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bbs.getClass();
        if (!bci.e.a()) {
            bci.e = aucj.a(bci.e);
        }
        bci.e.add(bbs);
    }

    public aucd(short[] sArr, short[][] sArr2) {
        this((aucj) aupk.e);
    }

    public aucd(short[] sArr, boolean[][] zArr) {
        this((aucj) aqdu.f);
    }

    public aucd(short[] sArr, byte[][][] bArr) {
        this((aucj) atzr.b);
    }

    public aucd(short[] sArr, char[][][] cArr) {
        this((aucj) arel.d);
    }

    public aucd(short[] sArr, float[][][] fArr) {
        this((aucj) aszm.e);
    }

    public aucd(short[] sArr, int[][][] iArr) {
        this((aucj) aaty.r);
    }

    public aucd(short[] sArr, short[][][] sArr2) {
        this((aucj) aodx.h);
    }

    public final void a(bbt bbt) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bbt.getClass();
        if (!bci.h.a()) {
            bci.h = aucj.a(bci.h);
        }
        bci.h.add(bbt);
    }

    public aucd(short[] sArr, boolean[][][] zArr) {
        this((aucj) ailg.d);
    }

    public aucd(boolean[] zArr) {
        this((aucj) avft.c);
    }

    public aucd(boolean[] zArr, byte[] bArr) {
        this((aucj) artj.b);
    }

    public aucd(boolean[] zArr, byte[] bArr, byte[] bArr2) {
        this((aucj) arpd.d);
    }

    public aucd(boolean[] zArr, char[] cArr) {
        this((aucj) aqre.e);
    }

    public aucd(boolean[] zArr, char[] cArr, byte[] bArr) {
        this((aucj) aoge.m);
    }

    public aucd(boolean[] zArr, float[] fArr) {
        this((aucj) araq.m);
    }

    public final void a(bbv bbv) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bbv.getClass();
        if (!bci.d.a()) {
            bci.d = aucj.a(bci.d);
        }
        bci.d.add(bbv);
    }

    public aucd(boolean[] zArr, int[] iArr) {
        this((aucj) auxi.c);
    }

    public aucd(boolean[] zArr, int[] iArr, byte[] bArr) {
        this((aucj) qje.d);
    }

    public aucd(boolean[] zArr, short[] sArr) {
        this((aucj) allr.b);
    }

    public aucd(boolean[] zArr, short[] sArr, byte[] bArr) {
        this((aucj) auyx.e);
    }

    public aucd(boolean[] zArr, boolean[] zArr2) {
        this((aucj) aumw.b);
    }

    public aucd(boolean[] zArr, boolean[] zArr2, byte[] bArr) {
        this((aucj) ataf.e);
    }

    public aucd(boolean[] zArr, byte[][] bArr) {
        this((aucj) apgv.e);
    }

    public final void a(bby bby) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bby.getClass();
        if (!bci.g.a()) {
            bci.g = aucj.a(bci.g);
        }
        bci.g.add(bby);
    }

    public aucd(boolean[] zArr, char[][] cArr) {
        this((aucj) avvq.e);
    }

    public aucd(boolean[] zArr, float[][] fArr) {
        this((aucj) aate.c);
    }

    public aucd(boolean[] zArr, int[][] iArr) {
        this((aucj) askl.g);
    }

    public aucd(boolean[] zArr, short[][] sArr) {
        this((aucj) afjx.e);
    }

    public aucd(boolean[] zArr, boolean[][] zArr2) {
        this((aucj) anwk.i);
    }

    public aucd(boolean[] zArr, byte[][][] bArr) {
        this((aucj) pqu.f);
    }

    public aucd(boolean[] zArr, char[][][] cArr) {
        this((aucj) astv.f);
    }

    public final void a(bbz bbz) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bbz.getClass();
        if (!bci.q.a()) {
            bci.q = aucj.a(bci.q);
        }
        bci.q.add(bbz);
    }

    public aucd(boolean[] zArr, float[][][] fArr) {
        this((aucj) atjl.k);
    }

    public aucd(boolean[] zArr, int[][][] iArr) {
        this((aucj) anpy.f);
    }

    public aucd(boolean[] zArr, short[][][] sArr) {
        this((aucj) aokk.b);
    }

    public aucd(boolean[] zArr, boolean[][][] zArr2) {
        this((aucj) xom.d);
    }

    public aucd(byte[][] bArr) {
        this((aucj) nqk.b);
    }

    public aucd(byte[][] bArr, byte[] bArr2) {
        this((aucj) atwf.g);
    }

    public aucd(byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        this((aucj) atah.d);
    }

    public final void a(bcc bcc) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bcc.getClass();
        if (!bci.j.a()) {
            bci.j = aucj.a(bci.j);
        }
        bci.j.add(bcc);
    }

    public aucd(byte[][] bArr, char[] cArr) {
        this((aucj) atol.h);
    }

    public aucd(byte[][] bArr, char[] cArr, byte[] bArr2) {
        this((aucj) anyy.h);
    }

    public aucd(byte[][] bArr, float[] fArr) {
        this((aucj) assl.d);
    }

    public aucd(byte[][] bArr, int[] iArr) {
        this((aucj) avuu.g);
    }

    public aucd(byte[][] bArr, int[] iArr, byte[] bArr2) {
        this((aucj) avth.g);
    }

    public aucd(byte[][] bArr, short[] sArr) {
        this((aucj) aphv.e);
    }

    public aucd(byte[][] bArr, short[] sArr, byte[] bArr2) {
        this((aucj) aauc.e);
    }

    public final void a(bcl bcl) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bcl.getClass();
        if (!bci.m.a()) {
            bci.m = aucj.a(bci.m);
        }
        bci.m.add(bcl);
    }

    public aucd(byte[][] bArr, boolean[] zArr) {
        this((aucj) adqq.d);
    }

    public aucd(byte[][] bArr, boolean[] zArr, byte[] bArr2) {
        this((aucj) atod.b);
    }

    public aucd(byte[][] bArr, byte[][] bArr2) {
        this((aucj) anua.h);
    }

    public aucd(byte[][] bArr, char[][] cArr) {
        this((aucj) almp.l);
    }

    public aucd(byte[][] bArr, float[][] fArr) {
        this((aucj) anpa.u);
    }

    public aucd(byte[][] bArr, short[][] sArr) {
        this((aucj) xma.b);
    }

    public final void a(bcm bcm) {
        if (this.c) {
            c();
            this.c = false;
        }
        bci bci = (bci) this.b;
        bci bci2 = bci.u;
        bcm.getClass();
        if (!bci.f.a()) {
            bci.f = aucj.a(bci.f);
        }
        bci.f.add(bcm);
    }

    public aucd(byte[][] bArr, boolean[][] zArr) {
        this((aucj) aokl.b);
    }

    public aucd(byte[][] bArr, byte[][][] bArr2) {
        this((aucj) avqe.f);
    }

    public aucd(byte[][] bArr, char[][][] cArr) {
        this((aucj) atco.r);
    }

    public aucd(byte[][] bArr, float[][][] fArr) {
        this((aucj) ovo.f);
    }

    public aucd(byte[][] bArr, int[][][] iArr) {
        this((aucj) aofg.b);
    }

    public aucd(byte[][] bArr, short[][][] sArr) {
        this((aucj) arew.e);
    }

    public aucd(byte[][] bArr, boolean[][][] zArr) {
        this((aucj) tzi.p);
    }

    public final void a(bda bda) {
        if (this.c) {
            c();
            this.c = false;
        }
        bdb bdb = (bdb) this.b;
        bdb bdb2 = bdb.b;
        bda.getClass();
        if (!bdb.a.a()) {
            bdb.a = aucj.a(bdb.a);
        }
        bdb.a.add(bda);
    }

    public aucd(char[][] cArr) {
        this((aucj) oqo.g);
    }

    public aucd(char[][] cArr, byte[] bArr) {
        this((aucj) aumm.e);
    }

    public aucd(char[][] cArr, byte[] bArr, byte[] bArr2) {
        this((aucj) asrk.d);
    }

    public aucd(char[][] cArr, char[] cArr2) {
        this((aucj) assk.f);
    }

    public aucd(char[][] cArr, char[] cArr2, byte[] bArr) {
        this((aucj) aokz.f);
    }

    public aucd(char[][] cArr, float[] fArr) {
        this((aucj) asab.j);
    }

    public aucd(char[][] cArr, int[] iArr) {
        this((aucj) aask.e);
    }

    public final void a(bre bre) {
        if (this.c) {
            c();
            this.c = false;
        }
        brf brf = (brf) this.b;
        brf brf2 = brf.d;
        bre.getClass();
        brf.a();
        brf.c.add(bre);
    }

    public aucd(char[][] cArr, int[] iArr, byte[] bArr) {
        this((aucj) xsg.f);
    }

    public aucd(char[][] cArr, short[] sArr) {
        this((aucj) aoaj.j);
    }

    public aucd(char[][] cArr, short[] sArr, byte[] bArr) {
        this((aucj) amet.h);
    }

    public aucd(char[][] cArr, boolean[] zArr) {
        this((aucj) avgu.f);
    }

    public final void a(fyy fyy) {
        if (this.c) {
            c();
            this.c = false;
        }
        fyw fyw = (fyw) this.b;
        fyw fyw2 = fyw.d;
        fyy.getClass();
        fyw.a();
        fyw.b.add(fyy);
    }

    public aucd(char[][] cArr, byte[][] bArr) {
        this((aucj) aois.d);
    }

    public aucd(char[][] cArr, char[][] cArr2) {
        this((aucj) amnz.b);
    }

    public aucd(char[][] cArr, float[][] fArr) {
        this((aucj) otu.k);
    }

    public aucd(char[][] cArr, int[][] iArr) {
        this((aucj) opr.b);
    }

    public final void a(haq haq) {
        if (this.c) {
            c();
            this.c = false;
        }
        har har = (har) this.b;
        har har2 = har.i;
        haq.getClass();
        if (!har.e.a()) {
            har.e = aucj.a(har.e);
        }
        har.e.d(haq.d);
    }

    public aucd(char[][] cArr, short[][] sArr) {
        this((aucj) otr.d);
    }

    public aucd(char[][] cArr, boolean[][] zArr) {
        this((aucj) aqvc.c);
    }

    public aucd(char[][] cArr, byte[][][] bArr) {
        this((aucj) xny.w);
    }

    public aucd(char[][] cArr, char[][][] cArr2) {
        this((aucj) augp.j);
    }

    public aucd(char[][] cArr, float[][][] fArr) {
        this((aucj) auwe.f);
    }

    public aucd(char[][] cArr, int[][][] iArr) {
        this((aucj) otp.i);
    }

    public aucd(char[][] cArr, short[][][] sArr) {
        this((aucj) atrb.d);
    }

    public final void a(hfi hfi) {
        if (this.c) {
            c();
            this.c = false;
        }
        hfj hfj = (hfj) this.b;
        hfj hfj2 = hfj.b;
        hfi.getClass();
        hfj.a();
        hfj.a.add(hfi);
    }

    public aucd(char[][] cArr, boolean[][][] zArr) {
        this((aucj) aatz.l);
    }

    public aucd(float[][] fArr) {
        this((aucj) zra.d);
    }

    public aucd(float[][] fArr, byte[] bArr) {
        this((aucj) vih.b);
    }

    public aucd(float[][] fArr, byte[] bArr, byte[] bArr2) {
        this((aucj) auvb.b);
    }

    public final void a(lyf lyf) {
        if (this.c) {
            c();
            this.c = false;
        }
        lyd lyd = (lyd) this.b;
        lyd lyd2 = lyd.p;
        lyf.getClass();
        if (!lyd.c.a()) {
            lyd.c = aucj.a(lyd.c);
        }
        lyd.c.add(lyf);
    }

    public aucd(float[][] fArr, char[] cArr) {
        this((aucj) atxi.f);
    }

    public aucd(float[][] fArr, char[] cArr, byte[] bArr) {
        this((aucj) aszy.b);
    }

    public aucd(float[][] fArr, float[] fArr2) {
        this((aucj) plh.b);
    }

    public aucd(float[][] fArr, int[] iArr) {
        this((aucj) apgo.d);
    }

    public aucd(float[][] fArr, int[] iArr, byte[] bArr) {
        this((aucj) amfk.d);
    }

    public aucd(float[][] fArr, short[] sArr) {
        this((aucj) arax.e);
    }

    public aucd(float[][] fArr, short[] sArr, byte[] bArr) {
        this((aucj) anyj.d);
    }

    public void a(oll oll) {
        if (this.c) {
            c();
            this.c = false;
        }
        olt olt = (olt) this.b;
        olt olt2 = olt.c;
        oll.getClass();
        if (!olt.a.a()) {
            olt.a = aucj.a(olt.a);
        }
        olt.a.add(oll);
    }

    public aucd(float[][] fArr, boolean[] zArr) {
        this((aucj) avuk.j);
    }

    public aucd(float[][] fArr, byte[][] bArr) {
        this((aucj) assu.q);
    }

    public aucd(float[][] fArr, char[][] cArr) {
        this((aucj) anuq.d);
    }

    public aucd(float[][] fArr, float[][] fArr2) {
        this((aucj) olt.c);
    }

    public aucd(float[][] fArr, int[][] iArr) {
        this((aucj) agxe.g);
    }

    public aucd(float[][] fArr, short[][] sArr) {
        this((aucj) aatb.n);
    }

    public aucd(float[][] fArr, boolean[][] zArr) {
        this((aucj) asnl.f);
    }

    public void a(opy opy) {
        if (this.c) {
            c();
            this.c = false;
        }
        opz opz = (opz) this.b;
        opz opz2 = opz.d;
        opy.getClass();
        if (!opz.c.a()) {
            opz.c = aucj.a(opz.c);
        }
        opz.c.add(opy);
    }

    public aucd(float[][] fArr, byte[][][] bArr) {
        this((aucj) aatc.g);
    }

    public aucd(float[][] fArr, char[][][] cArr) {
        this((aucj) avra.b);
    }

    public aucd(float[][] fArr, float[][][] fArr2) {
        this((aucj) zqz.b);
    }

    public aucd(float[][] fArr, int[][][] iArr) {
        this((aucj) arff.d);
    }

    public aucd(float[][] fArr, short[][][] sArr) {
        this((aucj) auik.d);
    }

    public aucd(float[][] fArr, boolean[][][] zArr) {
        this((aucj) aqmw.f);
    }

    public aucd(int[][] iArr) {
        this((aucj) qji.b);
    }

    public void a(opz opz) {
        if (this.c) {
            c();
            this.c = false;
        }
        otu otu = (otu) this.b;
        otu otu2 = otu.k;
        opz.getClass();
        if (!otu.c.a()) {
            otu.c = aucj.a(otu.c);
        }
        otu.c.add(opz);
    }

    public aucd(int[][] iArr, byte[] bArr) {
        this((aucj) aawc.e);
    }

    public aucd(int[][] iArr, byte[] bArr, byte[] bArr2) {
        this((aucj) auln.b);
    }

    public aucd(int[][] iArr, char[] cArr) {
        this((aucj) oky.g);
    }

    public aucd(int[][] iArr, char[] cArr, byte[] bArr) {
        this((aucj) arij.g);
    }

    public aucd(int[][] iArr, float[] fArr) {
        this((aucj) atxb.d);
    }

    public aucd(int[][] iArr, int[] iArr2) {
        this((aucj) amhd.d);
    }

    public aucd(int[][] iArr, int[] iArr2, byte[] bArr) {
        this((aucj) vhm.b);
    }

    public void a(oqg oqg) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqh oqh = (oqh) this.b;
        oqh oqh2 = oqh.c;
        oqg.getClass();
        if (!oqh.b.a()) {
            oqh.b = aucj.a(oqh.b);
        }
        oqh.b.add(oqg);
    }

    public aucd(int[][] iArr, short[] sArr) {
        this((aucj) aoit.d);
    }

    public aucd(int[][] iArr, short[] sArr, byte[] bArr) {
        this((aucj) aqom.e);
    }

    public aucd(int[][] iArr, boolean[] zArr) {
        this((aucj) auxc.h);
    }

    public aucd(int[][] iArr, byte[][] bArr) {
        this((aucj) araw.m);
    }

    public aucd(int[][] iArr, char[][] cArr) {
        this((aucj) apii.e);
    }

    public aucd(int[][] iArr, float[][] fArr) {
        this((aucj) aodf.f);
    }

    public aucd(int[][] iArr, int[][] iArr2) {
        this((aucj) auum.b);
    }

    public void a(oqh oqh) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqk oqk = (oqk) this.b;
        oqk oqk2 = oqk.e;
        oqh.getClass();
        oqk.a();
        oqk.a.add(oqh);
    }

    public aucd(int[][] iArr, short[][] sArr) {
        this((aucj) tac.b);
    }

    public aucd(int[][] iArr, boolean[][] zArr) {
        this((aucj) atrn.c);
    }

    public aucd(int[][] iArr, byte[][][] bArr) {
        this((aucj) tad.P);
    }

    public aucd(int[][] iArr, char[][][] cArr) {
        this((aucj) ptj.c);
    }

    public void a(oqj oqj) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqk oqk = (oqk) this.b;
        oqk oqk2 = oqk.e;
        oqj.getClass();
        if (!oqk.d.a()) {
            oqk.d = aucj.a(oqk.d);
        }
        oqk.d.d(oqj.d);
    }

    public aucd(int[][] iArr, float[][][] fArr) {
        this((aucj) aiss.f);
    }

    public aucd(int[][] iArr, int[][][] iArr2) {
        this((aucj) aokp.o);
    }

    public aucd(int[][] iArr, short[][][] sArr) {
        this((aucj) asnk.g);
    }

    public aucd(int[][] iArr, boolean[][][] zArr) {
        this((aucj) amds.b);
    }

    public aucd(short[][] sArr) {
        this((aucj) auwr.e);
    }

    public aucd(short[][] sArr, byte[] bArr) {
        this((aucj) ovp.c);
    }

    public aucd(short[][] sArr, byte[] bArr, byte[] bArr2) {
        this((aucj) atoh.b);
    }

    public void a(oqk oqk) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqe oqe = (oqe) this.b;
        oqe oqe2 = oqe.d;
        oqk.getClass();
        oqe.a();
        oqe.b.add(oqk);
    }

    public aucd(short[][] sArr, char[] cArr) {
        this((aucj) aruv.f);
    }

    public aucd(short[][] sArr, char[] cArr, byte[] bArr) {
        this((aucj) aqwg.g);
    }

    public aucd(short[][] sArr, float[] fArr) {
        this((aucj) atau.d);
    }

    public aucd(short[][] sArr, int[] iArr) {
        this((aucj) ajjx.u);
    }

    public void a(oql oql) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqk oqk = (oqk) this.b;
        oqk oqk2 = oqk.e;
        oql.getClass();
        if (!oqk.c.a()) {
            oqk.c = aucj.a(oqk.c);
        }
        oqk.c.add(oql);
    }

    public aucd(short[][] sArr, int[] iArr, byte[] bArr) {
        this((aucj) avdz.r);
    }

    public aucd(short[][] sArr, short[] sArr2) {
        this((aucj) anuu.e);
    }

    public aucd(short[][] sArr, short[] sArr2, byte[] bArr) {
        this((aucj) anry.h);
    }

    public aucd(short[][] sArr, boolean[] zArr) {
        this((aucj) vnb.b);
    }

    public aucd(short[][] sArr, byte[][] bArr) {
        this((aucj) aqul.c);
    }

    public aucd(short[][] sArr, char[][] cArr) {
        this((aucj) otg.h);
    }

    public aucd(short[][] sArr, float[][] fArr) {
        this((aucj) aqdh.e);
    }

    public void a(oqn oqn) {
        if (this.c) {
            c();
            this.c = false;
        }
        oqo oqo = (oqo) this.b;
        oqo oqo2 = oqo.g;
        oqn.getClass();
        oqo.a();
        oqo.e.add(oqn);
    }

    public aucd(short[][] sArr, int[][] iArr) {
        this((aucj) olu.b);
    }

    public aucd(short[][] sArr, short[][] sArr2) {
        this((aucj) auxx.d);
    }

    public aucd(short[][] sArr, boolean[][] zArr) {
        this((aucj) arex.t);
    }

    public aucd(short[][] sArr, byte[][][] bArr) {
        this((aucj) auyc.b);
    }

    public void a(oqy oqy) {
        if (this.c) {
            c();
            this.c = false;
        }
        osz osz = (osz) this.b;
        osz osz2 = osz.s;
        oqy.getClass();
        osz.a();
        osz.j.add(oqy);
    }

    public aucd(short[][] sArr, char[][][] cArr) {
        this((aucj) autg.f);
    }

    public aucd(short[][] sArr, float[][][] fArr) {
        this((aucj) qjh.e);
    }

    public aucd(short[][] sArr, int[][][] iArr) {
        this((aucj) anxj.g);
    }

    public aucd(short[][] sArr, short[][][] sArr2) {
        this((aucj) asul.d);
    }

    public void a(ouc ouc) {
        if (this.c) {
            c();
            this.c = false;
        }
        oul oul = (oul) this.b;
        oul oul2 = oul.v;
        ouc.getClass();
        oul.a();
        oul.b.add(ouc);
    }

    public aucd(short[][] sArr, boolean[][][] zArr) {
        this((aucj) nwq.i);
    }

    public aucd(boolean[][] zArr) {
        this((aucj) avtp.k);
    }

    public aucd(boolean[][] zArr, byte[] bArr) {
        this((aucj) avgi.d);
    }

    public aucd(boolean[][] zArr, byte[] bArr, byte[] bArr2) {
        this((aucj) ous.d);
    }

    public void a(ouk ouk) {
        if (this.c) {
            c();
            this.c = false;
        }
        oul oul = (oul) this.b;
        oul oul2 = oul.v;
        ouk.getClass();
        oul.b();
        oul.d.add(ouk);
    }

    public aucd(boolean[][] zArr, char[] cArr) {
        this((aucj) atat.e);
    }

    public aucd(boolean[][] zArr, char[] cArr, byte[] bArr) {
        this((aucj) atuo.d);
    }

    public aucd(boolean[][] zArr, float[] fArr) {
        this((aucj) auoz.p);
    }

    public aucd(boolean[][] zArr, int[] iArr) {
        this((aucj) nws.b);
    }

    public void a(ovo ovo) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovp ovp = (ovp) this.b;
        ovp ovp2 = ovp.c;
        ovo.getClass();
        ovp.a();
        ovp.a.add(ovo);
    }

    public aucd(boolean[][] zArr, int[] iArr, byte[] bArr) {
        this((aucj) aavm.d);
    }

    public aucd(boolean[][] zArr, short[] sArr) {
        this((aucj) aquo.d);
    }

    public aucd(boolean[][] zArr, short[] sArr, byte[] bArr) {
        this((aucj) aofq.c);
    }

    public aucd(boolean[][] zArr, boolean[] zArr2) {
        this((aucj) szk.e);
    }

    public void a(plh plh) {
        if (this.c) {
            c();
            this.c = false;
        }
        ovn ovn = (ovn) this.b;
        ovn ovn2 = ovn.h;
        plh.getClass();
        ovn.g = plh;
        ovn.a |= 16;
    }

    public aucd(boolean[][] zArr, byte[][] bArr) {
        this((aucj) ator.d);
    }

    public aucd(boolean[][] zArr, char[][] cArr) {
        this((aucj) aoan.d);
    }

    public aucd(boolean[][] zArr, float[][] fArr) {
        this((aucj) anva.b);
    }

    public aucd(boolean[][] zArr, int[][] iArr) {
        this((aucj) ptk.f);
    }

    public void a(tab tab) {
        if (this.c) {
            c();
            this.c = false;
        }
        szz szz = (szz) this.b;
        szz szz2 = szz.g;
        tab.getClass();
        szz.a();
        szz.b.add(tab);
    }

    public aucd(boolean[][] zArr, short[][] sArr) {
        this((aucj) barn.w);
    }

    public aucd(boolean[][] zArr, boolean[][] zArr2) {
        this((aucj) asuq.l);
    }

    public aucd(boolean[][] zArr, byte[][][] bArr) {
        this((aucj) baro.b);
    }

    public aucd(boolean[][] zArr, char[][][] cArr) {
        this((aucj) afys.f);
    }

    public void a(tah tah) {
        if (this.c) {
            c();
            this.c = false;
        }
        tad tad = (tad) this.b;
        tad tad2 = tad.P;
        tah.getClass();
        tad.b();
        tad.e.add(tah);
    }

    public aucd(boolean[][] zArr, float[][][] fArr) {
        this((aucj) avtk.k);
    }

    public aucd(boolean[][] zArr, int[][][] iArr) {
        this((aucj) aqvf.c);
    }

    public aucd(boolean[][] zArr, short[][][] sArr) {
        this((aucj) atdd.g);
    }

    public aucd(boolean[][] zArr, boolean[][][] zArr2) {
        this((aucj) anqd.e);
    }

    public void a(vhl vhl) {
        if (this.c) {
            c();
            this.c = false;
        }
        vhm vhm = (vhm) this.b;
        vhm vhm2 = vhm.b;
        vhl.getClass();
        if (!vhm.a.a()) {
            vhm.a = aucj.a(vhm.a);
        }
        vhm.a.add(vhl);
    }

    public aucd(byte[][][] bArr) {
        this((aucj) aizj.d);
    }

    public aucd(byte[][][] bArr, byte[] bArr2) {
        this((aucj) auwy.u);
    }

    public aucd(byte[][][] bArr, byte[] bArr2, byte[] bArr3) {
        this((aucj) qix.b);
    }

    public aucd(byte[][][] bArr, char[] cArr) {
        this((aucj) okm.e);
    }

    public aucd(byte[][][] bArr, char[] cArr, byte[] bArr2) {
        this((aucj) asrh.f);
    }

    public aucd(byte[][][] bArr, float[] fArr) {
        this((aucj) aece.b);
    }

    public aucd(byte[][][] bArr, int[] iArr) {
        this((aucj) aoag.e);
    }

    public void a(vnq vnq) {
        if (this.c) {
            c();
            this.c = false;
        }
        vnb vnb = (vnb) this.b;
        vnb vnb2 = vnb.b;
        vnq.getClass();
        if (!vnb.a.a()) {
            vnb.a = aucj.a(vnb.a);
        }
        vnb.a.add(vnq);
    }

    public aucd(byte[][][] bArr, int[] iArr, byte[] bArr2) {
        this((aucj) ansh.e);
    }

    public aucd(byte[][][] bArr, short[] sArr) {
        this((aucj) atow.f);
    }

    public aucd(byte[][][] bArr, boolean[] zArr) {
        this((aucj) aarw.b);
    }

    public aucd(byte[][][] bArr, byte[][] bArr2) {
        this((aucj) aske.e);
    }

    public aucd(byte[][][] bArr, char[][] cArr) {
        this((aucj) aojk.C);
    }

    public aucd(byte[][][] bArr, float[][] fArr) {
        this((aucj) oqk.e);
    }

    public void a(xns xns) {
        if (this.c) {
            c();
            this.c = false;
        }
        xny xny = (xny) this.b;
        xny xny2 = xny.w;
        xns.getClass();
        if (!xny.u.a()) {
            xny.u = aucj.a(xny.u);
        }
        xny.u.add(xns);
    }

    public aucd(byte[][][] bArr, int[][] iArr) {
        this((aucj) avrd.e);
    }

    public aucd(byte[][][] bArr, short[][] sArr) {
        this((aucj) alzn.f);
    }

    public aucd(byte[][][] bArr, boolean[][] zArr) {
        this((aucj) atde.b);
    }

    public aucd(byte[][][] bArr, byte[][][] bArr2) {
        this((aucj) amao.g);
    }

    public aucd(byte[][][] bArr, char[][][] cArr) {
        this((aucj) xno.o);
    }

    public aucd(byte[][][] bArr, float[][][] fArr) {
        this((aucj) avfj.n);
    }

    public aucd(byte[][][] bArr, int[][][] iArr) {
        this((aucj) atsa.b);
    }

    public void a(xnv xnv) {
        if (this.c) {
            c();
            this.c = false;
        }
        xny xny = (xny) this.b;
        xny xny2 = xny.w;
        xnv.getClass();
        if (!xny.t.a()) {
            xny.t = aucj.a(xny.t);
        }
        xny.t.add(xnv);
    }

    public aucd(byte[][][] bArr, short[][][] sArr) {
        this((aucj) otx.d);
    }

    public aucd(byte[][][] bArr, boolean[][][] zArr) {
        this((aucj) aofh.b);
    }

    public aucd(char[][][] cArr) {
        this((aucj) amfu.b);
    }

    public aucd(char[][][] cArr, byte[] bArr) {
        this((aucj) qjm.c);
    }

    public aucd(char[][][] cArr, byte[] bArr, byte[] bArr2) {
        this((aucj) ailw.d);
    }

    public aucd(char[][][] cArr, char[] cArr2) {
        this((aucj) aupd.d);
    }

    public aucd(char[][][] cArr, char[] cArr2, byte[] bArr) {
        this((aucj) atnm.b);
    }

    public aucd(char[][][] cArr, float[] fArr) {
        this((aucj) aviy.b);
    }

    public final /* bridge */ /* synthetic */ void a(byte[] bArr, int i) {
        a(bArr, i, aubs.b());
    }

    public aucd(char[][][] cArr, int[] iArr) {
        this((aucj) antq.b);
    }

    public aucd(char[][][] cArr, int[] iArr, byte[] bArr) {
        this((aucj) aqox.d);
    }

    public aucd(char[][][] cArr, short[] sArr) {
        this((aucj) assv.d);
    }

    public aucd(char[][][] cArr, short[] sArr, byte[] bArr) {
        this((aucj) aqwe.g);
    }

    public aucd(char[][][] cArr, boolean[] zArr) {
        this((aucj) ajjt.b);
    }

    public aucd(char[][][] cArr, byte[][] bArr) {
        this((aucj) atbr.j);
    }

    public aucd(char[][][] cArr, char[][] cArr2) {
        this((aucj) aqus.d);
    }

    public aucd(char[][][] cArr, float[][] fArr) {
        this((aucj) aokc.g);
    }

    public aucd(char[][][] cArr, int[][] iArr) {
        this((aucj) xng.l);
    }

    public aucd(char[][][] cArr, short[][] sArr) {
        this((aucj) amob.b);
    }

    public aucd(char[][][] cArr, boolean[][] zArr) {
        this((aucj) atzu.b);
    }

    public aucd(char[][][] cArr, byte[][][] bArr) {
        this((aucj) anod.f);
    }

    public aucd(char[][][] cArr, char[][][] cArr2) {
        this((aucj) auyf.e);
    }

    public aucd(char[][][] cArr, float[][][] fArr) {
        this((aucj) vho.b);
    }

    public aucd(char[][][] cArr, int[][][] iArr) {
        this((aucj) asuw.d);
    }

    public aucd(char[][][] cArr, short[][][] sArr) {
        this((aucj) auuo.b);
    }

    public aucd(char[][][] cArr, boolean[][][] zArr) {
        this((aucj) oly.b);
    }

    public aucd(float[][][] fArr) {
        this((aucj) aohu.h);
    }

    public aucd(float[][][] fArr, byte[] bArr) {
        this((aucj) amgi.D);
    }

    public aucd(float[][][] fArr, byte[] bArr, byte[] bArr2) {
        this((aucj) vhk.l);
    }

    public aucd(float[][][] fArr, char[] cArr) {
        this((aucj) xlx.f);
    }

    public aucd(float[][][] fArr, char[] cArr, byte[] bArr) {
        this((aucj) auur.c);
    }

    public aucd(float[][][] fArr, float[] fArr2) {
        this((aucj) szv.h);
    }

    public aucd(float[][][] fArr, int[] iArr) {
        this((aucj) atoq.f);
    }

    public aucd(float[][][] fArr, short[] sArr) {
        this((aucj) auot.h);
    }

    public aucd(float[][][] fArr, short[] sArr, byte[] bArr) {
        this((aucj) asqz.e);
    }

    public aucd(float[][][] fArr, boolean[] zArr) {
        this((aucj) apgf.g);
    }

    public aucd(float[][][] fArr, byte[][] bArr) {
        this((aucj) afjh.h);
    }

    public aucd(float[][][] fArr, char[][] cArr) {
        this((aucj) askk.f);
    }

    public aucd(float[][][] fArr, float[][] fArr2) {
        this((aucj) asug.c);
    }

    public aucd(float[][][] fArr, int[][] iArr) {
        this((aucj) aatt.P);
    }

    public aucd(float[][][] fArr, short[][] sArr) {
        this((aucj) aojn.i);
    }

    public aucd(float[][][] fArr, boolean[][] zArr) {
        this((aucj) avqu.j);
    }

    public aucd(float[][][] fArr, byte[][][] bArr) {
        this((aucj) aoka.e);
    }

    public aucd(float[][][] fArr, char[][][] cArr) {
        this((aucj) amba.g);
    }

    public aucd(float[][][] fArr, float[][][] fArr2) {
        this((aucj) aqoz.d);
    }

    public aucd(float[][][] fArr, int[][][] iArr) {
        this((aucj) oul.v);
    }

    public aucd(float[][][] fArr, short[][][] sArr) {
        this((aucj) xnj.e);
    }

    public aucd(float[][][] fArr, boolean[][][] zArr) {
        this((aucj) aqvk.b);
    }

    public aucd(int[][][] iArr) {
        this((aucj) anzq.j);
    }

    public aucd(int[][][] iArr, byte[] bArr) {
        this((aucj) aarg.k);
    }

    public aucd(int[][][] iArr, byte[] bArr, byte[] bArr2) {
        this((aucj) xoo.b);
    }

    public aucd(int[][][] iArr, char[] cArr) {
        this((aucj) aecb.p);
    }

    public aucd(int[][][] iArr, char[] cArr, byte[] bArr) {
        this((aucj) ouc.g);
    }

    public aucd(int[][][] iArr, float[] fArr) {
        this((aucj) otb.e);
    }

    public aucd(int[][][] iArr, int[] iArr2) {
        this((aucj) aqsj.b);
    }

    public aucd(int[][][] iArr, int[] iArr2, byte[] bArr) {
        this((aucj) anyz.d);
    }

    public aucd(int[][][] iArr, short[] sArr) {
        this((aucj) atbw.c);
    }

    public aucd(int[][][] iArr, short[] sArr, byte[] bArr) {
        this((aucj) atup.e);
    }

    public aucd(int[][][] iArr, boolean[] zArr) {
        this((aucj) amgn.f);
    }

    public aucd(int[][][] iArr, byte[][] bArr) {
        this((aucj) aupi.j);
    }

    public aucd(int[][][] iArr, char[][] cArr) {
        this((aucj) atqb.e);
    }

    public aucd(int[][][] iArr, float[][] fArr) {
        this((aucj) areu.f);
    }

    public aucd(int[][][] iArr, int[][] iArr2) {
        this((aucj) tag.d);
    }

    public aucd(int[][][] iArr, short[][] sArr) {
        this((aucj) aocd.k);
    }

    public aucd(int[][][] iArr, boolean[][] zArr) {
        this((aucj) pqy.c);
    }

    public aucd(int[][][] iArr, byte[][][] bArr) {
        this((aucj) aocf.s);
    }

    public aucd(int[][][] iArr, char[][][] cArr) {
        this((aucj) bask.h);
    }

    public aucd(int[][][] iArr, int[][][] iArr2) {
        this((aucj) ates.f);
    }

    public aucd(int[][][] iArr, short[][][] sArr) {
        this((aucj) ailf.b);
    }

    public aucd(int[][][] iArr, boolean[][][] zArr) {
        this((aucj) oqe.d);
    }

    public aucd(short[][][] sArr) {
        this((aucj) aozc.c);
    }

    public aucd(short[][][] sArr, byte[] bArr) {
        this((aucj) avuc.e);
    }

    public aucd(short[][][] sArr, byte[] bArr, byte[] bArr2) {
        this((aucj) avsl.b);
    }

    public aucd(short[][][] sArr, char[] cArr) {
        this((aucj) pqm.q);
    }

    public aucd(short[][][] sArr, char[] cArr, byte[] bArr) {
        this((aucj) aukj.b);
    }

    public aucd(short[][][] sArr, int[] iArr) {
        this((aucj) aoip.h);
    }

    public aucd(short[][][] sArr, int[] iArr, byte[] bArr) {
        this((aucj) aogs.c);
    }

    public aucd(short[][][] sArr, short[] sArr2) {
        this((aucj) askg.d);
    }

    public aucd(short[][][] sArr, short[] sArr2, byte[] bArr) {
        this((aucj) arig.h);
    }

    public aucd(short[][][] sArr, boolean[] zArr) {
        this((aucj) olp.b);
    }

    public aucd(short[][][] sArr, byte[][] bArr) {
        this((aucj) atxk.b);
    }

    public aucd(short[][][] sArr, char[][] cArr) {
        this((aucj) arbd.k);
    }

    public aucd(short[][][] sArr, float[][] fArr) {
        this((aucj) aquy.c);
    }

    public aucd(short[][][] sArr, int[][] iArr) {
        this((aucj) auyg.g);
    }

    public aucd(short[][][] sArr, short[][] sArr2) {
        this((aucj) aqcx.f);
    }

    public aucd(short[][][] sArr, boolean[][] zArr) {
        this((aucj) auqg.g);
    }

    public aucd(short[][][] sArr, byte[][][] bArr) {
        this((aucj) aqdd.b);
    }

    public aucd(short[][][] sArr, char[][][] cArr) {
        this((aucj) taf.e);
    }

    public aucd(short[][][] sArr, float[][][] fArr) {
        this((aucj) aavk.e);
    }

    public aucd(short[][][] sArr, int[][][] iArr) {
        this((aucj) asqc.e);
    }

    public aucd(short[][][] sArr, short[][][] sArr2) {
        this((aucj) qik.m);
    }

    public aucd(short[][][] sArr, boolean[][][] zArr) {
        this((aucj) anxk.j);
    }

    public aucd(boolean[][][] zArr) {
        this((aucj) ansk.g);
    }

    public aucd(boolean[][][] zArr, byte[] bArr) {
        this((aucj) ajcd.f);
    }

    public aucd(boolean[][][] zArr, byte[] bArr, byte[] bArr2) {
        this((aucj) avcs.c);
    }

    public aucd(boolean[][][] zArr, char[] cArr) {
        this((aucj) avml.n);
    }

    public aucd(boolean[][][] zArr, char[] cArr, byte[] bArr) {
        this((aucj) oqh.c);
    }

    public aucd(boolean[][][] zArr, float[] fArr) {
        this((aucj) auxj.d);
    }

    public aucd(boolean[][][] zArr, int[] iArr) {
        this((aucj) arar.j);
    }

    public aucd(boolean[][][] zArr, int[] iArr, byte[] bArr) {
        this((aucj) oql.f);
    }

    public aucd(boolean[][][] zArr, short[] sArr) {
        this((aucj) atwj.g);
    }

    public aucd(boolean[][][] zArr, short[] sArr, byte[] bArr) {
        this((aucj) aszr.f);
    }

    public aucd(boolean[][][] zArr, boolean[] zArr2) {
        this((aucj) oqy.r);
    }

    public aucd(boolean[][][] zArr, byte[][] bArr) {
        this((aucj) pqq.g);
    }

    public aucd(boolean[][][] zArr, char[][] cArr) {
        this((aucj) assx.d);
    }

    public aucd(boolean[][][] zArr, float[][] fArr) {
        this((aucj) atqz.d);
    }

    public aucd(boolean[][][] zArr, int[][] iArr) {
        this((aucj) basn.e);
    }

    public aucd(boolean[][][] zArr, short[][] sArr) {
        this((aucj) anup.h);
    }

    public aucd(boolean[][][] zArr, boolean[][] zArr2) {
        this((aucj) afth.k);
    }

    public aucd(boolean[][][] zArr, byte[][][] bArr) {
        this((aucj) anuz.b);
    }

    public aucd(boolean[][][] zArr, char[][][] cArr) {
        this((aucj) aats.e);
    }

    public aucd(boolean[][][] zArr, float[][][] fArr) {
        this((aucj) ansi.f);
    }

    public aucd(boolean[][][] zArr, int[][][] iArr) {
        this((aucj) aujm.g);
    }
}
