package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: rqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqr {
    private static boolean a = false;

    public static synchronized void a(Context context) {
        synchronized (rqr.class) {
            iva.a((Object) context, (Object) "Context is null");
            if (!a) {
                try {
                    rsf a2 = ruu.a(context);
                    try {
                        rsb newCameraUpdateFactoryDelegate = a2.newCameraUpdateFactoryDelegate();
                        iva.a((Object) newCameraUpdateFactoryDelegate);
                        rqi.a = newCameraUpdateFactoryDelegate;
                        rvu newBitmapDescriptorFactoryDelegate = a2.newBitmapDescriptorFactoryDelegate();
                        if (ruw.a == null) {
                            iva.a((Object) newBitmapDescriptorFactoryDelegate);
                            ruw.a = newBitmapDescriptorFactoryDelegate;
                        }
                        a = true;
                    } catch (RemoteException e) {
                        throw new rvl(e);
                    }
                } catch (hxw e2) {
                }
            }
        }
    }
}
