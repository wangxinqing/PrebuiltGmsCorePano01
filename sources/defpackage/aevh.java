package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: aevh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aevh implements aevc {
    public final aerd a;
    public final afch b;
    public final afcw c;
    public final afcw d;
    public final afda e;
    public final afci f;
    public final awdn g;
    private final awdn h;
    private final aula i;
    private final aevg j;
    private final int k;

    public aevh(awdn awdn, aerd aerd, aula aula, afch afch, afcw afcw, afcw afcw2, afda afda, afci afci, awdn awdn2, aevg aevg, int i2) {
        amrl.a((Object) awdn);
        amrl.a((Object) aerd);
        amrl.a((Object) aula);
        amrl.a((Object) afch);
        amrl.a((Object) afcw);
        amrl.a((Object) afcw2);
        amrl.a((Object) afda);
        amrl.a((Object) afci);
        amrl.a((Object) awdn2);
        amrl.a((Object) aevg);
        this.h = awdn;
        this.a = aerd;
        this.i = aula;
        this.b = afch;
        this.c = afcw;
        this.d = afcw2;
        this.e = afda;
        this.f = afci;
        this.g = awdn2;
        this.j = aevg;
        this.k = i2;
    }

    private final aetb a(byte[] bArr, byte[] bArr2) {
        aulb aulb = (aulb) aucj.a((aucj) aulb.d, bArr2);
        byte[] k2 = aulb.c.k();
        if (bArr.length == 0 && !this.i.a) {
            bArr = null;
        }
        return aetb.a(k2, bArr, aulb.b);
    }

    private final aukz b(afdp afdp, auay auay, auay auay2, long j2) {
        aucd o = aukz.g.o();
        auky auky = auky.UPDATE;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukz aukz = (aukz) o.b;
        aukz.b = auky.d;
        int i2 = aukz.a | 1;
        aukz.a = i2;
        auay2.getClass();
        int i3 = i2 | 2;
        aukz.a = i3;
        aukz.c = auay2;
        if (auay != null) {
            auay.getClass();
            i3 |= 4;
            aukz.a = i3;
            aukz.d = auay;
        }
        if (j2 != -1) {
            aukz.a = i3 | 8;
            aukz.e = j2;
        }
        aukz aukz2 = (aukz) o.i();
        this.c.a(afdp, (audx) aukz2);
        aucd o2 = aulb.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aulb aulb = (aulb) o2.b;
        auay2.getClass();
        int i4 = aulb.a | 2;
        aulb.a = i4;
        aulb.c = auay2;
        if (j2 != -1) {
            aulb.a = i4 | 1;
            aulb.b = j2;
        }
        afch afch = this.b;
        if (auay == null) {
            auay = auay.b;
        }
        afch.a(afdp, auay, ((aulb) o2.i()).au());
        return aukz2;
    }

    public final afcw a() {
        return this.c;
    }

    public final afcw b() {
        return this.d;
    }

    public final aesm c(afdo afdo) {
        long j2;
        aulc aulc;
        aumr a2 = a(afdo);
        if (a2 == null) {
            return aesm.a;
        }
        if (((long) this.e.e(afdo)) == ((long) this.k)) {
            j2 = this.e.d(afdo) / 1000;
        } else {
            j2 = -1;
        }
        long c2 = this.e.c(afdo) / 1000;
        if (a2.a != 2) {
            aulc = aulc.c;
        } else {
            aulc = (aulc) a2.b;
        }
        return aesm.a(j2, c2, aulc.b / 1000);
    }

    public final void close() {
        aevg aevg = this.j;
        aerd aerd = this.a;
        synchronized (aevg.a) {
            long b2 = aevg.b.b(aerd);
            if (b2 == 0) {
                aevg.a.remove(aerd);
                aevg.b.d(aerd);
                this.b.close();
                this.c.close();
                this.d.close();
                this.e.close();
                this.f.close();
                if (aevg.b.b()) {
                    aevg.a.notifyAll();
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

    public final auay a(auay auay) {
        if (!auay.j() || this.i.a) {
            return auay;
        }
        return null;
    }

    public final aumr a(afdo afdo) {
        return this.e.a(afdo);
    }

    public final List a(afdo afdo, aeta aeta, String str) {
        if (str != null) {
            afdo.a((afdn) new aevd(this, str));
        }
        HashSet hashSet = new HashSet();
        anhk i2 = aeta.a().listIterator();
        while (i2.hasNext()) {
            aetg aetg = (aetg) i2.next();
            byte[] a2 = aetg.a();
            int b2 = aetg.b();
            if (b2 == 1) {
                byte[] a3 = this.b.a(afdo, a2);
                if (a3 != null) {
                    hashSet.add(a(a2, a3));
                }
            } else if (b2 == 2) {
                for (Pair pair : this.b.a(afdo, a2, afgi.a(a2))) {
                    hashSet.add(a((byte[]) pair.first, (byte[]) pair.second));
                }
            }
        }
        return amzy.a((Collection) hashSet);
    }

    public final afcv c() {
        return this.f.b();
    }

    public final aeta b(afdo afdo) {
        boolean z;
        auln auln;
        aumv b2 = this.e.b(afdo);
        if (aumu.a(b2.a) == 1) {
            return aeta.b().a();
        }
        if (b2.a == 1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        if (b2.a == 1) {
            auln = (auln) b2.b;
        } else {
            auln = auln.b;
        }
        return aeuz.a(auln);
    }

    public final void a(afdp afdp) {
        aucd o = aukz.g.o();
        auky auky = auky.RESET;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukz aukz = (aukz) o.b;
        aukz.b = auky.d;
        aukz.a |= 1;
        this.c.a(afdp, (audx) (aukz) o.i());
        this.b.b(afdp, auay.b, (auay) null);
    }

    public final void a(afdp afdp, aeta aeta, long j2, int i2, long j3, long j4) {
        afda afda = this.e;
        aucd o = aumv.c.o();
        auln b2 = aeuz.b(aeta);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumv aumv = (aumv) o.b;
        b2.getClass();
        aumv.b = b2;
        aumv.a = 1;
        afda.a(afdp, (aumv) o.i());
        this.e.a(afdp, j2);
        this.e.a(afdp, i2);
        this.e.b(afdp, j3);
        this.e.c(afdp, j4);
        afdp.a((afdn) new aevf(this));
    }

    public final void b(afdp afdp) {
        this.b.b(afdp, auay.b, (auay) null);
        this.e.a(afdp);
        this.d.b(afdp).a(afdp);
        this.c.b(afdp).a(afdp);
        afcw afcw = this.c;
        aucd o = aukz.g.o();
        auky auky = auky.RESET;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukz aukz = (aukz) o.b;
        aukz.b = auky.d;
        aukz.a |= 1;
        afcw.a(afdp, (audx) (aukz) o.i());
    }

    public final void a(afdp afdp, auay auay, auay auay2, long j2) {
        b(afdp, auay, auay2, j2);
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

    public final void a(afdp afdp, String str, auay auay, auay auay2) {
        boolean z;
        boolean z2 = this.i.a;
        if (auay != null) {
            z = false;
        } else {
            z = true;
        }
        if (z2 != z) {
            aukz b2 = b(afdp, auay, auay2, -1);
            afcw afcw = this.d;
            aucd aucd = (aucd) b2.c(5);
            aucd.a((aucj) b2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aukz aukz = (aukz) aucd.b;
            aukz aukz2 = aukz.g;
            str.getClass();
            aukz.a |= 16;
            aukz.f = str;
            afcw.a(afdp, (audx) (aukz) aucd.i());
            afdp.a((afdn) new aeve(this, str));
            return;
        }
        throw new aevb();
    }
}
