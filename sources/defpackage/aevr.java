package defpackage;

import android.util.Pair;
import java.util.List;

/* renamed from: aevr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aevr implements aevm {
    public final aerd a;
    public final afch b;
    public final afcw c;
    public final afcw d;
    public final afda e;
    public final afci f;
    public final awdn g;
    private final awdn h;
    private final aevq i;
    private final int j;

    public aevr(awdn awdn, aerd aerd, afch afch, afcw afcw, afcw afcw2, afda afda, afci afci, awdn awdn2, aevq aevq, int i2) {
        this.h = awdn;
        this.a = aerd;
        this.b = afch;
        this.c = afcw;
        this.d = afcw2;
        this.e = afda;
        this.f = afci;
        this.g = awdn2;
        this.i = aevq;
        this.j = i2;
    }

    private final amzy a(afdo afdo, long j2, long j3) {
        amzt amzt = new amzt();
        for (Pair pair : this.b.a(afdo, a(j2), a(j3))) {
            aulb aulb = (aulb) aucj.a((aucj) aulb.d, (byte[]) pair.second);
            amzt.c(aetb.a(aulb.c.k(), (byte[]) null, aulb.b));
        }
        return amzt.a();
    }

    private final aulg b(afdp afdp, auay auay, long j2) {
        aucd o = aulg.f.o();
        aulf aulf = aulf.UPDATE;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aulg aulg = (aulg) o.b;
        aulg.b = aulf.e;
        int i2 = aulg.a | 1;
        aulg.a = i2;
        auay.getClass();
        int i3 = i2 | 2;
        aulg.a = i3;
        aulg.c = auay;
        aulg.a = i3 | 4;
        aulg.d = j2;
        aulg aulg2 = (aulg) o.i();
        this.c.a(afdp, (audx) aulg2);
        afch afch = this.b;
        byte[] a2 = a(j2);
        aucd o2 = aulb.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aulb aulb = (aulb) o2.b;
        auay.getClass();
        int i4 = aulb.a | 2;
        aulb.a = i4;
        aulb.c = auay;
        aulb.a = i4 | 1;
        aulb.b = j2;
        afch.a(afdp, a2, ((aulb) o2.i()).k());
        return aulg2;
    }

    public final afcw a() {
        return this.c;
    }

    public final afcw b() {
        return this.d;
    }

    public final long c(afdo afdo) {
        return this.e.c(afdo);
    }

    public final void close() {
        aevq aevq = this.i;
        aerd aerd = this.a;
        synchronized (aevq.a) {
            long b2 = aevq.b.b(aerd);
            if (b2 == 0) {
                aevq.a.remove(aerd);
                aevq.b.d(aerd);
                this.b.close();
                this.c.close();
                this.d.close();
                this.e.close();
                this.f.close();
                if (aevq.b.b()) {
                    aevq.a.notifyAll();
                }
            } else if (b2 < 0) {
                String valueOf = String.valueOf(aerd);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Footprints channel [");
                sb.append(valueOf);
                sb.append("] closed too many times.");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public final aesm d(afdo afdo) {
        long j2;
        aulc aulc;
        aumr a2 = a(afdo);
        if (a2 == null) {
            return aesm.a;
        }
        if (((long) this.e.e(afdo)) == ((long) this.j)) {
            j2 = this.e.d(afdo) / 1000;
        } else {
            j2 = -1;
        }
        long c2 = c(afdo) / 1000;
        if (a2.a != 2) {
            aulc = aulc.c;
        } else {
            aulc = (aulc) a2.b;
        }
        return aesm.a(j2, c2, aulc.b / 1000);
    }

    public final afcv c() {
        return this.f.b();
    }

    private static byte[] a(long j2) {
        return aook.b((j2 - Long.MIN_VALUE) ^ -1);
    }

    public final aumr a(afdo afdo) {
        return this.e.a(afdo);
    }

    public final List a(afdo afdo, long j2, long j3, String str) {
        if (str != null) {
            afdo.a((afdn) new aevn(this, str));
        }
        return a(afdo, j2, j3);
    }

    public final void a(afdp afdp) {
        aucd o = aulg.f.o();
        aulf aulf = aulf.RESET;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aulg aulg = (aulg) o.b;
        aulg.b = aulf.e;
        aulg.a |= 1;
        this.c.a(afdp, (audx) (aulg) o.i());
        this.b.b(afdp, new byte[0], (byte[]) null);
    }

    public final aeti b(afdo afdo) {
        aumy aumy;
        aumv b2 = this.e.b(afdo);
        boolean z = false;
        if (aumu.a(b2.a) == 1) {
            return aeti.a(0, (Long) null, (Long) null);
        }
        if (b2.a == 2) {
            z = true;
        }
        amrl.a(z);
        if (b2.a == 2) {
            aumy = (aumy) b2.b;
        } else {
            aumy = aumy.e;
        }
        return aeuz.a(aumy);
    }

    public final void a(afdp afdp, long j2, long j3) {
        anhk i2 = a((afdo) afdp, j2, j3).listIterator();
        while (i2.hasNext()) {
            aetb aetb = (aetb) i2.next();
            afcw afcw = this.c;
            aucd o = aulg.f.o();
            aulf aulf = aulf.DELETE;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aulg aulg = (aulg) o.b;
            aulg.b = aulf.e;
            aulg.a |= 1;
            long c2 = aetb.c();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aulg aulg2 = (aulg) o.b;
            aulg2.a |= 4;
            aulg2.d = c2;
            afcw.a(afdp, (audx) (aulg) o.i());
        }
        this.b.b(afdp, a(j2), a(j3));
    }

    public final void b(afdp afdp) {
        this.b.b(afdp, auay.b, (auay) null);
        this.e.a(afdp);
        this.d.b(afdp).a(afdp);
        this.c.b(afdp).a(afdp);
        afcw afcw = this.c;
        aucd o = aulg.f.o();
        aulf aulf = aulf.RESET;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aulg aulg = (aulg) o.b;
        aulg.b = aulf.e;
        aulg.a |= 1;
        afcw.a(afdp, (audx) (aulg) o.i());
    }

    public final void a(afdp afdp, aeti aeti, long j2, int i2, long j3, long j4) {
        afda afda = this.e;
        aucd o = aumv.c.o();
        aumy a2 = aeuz.a(aeti);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumv aumv = (aumv) o.b;
        a2.getClass();
        aumv.b = a2;
        aumv.a = 2;
        afda.a(afdp, (aumv) o.i());
        this.e.a(afdp, j2);
        this.e.a(afdp, i2);
        this.e.b(afdp, j3);
        this.e.c(afdp, j4);
        afdp.a((afdn) new aevp(this));
    }

    public final void a(afdp afdp, auay auay, long j2) {
        b(afdp, auay, j2);
    }

    public final void a(afdp afdp, auay auay, long j2, String str) {
        aulg b2 = b(afdp, auay, j2);
        afcw afcw = this.d;
        aucd aucd = (aucd) b2.c(5);
        aucd.a((aucj) b2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aulg aulg = (aulg) aucd.b;
        aulg aulg2 = aulg.f;
        str.getClass();
        aulg.a |= 8;
        aulg.e = str;
        afcw.a(afdp, (audx) (aulg) aucd.i());
        afdp.a((afdn) new aevo(this, str));
    }

    public final void a(afdp afdp, aumr aumr) {
        if (aumq.b(aumr.a) == 3) {
            this.e.a(afdp, aumr);
        } else if (aumq.b(aumr.a) != 1) {
            int b2 = aumq.b(aumr.a);
            String a2 = aumq.a(b2);
            if (b2 == 0) {
                throw null;
            }
            String a3 = aumq.a(3);
            StringBuilder sb = new StringBuilder(a2.length() + 30 + a3.length());
            sb.append("Invalid sync token ");
            sb.append(a2);
            sb.append(", expected ");
            sb.append(a3);
            throw new IllegalArgumentException(sb.toString());
        } else {
            ((pia) this.h.a()).a("Sync token is not set and will be initialized", new Object[0]);
        }
    }
}
