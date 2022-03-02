package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: jhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jhg {
    public static final int a = Process.myUid();
    public static final ikz b = ikz.a("android_id", (Long) 0L);
    public static volatile boolean c = true;
    private static final AtomicInteger d = new AtomicInteger();
    private static volatile String e = null;
    private static volatile Long f = null;
    private static Boolean g;
    private static Boolean h = null;
    private static String i = null;

    private jhg() {
    }

    private static int a(char c2) {
        int upperCase = Character.toUpperCase(c2) - '0';
        if (upperCase > 9) {
            upperCase -= 7;
        }
        if (upperCase >= 0 && upperCase <= 15) {
            return upperCase;
        }
        throw new IllegalArgumentException(String.format("'%c' is not a valid hexadecimal character", new Object[]{Character.valueOf(c2)}));
    }

    public static int b(Context context, String str) {
        return jni.b(context).b(str, 0).versionCode;
    }

    public static String c(Activity activity) {
        android.app.Activity containerActivity = activity.getContainerActivity();
        String a2 = a(containerActivity);
        if (a2 == null) {
            if (Log.isLoggable("AndroidUtils", 4)) {
                Log.i("AndroidUtils", "Was the Activity started with startActivityForResult?");
            }
            throw new SecurityException("Calling package was null");
        }
        hya.a((Context) containerActivity).a(a2);
        return a2;
    }

    @Deprecated
    public static int d(Context context) {
        return jhh.a(context);
    }

    public static String e(Context context) {
        if (e == null) {
            String packageName = context.getPackageName();
            try {
                e = jni.b(context).b(packageName, 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf = String.valueOf(packageName);
                Log.w("AndroidUtils", valueOf.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(valueOf));
            }
        }
        return e;
    }

    public static Cipher f(String str) {
        int i2 = 0;
        while (i2 < 2) {
            try {
                Cipher instance = Cipher.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return null;
    }

    @Deprecated
    public static Intent g(String str) {
        return a(new Intent(str));
    }

    public static Intent h(String str) {
        return new Intent().setClassName("com.google.android.gms", str);
    }

    public static int i(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return jni.b(context).a(str, 0).uid;
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Cannot get application info for [");
            sb.append(str);
            sb.append("]");
            sb.toString();
            return -1;
        }
    }

    public static String j(Context context, String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty((CharSequence) null)) {
            return null;
        }
        try {
            Bundle bundle = jni.b(context).a(str, 128).metaData;
            if (bundle != null) {
                String string = bundle.getString((String) null);
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf((Object) null).length() + 217);
            sb.append("A required meta-data tag in your app's AndroidManifest.xml is not found.  You must have the following declaration within the <application> element:     <meta-data android:name=\"null\" android:value=\"SOME_METADATA_VALUE\" />");
            throw new IllegalStateException(sb.toString());
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
            sb2.append("Cannot get meta data for [");
            sb2.append(str);
            sb2.append("]");
            sb2.toString();
            return null;
        }
    }

    public static ComponentName b(Activity activity) {
        android.app.Activity containerActivity = activity.getContainerActivity();
        return jni.b(containerActivity).b(containerActivity);
    }

    public static int d(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    public static String g() {
        try {
            return !jkr.e() ? Build.SERIAL : Build.getSerial();
        } catch (SecurityException e2) {
            return "unknown";
        }
    }

    private static TelephonyManager h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long a(Context context) {
        if (aekv.a(context)) {
            Log.w("AndroidUtils", "getAndroidId is called in direct boot mode.");
            return 0;
        } else if (!awyg.a.a().c()) {
            ikz ikz = b;
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return ((Long) ikz.c()).longValue();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } else {
            if (f == null || f.longValue() == 0) {
                try {
                    f = Long.valueOf((String) acws.a(gvl.a(context).a((ihb) new gvi()), 1000, TimeUnit.MILLISECONDS));
                } catch (InterruptedException | NumberFormatException | ExecutionException | TimeoutException e2) {
                    if (e2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    Log.e("AndroidUtils", "Failed to get Android ID", e2);
                    f = 0L;
                }
            }
            return f.longValue();
        }
    }

    @Deprecated
    public static String d() {
        if (i == null) {
            i = jkt.a();
        }
        return i;
    }

    public static boolean f() {
        int i2 = Build.VERSION.SDK_INT;
        return Process.myUserHandle().isOwner();
    }

    public static boolean g(Context context) {
        return context.getPackageManager().hasSystemFeature("org.chromium.arc");
    }

    public static String h(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return e(context, str);
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
            sb.append("Cannot get package certificate for [");
            sb.append(str);
            sb.append("]");
            sb.toString();
            return null;
        }
    }

    public static String b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "none";
        }
        try {
            return telephonyManager.getNetworkOperator();
        } catch (Exception e2) {
            return "none";
        }
    }

    public static Signature d(String str) {
        int i2 = 0;
        while (i2 < 2) {
            try {
                Signature instance = Signature.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return null;
    }

    public static String e(Context context, String str) {
        return b(context, str, "SHA1");
    }

    public static boolean g(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    public static KeyFactory e(String str) {
        int i2 = 0;
        while (i2 < 2) {
            try {
                KeyFactory instance = KeyFactory.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        return a(jni.b(context).b(str, 64), str2);
    }

    public static Mac c(String str) {
        int i2 = 0;
        while (i2 < 2) {
            try {
                Mac instance = Mac.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return null;
    }

    public static void e() {
        Process.killProcess(Process.myPid());
        aosr.a(1000, TimeUnit.MILLISECONDS);
    }

    public static boolean f(Context context) {
        String[] systemSharedLibraryNames = context.getPackageManager().getSystemSharedLibraryNames();
        if (systemSharedLibraryNames == null) {
            return false;
        }
        for (String equalsIgnoreCase : systemSharedLibraryNames) {
            if ("com.google.android.pano.v1".equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static MessageDigest b(String str) {
        return jhh.a(str);
    }

    public static void c(Context context, String str) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != a && !hxz.a(context, callingUid, str)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
        }
    }

    public static boolean b() {
        return Binder.getCallingUid() == a;
    }

    public static byte[] f(Context context, String str) {
        return jhh.a(context, str, "SHA1");
    }

    public static boolean c() {
        Boolean bool = h;
        if (bool != null) {
            return bool.booleanValue();
        }
        String d2 = d();
        boolean z = true;
        if (!"com.google.android.gms.persistent".equals(d2) && !"com.google.process.gapps".equals(d2) && !"com.google.android.gms.location".equals(d2)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        h = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean c(Context context) {
        return h(context).getPhoneType() != 0;
    }

    @Deprecated
    public static byte[] c(Context context, String str, String str2) {
        return jhh.a(context, str, str2);
    }

    public static PendingIntent a(Context context, Intent intent, int i2) {
        return PendingIntent.getActivity(context, d.incrementAndGet(), intent, i2);
    }

    public static Intent a(Intent intent) {
        return intent.setPackage("com.google.android.gms");
    }

    public static avrb a(Context context, boolean z, String str, int i2, Integer num, jik jik, anoc anoc) {
        aucf aucf = (aucf) avrb.C.o();
        if (z) {
            long a2 = a(context);
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb = (avrb) aucf.b;
            avrb.a |= 1;
            avrb.b = a2;
        }
        if (str != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb2 = (avrb) aucf.b;
            str.getClass();
            avrb2.a |= 2;
            avrb2.c = str;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb3 = (avrb) aucf.b;
        avrb3.a |= 8;
        avrb3.d = i3;
        String str2 = Build.MODEL;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb4 = (avrb) aucf.b;
        str2.getClass();
        avrb4.a |= 16;
        avrb4.e = str2;
        String str3 = Build.PRODUCT;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb5 = (avrb) aucf.b;
        str3.getClass();
        avrb5.a |= 32;
        avrb5.f = str3;
        String str4 = Build.HARDWARE;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb6 = (avrb) aucf.b;
        str4.getClass();
        avrb6.a |= 64;
        avrb6.g = str4;
        String str5 = Build.DEVICE;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb7 = (avrb) aucf.b;
        str5.getClass();
        avrb7.a |= 128;
        avrb7.h = str5;
        String str6 = Build.ID;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb8 = (avrb) aucf.b;
        str6.getClass();
        avrb8.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        avrb8.i = str6;
        String simOperator = h(context).getSimOperator();
        if (simOperator != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb9 = (avrb) aucf.b;
            simOperator.getClass();
            avrb9.a |= 1024;
            avrb9.k = simOperator;
        }
        if (Build.VERSION.SDK_INT >= 28 && awyg.a.a().e()) {
            int simCarrierId = h(context).getSimCarrierId();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb10 = (avrb) aucf.b;
            avrb10.a |= 268435456;
            avrb10.B = simCarrierId;
        }
        String str7 = Build.MANUFACTURER;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb11 = (avrb) aucf.b;
        str7.getClass();
        avrb11.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        avrb11.o = str7;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb12 = (avrb) aucf.b;
        language.getClass();
        avrb12.a |= 2048;
        avrb12.l = language;
        String country = locale.getCountry();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb13 = (avrb) aucf.b;
        country.getClass();
        avrb13.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        avrb13.n = country;
        String num2 = Integer.toString(i2);
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb14 = (avrb) aucf.b;
        num2.getClass();
        avrb14.a |= 512;
        avrb14.j = num2;
        String str8 = Build.BRAND;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb15 = (avrb) aucf.b;
        str8.getClass();
        avrb15.a |= 16384;
        avrb15.p = str8;
        String str9 = Build.BOARD;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb16 = (avrb) aucf.b;
        str9.getClass();
        avrb16.a |= 32768;
        avrb16.q = str9;
        String str10 = Build.FINGERPRINT;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb17 = (avrb) aucf.b;
        str10.getClass();
        avrb17.a |= 131072;
        avrb17.s = str10;
        String str11 = Build.TYPE;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb18 = (avrb) aucf.b;
        str11.getClass();
        avrb18.a |= 33554432;
        avrb18.z = str11;
        if (num != null) {
            int intValue = num.intValue();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb19 = (avrb) aucf.b;
            avrb19.a |= 262144;
            avrb19.t = intValue;
        }
        if (awyg.a.a().f() && jlo.l() != null) {
            aedz l = jlo.l();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb20 = (avrb) aucf.b;
            l.getClass();
            avrb20.u = l;
            avrb20.a |= 524288;
        }
        if (jik != null) {
            aucf.a(avqo.b, jik.a);
        }
        if (anoc != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb21 = (avrb) aucf.b;
            anoc.getClass();
            avrb21.y = anoc;
            avrb21.a |= 16777216;
        }
        if (jix.b(context)) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb22 = (avrb) aucf.b;
            avrb22.w = 2;
            avrb22.a |= 4194304;
        } else if (jix.a(context)) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb23 = (avrb) aucf.b;
            int i4 = avrb23.a | 1048576;
            avrb23.a = i4;
            avrb23.v = true;
            avrb23.w = 1;
            avrb23.a = i4 | 4194304;
        }
        String radioVersion = Build.getRadioVersion();
        if (radioVersion != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb24 = (avrb) aucf.b;
            radioVersion.getClass();
            avrb24.a |= 65536;
            avrb24.r = radioVersion;
        }
        jix.i(context);
        jix.g(context);
        if (jix.e(context)) {
            aucd o = avrc.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avrc avrc = (avrc) o.b;
            avrc.a |= 4;
            avrc.b = true;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb25 = (avrb) aucf.b;
            avrc avrc2 = (avrc) o.i();
            avrc2.getClass();
            avrb25.x = avrc2;
            avrb25.a |= 8388608;
        }
        return (avrb) aucf.i();
    }

    public static String a(android.app.Activity activity) {
        return jni.b(activity).a(activity);
    }

    public static String a(Context context, String str) {
        return jni.b(context).b(str, 0).versionName;
    }

    public static String a(Context context, String str, String str2) {
        Bundle bundle;
        try {
            ApplicationInfo a2 = jni.b(context).a(str, 128);
            if (a2 == null || (bundle = a2.metaData) == null) {
                return null;
            }
            return bundle.getString(str2);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("AndroidUtils", "Caller attempted to insert app data for non-existent package.", e2);
            return "";
        }
    }

    public static String a(PackageInfo packageInfo) {
        return a(packageInfo, "SHA1");
    }

    public static String a(PackageInfo packageInfo, String str) {
        byte[] a2 = jhh.a(packageInfo, str);
        if (a2 != null) {
            return jjp.d(a2);
        }
        return null;
    }

    public static String a(Activity activity) {
        return a(activity.getContainerActivity());
    }

    public static void a(Context context, int i2, String str, int i3) {
        if (i2 != -1) {
            jis.a(context, str, jkt.a(i2), i3, (Throwable) null);
            Process.killProcess(i2);
        }
    }

    public static void a(Context context, ComponentName componentName) {
        context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
    }

    @Deprecated
    public static void a(Context context, Class cls) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), 2, 1);
    }

    public static void a(Context context, String str, boolean z) {
        int i2;
        if (!z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, str), i2, 1);
    }

    public static void a(AsyncTask asyncTask, Object... objArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
    }

    public static void a(RemoteException remoteException) {
        if (!(remoteException instanceof TransactionTooLargeException)) {
            throw remoteException;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (jhg.class) {
            if (g == null) {
                boolean z = true;
                if (!"1".equals(jli.a("ro.kernel.qemu", "0")) && !Build.HARDWARE.contains("ranchu")) {
                    z = false;
                }
                g = Boolean.valueOf(z);
            }
            booleanValue = g.booleanValue();
        }
        return booleanValue;
    }

    public static boolean a(Context context, Intent intent) {
        ActivityInfo activityInfo;
        ApplicationInfo applicationInfo;
        for (ResolveInfo next : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            if (next.priority >= 0 && (activityInfo = next.activityInfo) != null && (applicationInfo = activityInfo.applicationInfo) != null && applicationInfo.enabled) {
                return true;
            }
        }
        return false;
    }

    public static byte[] a(String str) {
        int i2 = 1;
        int length = (str.length() + 1) / 2;
        byte[] bArr = new byte[length];
        int i3 = 0;
        if ((str.length() & 1) != 0) {
            bArr[0] = (byte) a(str.charAt(0));
            i3 = 1;
        } else {
            i2 = 0;
        }
        while (i2 < length) {
            bArr[i2] = (byte) ((a(str.charAt(i3)) << 4) | a(str.charAt(i3 + 1)));
            i2++;
            i3 += 2;
        }
        return bArr;
    }

    public static byte[] a(String str, String str2) {
        if (str != null) {
            return a(str.getBytes(Charset.forName("UTF-8")), str2);
        }
        return new byte[0];
    }

    public static byte[] a(byte[] bArr, String str) {
        if (bArr == null) {
            return new byte[0];
        }
        MessageDigest a2 = jhh.a(str);
        if (a2 != null) {
            return a2.digest(bArr);
        }
        return null;
    }
}
