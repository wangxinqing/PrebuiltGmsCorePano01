package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* renamed from: nsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsn {
    public final Context a;
    public nss b;

    public nsn(Context context) {
        this.a = context.getApplicationContext();
    }

    public final synchronized List a() {
        nss nss = this.b;
        if (nss != null) {
            try {
                return nss.b();
            } catch (RemoteException e) {
                Log.e("GcmDiagnostics", "Failed to get events.", e);
                return amzy.h();
            }
        } else {
            return amzy.h();
        }
    }

    public final synchronized String b() {
        String str;
        nss nss = this.b;
        if (nss != null) {
            try {
                str = nss.c();
            } catch (RemoteException e) {
                Log.e("GcmDiagnostics", "Failed to get status.", e);
                return "No service";
            }
        } else {
            str = "No service";
        }
        return str;
    }

    public final synchronized String c() {
        String str;
        nss nss = this.b;
        if (nss != null) {
            try {
                str = nss.d();
            } catch (RemoteException e) {
                Log.e("GcmDiagnostics", "Failed to get status.", e);
                return "No service";
            }
        } else {
            str = "No service";
        }
        return str;
    }
}
