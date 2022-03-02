package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* renamed from: agvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agvf implements agvc {
    private static agvf b;
    public final Context a;
    private final ContentObserver c;

    private agvf() {
        this.a = null;
        this.c = null;
    }

    static agvf a(Context context) {
        agvf agvf;
        synchronized (agvf.class) {
            if (b == null) {
                b = kr.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0 ? new agvf() : new agvf(context);
            }
            agvf = b;
        }
        return agvf;
    }

    /* renamed from: b */
    public final String a(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) agva.a(new agvd(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() == 0 ? new String("Unable to read GServices for: ") : "Unable to read GServices for: ".concat(valueOf), e);
            return null;
        }
    }

    private agvf(Context context) {
        this.a = context;
        this.c = new agve();
        context.getContentResolver().registerContentObserver(aeeg.a, true, this.c);
    }

    static synchronized void a() {
        synchronized (agvf.class) {
            if (!(b == null || b.a == null || b.c == null)) {
                b.a.getContentResolver().unregisterContentObserver(b.c);
            }
            b = null;
        }
    }
}
