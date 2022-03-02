package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: acsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsv extends acrl {
    private PackageManager h;

    public acsv() {
        super("Launcherstats", "activity", "LAUNCHER_STATS", false);
    }

    public final String[] a(long j, long j2) {
        return acrl.g;
    }

    /* access modifiers changed from: protected */
    public final avwc b(Context context, InputStream inputStream, long j, long j2, hph hph) {
        return a(context, inputStream, j, j2, hph, true);
    }

    public final long c() {
        return azor.a.a().b();
    }

    public final long d() {
        return 0;
    }

    public final boolean b() {
        return jkr.e() && azor.a.a().a();
    }

    public final File c(Context context, long j, long j2, hph hph) {
        String[] strArr;
        File fileStreamPath = context.getFileStreamPath(String.valueOf(this.a).concat(".tmp"));
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
        }
        PackageManager packageManager = context.getPackageManager();
        if (this.h == null) {
            this.h = packageManager;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        List<ResolveInfo> queryIntentActivities = this.h.queryIntentActivities(intent, 1048576);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            String str = "";
            String str2 = str;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                try {
                    ApplicationInfo applicationInfo = this.h.getApplicationInfo(next.activityInfo.packageName, 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || TextUtils.isEmpty(applicationInfo.metaData.getString("com.android.launcher3.launcher_dump_provider")))) {
                        str2 = next.activityInfo.packageName;
                        try {
                            str = applicationInfo.metaData.getString("com.android.launcher3.launcher_dump_provider");
                            break;
                        } catch (PackageManager.NameNotFoundException e) {
                            e = e;
                            Log.e(this.a, "Fail to get package info for Launcher", e);
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    e = e2;
                    Log.e(this.a, "Fail to get package info for Launcher", e);
                }
            }
            if (!str2.isEmpty() && !str.isEmpty()) {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
                sb.append(str2);
                sb.append("/");
                sb.append(str);
                strArr = new String[]{"provider", sb.toString(), "--proto"};
            } else {
                strArr = acrl.g;
            }
        } else {
            strArr = acrl.g;
        }
        if (strArr.length == 0) {
            hph.c("LauncherInvalidCommandFlag").a();
            return fileStreamPath;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileStreamPath);
            try {
                if (Debug.dumpService(this.f, fileOutputStream2.getFD(), strArr)) {
                    jjt.a((Closeable) fileOutputStream2);
                    return fileStreamPath;
                }
                Log.w(this.a, "Dumpsys failed.");
                throw new acrj(String.valueOf(this.a).concat(" dumpsys failed."));
            } catch (IOException | NullPointerException | SecurityException e3) {
                e = e3;
                fileOutputStream = fileOutputStream2;
                try {
                    hph.c("LauncherDumpsysException").a();
                    throw new acrj(e);
                } catch (Throwable th) {
                    th = th;
                    jjt.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                jjt.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (IOException | NullPointerException | SecurityException e4) {
            e = e4;
            hph.c("LauncherDumpsysException").a();
            throw new acrj(e);
        } catch (Throwable th3) {
            th = th3;
            jjt.a((Closeable) fileOutputStream);
            throw th;
        }
    }
}
