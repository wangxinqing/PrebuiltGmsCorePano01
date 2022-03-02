package defpackage;

import android.os.health.HealthStats;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;

/* renamed from: agju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agju {
    final Long a;
    final Long b;
    final HealthStats c;
    final baql d;
    final Boolean e;
    final /* synthetic */ agjv f;

    public agju(agjv agjv, Long l, Long l2, HealthStats healthStats, baql baql, Boolean bool) {
        this.f = agjv;
        this.a = l;
        this.b = l2;
        this.c = healthStats;
        this.d = baql;
        this.e = bool;
    }

    public final agkm a() {
        agkp agkp = this.f.a;
        HealthStats healthStats = this.c;
        baqw baqw = (baqw) baqx.ar.o();
        long a2 = agkj.a(healthStats, 10001);
        long j = 0;
        if (a2 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx = (baqx) baqw.b;
            baqx.a |= 1;
            baqx.c = a2;
        }
        long a3 = agkj.a(healthStats, 10002);
        if (a3 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx2 = (baqx) baqw.b;
            baqx2.a |= 2;
            baqx2.d = a3;
        }
        long a4 = agkj.a(healthStats, 10003);
        if (a4 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx3 = (baqx) baqw.b;
            baqx3.a |= 4;
            baqx3.e = a4;
        }
        long a5 = agkj.a(healthStats, 10004);
        if (a5 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx4 = (baqx) baqw.b;
            baqx4.a |= 8;
            baqx4.f = a5;
        }
        baqw.g(agkj.c(healthStats, 10005));
        baqw.al(agkj.c(healthStats, 10006));
        baqw.am(agkj.c(healthStats, 10007));
        baqw.f(agkj.c(healthStats, 10008));
        baqw.e(agkj.c(healthStats, 10009));
        baqw.a((Iterable) agkj.c(healthStats, 10010));
        baqv b2 = agkj.b(healthStats, 10011);
        if (b2 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx5 = (baqx) baqw.b;
            b2.getClass();
            baqx5.m = b2;
            baqx5.a |= 16;
        }
        baqw.b(agkj.c(healthStats, 10012));
        baqw.d(agkf.a.a(agkj.d(healthStats, 10014)));
        baqw.c(agke.a.a(agkj.d(healthStats, 10015)));
        long a6 = agkj.a(healthStats, 10016);
        if (a6 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx6 = (baqx) baqw.b;
            baqx6.a |= 32;
            baqx6.r = a6;
        }
        long a7 = agkj.a(healthStats, 10017);
        if (a7 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx7 = (baqx) baqw.b;
            baqx7.a |= 64;
            baqx7.s = a7;
        }
        long a8 = agkj.a(healthStats, 10018);
        if (a8 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx8 = (baqx) baqw.b;
            baqx8.a |= 128;
            baqx8.t = a8;
        }
        long a9 = agkj.a(healthStats, 10019);
        if (a9 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx9 = (baqx) baqw.b;
            baqx9.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            baqx9.u = a9;
        }
        long a10 = agkj.a(healthStats, 10020);
        if (a10 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx10 = (baqx) baqw.b;
            baqx10.a |= 512;
            baqx10.v = a10;
        }
        long a11 = agkj.a(healthStats, 10021);
        if (a11 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx11 = (baqx) baqw.b;
            baqx11.a |= 1024;
            baqx11.w = a11;
        }
        long a12 = agkj.a(healthStats, 10022);
        if (a12 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx12 = (baqx) baqw.b;
            baqx12.a |= 2048;
            baqx12.x = a12;
        }
        long a13 = agkj.a(healthStats, 10023);
        if (a13 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx13 = (baqx) baqw.b;
            baqx13.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            baqx13.y = a13;
        }
        long a14 = agkj.a(healthStats, 10024);
        if (a14 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx14 = (baqx) baqw.b;
            baqx14.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            baqx14.z = a14;
        }
        long a15 = agkj.a(healthStats, 10025);
        if (a15 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx15 = (baqx) baqw.b;
            baqx15.a |= 16384;
            baqx15.A = a15;
        }
        long a16 = agkj.a(healthStats, 10026);
        if (a16 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx16 = (baqx) baqw.b;
            baqx16.a |= 32768;
            baqx16.B = a16;
        }
        long a17 = agkj.a(healthStats, 10027);
        if (a17 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx17 = (baqx) baqw.b;
            baqx17.a |= 65536;
            baqx17.C = a17;
        }
        long a18 = agkj.a(healthStats, 10028);
        if (a18 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx18 = (baqx) baqw.b;
            baqx18.a |= 131072;
            baqx18.D = a18;
        }
        long a19 = agkj.a(healthStats, 10029);
        if (a19 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx19 = (baqx) baqw.b;
            baqx19.a |= 262144;
            baqx19.E = a19;
        }
        baqv b3 = agkj.b(healthStats, 10030);
        if (b3 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx20 = (baqx) baqw.b;
            b3.getClass();
            baqx20.F = b3;
            baqx20.a |= 524288;
        }
        long a20 = agkj.a(healthStats, 10031);
        if (a20 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx21 = (baqx) baqw.b;
            baqx21.a |= 1048576;
            baqx21.G = a20;
        }
        baqv b4 = agkj.b(healthStats, 10032);
        if (b4 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx22 = (baqx) baqw.b;
            b4.getClass();
            baqx22.H = b4;
            baqx22.a |= 2097152;
        }
        baqv b5 = agkj.b(healthStats, 10033);
        if (b5 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx23 = (baqx) baqw.b;
            b5.getClass();
            baqx23.I = b5;
            baqx23.a |= 4194304;
        }
        baqv b6 = agkj.b(healthStats, 10034);
        if (b6 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx24 = (baqx) baqw.b;
            b6.getClass();
            baqx24.J = b6;
            baqx24.a |= 8388608;
        }
        baqv b7 = agkj.b(healthStats, 10035);
        if (b7 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx25 = (baqx) baqw.b;
            b7.getClass();
            baqx25.K = b7;
            baqx25.a |= 16777216;
        }
        baqv b8 = agkj.b(healthStats, 10036);
        if (b8 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx26 = (baqx) baqw.b;
            b8.getClass();
            baqx26.L = b8;
            baqx26.a |= 33554432;
        }
        baqv b9 = agkj.b(healthStats, 10037);
        if (b9 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx27 = (baqx) baqw.b;
            b9.getClass();
            baqx27.M = b9;
            baqx27.a |= 67108864;
        }
        baqv b10 = agkj.b(healthStats, 10038);
        if (b10 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx28 = (baqx) baqw.b;
            b10.getClass();
            baqx28.N = b10;
            baqx28.a |= 134217728;
        }
        baqv b11 = agkj.b(healthStats, 10039);
        if (b11 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx29 = (baqx) baqw.b;
            b11.getClass();
            baqx29.O = b11;
            baqx29.a |= 268435456;
        }
        baqv b12 = agkj.b(healthStats, 10040);
        if (b12 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx30 = (baqx) baqw.b;
            b12.getClass();
            baqx30.P = b12;
            baqx30.a |= 536870912;
        }
        baqv b13 = agkj.b(healthStats, 10041);
        if (b13 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx31 = (baqx) baqw.b;
            b13.getClass();
            baqx31.Q = b13;
            baqx31.a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        }
        baqv b14 = agkj.b(healthStats, 10042);
        if (b14 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx32 = (baqx) baqw.b;
            b14.getClass();
            baqx32.R = b14;
            baqx32.a |= Integer.MIN_VALUE;
        }
        baqv b15 = agkj.b(healthStats, 10043);
        if (b15 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx33 = (baqx) baqw.b;
            b15.getClass();
            baqx33.W = b15;
            baqx33.b |= 1;
        }
        baqv b16 = agkj.b(healthStats, 10044);
        if (b16 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx34 = (baqx) baqw.b;
            b16.getClass();
            baqx34.X = b16;
            baqx34.b |= 2;
        }
        long a21 = agkj.a(healthStats, 10045);
        if (a21 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx35 = (baqx) baqw.b;
            baqx35.b |= 4;
            baqx35.Y = a21;
        }
        long a22 = agkj.a(healthStats, 10046);
        if (a22 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx36 = (baqx) baqw.b;
            baqx36.b |= 8;
            baqx36.Z = a22;
        }
        long a23 = agkj.a(healthStats, 10047);
        if (a23 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx37 = (baqx) baqw.b;
            baqx37.b |= 16;
            baqx37.aa = a23;
        }
        long a24 = agkj.a(healthStats, 10048);
        if (a24 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx38 = (baqx) baqw.b;
            baqx38.b |= 32;
            baqx38.ab = a24;
        }
        long a25 = agkj.a(healthStats, 10049);
        if (a25 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx39 = (baqx) baqw.b;
            baqx39.b |= 64;
            baqx39.ac = a25;
        }
        long a26 = agkj.a(healthStats, 10050);
        if (a26 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx40 = (baqx) baqw.b;
            baqx40.b |= 128;
            baqx40.ad = a26;
        }
        long a27 = agkj.a(healthStats, 10051);
        if (a27 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx41 = (baqx) baqw.b;
            baqx41.b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            baqx41.ae = a27;
        }
        long a28 = agkj.a(healthStats, 10052);
        if (a28 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx42 = (baqx) baqw.b;
            baqx42.b |= 512;
            baqx42.af = a28;
        }
        long a29 = agkj.a(healthStats, 10053);
        if (a29 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx43 = (baqx) baqw.b;
            baqx43.b |= 1024;
            baqx43.ag = a29;
        }
        long a30 = agkj.a(healthStats, 10054);
        if (a30 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx44 = (baqx) baqw.b;
            baqx44.b |= 2048;
            baqx44.ah = a30;
        }
        long a31 = agkj.a(healthStats, 10055);
        if (a31 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx45 = (baqx) baqw.b;
            baqx45.b |= FragmentTransaction.TRANSIT_ENTER_MASK;
            baqx45.ai = a31;
        }
        long a32 = agkj.a(healthStats, 10056);
        if (a32 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx46 = (baqx) baqw.b;
            baqx46.b |= FragmentTransaction.TRANSIT_EXIT_MASK;
            baqx46.aj = a32;
        }
        long a33 = agkj.a(healthStats, 10057);
        if (a33 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx47 = (baqx) baqw.b;
            baqx47.b |= 16384;
            baqx47.ak = a33;
        }
        long a34 = agkj.a(healthStats, 10058);
        if (a34 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx48 = (baqx) baqw.b;
            baqx48.b = 32768 | baqx48.b;
            baqx48.al = a34;
        }
        long a35 = agkj.a(healthStats, 10059);
        if (a35 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx49 = (baqx) baqw.b;
            baqx49.b |= 65536;
            baqx49.am = a35;
        }
        baqv b17 = agkj.b(healthStats, 10061);
        if (b17 != null) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx50 = (baqx) baqw.b;
            b17.getClass();
            baqx50.an = b17;
            baqx50.b |= 131072;
        }
        long a36 = agkj.a(healthStats, 10062);
        if (a36 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx51 = (baqx) baqw.b;
            baqx51.b = 262144 | baqx51.b;
            baqx51.ao = a36;
        }
        long a37 = agkj.a(healthStats, 10063);
        if (a37 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx52 = (baqx) baqw.b;
            baqx52.b |= 524288;
            baqx52.ap = a37;
        }
        long a38 = agkj.a(healthStats, 10064);
        if (a38 != 0) {
            if (baqw.c) {
                baqw.c();
                baqw.c = false;
            }
            baqx baqx53 = (baqx) baqw.b;
            baqx53.b |= 1048576;
            baqx53.aq = a38;
        }
        baqx baqx54 = (baqx) baqw.i();
        aucd aucd = (aucd) baqx54.c(5);
        aucd.a((aucj) baqx54);
        baqw baqw2 = (baqw) aucd;
        agkc agkc = agkp.b;
        Collections.unmodifiableList(((baqx) baqw2.b).g);
        for (int i = 0; i < ((baqx) baqw2.b).g.size(); i++) {
            baqw2.e(i, agkc.a(1, baqw2.a(i)));
        }
        Collections.unmodifiableList(((baqx) baqw2.b).h);
        for (int i2 = 0; i2 < ((baqx) baqw2.b).h.size(); i2++) {
            baqw2.f(i2, agkc.a(1, baqw2.D(i2)));
        }
        Collections.unmodifiableList(((baqx) baqw2.b).i);
        for (int i3 = 0; i3 < ((baqx) baqw2.b).i.size(); i3++) {
            baqw2.g(i3, agkc.a(1, baqw2.E(i3)));
        }
        Collections.unmodifiableList(((baqx) baqw2.b).j);
        for (int i4 = 0; i4 < ((baqx) baqw2.b).j.size(); i4++) {
            baqw2.d(i4, agkc.a(1, baqw2.F(i4)));
        }
        Collections.unmodifiableList(((baqx) baqw2.b).k);
        for (int i5 = 0; i5 < ((baqx) baqw2.b).k.size(); i5++) {
            baqw2.c(i5, agkc.a(2, baqw2.G(i5)));
        }
        Collections.unmodifiableList(((baqx) baqw2.b).l);
        for (int i6 = 0; i6 < ((baqx) baqw2.b).l.size(); i6++) {
            baqw2.a(i6, agkc.a(3, baqw2.H(i6)));
        }
        Collections.unmodifiableList(((baqx) baqw2.b).n);
        for (int i7 = 0; i7 < ((baqx) baqw2.b).n.size(); i7++) {
            baqw2.b(i7, agkc.a(5, baqw2.I(i7)));
        }
        baqx baqx55 = (baqx) baqw2.i();
        Long l = this.a;
        Long l2 = this.b;
        Long l3 = ((ageu) this.f.c.a()).g;
        String str = ((ageu) this.f.c.a()).d;
        if (str != null) {
            j = (long) str.hashCode();
        }
        return new agkm(baqx55, l, l2, l3, Long.valueOf(j), this.d, (String) null, this.e, (barb) null);
    }
}
