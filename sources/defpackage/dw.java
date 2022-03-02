package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: dw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dw {
    final HashMap a;
    final String[] b;
    final eb c;
    AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    final n f = new n();
    public dx g;
    Runnable h = new dt(this);
    public volatile C0000do i;
    private du j;

    public dw(eb ebVar, Map map, String... strArr) {
        this.c = ebVar;
        int length = strArr.length;
        this.j = new du(length);
        this.a = new HashMap();
        new ds();
        this.b = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.US);
            this.a.put(lowerCase, Integer.valueOf(i2));
            String str = (String) map.get(strArr[i2]);
            if (str != null) {
                this.b[i2] = str.toLowerCase(Locale.US);
            } else {
                this.b[i2] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                HashMap hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public final void a(di diVar) {
        if (!diVar.d()) {
            try {
                Lock a2 = this.c.a();
                a2.lock();
                try {
                    du duVar = this.j;
                    synchronized (duVar) {
                        boolean z = duVar.c;
                    }
                    a2.unlock();
                } catch (Throwable th) {
                    a2.unlock();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            }
        }
    }
}
