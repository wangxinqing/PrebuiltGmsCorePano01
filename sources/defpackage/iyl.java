package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: iyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iyl extends ContextWrapper {
    public iyl(Context context) {
        super(context);
    }

    public final Context createCredentialProtectedStorageContext() {
        return new iyl(super.createCredentialProtectedStorageContext());
    }

    public final Context createDeviceProtectedStorageContext() {
        return new iyl(super.createDeviceProtectedStorageContext());
    }

    public final Context getApplicationContext() {
        return this;
    }
}
