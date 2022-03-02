package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;

/* renamed from: heo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class heo extends ContextWrapper {
    private final Context a;
    private final heo b;

    private heo(Context context, Context context2, heo heo) {
        super(context);
        this.a = context2;
        this.b = heo;
    }

    private final heo a() {
        heo heo = this.b;
        return heo != null ? heo : this;
    }

    public final Context createCredentialProtectedStorageContext() {
        return new heo(super.createCredentialProtectedStorageContext(), this.a.createCredentialProtectedStorageContext(), a());
    }

    public final Context createDeviceProtectedStorageContext() {
        return new heo(super.createDeviceProtectedStorageContext(), this.a.createDeviceProtectedStorageContext(), a());
    }

    public final Context getApplicationContext() {
        return a();
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.a.getApplicationInfo();
    }

    public final File getDir(String str, int i) {
        if ("chimera".equals(str)) {
            return this.a.getDir(str, i);
        }
        return super.getDir(str, i);
    }

    public final String getPackageName() {
        return this.a.getPackageName();
    }

    public static heo a(Context context) {
        heo heo = null;
        try {
            Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext == null || applicationContext == context)) {
                heo = new heo(applicationContext, createPackageContext, (heo) null);
            }
            return new heo(context, createPackageContext, heo);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("DynamiteCtx", valueOf.length() == 0 ? new String("Couldn't get GmsCore context: ") : "Couldn't get GmsCore context: ".concat(valueOf));
            return null;
        }
    }
}
