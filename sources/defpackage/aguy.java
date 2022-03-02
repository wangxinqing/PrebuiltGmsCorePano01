package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: aguy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aguy implements agvc {
    public static final String[] c = {"key", "value"};
    private static final Map d = new nz();
    public final ContentResolver a;
    public final Uri b;
    private final ContentObserver e = new agux(this);
    private final Object f = new Object();
    private volatile Map g;
    private final List h = new ArrayList();

    private aguy(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, this.e);
    }

    public static aguy a(ContentResolver contentResolver, Uri uri) {
        aguy aguy;
        synchronized (aguy.class) {
            aguy = (aguy) d.get(uri);
            if (aguy == null) {
                try {
                    aguy aguy2 = new aguy(contentResolver, uri);
                    try {
                        d.put(uri, aguy2);
                    } catch (SecurityException e2) {
                    }
                    aguy = aguy2;
                } catch (SecurityException e3) {
                }
            }
        }
        return aguy;
    }

    static synchronized void c() {
        synchronized (aguy.class) {
            for (aguy aguy : d.values()) {
                aguy.a.unregisterContentObserver(aguy.e);
            }
            d.clear();
        }
    }

    public final void b() {
        synchronized (this.f) {
            this.g = null;
            agvx.a();
        }
        synchronized (this) {
            for (aguz a2 : this.h) {
                a2.a();
            }
        }
    }

    public static void a(Uri uri) {
        synchronized (aguy.class) {
            aguy aguy = (aguy) d.get(uri);
            if (aguy != null) {
                aguy.b();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) a().get(str);
    }

    /* JADX INFO: finally extract failed */
    public final Map a() {
        Map map;
        Map map2 = this.g;
        if (map2 == null) {
            synchronized (this.f) {
                map2 = this.g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) agva.a(new aguw(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException e2) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.g = map;
                    map2 = map;
                }
            }
        }
        return map2 == null ? Collections.emptyMap() : map2;
    }
}
