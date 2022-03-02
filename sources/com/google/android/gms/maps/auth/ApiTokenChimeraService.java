package com.google.android.gms.maps.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import com.google.android.chimera.Service;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ApiTokenChimeraService extends Service {
    public static final String a = ApiTokenChimeraService.class.getSimpleName();
    public static final long b = TimeUnit.SECONDS.toMillis(30);
    public atgq c;
    private final rrb d;

    public ApiTokenChimeraService() {
        this(rqz.a, rra.a, rqy.a, athd.a);
    }

    public static Bundle a(short s) {
        Bundle bundle = new Bundle(1);
        bundle.putShort("ERROR_CODE", s);
        return bundle;
    }

    public final IBinder onBind(Intent intent) {
        Context applicationContext = getApplicationContext();
        Locale locale = Locale.getDefault();
        atgx atgx = new atgx();
        Matcher matcher = atgy.a.matcher(locale.toString());
        if (matcher.matches()) {
            atgx.a = matcher.group(1);
            atgx.b = matcher.group(3);
            if (matcher.group(2) != null && !matcher.group(2).isEmpty()) {
                atgx.c = matcher.group(2);
            }
        } else {
            atgx.a = locale.getLanguage();
            if (!locale.getCountry().isEmpty()) {
                atgx.c = locale.getCountry();
            }
        }
        if (atgx.a.equals("en") && (atgx.c.equals("AU") || atgx.c.equals("NZ"))) {
            atgx.c = "GB";
        }
        atgr.f = atgx.toString();
        atgr.a = applicationContext.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        DisplayMetrics displayMetrics = applicationContext.getResources().getDisplayMetrics();
        atgr.b = displayMetrics.densityDpi;
        atgr.c = displayMetrics.density;
        float f = (float) atgr.b;
        if (((double) (Math.abs(displayMetrics.xdpi - f) / f)) > 0.25d || ((double) (Math.abs(displayMetrics.ydpi - f) / f)) > 0.25d) {
            atgr.d = f;
            atgr.e = f;
        } else {
            atgr.d = displayMetrics.xdpi;
            atgr.e = displayMetrics.ydpi;
        }
        Math.hypot((double) (((float) displayMetrics.widthPixels) / atgr.d), (double) (((float) displayMetrics.heightPixels) / atgr.e));
        atgr.g = applicationContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        return this.d;
    }

    public final boolean onUnbind(Intent intent) {
        atgq atgq = this.c;
        if (atgq != null) {
            atgq.h();
            this.c = null;
        }
        return super.onUnbind(intent);
    }

    public ApiTokenChimeraService(rqz rqz, rra rra, rqy rqy, athd athd) {
        this.d = new rrb(this);
        this.c = null;
    }
}
