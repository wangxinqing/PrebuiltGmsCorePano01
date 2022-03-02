package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dve {
    public static String a(dvj dvj) {
        return String.valueOf(dvj.a).concat("_seqno_table_appdatasearch");
    }

    public static String b(dvj dvj) {
        return String.valueOf(dvj.a).concat("_insert_trigger_appdatasearch");
    }

    public static String c(dvj dvj) {
        return String.valueOf(dvj.a).concat("_delete_trigger_appdatasearch");
    }

    public static String d(dvj dvj) {
        return String.valueOf(dvj.a).concat("_update_trigger_appdatasearch");
    }

    public static String e(dvj dvj) {
        return String.valueOf(dvj.a).concat("_tag_insert_trigger_appdatasearch");
    }

    public static String f(dvj dvj) {
        return String.valueOf(dvj.a).concat("_tag_delete_trigger_appdatasearch");
    }

    public static Set g(dvj dvj) {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{b(dvj), c(dvj), d(dvj)}));
        if (dvj.e != null) {
            hashSet.add(e(dvj));
            hashSet.add(f(dvj));
        }
        return hashSet;
    }

    public static Set a(SQLiteDatabase sQLiteDatabase) {
        return dvk.a(sQLiteDatabase, "_seqno_table_appdatasearch");
    }

    public static Set b(SQLiteDatabase sQLiteDatabase) {
        return dvk.b(sQLiteDatabase, "_trigger_appdatasearch");
    }
}
