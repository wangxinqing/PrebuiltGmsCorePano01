package defpackage;

import java.util.concurrent.Future;

/* renamed from: cke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cke extends cbm implements bve {
    private bsz a;

    public cke() {
        super("DownloadSyncOperation", "download sync", new Object[0]);
    }

    public final Future a() {
        juj a2 = cbi.q().a((bsz) null, 10);
        if (a2 == null) {
            ((anih) ((anih) bxk.a.c()).a("cke", "a", 44, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DownloadSyncOperation] No gcm message in feature store.");
            return buk.a;
        }
        try {
            atxv atxv = (atxv) aucj.a((aucj) atxv.c, a2.c(), aubs.c());
            new Object[1][0] = atxv;
            cbi.y();
            bsz b = bsx.b(atxv.b);
            this.a = b;
            if (b == null) {
                ((anih) ((anih) bxk.a.b()).a("cke", "a", 64, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DownloadSyncOperation] Invalid account in gcm message.  account=%s", (Object) bsx.a(atxv.b));
                return buk.a;
            }
            cbl w = cbi.w();
            bsz bsz = this.a;
            atxw atxw = atxv.a;
            w.a(bsz, atxw != null ? atxw : atxw.a, (cbm) this, (but) cbi.k(), bvq.a("DownloadSyncOperation"));
            return this;
        } catch (auda e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cke", "a", 56, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DownloadSyncOperation] Could not deserialize gcmMessage in feature store.");
            return buk.a;
        }
    }

    public final void a(int i) {
        super.a(i);
        cbi.F().a(1);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atqg atqg = (atqg) obj;
        bsz bsz = this.a;
        atpp[] atppArr = (atpp[]) atqg.c.toArray(new atpp[0]);
        aucx aucx = atqg.b;
        atqk atqk = atqg.a;
        if (atqk == null) {
            atqk = atqk.c;
        }
        atpr atpr = atqk.b;
        if (atpr == null) {
            atpr = atpr.b;
        }
        cju.a(bsz, atppArr, aucx, atpr, 5);
        cbi.F().a(2);
    }
}
