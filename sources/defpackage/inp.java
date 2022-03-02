package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* renamed from: inp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class inp extends imh {
    public inp() {
        super("Safeboot Condition");
    }

    public static boolean b() {
        try {
            return "com.google.android.gms.persistent".equals(jkt.a());
        } catch (NoSuchMethodError e) {
            Log.e("Safeboot Condition", "Could not check if we were in persistent process.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(inb inb) {
        if (!axbk.c() || !b()) {
            return false;
        }
        if (axbk.d()) {
            try {
                if (!ioi.a(inb.b).exists()) {
                    Log.i("Safeboot Condition", "No need to enter Safeboot.");
                    return false;
                }
            } catch (SecurityException e) {
                Log.w("Safeboot Condition", "Couldn't check if crash file existed.", e);
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) inb.b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        ilu a = inb.a();
        if (a == null) {
            Log.e("Safeboot Condition", "Missing crash data");
            return false;
        }
        imz imz = inb.h;
        if (imz == null) {
            Log.e("Safeboot Condition", "Missing current fixer");
            return false;
        }
        anhk i = inb.b().listIterator();
        while (i.hasNext()) {
            imb imb = (imb) i.next();
            if (imb.a.equals(imz.a()) && imb.d > a.e) {
                return false;
            }
        }
        return true;
    }
}
