package defpackage;

import android.database.Cursor;
import android.os.Bundle;

/* renamed from: dun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dun {
    public static final Cursor a(Cursor cursor, String str) {
        Bundle bundle = new Bundle(cursor.getExtras());
        bundle.putString("com.google.android.gms.appdatasearch.CONTENT_INCARNATION_KEY", str);
        return new duk(cursor, bundle);
    }

    public static final String a(Cursor cursor) {
        return cursor.getExtras().getString("com.google.android.gms.appdatasearch.CONTENT_INCARNATION_KEY");
    }
}
