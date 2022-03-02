package com.google.android.gms.common;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GoogleCertificatesImpl extends iua {
    private static Context a() {
        Context context = hdh.a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Missing DynamiteApplicationContext.");
    }

    private static final boolean b(hyd hyd) {
        return hyd.a(hxb.a());
    }

    private static final boolean c(hyd hyd) {
        if (!hyd.a.equals("com.google.android.instantapps.supervisor")) {
            return false;
        }
        agvx.b(a());
        try {
            return awzo.a.a().b();
        } catch (SecurityException e) {
            Log.w("GoogleCertificatesImpl", "Flags cannot be read", e);
            return false;
        }
    }

    private static final boolean d(hyd hyd) {
        if (!c(hyd)) {
            return a(hyd);
        }
        return false;
    }

    @Deprecated
    public mby getGoogleCertificates() {
        return mbz.a((Object) (hxm[]) a(true).toArray(new hxm[0]));
    }

    @Deprecated
    public mby getGoogleReleaseCertificates() {
        return mbz.a((Object) (hxm[]) a(false).toArray(new hxm[0]));
    }

    public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, mby mby) {
        String str;
        Notification.Builder builder;
        if (googleCertificatesQuery.b == null) {
            return false;
        }
        ApplicationInfo applicationInfo = null;
        hyb hyb = mby != null ? new hyb((PackageManager) mbz.a(mby)) : null;
        String str2 = googleCertificatesQuery.a;
        hyd hyd = new hyd(str2, googleCertificatesQuery.b);
        if (a(hyd, hyb)) {
            return true;
        }
        if (!d(hyd)) {
            return false;
        }
        if (googleCertificatesQuery.c) {
            return true;
        }
        if (!googleCertificatesQuery.d) {
            Context a = a();
            if (hxe.a(a)) {
                agvx.b(a);
                try {
                    if (awzo.a.a().a()) {
                        synchronized (hxe.c) {
                            if (hxe.b != null) {
                                if (!hxe.b.contains(str2)) {
                                }
                            }
                            PackageManager packageManager = a.getPackageManager();
                            try {
                                applicationInfo = packageManager.getApplicationInfo(str2, 0);
                            } catch (PackageManager.NameNotFoundException e) {
                            }
                            if (applicationInfo != null) {
                                str = (String) packageManager.getApplicationLabel(applicationInfo);
                            } else {
                                str = "(could not get application name)";
                            }
                            String format = String.format("Application \"%s\" (%s) is an unverified version of a Google application, but is considered trusted by Google Play services because an account on your device has opted into accepting debug certificates. If you do not wish to run unverified apps, please uninstall immediately.", new Object[]{str, str2});
                            NotificationManager notificationManager = (NotificationManager) a.getSystemService("notification");
                            if (jkr.e()) {
                                notificationManager.createNotificationChannel(new NotificationChannel("googlecertificates", "Security warning", 2));
                            }
                            if (!jkr.e()) {
                                builder = new Notification.Builder(a);
                            } else {
                                builder = new Notification.Builder(a, "googlecertificates");
                            }
                            Notification.Builder smallIcon = builder.setContentText(format).setSmallIcon(R.drawable.common_ic_googleplayservices);
                            smallIcon.setStyle(new Notification.BigTextStyle().bigText(format));
                            int i = Build.VERSION.SDK_INT;
                            smallIcon.setLocalOnly(true);
                            if (!jkr.e()) {
                                smallIcon.setPriority(-1);
                            }
                            Notification build = smallIcon.build();
                            String valueOf = String.valueOf(str2);
                            notificationManager.notify(valueOf.length() == 0 ? new String("GMS_TEST_KEYS_WARNING_NOTIFICATION_TAG") : "GMS_TEST_KEYS_WARNING_NOTIFICATION_TAG".concat(valueOf), 1, build);
                            if (hxe.b == null) {
                                hxe.b = new ob();
                            }
                            hxe.b.add(str2);
                        }
                        Log.w("GoogleCertificatesImpl", String.valueOf(str2).concat(" is signed with test keys"));
                        return true;
                    }
                } catch (SecurityException e2) {
                    Log.w("DebugCertificatesHelper", "Flags cannot be read", e2);
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean isGoogleReleaseSigned(String str, mby mby) {
        return a(new hyd(str, (hxm) new hxn((byte[]) mbz.a(mby))), (hyb) null);
    }

    @Deprecated
    public boolean isGoogleSigned(String str, mby mby) {
        hyd hyd = new hyd(str, (hxm) new hxn((byte[]) mbz.a(mby)));
        return a(hyd, (hyb) null) || d(hyd);
    }

    private static final Set a(boolean z) {
        Log.w("GoogleCertificatesImpl", "App has 2016 GMS Core SDK; yielding incomplete certs");
        HashSet hashSet = new HashSet();
        Context a = a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (PackageInfo next : a.getPackageManager().getInstalledPackages(64)) {
            String str = next.packageName;
            byte[] bArr = null;
            if (next.signatures != null && next.signatures.length == 1) {
                bArr = next.signatures[0].toByteArray();
            }
            if (bArr != null) {
                hyd hyd = new hyd(str, bArr);
                if ((z && a(hyd)) || b(hyd)) {
                    hashSet.add(new hxn(bArr));
                }
            }
        }
        if (Log.isLoggable("GoogleCertificatesImpl", 4)) {
            Log.i("GoogleCertificatesImpl", String.format("Scraped %d debug certs in %d ms", new Object[]{Integer.valueOf(hashSet.size()), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)}));
        }
        return hashSet;
    }

    private static final boolean a(hyd hyd) {
        hxc hxc = hxb.a;
        if (hyd.d == null) {
            hyd.d = hyd.a(hyd.c, "*");
        }
        if (!hxc.a(hyd.d)) {
            return hyd.a(hxb.b());
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final boolean a(defpackage.hyd r5, defpackage.hyb r6) {
        /*
            java.lang.String r0 = "PlatCertificateHelper"
            boolean r1 = c(r5)
            r2 = 0
            if (r1 != 0) goto L_0x005a
            boolean r1 = b(r5)
            r3 = 1
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = r5.a
            hxm r5 = r5.b
            if (r6 == 0) goto L_0x0057
            boolean r4 = r6.b
            if (r4 == 0) goto L_0x0057
            java.util.Set r4 = defpackage.hyb.a
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0057
            android.content.pm.PackageManager r6 = r6.c     // Catch:{ NameNotFoundException -> 0x003f }
            java.lang.String r1 = "android"
            r4 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x003f }
            android.content.pm.Signature[] r1 = r6.signatures     // Catch:{ NameNotFoundException -> 0x003f }
            int r1 = r1.length     // Catch:{ NameNotFoundException -> 0x003f }
            if (r1 != r3) goto L_0x0045
            hxn r1 = new hxn     // Catch:{ NameNotFoundException -> 0x003f }
            android.content.pm.Signature[] r6 = r6.signatures     // Catch:{ NameNotFoundException -> 0x003f }
            r6 = r6[r2]     // Catch:{ NameNotFoundException -> 0x003f }
            byte[] r6 = r6.toByteArray()     // Catch:{ NameNotFoundException -> 0x003f }
            r1.<init>(r6)     // Catch:{ NameNotFoundException -> 0x003f }
            goto L_0x004c
        L_0x003f:
            r6 = move-exception
            java.lang.String r1 = "Unexpected exception looking up android"
            android.util.Log.w(r0, r1, r6)
        L_0x0045:
            java.lang.String r6 = "Could not determine the platform key"
            android.util.Log.w(r0, r6)
            r1 = 0
        L_0x004c:
            if (r1 == 0) goto L_0x0056
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            return r3
        L_0x0056:
            goto L_0x0059
        L_0x0057:
            goto L_0x0059
        L_0x0058:
            r2 = 1
        L_0x0059:
            return r2
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleCertificatesImpl.a(hyd, hyb):boolean");
    }
}
