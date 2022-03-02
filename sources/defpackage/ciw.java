package defpackage;

import android.content.ContentValues;

/* renamed from: ciw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ciw {
    public static void a(ContentValues contentValues, jun jun) {
        if (jun != null) {
            if (jun.a()) {
                contentValues.put("string_key1", jun.b());
            }
            if (jun.c()) {
                contentValues.put("string_key2", jun.d());
            }
            if (jun.e()) {
                contentValues.put("string_key3", jun.f());
            }
        }
    }

    public static void a(ContentValues contentValues, jut jut) {
        if (jut != null) {
            contentValues.put("time_type", Integer.valueOf(jut.a()));
            contentValues.put("start_time", Long.valueOf(jut.c()));
            contentValues.put("end_time", Long.valueOf(jut.d()));
        }
    }
}
