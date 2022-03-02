package defpackage;

import android.app.UiModeManager;
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
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: qnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qnt {
    private static final QuerySpecification a;

    static {
        dti dti = new dti();
        dti.b();
        dti.d();
        a = dti.a();
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
            qoi.c("Resources not found for %s", applicationInfo.packageName);
            return null;
        } catch (Resources.NotFoundException e2) {
            qoi.c("Resource not found: %s in %s", Integer.valueOf(i), applicationInfo.packageName);
            return null;
        }
    }

    public static amzy b(PackageManager packageManager) {
        return b(packageManager, (String) null);
    }

    public static amzy b(PackageManager packageManager, String str) {
        qnj qnj;
        PackageInfo packageInfo;
        String str2;
        Uri a2;
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory(a());
        intent.setPackage(str);
        try {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            try {
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                amzt amzt = new amzt();
                for (ResolveInfo next : queryIntentActivities) {
                    ComponentName componentName = new ComponentName(next.activityInfo.applicationInfo.packageName, next.activityInfo.name);
                    Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent2.addCategory(a());
                    intent2.setComponent(componentName);
                    try {
                        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent2, 0);
                        if (!queryIntentActivities2.isEmpty()) {
                            ResolveInfo resolveInfo = queryIntentActivities2.get(0);
                            Iterator<PackageInfo> it = installedPackages.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    packageInfo = null;
                                    break;
                                }
                                packageInfo = it.next();
                                if (packageInfo.packageName.equals(componentName.getPackageName())) {
                                    break;
                                }
                            }
                            if (packageInfo != null) {
                                String charSequence = resolveInfo.loadLabel(packageManager).toString();
                                if (TextUtils.isEmpty(charSequence)) {
                                    charSequence = componentName.getClassName();
                                }
                                qni qni = new qni();
                                qni.a = charSequence;
                                qni.c = componentName;
                                ActivityInfo activityInfo = resolveInfo.activityInfo;
                                int iconResource = activityInfo.getIconResource();
                                if (iconResource == 0 || (a2 = a(packageManager, activityInfo.applicationInfo, iconResource)) == null) {
                                    str2 = null;
                                } else {
                                    str2 = a2.toString();
                                }
                                qni.b = amrk.b(str2);
                                qni.d = a(componentName);
                                long j = packageInfo.firstInstallTime;
                                qni.e = Long.valueOf(packageInfo.lastUpdateTime);
                                qnj = new qnj(qni);
                                if (qnj != null && qnj.a()) {
                                    amzt.c(qnj);
                                }
                            }
                        }
                        qnj = null;
                    } catch (Exception e) {
                        qoi.b("PackageManager.queryIntentActivities threw an exception %s for intent %s", amrk.b(e.getMessage()), intent2);
                        qnj = null;
                    }
                    amzt.c(qnj);
                }
                return amzt.a();
            } catch (RuntimeException e2) {
                qoi.b(e2, "PackageManager.queryIntentActivities threw an exception", new Object[0]);
                qoh.a().a(30);
                return null;
            }
        } catch (RuntimeException e3) {
            qoi.b(e3, "PackageManager.queryIntentActivities threw an exception", new Object[0]);
            qoh.a().a(30);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    static String a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        int aa = (int) axvz.a.a().aa();
        synchronized (qnv.a) {
            if (qnv.b != aa) {
                if (aa == 1) {
                    qnv.c = true;
                } else if (aa == 2) {
                    qnv.c = ((UiModeManager) ihs.b().getSystemService("uimode")).getCurrentModeType() == 4;
                } else if (aa == 3) {
                    try {
                        ihs.b().getPackageManager().getPackageInfo("com.google.android.katniss", 0);
                        qnv.c = true;
                    } catch (PackageManager.NameNotFoundException e) {
                        qnv.c = false;
                    }
                } else if (aa != 4) {
                    try {
                        qnv.c = false;
                    } catch (Exception e2) {
                        try {
                            qnv.c = false;
                            qoi.b(e2, "Failure resolving TV device", new Object[0]);
                            qnv.b = aa;
                            Object[] objArr = new Object[2];
                            if (!qnv.c) {
                                str2 = "regular";
                            } else {
                                str2 = "TV";
                            }
                            objArr[0] = str2;
                            objArr[1] = Integer.valueOf(qnv.b);
                            qoi.a("Using %s flags by method %d", objArr);
                        } catch (Throwable th) {
                            qnv.b = aa;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = !qnv.c ? "regular" : "TV";
                            objArr2[1] = Integer.valueOf(qnv.b);
                            qoi.a("Using %s flags by method %d", objArr2);
                            throw th;
                        }
                    }
                } else {
                    PackageManager packageManager = ihs.b().getPackageManager();
                    qnv.c = packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback");
                }
                qnv.b = aa;
                Object[] objArr3 = new Object[2];
                if (!qnv.c) {
                    str = "regular";
                } else {
                    str = "TV";
                }
                objArr3[0] = str;
                objArr3[1] = Integer.valueOf(qnv.b);
                qoi.a("Using %s flags by method %d", objArr3);
            }
        }
        return !qnv.c ? "android.intent.category.LAUNCHER" : "android.intent.category.LEANBACK_LAUNCHER";
    }

    public static String a(ComponentName componentName) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        intent.setPackage(componentName.getPackageName());
        intent.addCategory(a());
        if (axvz.a.a().ab()) {
            return intent.toUri(1);
        }
        String uri = intent.toUri(2);
        if (uri.startsWith("android-app")) {
            return uri;
        }
        return String.format("android-app://%s#Intent;category=%s;launchFlags=0x10000000;component=%s;end", new Object[]{componentName.getPackageName(), a(), componentName.flattenToShortString()});
    }

    public static String a(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                return null;
            }
            return resolveActivity.activityInfo.packageName;
        } catch (SecurityException e) {
            qoi.b("Failed to get default launcher package name. Exception: %s", e.getMessage());
            return null;
        }
    }

    public static List a(amzy amzy) {
        ArrayList arrayList = new ArrayList();
        if (amzy != null) {
            anhk i = amzy.listIterator();
            while (i.hasNext()) {
                qnj qnj = (qnj) i.next();
                if (qnj.b()) {
                    arrayList.add(qnj.c.flattenToString());
                }
            }
        }
        return arrayList;
    }

    public static Set a(aalw aalw) {
        String str = "";
        HashSet a2 = angm.a(100);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                SearchResults searchResults = (SearchResults) acws.a(aalw.a("", "com.google.android.gms", new String[]{"internal.3p:MobileApplication"}, i, 100, a), axvz.a.a().v(), TimeUnit.SECONDS);
                if (searchResults == null || searchResults.a()) {
                    qoh.a().a(28);
                    new Object[1][0] = searchResults != null ? searchResults.a : str;
                    return null;
                }
                dua b = searchResults.iterator();
                while (b.hasNext()) {
                    a2.add(b.next().a());
                }
                z = searchResults.g < 100;
                i += 100;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                if (e.getCause() instanceof ibr) {
                    Object[] objArr = new Object[1];
                    if (e.getCause().getMessage() != null) {
                        str = e.getCause().getMessage();
                    }
                    objArr[0] = str;
                    qoi.c("Query failed: %s", objArr);
                }
                qoh.a().a(50);
                return null;
            }
        }
        return a2;
    }

    public static boolean a(PackageManager packageManager, String str) {
        if (str == null) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            qoi.b(e, str.length() == 0 ? new String("Could not get app info for ") : "Could not get app info for ".concat(str), new Object[0]);
            return false;
        }
    }
}
