package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

/* renamed from: oxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class oxk extends oxh {
    private oxj a;
    private final int b;

    protected oxk(int i, int i2) {
        super(i);
        this.b = i2;
    }

    public abstract oxj a(SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb);

    public final void a(Context context, SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb) {
        this.a = a(sQLiteDatabase, ovw, ozc, oyb);
    }

    public /* bridge */ /* synthetic */ void a(ozc ozc, osf osf) {
    }

    public final void a(ovw ovw, ozc ozc, osf osf) {
        oxj oxj = this.a;
        if (oxj != null) {
            Set set = oxj.a;
            Set set2 = oxj.b;
            if (!set2.isEmpty() && !set.isEmpty()) {
                HashSet hashSet = new HashSet(set);
                hashSet.removeAll(set2);
                set = hashSet;
            }
            ovw.a(set2, ozc, osf, this.b);
            ovw.b(set, ozc, osf, this.b);
        }
    }
}
