package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: xuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xuv {
    private final ixk a;
    private final Context b;

    public xuv(Context context, String str, int i) {
        ClientContext clientContext = new ClientContext();
        clientContext.e = str;
        clientContext.b = i;
        ixk a2 = ixk.a(context, clientContext);
        this.b = context;
        this.a = a2;
    }

    public static boolean a(Context context) {
        if (aywy.d()) {
            return xuu.a(context).a();
        }
        return a(context, "android.permission.READ_CONTACTS");
    }

    @Deprecated
    public static boolean a(Context context, String str) {
        if (!jkr.b()) {
            return true;
        }
        ClientContext clientContext = new ClientContext();
        clientContext.e = context.getPackageName();
        clientContext.b = Process.myUid();
        if (ixk.a(context, clientContext).a(str) == 0) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (jkr.b()) {
            return this.a.a("android.permission.READ_CONTACTS") == 0 && a(this.b);
        }
        return true;
    }
}
