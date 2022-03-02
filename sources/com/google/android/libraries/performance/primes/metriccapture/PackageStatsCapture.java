package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PackageStatsCapture {
    static final PackageStatsInvocation[] GETTER_INVOCATIONS = {new PackageStatsInvocation("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new PackageStatsInvocation("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new PackageStatsInvocation("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};
    public static final anhq a = anhq.a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture");

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    final class PackageStatsCallback extends IPackageStatsObserver.Stub {
        public final Semaphore a = new Semaphore(1);
        public volatile PackageStats b;

        public final PackageStats a(long j) {
            if (this.a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                return this.b;
            }
            ((anhn) ((anhn) PackageStatsCapture.a.c()).a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture$PackageStatsCallback", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timeout while waiting for PackageStats callback");
            return null;
        }

        public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (!z) {
                ((anhn) ((anhn) PackageStatsCapture.a.c()).a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 51, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failure getting PackageStats");
            } else {
                anhq anhq = PackageStatsCapture.a;
                this.b = packageStats;
            }
            this.a.release();
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    final class PackageStatsInvocation {
        private final String a;
        private final Class[] b;

        public PackageStatsInvocation(String str, Class[] clsArr) {
            this.a = str;
            this.b = clsArr;
        }

        public boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            Object[] objArr;
            try {
                Method method = packageManager.getClass().getMethod(this.a, this.b);
                Class<IPackageStatsObserver>[] clsArr = this.b;
                int length = clsArr.length;
                if (length == 2) {
                    if (clsArr[0] == String.class && clsArr[1] == IPackageStatsObserver.class) {
                        objArr = new Object[]{str, iPackageStatsObserver};
                    }
                    throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
                }
                if (length == 3 && clsArr[0] == String.class && clsArr[1] == Integer.TYPE && this.b[2] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
                method.invoke(packageManager, objArr);
                return true;
            } catch (NoSuchMethodException e) {
                anhq anhq = PackageStatsCapture.a;
                return false;
            } catch (Error | Exception e2) {
                ((anhn) ((anhn) PackageStatsCapture.a.d()).a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture$PackageStatsInvocation", "invoke", 116, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s for %s (%s) invocation", (Object) e2.getClass().getSimpleName(), (Object) this.a, (Object) Arrays.asList(this.b));
                return false;
            }
        }
    }

    private PackageStatsCapture() {
    }

    private static boolean a() {
        try {
            return !Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", new Class[]{PackageStats.class, Boolean.TYPE}).getModifiers());
        } catch (Error | Exception e) {
            return false;
        }
    }

    public static PackageStats getPackageStats(Context context) {
        agzj.c();
        if (Build.VERSION.SDK_INT >= 26) {
            return agjr.a(context);
        }
        if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) == 0 || context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") == 0) {
            return getPackageStatsUsingInternalAPI(context, 15000, GETTER_INVOCATIONS);
        }
        ((anhn) ((anhn) a.c()).a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture", "getPackageStats", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s required", (Object) "android.permission.GET_PACKAGE_SIZE");
        return null;
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        if (!a()) {
            ((anhn) ((anhn) a.c()).a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture", "getPackageStatsUsingInternalAPI", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Callback implementation stripped by proguard.");
            return null;
        }
        PackageStatsCallback packageStatsCallback = new PackageStatsCallback();
        try {
            packageStatsCallback.a.acquire();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            int myUid = Process.myUid();
            for (PackageStatsInvocation invoke : packageStatsInvocationArr) {
                if (invoke.invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                    ((anhn) ((anhn) a.d()).a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture", "getPackageStatsUsingInternalAPI", 166, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Success invoking PackageStats capture.");
                    if (packageStatsCallback.a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                        return packageStatsCallback.b;
                    }
                    ((anhn) ((anhn) a.c()).a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture$PackageStatsCallback", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timeout while waiting for PackageStats callback");
                    return null;
                }
            }
            ((anhn) ((anhn) a.c()).a("com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture", "getPackageStatsUsingInternalAPI", 172, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't capture PackageStats.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return null;
    }
}
