package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: hnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hnl {
    public static final fzi a = new hnk();
    private static final iwd g = hir.b("IndexManager");
    public final hkx b = ((hkx) hkx.i.b());
    public final hls c = ((hls) hls.e.b());
    public final hlq d = ((hlq) hlq.a.b());
    public final hnh e = ((hnh) hnh.a.b());
    public final Object f = new Object();

    public static amzy a(hjg hjg, hjc hjc) {
        amri a2 = hjc.a();
        if (!a2.a()) {
            return amzy.h();
        }
        anax a3 = hjg.a(hjc);
        ArrayList arrayList = new ArrayList(a3.size());
        anhj a4 = a3.iterator();
        while (a4.hasNext()) {
            ContentValues contentValues = new ContentValues((ContentValues) a2.b());
            contentValues.put("id", (String) a4.next());
            arrayList.add(contentValues);
        }
        return amzy.a((Collection) arrayList);
    }

    /* JADX INFO: finally extract failed */
    public final void a(hlj hlj, pyv pyv, int i) {
        amri amri;
        synchronized (this.f) {
            if (((Long) this.b.a(pyv, hkx.c(i))).longValue() != hlj.e()) {
                amri c2 = this.e.c(pyv);
                if (c2.a()) {
                    hlq hlq = this.d;
                    SQLiteDatabase a2 = hlq.b.a();
                    a2.beginTransaction();
                    try {
                        hlq.b.a().delete(hlj.a(), "account=?", new String[]{pyv.d});
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        aqpc aqpc = (aqpc) c2.b();
                        hjg a3 = hjh.a(i);
                        if (a3.a) {
                            amri = amri.b(this.e.a(pyv));
                        } else {
                            amri = ampu.a;
                        }
                        List<hln> b2 = this.c.b(pyv, i);
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        for (hln a4 : b2) {
                            try {
                                arrayList.addAll(a(a3, a3.a(a4, amri)));
                            } catch (hji | hjm e2) {
                                i2++;
                            }
                        }
                        if (i2 > 0) {
                            g.c("Total invalid data ignored: %d.", Integer.valueOf(i2));
                        }
                        this.d.a(hlj, pyv, arrayList);
                        this.b.a(pyv, hkx.c(i), Long.valueOf(hlj.e()));
                    } catch (Throwable th) {
                        a2.endTransaction();
                        throw th;
                    }
                }
            }
        }
    }

    public final void a(pyv pyv) {
        synchronized (this.f) {
            anhj a2 = hln.a.iterator();
            while (a2.hasNext()) {
                int intValue = ((Integer) a2.next()).intValue();
                try {
                    a(pyv, intValue);
                } catch (hjm e2) {
                    g.e("Index for data type %d failed.", e2, Integer.valueOf(intValue));
                }
            }
        }
    }

    public final void a(pyv pyv, int i) {
        amri a2 = hlj.a(i);
        if (a2.a()) {
            a((hlj) a2.b(), pyv, i);
        }
    }
}
