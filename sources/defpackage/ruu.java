package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: ruu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ruu {
    private static final String a = ruu.class.getSimpleName();
    private static Context b = null;
    private static rsf c;

    private static Object a(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unable to instantiate the dynamic class ") : "Unable to instantiate the dynamic class ".concat(valueOf));
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Unable to call the default constructor of ") : "Unable to call the default constructor of ".concat(valueOf2));
        }
    }

    private static Context b(Context context) {
        Context context2;
        Context context3 = b;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = mcx.a(context, mcx.a, "com.google.android.gms.maps_dynamite").d;
        } catch (Exception e) {
            Log.e(a, "Failed to load maps module, use legacy", e);
            context2 = hxy.c(context);
        }
        b = context2;
        return context2;
    }

    public static rsf a(Context context) {
        iva.a((Object) context);
        rsf rsf = c;
        if (rsf != null) {
            return rsf;
        }
        int i = hxy.a;
        Log.i(a, "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            iva.a((Object) classLoader);
            rsf asInterface = rse.asInterface((IBinder) a((Class) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl")));
            c = asInterface;
            try {
                asInterface.initV2(mbz.a((Object) b(context).getResources()), hxy.a);
                return c;
            } catch (RemoteException e) {
                throw new rvl(e);
            }
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }
}
