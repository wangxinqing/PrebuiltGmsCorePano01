package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aedb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aedb extends jhr {
    private final jhr b;
    private final Context c;
    private final Set d = new HashSet();

    public aedb(jhr jhr, Context context) {
        this.b = jhr;
        this.c = context;
    }

    private static final void a(aecy aecy, String str, int i, String str2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("op", str);
            bundle.putInt("uid", i);
            bundle.putString("packageName", str2);
            aecy.a("finishOpNoThrow", bundle);
        } catch (RemoteException e) {
        }
    }

    private static final int b(aecy aecy, String str, int i, String str2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("op", str);
            bundle.putInt("uid", i);
            bundle.putString("packageName", str2);
            return aecy.a("noteOpNoThrow", bundle).getInt("result");
        } catch (RemoteException e) {
            return 2;
        }
    }

    private static final int c(aecy aecy, String str, int i, String str2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("op", str);
            bundle.putInt("uid", i);
            bundle.putString("packageName", str2);
            return aecy.a("startOpNoThrow", bundle).getInt("result");
        } catch (RemoteException e) {
            return 2;
        }
    }

    public final int e(String str, int i, String str2) {
        if (!jkr.g()) {
            return d(str, i, str2);
        }
        throw new IllegalStateException("unexpected call of checkOpRawNoThrow on P+ platform");
    }

    public final int d(String str, int i, String str2) {
        aecy a;
        if (!aecx.a() || !aede.a(i) || (a = aecy.a(this.c)) == null) {
            return this.b.d(str, i, str2);
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("op", str);
            bundle.putInt("uid", i);
            bundle.putString("packageName", str2);
            return a.a("checkOpNoThrow", bundle).getInt("result");
        } catch (RemoteException e) {
            Log.e("WhAwareAppOpsCompat", "Exception noting op", e);
            return 2;
        }
    }

    private static final synchronized void a(aecy aecy, jhq jhq) {
        synchronized (aedb.class) {
            try {
                ResultReceiver resultReceiver = (ResultReceiver) aecy.a.remove(jhq);
                if (resultReceiver != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("receiver", resultReceiver);
                    aecy.a("stopWatchingMode", bundle);
                }
            } catch (RemoteException e) {
                Log.e("WhAwareAppOpsCompat", "Exception stopping watching", e);
            }
        }
    }

    public final int b(String str, int i, String str2, String str3) {
        aecy a;
        if (!aecx.a() || !aede.a(i) || (a = aecy.a(this.c)) == null) {
            return this.b.b(str, i, str2, str3);
        }
        return b(a, str, i, str2);
    }

    public final int c(String str, int i, String str2) {
        aecy a;
        if (!aecx.a() || !aede.a(i) || (a = aecy.a(this.c)) == null) {
            return this.b.c(str, i, str2);
        }
        return b(a, str, i, str2);
    }

    public final int a(String str, int i, String str2) {
        aecy a;
        if (!aecx.a() || !aede.a(i) || (a = aecy.a(this.c)) == null) {
            return this.b.a(str, i, str2);
        }
        return c(a, str, i, str2);
    }

    public final void b(String str, int i, String str2) {
        aecy a;
        if (!aecx.a() || !aede.a(i) || (a = aecy.a(this.c)) == null) {
            this.b.b(str, i, str2);
        } else {
            a(a, str, i, str2);
        }
    }

    public final int c(String str, int i, String str2, String str3) {
        aecy a;
        if (!aecx.a() || !aede.a(i) || (a = aecy.a(this.c)) == null) {
            return this.b.c(str, i, str2, str3);
        }
        return c(a, str, i, str2);
    }

    public final String a(String str) {
        return this.b.a(str);
    }

    public final void a(String str, int i, String str2, String str3) {
        aecy a;
        if (!aecx.a() || !aede.a(i) || (a = aecy.a(this.c)) == null) {
            this.b.a(str, i, str2, str3);
        } else {
            a(a, str, i, str2);
        }
    }

    public final void a(String str, int i, jhq jhq) {
        if (!jkr.g()) {
            a(str, jhq);
            return;
        }
        throw new IllegalStateException("unexpected call of startWatchingMode with flags on P+ platform");
    }

    public final void a(String str, jhq jhq) {
        aecx.a();
        this.b.a(str, jhq);
    }

    public final void a(jhq jhq) {
        boolean remove;
        synchronized (this.d) {
            remove = this.d.remove(jhq);
        }
        if (remove && aecx.a()) {
            aecy a = aecy.a(this.c);
            if (a != null) {
                a(a, jhq);
                return;
            }
            return;
        }
        this.b.a(jhq);
    }
}
