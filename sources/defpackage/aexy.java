package defpackage;

import android.accounts.Account;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: aexy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexy implements Callable {
    private final aevl a;
    private final int b;
    private final Long c;
    private final Long d;
    private final Account e;
    private final int f;
    private final int g;
    private final aeri h;
    private final awdn i;
    private final afeb j;
    private final String k;

    public aexy(aeri aeri, awdn awdn, aevl aevl, afeb afeb, String str, Account account, int i2, int i3, int i4, Long l, Long l2) {
        this.a = aevl;
        this.e = account;
        this.f = i2;
        this.g = i3;
        this.h = aeri;
        this.i = awdn;
        this.j = afeb;
        this.k = str;
        this.b = i4;
        this.c = l;
        this.d = l2;
    }

    /* renamed from: a */
    public final aetc call() {
        Throwable th;
        afdp b2;
        Throwable th2;
        long j2;
        ((pia) this.i.a()).a("Reading time series footprints from %s/%s.", Integer.valueOf(this.f), Integer.valueOf(this.g));
        try {
            aevm a2 = this.a.a(this.e, this.f, this.g);
            try {
                afdx b3 = this.j.b(this.k, this.e, aeuz.a(this.f, this.g, auku.SYNC_FULL_SNAPSHOT));
                if (b3 == null) {
                    ((pia) this.i.a()).d("%s is not subscribed to corpus=%d, datatype=%d, returning empty list.", this.k, Integer.valueOf(this.f), Integer.valueOf(this.g));
                    aetc aetc = aetc.a;
                    if (a2 != null) {
                        a2.close();
                    }
                    return aetc;
                }
                if (this.h.J()) {
                    this.j.a(b3.a(), b3.b(), b3.c());
                }
                aeti b4 = aeuz.b(b3.e());
                int a3 = b4.a();
                if (a3 == 0) {
                    ((pia) this.i.a()).c("%s subscription filter for corpus=%d, datatype=%d is empty, returning empty result.", this.k, Integer.valueOf(this.f), Integer.valueOf(this.g));
                    aetc aetc2 = aetc.a;
                    if (a2 != null) {
                        a2.close();
                    }
                    return aetc2;
                }
                b2 = a2.c().b();
                long c2 = a2.c(b2);
                long j3 = Long.MAX_VALUE;
                long longValue = b4.c() != null ? b4.c().longValue() + c2 : Long.MAX_VALUE;
                long longValue2 = b4.b() != null ? c2 + b4.b().longValue() : Long.MIN_VALUE;
                Long l = this.d;
                if (l != null) {
                    j3 = l.longValue();
                }
                long min = Math.min(longValue, j3);
                Long l2 = this.c;
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = Long.MIN_VALUE;
                }
                List a4 = a2.a((afdo) b2, min, Math.max(longValue2, j2), this.k);
                b2.b();
                aetc a5 = aetc.a(amzy.a((Collection) a4.subList(0, Math.min(a4.size(), Math.min(this.b, a3)))), a2.d(b2));
                b2.close();
                if (a2 != null) {
                    a2.close();
                }
                return a5;
            } catch (Throwable th3) {
                th = th3;
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
            throw th2;
        } catch (IOException e2) {
            throw new aepg(3, String.format(Locale.ENGLISH, "Failed to read footprint from %s/%s.", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g)}), e2);
        } catch (Throwable th4) {
            apev.a(th, th4);
        }
    }
}
