package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: asec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asec {
    public static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.location.nearby.direct.service.NearbyDirectService"));
        return intent;
    }

    public static ased a(IBinder iBinder) {
        asgz asgz;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.direct.client.internal.INearbyDirectService");
            asgz = queryLocalInterface instanceof asgz ? (asgz) queryLocalInterface : new asgx(iBinder);
        } else {
            asgz = null;
        }
        return new asek(asgz);
    }
}
