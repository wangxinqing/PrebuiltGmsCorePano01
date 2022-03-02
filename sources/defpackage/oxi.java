package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

/* renamed from: oxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class oxi extends oxh {
    private Set a = null;

    protected oxi() {
        super(0);
    }

    /* access modifiers changed from: protected */
    public abstract Set a(SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb);

    public final void a(Context context, SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb) {
        this.a = a(sQLiteDatabase, ovw, ozc, oyb);
    }

    public final void a(ovw ovw, ozc ozc, osf osf) {
        Set<oxe> set = this.a;
        if (set != null) {
            String str = ozc.f;
            for (oxe ovt : set) {
                ppp ppp = osf.c;
                ovt ovt2 = new ovt(aonk.CLEAR_CORPUS_DATA, str, osf, str, ovt);
                ppp.d(ovt2);
                ovt2.h();
            }
        }
    }
}
