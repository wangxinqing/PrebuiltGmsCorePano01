package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: akel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akel {
    private static Method a;

    static {
        try {
            Bundle.class.getDeclaredMethod("putBinder", new Class[]{String.class, IBinder.class});
        } catch (Exception e) {
            Log.e("ActivityTransitionBitmapHelper", e.getMessage());
        }
        try {
            a = Bundle.class.getDeclaredMethod("getBinder", new Class[]{String.class});
        } catch (Exception e2) {
            Log.e("ActivityTransitionBitmapHelper", e2.getMessage());
        }
    }

    public static Bitmap a(Bundle bundle) {
        IBinder iBinder;
        akeo akeo;
        if (bundle.containsKey("com.google.android.pano.util.extra_binder")) {
            Method method = a;
            if (method != null) {
                try {
                    iBinder = (IBinder) method.invoke(bundle, new Object[]{"com.google.android.pano.util.extra_binder"});
                } catch (Exception e) {
                    Log.e("ActivityTransitionBitmapHelper", e.getMessage());
                    iBinder = null;
                }
            } else {
                iBinder = null;
            }
            if (iBinder == null) {
                akeo = null;
            } else if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.pano.util.IActivityTransitionBitmapProvider");
                akeo = queryLocalInterface instanceof akeo ? (akeo) queryLocalInterface : new akeo(iBinder);
            } else {
                akeo = null;
            }
            if (akeo != null) {
                try {
                    Parcel a2 = akeo.a(1, akeo.aQ());
                    Bitmap bitmap = (Bitmap) bhx.a(a2, Bitmap.CREATOR);
                    a2.recycle();
                    return bitmap;
                } catch (RemoteException e2) {
                }
            }
        }
        return null;
    }
}
