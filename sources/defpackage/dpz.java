package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* renamed from: dpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpz {
    public static List a(Bundle bundle) {
        mby mby;
        IBinder a = fy.a(bundle, "settingsListKey");
        if (a == null || !a.pingBinder()) {
            return null;
        }
        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof mby) {
            mby = (mby) queryLocalInterface;
        } else {
            mby = new mbw(a);
        }
        return (List) mbz.a(mby);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [mby, android.os.IBinder] */
    public static void a(Bundle bundle, List list) {
        fy.a(bundle, "settingsListKey", mbz.a((Object) list));
    }
}
