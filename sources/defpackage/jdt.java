package defpackage;

import android.content.ContentValues;

/* renamed from: jdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jdt extends or {
    public jdt() {
        super(50);
    }

    public final void a(ContentValues contentValues) {
        contentValues.clear();
        super.a(contentValues);
    }

    public final ContentValues b() {
        ContentValues contentValues = (ContentValues) super.a();
        return contentValues == null ? new ContentValues() : contentValues;
    }
}
