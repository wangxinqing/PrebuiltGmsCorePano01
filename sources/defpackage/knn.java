package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Date;

/* renamed from: knn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class knn extends kns {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Cursor cursor) {
        Long b = ((kqh) this.b.b()).b(cursor);
        if (b != null) {
            return new Date(b.longValue());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        Long l;
        String a = ((kqh) this.b.b()).a();
        Object obj = this.c;
        if (obj != null) {
            l = Long.valueOf(((Date) obj).getTime());
        } else {
            l = null;
        }
        contentValues.put(a, l);
    }

    public knn(lsb lsb, lsb lsb2) {
        super(lsb, lsb2);
    }
}
