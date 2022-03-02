package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: dkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dkb {
    private static dkb a;
    private ClassLoader b;

    private dkb(Context context) {
        iva.a((Object) context);
        try {
            Context a2 = hep.a(context, ModuleDescriptor.MODULE_ID);
            if (a2 != null) {
                this.b = a2.getClassLoader();
            } else {
                Log.d("DynamitePackage", "Module could not be loaded.");
                throw new RemoteException();
            }
        } catch (RemoteException e) {
            Log.e("DynamitePackage", "Failed to load ads dynamite module.", e);
        }
    }

    public static dkb a(Context context) {
        Context applicationContext = context.getApplicationContext();
        iva.a((Object) applicationContext);
        synchronized (dkb.class) {
            if (a == null) {
                a = new dkb(applicationContext);
                Log.d("DynamitePackage", "Instantiated singleton DynamitePackage.");
            }
        }
        return a;
    }

    private static Object a(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            Log.w("DynamitePackage", "Failed to instantiate class.", e);
            return null;
        } catch (InstantiationException e2) {
            Log.w("DynamitePackage", "Failed to instantiate class.", e2);
            return null;
        }
    }

    public final Object a(String str) {
        ClassLoader classLoader = this.b;
        if (classLoader == null) {
            return null;
        }
        Log.d("DynamitePackage", str.length() == 0 ? new String("Instantiating ") : "Instantiating ".concat(str));
        try {
            return a((Class) classLoader.loadClass(str));
        } catch (ClassNotFoundException e) {
            Log.w("DynamitePackage", "Failed to find class.", e);
            return null;
        }
    }
}
