package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: kmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kmh extends kqq {
    public final long a;
    public String b;

    public kmh(kqg kqg, long j, long j2, String str) {
        super(kqg, kmk.a, j);
        this.a = j2;
        this.b = str;
    }

    public static kmh a(kqg kqg, Cursor cursor) {
        return new kmh(kqg, kmk.a.a.b(cursor).longValue(), kmj.ACCOUNT_ID.c.b(cursor).longValue(), kmj.RESOURCE_ID.c.a(cursor));
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kmj.ACCOUNT_ID.c.a(), Long.valueOf(this.a));
        contentValues.put(kmj.RESOURCE_ID.c.a(), this.b);
    }
}
