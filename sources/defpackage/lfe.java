package defpackage;

import android.content.Context;
import android.content.SyncResult;
import com.google.android.gms.R;
import java.util.List;
import java.util.Locale;

/* renamed from: lfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lfe implements lff {
    private final Context a;
    private final kkf b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;
    private final kkz g;
    private final long h;
    private final int i;
    private koa j;
    private koa k;
    private koa l;
    private int m = 0;

    public lfe(lsm lsm, kkz kkz, int i2, int i3, int i4, boolean z, int i5, long j2) {
        iva.a((Object) kkz);
        this.g = kkz;
        this.a = lsm.b;
        kkf kkf = lsm.d;
        this.b = kkf;
        this.c = i2;
        this.d = i3;
        this.i = i4;
        this.e = z;
        this.f = i5;
        this.h = j2;
        b(kkf, this.g);
    }

    public static lfd a(kkf kkf, kkz kkz) {
        koa koa = null;
        koa koa2 = null;
        for (koa koa3 : kkf.a(kkz, lcr.DRIVE)) {
            if (((lco) koa3.b()).a) {
                koa2 = koa3;
            } else {
                koa = koa3;
            }
        }
        return new lfd(koa, koa2);
    }

    private final void b(SyncResult syncResult) {
        SyncResult syncResult2 = syncResult;
        this.b.d();
        try {
            klb b2 = this.b.b(this.g.a);
            kkf kkf = this.b;
            kkz kkz = this.g;
            long j2 = b2.a;
            iva.b(j2 >= 0);
            iva.a((Object) kkz);
            String a2 = kmk.a.a.a();
            String a3 = kmf.APPDATA_ROOT_ENTRY_ID.h.a();
            String b3 = kmg.a.b();
            String a4 = kmf.APPDATA_ROOT_ENTRY_ID.h.a();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 42 + String.valueOf(a3).length() + String.valueOf(b3).length() + String.valueOf(a4).length());
            sb.append(a2);
            sb.append(" NOT IN (SELECT ");
            sb.append(a3);
            sb.append(" FROM ");
            sb.append(b3);
            sb.append(" WHERE ");
            sb.append(a4);
            sb.append(" IS NOT NULL)");
            kqy a5 = kqz.a(lrr.b(kkz.b), kne.PINNED.aB.e(kpd.UNPINNED.d), lrr.a(), kqz.a(sb.toString()), kne.LAST_SYNC_SEQUENCE_NUMBER.aB.a(j2));
            int a6 = ((kjp) kkf).a.a(knf.a, kqz.a(String.format(Locale.US, "%s IN (SELECT %s FROM %s WHERE %s)", new Object[]{kne.ENTRY_ID.aB.a(), kne.ENTRY_ID.aB.a(), "EntryView", a5.a}), (List) a5.b));
            if (a6 > 0) {
                kmp d2 = this.b.d(this.g, this.a.getString(R.string.drive_view_my_drive));
                d2.f();
                b2.b(d2.y());
                b2.t();
            }
            if (syncResult2 != null) {
                syncResult2.stats.numDeletes += (long) a6;
            }
            this.b.f();
        } finally {
            this.b.e();
        }
    }

    public final boolean a() {
        return true;
    }

    private final void a(lea lea, koa koa, SyncResult syncResult, int i2, lnk lnk) {
        long j2;
        ldz a2 = leb.a(syncResult);
        Long l2 = koa.b;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = Long.MAX_VALUE;
        }
        lek lek = new lek(koa, leb.a(a2, j2));
        int d2 = (int) (((long) i2) - koa.d());
        if (d2 > 0 && !koa.c()) {
            lea.a(koa.a, Long.valueOf(koa.m), this.g, d2, lek, lnk);
            this.m++;
        }
    }

    public final void a(SyncResult syncResult) {
        b(syncResult);
    }

    public final void a(lea lea, lnk lnk, SyncResult syncResult) {
        if (this.e) {
            kkf kkf = this.b;
            long j2 = this.g.b;
            iva.b(j2 >= 0);
            ((kjp) kkf).a.a(kod.a, koc.ACCOUNT_ID.g.e(j2));
            b(this.b, this.g);
        }
        lea lea2 = lea;
        SyncResult syncResult2 = syncResult;
        lnk lnk2 = lnk;
        a(lea2, this.j, syncResult2, this.c, lnk2);
        a(lea2, this.k, syncResult2, this.d, lnk2);
        if (((Boolean) jzq.av.c()).booleanValue()) {
            a(lea, this.l, syncResult, this.i, lnk);
        }
        if ((this.j.d() == 0 && this.k.d() == 0) || this.e) {
            this.b.d();
            try {
                klb b2 = this.b.b(this.g.a);
                b2.a(((kjp) this.b).c());
                b2.g = false;
                b2.d = this.h;
                b2.e = (long) this.f;
                b2.t();
                this.b.f();
            } finally {
                this.b.e();
            }
        }
        if (this.m == 0) {
            b((SyncResult) null);
        }
    }

    private final void b(kkf kkf, kkz kkz) {
        lfd a2 = a(kkf, kkz);
        this.j = a2.a;
        this.k = a2.b;
        this.l = kkf.b(kkz);
        if (this.j == null) {
            this.j = kkf.a(kkz, (lcp) new lco(false), Long.MAX_VALUE);
        }
        if (this.k == null) {
            this.k = kkf.a(kkz, (lcp) new lco(true), Long.MAX_VALUE);
        }
        if (this.l == null) {
            this.l = this.b.a(kkz, (lcp) new lcs(), Long.MAX_VALUE);
        }
    }

    public final String b() {
        return String.format(Locale.US, "FullFeedSyncAlgorithm[%s,%d]", new Object[]{Integer.valueOf(this.f), Long.valueOf(this.h)});
    }
}
