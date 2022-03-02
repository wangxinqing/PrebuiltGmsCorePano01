package defpackage;

import android.content.SyncResult;
import android.database.Cursor;
import java.util.List;

/* renamed from: kda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kda implements lev {
    final /* synthetic */ String a;
    final /* synthetic */ List b;
    final /* synthetic */ kdb c;

    public kda(kdb kdb, String str, List list) {
        this.c = kdb;
        this.a = str;
        this.b = list;
    }

    public final void a(SyncResult syncResult) {
        Cursor a2;
        kkf kkf;
        int i;
        if (syncResult != null && !syncResult.hasError()) {
            kdb kdb = this.c;
            for (Long l : this.b) {
                kdb.b.d();
                try {
                    kkf kkf2 = kdb.b;
                    long longValue = l.longValue();
                    kkb kkb = ((kjp) kkf2).a;
                    koj koj = null;
                    a2 = kkb.a(kom.a.b(), (String[]) null, kom.a.a.e(longValue), (String) null);
                    if (a2.moveToFirst()) {
                        koj = koj.a(kkb, a2);
                    }
                    a2.close();
                    if (koj != null) {
                        kkz c2 = kdb.b.c(koj.d);
                        kaj kaj = koj.a;
                        long j = koj.b;
                        long j2 = koj.c;
                        lfq c3 = kdb.c.x.c();
                        c3.i();
                        c3.c(1, 36);
                        c3.a(c2.a);
                        kaj kaj2 = kaj.NULL;
                        int ordinal = kaj.ordinal();
                        if (ordinal == 10) {
                            i = lrt.b(kdb.b, c2, j, true);
                        } else if (ordinal != 12) {
                            kdb.a.c("ActionQueue", "Unexpected action type for deferred cleanup");
                            i = 0;
                        } else {
                            i = kbc.a(kdb.b, c2, j, true);
                            if (i > 0) {
                                kdb.d.a();
                            }
                        }
                        koj.u();
                        long currentTimeMillis = System.currentTimeMillis();
                        c3.a(kaj);
                        c3.a(i, currentTimeMillis - j2);
                        c3.h();
                        c3.a();
                        kdb.b.f();
                        kkf = kdb.b;
                    } else {
                        kdb.b.f();
                        kkf = kdb.b;
                    }
                    kkf.e();
                } catch (Throwable th) {
                    kdb.b.e();
                    throw th;
                }
            }
            return;
        }
        kdb.a.a("Sync failed for account: %s", this.a);
    }
}
