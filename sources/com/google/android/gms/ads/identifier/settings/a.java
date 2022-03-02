package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a {
    public static hwz a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                int i = hxz.b;
                hxz.l(context);
                hwz hwz = new hwz();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (jca.a().a(context, intent, hwz, 1)) {
                    return hwz;
                }
                throw new IOException("Connection failure");
            } catch (hxw e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new hxw();
        }
    }
}
