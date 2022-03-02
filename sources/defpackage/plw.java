package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: plw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plw {
    private static final QuerySpecification a;
    private static final String[] b = {"apps"};

    static {
        dti dti = new dti();
        dti.b();
        dti.a(new Section("package_name"));
        dti.a(new Section("class_name"));
        a = dti.a();
    }

    public static amzy a(PackageManager packageManager) {
        return b(packageManager, (String) null);
    }

    public static amzy b(PackageManager packageManager, String str) {
        String str2;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory(a());
        intent.setPackage(str);
        try {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            amzt amzt = new amzt();
            for (ResolveInfo next : queryIntentActivities) {
                ComponentName componentName = new ComponentName(next.activityInfo.applicationInfo.packageName, next.activityInfo.name);
                plu a2 = a(packageManager, componentName);
                if (!(a2 == null || (str2 = a2.a) == null)) {
                    amzt.c(new plv(componentName, str2));
                }
            }
            return amzt.a();
        } catch (RuntimeException e) {
            pnz.a((Throwable) e, "PackageManager.queryIntentActivities threw an exception", new Object[0]);
            return amzy.h();
        }
    }

    private static Uri a(PackageManager packageManager, ApplicationInfo applicationInfo, int i) {
        try {
            Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
            String str = applicationInfo.packageName;
            String resourcePackageName = resourcesForApplication.getResourcePackageName(i);
            String resourceTypeName = resourcesForApplication.getResourceTypeName(i);
            String resourceEntryName = resourcesForApplication.getResourceEntryName(i);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("android.resource");
            builder.encodedAuthority(str);
            builder.appendEncodedPath(resourceTypeName);
            if (!str.equals(resourcePackageName)) {
                StringBuilder sb = new StringBuilder(String.valueOf(resourcePackageName).length() + 1 + String.valueOf(resourceEntryName).length());
                sb.append(resourcePackageName);
                sb.append(":");
                sb.append(resourceEntryName);
                builder.appendEncodedPath(sb.toString());
            } else {
                builder.appendEncodedPath(resourceEntryName);
            }
            return builder.build();
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(applicationInfo.packageName);
            pnz.b(valueOf.length() == 0 ? new String("Resources not found for ") : "Resources not found for ".concat(valueOf));
            return null;
        } catch (Resources.NotFoundException e2) {
            String str2 = applicationInfo.packageName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 35);
            sb2.append("Resource not found: ");
            sb2.append(i);
            sb2.append(" in ");
            sb2.append(str2);
            pnz.b(sb2.toString());
            return null;
        }
    }

    public static String b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                return null;
            }
            return resolveActivity.activityInfo.packageName;
        } catch (SecurityException e) {
            pnz.e("Failed to get default launcher package name. Exception: %s", e);
            return null;
        }
    }

    static String a() {
        int i = Build.VERSION.SDK_INT;
        return !pxb.a() ? "android.intent.category.LAUNCHER" : "android.intent.category.LEANBACK_LAUNCHER";
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.lang.Iterable r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.size()
            r2 = 0
        L_0x000a:
            if (r2 >= r1) goto L_0x001a
            java.lang.Object r3 = r4.get(r2)
            plv r3 = (defpackage.plv) r3
            java.lang.String r3 = r3.a
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x000a
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plw.a(java.lang.Iterable):java.util.List");
    }

    public static Set a(aalw aalw, oyq oyq) {
        HashSet hashSet = new HashSet(100);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                SearchResults searchResults = (SearchResults) acws.a(aalw.a("", "com.google.android.gms", b, i, 100, a), 5, TimeUnit.SECONDS);
                dua b2 = searchResults.iterator();
                while (b2.hasNext()) {
                    dtz a2 = b2.next();
                    hashSet.add(new plv(new ComponentName(a2.b("package_name"), a2.b("class_name")), a2.b("name")));
                }
                z = searchResults.g < 100;
                i += 100;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                oyq.b(9002);
                return null;
            }
        }
        return hashSet;
    }

    public static plu a(PackageManager packageManager, ComponentName componentName) {
        Uri a2;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory(a());
        intent.setComponent(componentName);
        String str = null;
        try {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (!queryIntentActivities.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentActivities.get(0);
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                if (!installedPackages.isEmpty()) {
                    PackageInfo packageInfo = installedPackages.get(0);
                    plu plu = new plu();
                    plu.a = resolveInfo.loadLabel(packageManager).toString();
                    plu.c = componentName;
                    if (TextUtils.isEmpty(plu.a)) {
                        plu.a = componentName.getClassName();
                    }
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    int iconResource = activityInfo.getIconResource();
                    if (!(iconResource == 0 || (a2 = a(packageManager, activityInfo.applicationInfo, iconResource)) == null)) {
                        str = a2.toString();
                    }
                    if (str == null) {
                        str = "android.resource://android/drawable/sym_def_app_icon";
                    }
                    plu.b = str;
                    plu.d = packageInfo.firstInstallTime;
                    plu.f = packageInfo.lastUpdateTime;
                    plu.e = plo.a(componentName);
                    return plu;
                }
            }
            return null;
        } catch (Exception e) {
            if (Log.isLoggable("IcingInternalCorpora", 5)) {
                Log.w("IcingInternalCorpora", pnz.a("PackageManager.queryIntentActivities threw an exception %s for intent %s", e, intent));
            }
            return null;
        }
    }

    public static boolean a(PackageManager packageManager, String str) {
        if (str == null) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            pnz.a((Throwable) e, "Could not get app info for %s", str);
            return false;
        }
    }
}
