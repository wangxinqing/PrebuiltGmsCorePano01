package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: aptu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aptu {
    public final String a;
    public final String b;

    public aptu(Context context, String str) {
        iva.a((Object) context);
        iva.c(str);
        this.a = str;
        try {
            byte[] a2 = jhh.a(context, str, "SHA1");
            if (a2 == null) {
                String valueOf = String.valueOf(str);
                Log.e("FBA-PackageInfo", valueOf.length() == 0 ? new String("single cert required: ") : "single cert required: ".concat(valueOf));
                this.b = null;
                return;
            }
            this.b = jjp.d(a2);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf2 = String.valueOf(str);
            Log.e("FBA-PackageInfo", valueOf2.length() == 0 ? new String("no pkg: ") : "no pkg: ".concat(valueOf2));
            this.b = null;
        }
    }
}
