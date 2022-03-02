package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: klw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class klw extends kqq {
    public final kkx a;
    public final String b;
    public final String c;
    public String d;
    public final kns e = kns.c(kly.GENOA_VALUE, kly.ACTION_ID);

    public klw(kqg kqg, Cursor cursor) {
        super(kqg, klz.a, klz.a.a.b(cursor).longValue());
        this.c = kly.NAME.h.a(cursor);
        this.a = kkx.a(kly.ENTRY_ID.h.b(cursor).longValue());
        this.b = kly.SDK_APP_ID.h.a(cursor);
        this.d = kly.VALUE.h.a(cursor);
        this.e.b(cursor);
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kly.ENTRY_ID.h.a(), this.a.a);
        contentValues.put(kly.NAME.h.a(), this.c);
        contentValues.put(kly.SDK_APP_ID.h.a(), this.b);
        contentValues.put(kly.VALUE.h.a(), this.d);
        this.e.b(contentValues);
    }

    public final void a(String str) {
        if (!ius.a(this.d, str)) {
            this.d = str;
        }
    }

    public klw(kqg kqg, kkx kkx, String str, String str2) {
        super(kqg, klz.a, -1);
        iva.a((Object) kkx);
        iva.a((Object) str);
        this.a = kkx;
        this.c = str;
        this.b = str2;
        this.d = null;
    }
}
