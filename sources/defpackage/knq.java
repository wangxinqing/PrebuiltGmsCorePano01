package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: knq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class knq extends kns {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Cursor cursor) {
        return ((kqh) this.b.b()).b(cursor);
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(((kqh) this.b.b()).a(), (Long) this.c);
    }

    public knq(lsb lsb, lsb lsb2) {
        super(lsb, lsb2);
    }
}
