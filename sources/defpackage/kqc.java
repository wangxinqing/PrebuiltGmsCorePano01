package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: kqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqc extends kqq {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;

    public kqc(kqg kqg, long j, String str, String str2, String str3, boolean z, String str4) {
        super(kqg, kqf.a, j);
        iva.a((Object) str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public static kqc a(kqg kqg, Cursor cursor) {
        return new kqc(kqg, kqf.a.a.b(cursor).longValue(), kqe.PERMISSIONS_ID.f.a(cursor), kqe.DISPLAY_NAME.f.a(cursor), kqe.PICTURE_URL.f.a(cursor), kqe.IS_AUTHENTICATED_USER.f.e(cursor), kqe.EMAIL_ADDRESS.f.a(cursor));
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kqe.PERMISSIONS_ID.f.a(), this.a);
        contentValues.put(kqe.DISPLAY_NAME.f.a(), this.b);
        contentValues.put(kqe.PICTURE_URL.f.a(), this.c);
        contentValues.put(kqe.IS_AUTHENTICATED_USER.f.a(), Boolean.valueOf(this.d));
        contentValues.put(kqe.EMAIL_ADDRESS.f.a(), this.e);
    }
}
