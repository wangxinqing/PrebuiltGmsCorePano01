package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;
import java.util.Map;
import java.util.Set;

/* renamed from: yfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yfb extends yfa {
    public static final boolean d = axap.a.a().a();
    private final SharedPreferences e;
    private final SharedPreferences f;

    public yfb(yey yey, String str, SharedPreferences sharedPreferences) {
        super(yey, str);
        this.e = sharedPreferences;
        this.f = null;
    }

    public static SharedPreferences a(Context context, String str) {
        if (str.startsWith("direct_boot:")) {
            str = str.substring(12);
            if (!d || aekv.a(context)) {
                context = aekv.d(context);
            }
        }
        return context.getSharedPreferences(str, 0);
    }

    public static SharedPreferences b(Context context, String str) {
        if (str.startsWith("direct_boot:")) {
            str = str.substring(12);
        }
        return context.getSharedPreferences(str, 0);
    }

    public static SharedPreferences c(Context context, String str) {
        if (!aekv.a() || !str.startsWith("direct_boot:")) {
            return null;
        }
        return aekv.d(context).getSharedPreferences(str.substring(12), 0);
    }

    public static void d(Context context, String str) {
        iva.b(str.startsWith("direct_boot:"));
        if (aekv.a()) {
            iva.b(!context.isDeviceProtectedStorage());
            if (!aekv.a(context)) {
                Context d2 = aekv.d(context);
                String substring = str.substring(12);
                if (d) {
                    if (context.getSharedPreferences(substring, 0).getAll().isEmpty()) {
                        a(d2, context, substring);
                    } else if (d2.getSharedPreferences(substring, 0).getAll().isEmpty()) {
                        a(context, d2, substring);
                    }
                } else if (d2.getSharedPreferences(substring, 0).getAll().isEmpty()) {
                    d2.moveSharedPreferencesFrom(context, substring);
                } else {
                    context.deleteSharedPreferences(substring);
                }
            }
        }
    }

    public yfb(yey yey, String str, String str2, Context context) {
        super(yey, str);
        if (d) {
            this.e = b(context, str2);
            this.f = c(context, str2);
            return;
        }
        this.e = a(context, str2);
        this.f = null;
    }

    private static void a(Context context, Context context2, String str) {
        Map<String, ?> all = context.getSharedPreferences(str, 0).getAll();
        SharedPreferences.Editor edit = context2.getSharedPreferences(str, 0).edit();
        for (Map.Entry next : all.entrySet()) {
            if (next.getValue() instanceof String) {
                edit.putString((String) next.getKey(), (String) next.getValue());
            } else if (next.getValue() instanceof Boolean) {
                edit.putBoolean((String) next.getKey(), ((Boolean) next.getValue()).booleanValue());
            } else if (next.getValue() instanceof Integer) {
                edit.putInt((String) next.getKey(), ((Integer) next.getValue()).intValue());
            } else if (next.getValue() instanceof Long) {
                edit.putLong((String) next.getKey(), ((Long) next.getValue()).longValue());
            } else if (next.getValue() instanceof Float) {
                edit.putFloat((String) next.getKey(), ((Float) next.getValue()).floatValue());
            } else if (next.getValue() instanceof Set) {
                edit.putStringSet((String) next.getKey(), (Set) next.getValue());
            } else {
                return;
            }
        }
        edit.commit();
    }

    /* access modifiers changed from: protected */
    public final boolean b(Configurations configurations) {
        boolean a = yfa.a(this.e, configurations);
        if (this.f != null && aekv.a()) {
            a = yfa.a(this.f, configurations);
        }
        agvz.b();
        return a;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return this.e.getString("__phenotype_snapshot_token", (String) null);
    }
}
