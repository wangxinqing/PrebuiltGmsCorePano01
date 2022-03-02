package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: bpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bpx {
    public static boj a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        if (bundleExtra != null) {
            return a(bundleExtra, "progressListener");
        }
        return null;
    }

    public static boj a(Bundle bundle, String str) {
        IBinder a = fy.a(bundle, str);
        if (a == null) {
            return null;
        }
        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.chimera.container.internal.IUpdateProgressListener");
        if (queryLocalInterface instanceof boj) {
            return (boj) queryLocalInterface;
        }
        return new boh(a);
    }

    public static void a(Intent intent, String str, boj boj) {
        if (boj != null) {
            Bundle bundle = new Bundle();
            a(bundle, "progressListener", boj);
            intent.putExtra(str, bundle);
        }
    }

    public static void a(Bundle bundle, String str, boj boj) {
        if (boj != null) {
            fy.a(bundle, str, boj.asBinder());
        }
    }

    public static void a(boj boj, int i) {
        if (boj != null) {
            try {
                boj.a(i);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Failed to invoke updateComplete: ");
                sb.append(valueOf);
                Log.e("ChimeraUPLUtils", sb.toString());
            }
        }
    }
}
