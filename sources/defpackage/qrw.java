package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.List;

/* renamed from: qrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qrw implements acvv {
    final /* synthetic */ List a;
    final /* synthetic */ aosh b;
    final /* synthetic */ qry c;

    public qrw(qry qry, List list, aosh aosh) {
        this.c = qry;
        this.a = list;
        this.b = aosh;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i;
        Void voidR = (Void) obj;
        this.c.c.a(this.a.size());
        this.b.b((Object) true);
        qsx qsx = this.c.b;
        List list = this.a;
        try {
            SQLiteDatabase writableDatabase = qsx.b.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                if (((long) list.size()) <= axvz.n()) {
                    String[] strArr = new String[list.size()];
                    StringBuilder sb = new StringBuilder();
                    sb.append("_ID");
                    sb.append(" IN (");
                    int i2 = 0;
                    while (i2 < list.size()) {
                        strArr[i2] = Long.toString(((Long) list.get(i2)).longValue());
                        sb.append(i2 != 0 ? ", ?" : "?");
                        i2++;
                    }
                    sb.append(")");
                    qrj qrj = new qrj(sb.toString(), strArr);
                    i = writableDatabase.delete("IntermediateStore", qrj.a, qrj.b);
                    writableDatabase.setTransactionSuccessful();
                    if (i != this.a.size()) {
                        qoi.c("Intermediate store ids deletion failed: ids deleted: %d, ids should have been deleted: %d", Integer.valueOf(i), Integer.valueOf(this.a.size()));
                        qoh.a().a(18);
                        return;
                    }
                    return;
                }
                long n = axvz.n();
                int size = list.size();
                StringBuilder sb2 = new StringBuilder(71);
                sb2.append("The ids size exceeds max allowed size ");
                sb2.append(n);
                sb2.append(": ");
                sb2.append(size);
                throw new IllegalArgumentException(sb2.toString());
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
            i = 0;
        }
    }
}
