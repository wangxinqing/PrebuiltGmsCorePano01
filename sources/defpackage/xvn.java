package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: xvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvn {
    private static xvn a;
    private final SharedPreferences b;

    public xvn(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
    }

    public static synchronized xvn a(Context context) {
        xvn xvn;
        synchronized (xvn.class) {
            if (a == null) {
                a = new xvn(context.getSharedPreferences("gms.people.contactssync.optin", 0));
            }
            xvn = a;
        }
        return xvn;
    }

    public final xsg a() {
        iva.b((String) null);
        String string = this.b.getString("backup_and_sync", "");
        aucd o = xsg.f.o();
        try {
            if (!string.isEmpty()) {
                o.b(Base64.decode(string, 0));
            }
        } catch (auda e) {
        }
        return (xsg) o.i();
    }

    public final void a(xsg xsg) {
        iva.b((String) null);
        this.b.edit().putString("backup_and_sync", Base64.encodeToString(xsg.k(), 0)).apply();
    }
}
