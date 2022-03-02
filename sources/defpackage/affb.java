package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: affb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class affb implements Closeable {
    public final afft a;
    public final afgb b;
    public final aukh c;
    public final Account d;
    public final aukd e;
    public affr f;
    public affr g;
    public boolean h;
    public boolean i;
    public boolean j;
    final /* synthetic */ affc k;
    public int l;
    private final String m;
    private long n;

    public affb(affc affc, afft afft, afgb afgb, aukd aukd, aukh aukh, Account account, long j2) {
        this.k = affc;
        this.a = afft;
        this.b = afgb;
        this.e = aukd;
        this.c = aukh;
        this.m = ((aerh) affc.d.get(aukg.a(aukh.a))).a(aukh);
        this.d = account;
        Long a2 = afft.a();
        if (a2 == null || a2.longValue() != j2) {
            afgm afgm = this.k.o;
            long elapsedRealtime = (SystemClock.elapsedRealtime() - Math.max(this.k.n.h() * 1000, this.k.n.k() * 1000)) - 1;
            this.n = elapsedRealtime;
            afft.a(j2, elapsedRealtime);
        } else {
            this.n = afft.d().longValue();
        }
        this.f = afft.b();
        this.g = afft.c();
        this.l = 1;
    }

    public static final long a(aums aums) {
        aubn aubn = aums.d;
        if (aubn == null) {
            aubn = aubn.c;
        }
        long j2 = aubn.a * 1000;
        aubn aubn2 = aums.d;
        if (aubn2 == null) {
            aubn2 = aubn.c;
        }
        return j2 + (((long) aubn2.b) / 1000000);
    }

    public static final int b(aums aums) {
        return !aums.c ? 1 : 2;
    }

    public final boolean a(long j2, long j3) {
        return this.l != 1 || j2 - this.n <= j3;
    }

    public final void close() {
        this.a.close();
    }

    public final void b() {
        if (this.l != 4) {
            affr affr = this.f;
            affq d2 = affr.d();
            d2.a(affr.a() + 1);
            affr a2 = d2.a();
            this.f = a2;
            try {
                this.a.a(a2);
            } catch (afdm e2) {
                ((pia) this.k.a.a()).e("Storing channel state failed", new Object[0]);
            }
        }
    }

    public static final aomx a(affu affu) {
        int i2 = affu.a;
        if (i2 == 2) {
            return aomx.UNKNOWN_HOST;
        }
        if (i2 == 1) {
            return aomx.UNSUPPORTED_PROTOCOL;
        }
        if (i2 == 3) {
            return aomx.PENDING_LOCAL_CHANGES;
        }
        if (i2 == 4) {
            return aomx.CONNECT_EXCEPTION;
        }
        if (i2 == 5) {
            return aomx.UNAUTHENTICATED;
        }
        if (i2 == 6) {
            return aomx.UNAVAILABLE;
        }
        if (i2 == 7) {
            return aomx.DEADLINE_EXCEEDED;
        }
        return aomx.UNDEFINED;
    }

    public static final aujy a(aukd aukd, String str) {
        String str2;
        aucx aucx = aukd.d;
        int size = aucx.size();
        int i2 = 0;
        while (i2 < size) {
            aujy aujy = (aujy) aucx.get(i2);
            if (aujy.a == 1) {
                str2 = (String) aujy.b;
            } else {
                str2 = "";
            }
            i2++;
            if (str2.equals(str)) {
                return aujy;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Configuration for app ");
        sb.append(str);
        sb.append(" is missing");
        throw new afdm(sb.toString());
    }

    public final afdx a(String str) {
        try {
            return this.k.c.b(str, this.d, this.c);
        } catch (afdy e2) {
            throw new afdm("Write callback failure", e2);
        }
    }

    public final void a() {
        a(aerd.a(this.d, this.c));
    }

    public final void a(int i2) {
        int i3 = this.l;
        if (i3 != i2) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                boolean z = false;
                if (i4 != 0) {
                    if (i4 == 1) {
                        if (i2 == 1 || i2 == 3 || i2 == 4) {
                            z = true;
                        }
                        amrl.a(z);
                    } else if (i4 != 2) {
                        if (i4 == 3) {
                            amrl.b(false);
                        }
                    }
                    this.l = i2;
                    return;
                }
                if (i2 == 2) {
                    z = true;
                }
                amrl.a(z);
                this.l = i2;
                return;
            }
            throw null;
        }
    }

    public final void a(long j2, int i2, boolean z) {
        afgm afgm = this.k.o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(elapsedRealtime, j2)) {
            b();
            if (!this.k.a(elapsedRealtime, 0)) {
                this.k.a(elapsedRealtime, i2, z);
                pia pia = (pia) this.k.a.a();
                Object[] objArr = {this.d, this.c};
                return;
            }
            return;
        }
        pia pia2 = (pia) this.k.a.a();
        Object[] objArr2 = {this.d, this.c};
    }

    public final void a(long j2, boolean z, affr affr, Long l2, boolean z2, boolean z3, aucd aucd) {
        boolean z4;
        Long l3;
        affr affr2 = affr;
        aucd aucd2 = aucd;
        afgm afgm = this.k.o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.k.n.d()) {
            aokg a2 = afgq.a(this.c);
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            aokp aokp = (aokp) aucd2.b;
            aokp aokp2 = aokp.o;
            a2.getClass();
            aokp.b = a2;
            aokp.a |= 1;
        } else {
            String str = this.m;
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            aokp aokp3 = (aokp) aucd2.b;
            aokp aokp4 = aokp.o;
            str.getClass();
            aokp3.a |= 16384;
            aokp3.n = str;
        }
        aokp aokp5 = (aokp) aucd2.b;
        aokp5.a |= 8;
        aokp5.e = (int) (elapsedRealtime - j2);
        if (this.k.n.d()) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            aokp aokp6 = (aokp) aucd2.b;
            aokp6.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            aokp6.l = z;
            if (l2 != null) {
                l3 = Long.valueOf(j2 - l2.longValue());
            } else {
                l3 = null;
            }
            affr affr3 = this.g;
            anav anav = new anav();
            Iterator it = EnumSet.complementOf(EnumSet.of(aomv.UNRECOGNIZED)).iterator();
            while (it.hasNext()) {
                aomv aomv = (aomv) it.next();
                if (affr2.a(aomv) != affr3.a(aomv)) {
                    anav.b(aomv);
                }
            }
            anax<aomv> a3 = anav.a();
            if (l3 != null) {
                long longValue = l3.longValue();
                if (aucd2.c) {
                    aucd.c();
                    aucd2.c = false;
                }
                aokp aokp7 = (aokp) aucd2.b;
                aokp7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                aokp7.j = longValue;
            }
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            aokp aokp8 = (aokp) aucd2.b;
            if (!aokp8.k.a()) {
                aokp8.k = aucj.a(aokp8.k);
            }
            for (aomv a4 : a3) {
                aokp8.k.d(a4.a());
            }
        }
        if (this.k.n.e()) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            aokp aokp9 = (aokp) aucd2.b;
            aokp9.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            aokp9.m = z2;
        }
        aomx a5 = aomx.a(((aokp) aucd2.b).c);
        if (a5 == null) {
            a5 = aomx.UNDEFINED;
        }
        if (a5 == aomx.SUCCESS) {
            this.g = affr2;
            this.n = elapsedRealtime;
            if (this.l != 4) {
                try {
                    this.a.a(elapsedRealtime, affr2);
                } catch (afdm e2) {
                    ((pia) this.k.a.a()).e("Storing synced channel state failed", new Object[0]);
                }
            }
            if (z3) {
                this.k.g.b(this.d, this.c);
            }
        }
        boolean c2 = affr.c(this.f, this.g);
        if (aucd2.c) {
            aucd.c();
            aucd2.c = false;
        }
        aokp aokp10 = (aokp) aucd2.b;
        int i2 = aokp10.a | 16;
        aokp10.a = i2;
        aokp10.f = c2;
        int i3 = this.l;
        if (i3 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        aokp10.a = i2 | 32;
        aokp10.g = z4;
        if (i3 == 3 || i3 == 4) {
            a();
        } else {
            a(1);
        }
        ((aetj) this.k.f.a()).a((aokp) aucd.i());
        ((pia) this.k.a.a()).a("Sync complete; result=%s", a5);
    }

    public final void a(aerd aerd) {
        this.k.k.remove(aerd);
        try {
            close();
        } catch (IOException e2) {
            ((pia) this.k.a.a()).e("Channel close failed", new Object[0]);
        }
    }

    public final void a(aomv aomv) {
        if (this.l != 4) {
            affr affr = this.f;
            affq d2 = affr.d();
            long a2 = affr.a(aomv);
            anaf anaf = d2.a;
            if (anaf != null) {
                EnumMap enumMap = new EnumMap(anaf);
                enumMap.put(aomv, Long.valueOf(a2 + 1));
                d2.a(anet.a((Map) enumMap));
                affr a3 = d2.a();
                this.f = a3;
                try {
                    this.a.a(a3);
                } catch (afdm e2) {
                    ((pia) this.k.a.a()).e("Storing channel state failed", new Object[0]);
                }
            } else {
                throw new IllegalStateException("Property \"triggers\" has not been set");
            }
        }
    }

    public final void a(boolean z, long j2, long j3, int i2, boolean z2) {
        int i3;
        long j4 = j2;
        long j5 = j3;
        afgm afgm = this.k.o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((!z || a(elapsedRealtime, j4) || this.k.a(elapsedRealtime, 0)) && !this.k.a(elapsedRealtime)) {
            int i4 = i2;
            boolean z3 = z2;
            if (!this.k.a(elapsedRealtime, j5)) {
                affc affc = this.k;
                affc.l = true;
                affc.m = elapsedRealtime + j5;
                afbt afbt = affc.b;
                long j6 = j4 / 1000;
                long j7 = j5 / 1000;
                if (!affc.n.g()) {
                    i3 = 3;
                } else {
                    i3 = i4;
                }
                afbt.a(true, j6, j7, i3, z2, false, (Bundle) null);
                pia pia = (pia) this.k.a.a();
                Object[] objArr = {Long.valueOf(j3), this.d, this.c};
                return;
            }
            pia pia2 = (pia) this.k.a.a();
            Object[] objArr2 = {this.d, this.c};
            return;
        }
        this.k.a(elapsedRealtime, i2, z2);
        pia pia3 = (pia) this.k.a.a();
        Object[] objArr3 = {Long.valueOf(j3), this.d, this.c};
    }
}
