package defpackage;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.ArrayMap;
import android.util.Log;

/* renamed from: algl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algl {
    public static Bundle a(PersistableBundle persistableBundle) {
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }

    public static void b(PersistableBundle persistableBundle) {
        algm.a((Object) persistableBundle, "PersistableBundle cannot be null!");
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            algm.a(a(obj), String.format("Unknown/unsupported data type [%s] for key %s", new Object[]{obj, str}));
        }
    }

    private static ArrayMap a(BaseBundle baseBundle) {
        if (baseBundle.isEmpty()) {
            return new ArrayMap(0);
        }
        ArrayMap arrayMap = new ArrayMap(baseBundle.size());
        for (String next : baseBundle.keySet()) {
            Object obj = baseBundle.get(next);
            if (!a(obj)) {
                Log.w("SetupCompat.PersistBls", String.format("Unknown/unsupported data type [%s] for key %s", new Object[]{obj, next}));
            } else {
                arrayMap.put(next, baseBundle.get(next));
            }
        }
        return arrayMap;
    }

    public static boolean a(PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        return persistableBundle == persistableBundle2 || a((BaseBundle) persistableBundle).equals(a((BaseBundle) persistableBundle2));
    }

    private static boolean a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Boolean);
    }
}
