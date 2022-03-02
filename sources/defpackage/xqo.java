package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: xqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqo extends xqg {
    private final wzv a;
    private final Uri b;
    private final boolean c = ayuq.b();

    private final void a(xqy xqy, String str, int i, int i2) {
        wmi wmi;
        wmi wmi2;
        wmi wmi3;
        wzv wzv = this.a;
        if (wzv != null) {
            try {
                wzv.a(xqy.a, str);
                if (this.c && (wmi3 = this.r) != null) {
                    wmi3.b(i, i2);
                }
            } catch (RemoteException e) {
                Log.e("GetTypeOperation", "Operation failed remotely: ", e);
                if (this.c && (wmi = this.r) != null) {
                    wmi.b(10, 0);
                }
            } catch (Throwable th) {
                if (this.c && (wmi2 = this.r) != null) {
                    wmi2.b(i, i2);
                }
                throw th;
            }
        }
    }

    public final void b(Context context) {
        wmi wmi;
        if (this.c && (wmi = this.r) != null && this.p) {
            wmi.b(8, 0);
        } else if (ayxm.b()) {
            a(xqy.c, context.getContentResolver().getType(this.b), 2, 1);
        } else {
            Log.w("GetTypeOperation", "GalProvider delegation disabled.");
            a(xqy.i, (String) null, 13, 0);
        }
    }

    public xqo(String str, int i, wzv wzv, Uri uri) {
        super(str, i, (String) null, "GetGalProviderType", (byte[]) null);
        this.a = wzv;
        this.b = uri;
    }
}
