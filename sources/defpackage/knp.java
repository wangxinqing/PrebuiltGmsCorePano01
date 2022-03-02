package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: knp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class knp extends kns {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Cursor cursor) {
        Long b = ((kqh) this.b.b()).b(cursor);
        if (b != null) {
            return kpy.a(b.longValue());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        Long l;
        String a = ((kqh) this.b.b()).a();
        Object obj = this.c;
        if (obj != null) {
            l = Long.valueOf(((kpy) obj).d);
        } else {
            l = null;
        }
        contentValues.put(a, l);
    }

    public knp(lsb lsb, lsb lsb2) {
        super(lsb, lsb2);
    }
}
