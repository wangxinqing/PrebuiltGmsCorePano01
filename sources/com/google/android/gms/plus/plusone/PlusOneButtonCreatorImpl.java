package com.google.android.gms.plus.plusone;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.RemoteException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlusOneButtonCreatorImpl extends ytp {
    public static final String TAG = "PlusOneButtonCreatorImpl";

    private static final Resources a(Context context) {
        try {
            Context createPackageContext = context.createPackageContext("com.google.android.gms", 4);
            if (createPackageContext != null) {
                return createPackageContext.getResources();
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public mby newPlusOneButton(mby mby, int i, int i2, String str, int i3) {
        Context context = (Context) mbz.a(mby);
        if (a(context) == null) {
            a("Could not load GMS resources!");
        }
        return mbz.a((Object) new yzp(context, i, i2, str));
    }

    public mby newPlusOneButtonWithPopup(mby mby, int i, int i2, String str, String str2) {
        Context context = (Context) mbz.a(mby);
        if (a(context) == null) {
            a("Could not load GMS resources!");
        }
        return mbz.a((Object) new yzz(context, i, i2, str, str2));
    }

    private static void a(String str) {
        int i = Build.VERSION.SDK_INT;
        throw new RemoteException(str);
    }
}
