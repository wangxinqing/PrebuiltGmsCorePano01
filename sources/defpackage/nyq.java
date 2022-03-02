package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;

/* renamed from: nyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nyq implements Comparable {
    public final int c;
    public final ntx d;
    public final Bundle e;
    public final Map f;

    public nyq(int i, ntx ntx, Bundle bundle, Map map) {
        this.c = i;
        this.d = ntx;
        this.e = bundle;
        this.f = map;
    }

    public static String a(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("app");
        if (parcelableExtra instanceof PendingIntent) {
            intent.removeExtra("app");
            return ((PendingIntent) parcelableExtra).getTargetPackage();
        }
        Log.w("GCM", "Invalid parameter app");
        return null;
    }

    public static Messenger b(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
        if (parcelableExtra instanceof Messenger) {
            intent.removeExtra("google.messenger");
            return (Messenger) parcelableExtra;
        }
        Log.w("GCM", "Register request missing messenger");
        return null;
    }

    public void a(Context context, Bundle bundle) {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return aoog.a(a(), ((nyq) obj).a());
    }

    public static Map a(int i) {
        nz nzVar = new nz();
        nzVar.put("delete", "true");
        nzVar.put("unreg_cause", String.valueOf(i));
        return nzVar;
    }

    public static nyq a(int i, int i2, Intent intent, Map map) {
        Bundle bundle;
        String a = a(intent);
        if (a == null) {
            return null;
        }
        ntx a2 = ntx.a(a, i2);
        Messenger b = b(intent);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            bundle = new Bundle();
        } else {
            bundle = extras;
        }
        return new nyp(i, a2, bundle, map, b, i2);
    }

    public static nyq a(ntx ntx, int i) {
        return new nyq(3, ntx, Bundle.EMPTY, a(i));
    }

    static final boolean a(Messenger messenger, Intent intent) {
        Message obtain = Message.obtain();
        obtain.obj = intent;
        try {
            messenger.send(obtain);
            return true;
        } catch (RemoteException e2) {
            return false;
        }
    }

    public final int a() {
        int i = this.c;
        if (i != 0) {
            return i != 1 ? 1 : 0;
        }
        boolean containsKey = this.e.containsKey("delete");
        return this.e.containsKey("gcm.topic") ? !containsKey ? 2 : 3 : !containsKey ? 0 : 1;
    }

    /* access modifiers changed from: package-private */
    public final Intent a(Bundle bundle) {
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTRATION");
        intent.setPackage(this.d.a);
        intent.putExtras(bundle);
        return intent;
    }
}
