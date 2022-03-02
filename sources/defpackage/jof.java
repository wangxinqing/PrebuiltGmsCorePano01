package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: jof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jof {
    private static final Charset j = Charset.forName("UTF-8");
    public int a;
    public int b = -1;
    public final int c;
    public String d;
    public String e;
    public final String f;
    public String g;
    public String h;
    public final String i;

    public jof(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        String packageName = context.getPackageName();
        try {
            this.b = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(packageName);
            Log.wtf("DeviceContext", valueOf.length() == 0 ? new String("Our own package not found: ") : "Our own package not found: ".concat(valueOf), e2);
        }
        try {
            this.a = context.getPackageManager().getPackageInfo(str, 0).versionCode;
            this.h = context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e3) {
            String valueOf2 = String.valueOf(str);
            Log.e("DeviceContext", valueOf2.length() == 0 ? new String("Caller package not found: ") : "Caller package not found: ".concat(valueOf2), e3);
        }
        this.c = Build.VERSION.SDK_INT;
        if (context.getContentResolver() != null) {
            this.d = aeeg.a(context.getContentResolver(), "device_country", "");
        }
        Locale locale = Locale.getDefault();
        if (locale != null) {
            this.e = locale.toString();
        }
        this.f = str2;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
        } catch (PackageManager.NameNotFoundException e4) {
            String valueOf3 = String.valueOf(str);
            Log.e("DeviceContext", valueOf3.length() == 0 ? new String("Cannot retrieve application info for package: ") : "Cannot retrieve application info for package: ".concat(valueOf3), e4);
            applicationInfo = null;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            String string = bundle.getString("com.google.android.gms.games.APP_ID");
            if (!TextUtils.isEmpty(string)) {
                this.g = string;
            }
        }
        this.i = TimeZone.getDefault().getID();
    }

    public static byte[] a(jof jof) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update((byte) 0);
            instance.update(new Integer(jof.a).toString().getBytes(j));
            instance.update((byte) 0);
            instance.update(new Integer(jof.b).toString().getBytes(j));
            instance.update((byte) 0);
            instance.update(new Integer(jof.c).toString().getBytes(j));
            instance.update((byte) 0);
            String str = jof.d;
            if (str != null) {
                instance.update(str.getBytes(j));
                instance.update((byte) 0);
            }
            String str2 = jof.e;
            if (str2 != null) {
                instance.update(str2.getBytes(j));
                instance.update((byte) 0);
            }
            String str3 = jof.f;
            if (str3 != null) {
                instance.update(str3.getBytes(j));
                instance.update((byte) 0);
            }
            String str4 = jof.g;
            if (str4 != null) {
                instance.update(str4.getBytes(j));
                instance.update((byte) 0);
            }
            String str5 = jof.h;
            if (str5 != null) {
                instance.update(str5.getBytes(j));
                instance.update((byte) 0);
            }
            String str6 = jof.i;
            if (str6 != null) {
                instance.update(str6.getBytes(j));
                instance.update((byte) 0);
            }
            return instance.digest();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
