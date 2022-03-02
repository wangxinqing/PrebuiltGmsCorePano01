package com.google.android.gms.audit.service;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuditApiChimeraService extends nio {
    public AuditApiChimeraService() {
        super(154, "com.google.android.gms.audit.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        aqoe aqoe = (aqoe) aqof.l.o();
        String str = Build.ID;
        if (aqoe.c) {
            aqoe.c();
            aqoe.c = false;
        }
        aqof aqof = (aqof) aqoe.b;
        str.getClass();
        aqof.a |= 2;
        aqof.c = str;
        int i = Build.VERSION.SDK_INT;
        if (aqoe.c) {
            aqoe.c();
            aqoe.c = false;
        }
        aqof aqof2 = (aqof) aqoe.b;
        aqof2.a |= 1;
        aqof2.b = i;
        String str2 = getServiceRequest.d;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str2, 0);
            int i2 = packageInfo.versionCode;
            if (aqoe.c) {
                aqoe.c();
                aqoe.c = false;
            }
            aqof aqof3 = (aqof) aqoe.b;
            aqof3.a |= 8;
            aqof3.e = i2;
            if (packageInfo.versionName != null) {
                String str3 = packageInfo.versionName;
                if (aqoe.c) {
                    aqoe.c();
                    aqoe.c = false;
                }
                aqof aqof4 = (aqof) aqoe.b;
                str3.getClass();
                aqof4.a |= 4;
                aqof4.d = str3;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (aqoe.c) {
            aqoe.c();
            aqoe.c = false;
        }
        aqof aqof5 = (aqof) aqoe.b;
        str2.getClass();
        aqof5.a |= 16;
        aqof5.f = str2;
        String num = Integer.toString(201216073);
        if (aqoe.c) {
            aqoe.c();
            aqoe.c = false;
        }
        aqof aqof6 = (aqof) aqoe.b;
        num.getClass();
        aqof6.a |= 32;
        aqof6.g = num;
        String num2 = Integer.toString(getServiceRequest.c);
        if (aqoe.c) {
            aqoe.c();
            aqoe.c = false;
        }
        aqof aqof7 = (aqof) aqoe.b;
        num2.getClass();
        aqof7.a |= 64;
        aqof7.h = num2;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(str5).length());
        sb.append(str4);
        sb.append(" ");
        sb.append(str5);
        String sb2 = sb.toString();
        if (aqoe.c) {
            aqoe.c();
            aqoe.c = false;
        }
        aqof aqof8 = (aqof) aqoe.b;
        sb2.getClass();
        aqof8.a |= 128;
        aqof8.i = sb2;
        Configuration configuration = getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            long min = Math.min((long) locales.size(), awih.a.a().a());
            for (int i3 = 0; ((long) i3) < min; i3++) {
                aqoe.a(locales.get(i3).toLanguageTag());
            }
        } else {
            Locale locale = configuration.locale;
            int i4 = Build.VERSION.SDK_INT;
            String languageTag = locale.toLanguageTag();
            if (languageTag != null) {
                aqoe.a(languageTag);
            }
        }
        auay a = auay.a(jil.a(ModuleManager.get(this)).a());
        if (aqoe.c) {
            aqoe.c();
            aqoe.c = false;
        }
        aqof aqof9 = (aqof) aqoe.b;
        a.getClass();
        aqof9.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aqof9.k = a;
        nit.a(new ehn((aqof) aqoe.i(), new nix(this, this.e, this.f)));
    }
}
