package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmy {
    public static final wmw f = new wmw((String) null, (String) null, 8);
    private static wmy g;
    public final Object a = new Object();
    public final Context b;
    public final ArrayList c = jhx.a();
    public final ContentObserver d = new wmv(this, "people", "Cp2Observer");
    public boolean e;
    private final ArrayList h = jhx.a();

    private wmy(Context context) {
        this.b = context.getApplicationContext();
    }

    public static synchronized wmy a(Context context) {
        wmy wmy;
        synchronized (wmy.class) {
            if (g == null) {
                g = new wmy(context);
            }
            wmy = g;
        }
        return wmy;
    }

    public final void b() {
        synchronized (this.a) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    a((wmw) it.next());
                }
                this.h.clear();
            } catch (Throwable th) {
                this.h.clear();
                throw th;
            }
        }
    }

    public final void a() {
        if (this.e) {
            synchronized (this.a) {
                int i = 0;
                while (i < this.c.size()) {
                    if ((((wmx) this.c.get(i)).c & 8) == 0) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.b.getContentResolver().unregisterContentObserver(this.d);
                this.e = false;
            }
        }
    }

    public final void a(String str, String str2, int i) {
        synchronized (this.a) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                wmw wmw = (wmw) it.next();
                if (amqx.a(wmw.a, str) && amqx.a(wmw.b, str2)) {
                    wmw.c |= i;
                    return;
                }
            }
            this.h.add(new wmw(str, str2, i));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(wmw wmw) {
        String str;
        String str2 = wmw.a;
        String str3 = wmw.b;
        synchronized (this.a) {
            Bundle bundle = null;
            int i = 0;
            boolean z = false;
            while (i < this.c.size()) {
                wmx wmx = (wmx) this.c.get(i);
                if ((wmx.c & wmw.c) != 0) {
                    String str4 = wmx.a;
                    if (str4 == null || (str = wmw.a) == null || (amqx.a(str4, str) && amqx.a(wmx.b, wmw.b))) {
                        if (bundle == null) {
                            bundle = new Bundle();
                            bundle.putInt("scope", wmw.c);
                            bundle.putString("account", wmw.a);
                            bundle.putString("pagegaiaid", wmw.b);
                        }
                        try {
                            wmx.d.a(0, (Bundle) null, bundle);
                        } catch (Exception e2) {
                            this.c.remove(i);
                            i--;
                            z = true;
                        }
                    }
                }
                i++;
            }
            if (z) {
                a();
            }
        }
    }
}
