package defpackage;

import android.content.ContentValues;

/* renamed from: zud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zud implements ztz {
    public static final /* synthetic */ int b = 0;

    public static long a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("contact_id");
        if (asLong != null) {
            return asLong.longValue();
        }
        return 0;
    }
}
