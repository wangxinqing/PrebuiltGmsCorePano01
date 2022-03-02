package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* renamed from: lke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lke extends lka {
    private final lkg b;

    public lke(lkk lkk, lkg lkg) {
        super("CompactSnapshotOperation", lkk);
        this.b = lkg;
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        lkk lkk = this.a;
        if (lld.d.a(sQLiteDatabase) >= ((Integer) jzq.ap.c()).intValue()) {
            try {
                alrs alrs = lkk.b().a;
                alul alul = new alul(Integer.MAX_VALUE, alsx.a, -1);
                alul.a((Iterable) alrs.c, alss.c);
                sQLiteDatabase.delete(lld.d.b(), (String) null, (String[]) null);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (String b2 : alul.b.a()) {
                    altx b3 = alul.a(b2);
                    arrayList.add(b3.g());
                    if (b3 instanceof alsp) {
                        arrayList3.addAll(b3.k());
                    } else {
                        arrayList2.addAll(b3.k());
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList.size() + arrayList2.size() + arrayList3.size());
                arrayList4.addAll(arrayList);
                arrayList4.addAll(arrayList2);
                arrayList4.addAll(arrayList3);
                int size = arrayList4.size();
                for (int i = 0; i < size; i++) {
                    lld.d.a(sQLiteDatabase, this.b.a((amiw) arrayList4.get(i)));
                }
                lla.d.b(sQLiteDatabase, lld.d.a(sQLiteDatabase));
                b().g = 0;
                b().t();
            } catch (lkl e) {
            }
        }
    }
}
