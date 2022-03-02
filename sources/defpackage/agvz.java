package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: agvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agvz implements agvc {
    private static final Map a = new nz();
    private final SharedPreferences b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c = new agvy(this);
    private final Object d = new Object();
    private volatile Map e;
    private final List f = new ArrayList();

    private agvz(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.c);
    }

    public static void b() {
        synchronized (agvz.class) {
            for (agvz a2 : a.values()) {
                a2.a();
            }
        }
    }

    static synchronized void c() {
        synchronized (agvz.class) {
            for (agvz agvz : a.values()) {
                agvz.b.unregisterOnSharedPreferenceChangeListener(agvz.c);
            }
            a.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    static agvz a(Context context, String str) {
        agvz agvz;
        SharedPreferences sharedPreferences;
        if (aekv.a() && !str.startsWith("direct_boot:") && !aekv.b(context)) {
            return null;
        }
        synchronized (agvz.class) {
            agvz = (agvz) a.get(str);
            if (agvz == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (aekv.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    agvz = new agvz(sharedPreferences);
                    a.put(str, agvz);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return agvz;
    }

    /* JADX INFO: finally extract failed */
    public final Object a(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.b.getAll();
                        this.e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final void a() {
        synchronized (this.d) {
            this.e = null;
            agvx.a();
        }
        synchronized (this) {
            for (aguz a2 : this.f) {
                a2.a();
            }
        }
    }
}
