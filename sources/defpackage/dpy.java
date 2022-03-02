package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* renamed from: dpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpy extends dma {
    protected String a;
    protected String b;
    protected boolean c;
    protected int e;
    public boolean f;
    public boolean g;

    public dpy(dmd dmd) {
        super(dmd);
    }

    public final String b() {
        q();
        return this.a;
    }

    public final String s() {
        q();
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ApplicationInfo applicationInfo;
        int i;
        dpb a2;
        int i2;
        Context d = d();
        try {
            applicationInfo = d.getPackageManager().getApplicationInfo(d.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            d("PackageManager doesn't know about the app package", e2);
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0 && (a2 = new dmx(this.d).a(i)) != null) {
                b("Loading global XML config values");
                String str = a2.a;
                if (str != null) {
                    this.b = str;
                    b("XML config - app name", str);
                }
                String str2 = a2.b;
                if (str2 != null) {
                    this.a = str2;
                    b("XML config - app version", str2);
                }
                String str3 = a2.c;
                boolean z = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    if (!"verbose".equals(lowerCase)) {
                        i2 = !"info".equals(lowerCase) ? !"warning".equals(lowerCase) ? "error".equals(lowerCase) ? 3 : -1 : 2 : 1;
                    } else {
                        i2 = 0;
                    }
                    if (i2 >= 0) {
                        a("XML config - log level", Integer.valueOf(i2));
                    }
                }
                int i3 = a2.d;
                if (i3 >= 0) {
                    this.e = i3;
                    this.c = true;
                    b("XML config - dispatch period (sec)", Integer.valueOf(i3));
                }
                int i4 = a2.e;
                if (i4 != -1) {
                    if (i4 != 0) {
                        z = true;
                    }
                    this.g = z;
                    this.f = true;
                    b("XML config - dry run", Boolean.valueOf(z));
                    return;
                }
                return;
            }
            return;
        }
        d("Couldn't get ApplicationInfo to load global config");
    }
}
