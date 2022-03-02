package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: lih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lih {
    public static final ith a = new ith("PinnedContentDownloader", "");
    public final kkf b;
    public final kim c;
    public final lie d = new lie(this);
    public final ExecutorService e = jfm.b(10);
    public final ExecutorService f = jfb.a(((Integer) jzq.aa.c()).intValue(), 10);
    public final Map g = new HashMap();
    public final Map h = Collections.synchronizedMap(new HashMap());
    public final lel i;
    public final ksw j;
    public final lfr k;
    public final lhv l;
    public final lid m = new lid(this);

    public lih(kkf kkf, kim kim, lel lel, ksw ksw, lfr lfr, lhv lhv) {
        iva.a((Object) kkf);
        this.b = kkf;
        iva.a((Object) kim);
        this.c = kim;
        iva.a((Object) lel);
        this.i = lel;
        iva.a((Object) ksw);
        this.j = ksw;
        this.k = lfr;
        iva.a((Object) lhv);
        this.l = lhv;
    }

    public static int a(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 3:
                return 5;
            case 4:
                return -5;
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                a.b("PinnedContentDownloader", "Unrecognized download state code: %d", Integer.valueOf(i2));
                break;
        }
        return -4;
    }

    public final khq b(kmp kmp) {
        iva.a(kmp.ai());
        khq a2 = this.b.a(kmp.ac(), kmp.z());
        if (a2 == null) {
            a.a("Owner app of appdata entry %s does not exist, unpinning the entry", kmp);
            kmp.a(kpd.UNPINNED);
            kmp.m(false);
        }
        return a2;
    }

    private static TransferProgressData a(DriveId driveId, int i2) {
        return new TransferProgressData(1, driveId, i2, 0, -1);
    }

    public final int a(kmp kmp, lht lht) {
        if (kmp == null) {
            return -4;
        }
        kpd aa = kmp.aa();
        if (aa.a()) {
            return 0;
        }
        if (aa.c()) {
            return 3;
        }
        if (kmp.ab()) {
            return 5;
        }
        Integer num = (Integer) this.h.get(kmp.a());
        if (num == null || num.intValue() < ((Integer) jzq.ae.c()).intValue()) {
            return lht.c() ? 1 : 4;
        }
        return -4;
    }

    public final void b(kmp kmp, int i2) {
        a(kmp, a(i2));
    }

    public final synchronized void a() {
        synchronized (this.g) {
            if (this.g.size() > 0 && this.g.size() < ((Integer) jzq.aa.c()).intValue()) {
                this.g.notify();
            }
        }
        this.e.submit(this.d);
    }

    public final void a(kmp kmp) {
        kpd aa = kmp.aa();
        int i2 = 0;
        if (aa.b()) {
            if (!kmp.am()) {
                i2 = 1;
            }
        } else if (aa.c()) {
            i2 = 3;
        }
        this.j.a(a(kmp.g(), i2), kmp);
    }

    public final void a(kmp kmp, int i2) {
        this.j.a(a(kmp.g(), i2), kmp);
    }
}
