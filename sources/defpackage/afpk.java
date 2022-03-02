package defpackage;

import android.content.Context;

/* renamed from: afpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afpk {
    public static afpj a(Context context, afmh afmh) {
        int i = context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", afpj.NEW_FILE_KEY.d);
        try {
            return afpj.a(i);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("FileKey version metadata corrupted with unknown version: ");
            sb.append(i);
            afmh.a(sb.toString(), e);
            b(context);
            return afpj.USE_CHECKSUM_ONLY;
        }
    }

    public static void b(Context context) {
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
    }

    public static void c(Context context) {
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    static boolean a(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean a(Context context, afpj afpj) {
        afpj.name();
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", afpj.d).commit();
    }
}
