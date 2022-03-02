package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;

/* renamed from: lkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkf extends lka {
    private final lkg b;
    private final alrs c;

    public lkf(lkk lkk, lkg lkg, alrs alrs) {
        super("InitialSnapshotOperation", lkk);
        this.b = lkg;
        this.c = alrs;
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        lla lla = lla.d;
        lld lld = lld.d;
        alrs alrs = this.c;
        lkg lkg = this.b;
        Iterator it = alrs.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            alxk alxk = (alxk) it.next();
            if (alxk.f) {
                lla.a(sQLiteDatabase, "meSessionId", alxk.a);
                lla.a(sQLiteDatabase, "meDisplayName", alxk.c);
                lla.a(sQLiteDatabase, "meUserId", alxk.b);
                lla.a(sQLiteDatabase, "meColor", alxk.d);
                lla.a(sQLiteDatabase, "mePhotoUrl", alxk.g);
                lla.a(sQLiteDatabase, "mePermissionId", alxk.h);
                break;
            }
        }
        if (alrs.b == alyv.READ_ONLY) {
            z = true;
        } else {
            z = false;
        }
        lla.a(sQLiteDatabase, z);
        for (amiw a : alrs.c) {
            lld.a(sQLiteDatabase, lkg.a(a));
        }
        lla.b(sQLiteDatabase, lld.a(sQLiteDatabase));
        lla.a(sQLiteDatabase, alrs.a.b);
        b().f = false;
        b().t();
    }
}
