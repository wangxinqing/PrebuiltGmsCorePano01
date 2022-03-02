package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: hwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hwo {
    public static Integer a(Context context, String str) {
        a(context);
        if (aekv.a(context)) {
            context = context.createDeviceProtectedStorageContext();
        }
        int i = context.getSharedPreferences("QosTierPref", 0).getInt(str, -1);
        if (i != -1) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public static void a(Context context) {
        if (aekv.a() && aekv.b(context)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("QosTierPref", 0);
            if (!sharedPreferences.getBoolean("is_migrated_from_ce_to_de", false)) {
                SharedPreferences.Editor edit = context.createDeviceProtectedStorageContext().getSharedPreferences("QosTierPref", 0).edit();
                edit.clear();
                for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                    Object value = next.getValue();
                    String str = (String) next.getKey();
                    if (str.equals("qos_tier_fingerprint")) {
                        edit.putLong(str, ((Long) value).longValue());
                    } else if (value instanceof Integer) {
                        edit.putInt(str, ((Integer) value).intValue());
                    }
                }
                edit.commit();
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putBoolean("is_migrated_from_ce_to_de", true);
                edit2.commit();
            }
        }
    }

    public static void a(Context context, avsf avsf) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("QosTierPref", 0);
        if (!sharedPreferences.contains("qos_tier_fingerprint") || sharedPreferences.getLong("qos_tier_fingerprint", Long.MIN_VALUE) != avsf.b) {
            a(sharedPreferences, avsf);
            if (aekv.a()) {
                a(context.createDeviceProtectedStorageContext().getSharedPreferences("QosTierPref", 0), avsf);
            }
        }
    }

    private static void a(SharedPreferences sharedPreferences, avsf avsf) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.putLong("qos_tier_fingerprint", avsf.b);
        aucx aucx = avsf.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            avse avse = (avse) aucx.get(i);
            String str = avse.b;
            avsd a = avsd.a(avse.c);
            if (a == null) {
                a = avsd.DEFAULT;
            }
            edit.putInt(str, a.f);
        }
        edit.putBoolean("is_migrated_from_ce_to_de", true);
        edit.commit();
    }
}
