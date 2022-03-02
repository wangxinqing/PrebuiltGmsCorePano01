package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

@Deprecated
/* renamed from: hep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hep {
    @Deprecated
    public static Context a(Context context, String str) {
        try {
            return mcx.a(context, mcx.a, str).d;
        } catch (mct e) {
            Log.e("DynamiteUtils", str.length() == 0 ? new String("Failed to load ") : "Failed to load ".concat(str), e);
            return null;
        }
    }

    @Deprecated
    public static IBinder a(ClassLoader classLoader, String str) {
        try {
            return (IBinder) classLoader.loadClass(str).newInstance();
        } catch (ClassNotFoundException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        } catch (IllegalAccessException e2) {
            RemoteException remoteException2 = new RemoteException();
            remoteException2.initCause(e2);
            throw remoteException2;
        } catch (InstantiationException e3) {
            RemoteException remoteException3 = new RemoteException();
            remoteException3.initCause(e3);
            throw remoteException3;
        }
    }
}
