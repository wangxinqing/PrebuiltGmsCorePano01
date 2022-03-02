package defpackage;

import android.content.ContentValues;

/* renamed from: wqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wqm implements wqi {
    public static long a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("contact_id");
        if (asLong != null) {
            return asLong.longValue();
        }
        return 0;
    }
}
