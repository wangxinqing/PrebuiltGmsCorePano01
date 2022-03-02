package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sxn extends sot {
    protected sxk b;
    public volatile sxk c;
    public sxk d;
    public final Map e = new ConcurrentHashMap();
    public sxk f;
    public String g;

    public sxn(svv svv) {
        super(svv);
    }

    public static void a(sxk sxk, Bundle bundle, boolean z) {
        if (bundle != null && sxk != null && (!bundle.containsKey("_sc") || z)) {
            String str = sxk.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", sxk.b);
            bundle.putLong("_si", sxk.c);
        } else if (bundle != null && sxk == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    public final sxk o() {
        l();
        h();
        return this.b;
    }

    public final sxk p() {
        i();
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        String str2;
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        v();
        if (length2 <= 100) {
            return str2;
        }
        v();
        return str2.substring(0, 100);
    }

    public final sxk a(Activity activity) {
        iva.a((Object) activity);
        sxk sxk = (sxk) this.e.get(activity);
        if (sxk != null) {
            return sxk;
        }
        sxk sxk2 = new sxk((String) null, a(activity.getClass().getCanonicalName()), x().d());
        this.e.put(activity, sxk2);
        return sxk2;
    }

    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.e.put(activity, new sxk(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r3 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r2, defpackage.sxk r3) {
        /*
            r1 = this;
            r1.h()
            monitor-enter(r1)
            java.lang.String r0 = r1.g     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            if (r3 == 0) goto L_0x0015
        L_0x0011:
            r1.g = r2     // Catch:{ all -> 0x0017 }
            r1.f = r3     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return
        L_0x0017:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxn.a(java.lang.String, sxk):void");
    }
}
