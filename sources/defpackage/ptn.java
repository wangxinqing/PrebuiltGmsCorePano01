package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: ptn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ptn extends AsyncTask {
    /* access modifiers changed from: protected */
    public abstract Context a();

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ApplicationInfo applicationInfo;
        String str;
        Drawable drawable;
        CharSequence loadLabel;
        Void[] voidArr = (Void[]) objArr;
        acwa a = aafi.b(a()).a();
        ptm ptm = new ptm();
        try {
            ick ick = (ick) acws.a(a);
            int i = 0;
            ptm.a = 0;
            ptm.b = new ArrayList(ick.k().length);
            ptm.c = 0;
            GetStorageStatsCall$PackageStats[] k = ick.k();
            int length = k.length;
            int i2 = 0;
            while (i2 < length) {
                GetStorageStatsCall$PackageStats getStorageStatsCall$PackageStats = k[i2];
                List list = ptm.b;
                PackageManager packageManager = a().getPackageManager();
                String str2 = getStorageStatsCall$PackageStats.a;
                try {
                    applicationInfo = packageManager.getApplicationInfo(str2, i);
                } catch (PackageManager.NameNotFoundException e) {
                    oso.b("Application not found: %s. Cause: %s", (Object) str2, (Object) e.getMessage());
                    applicationInfo = null;
                }
                if (applicationInfo == null || (loadLabel = applicationInfo.loadLabel(packageManager)) == null) {
                    str = str2;
                } else {
                    str = loadLabel.toString();
                }
                String str3 = getStorageStatsCall$PackageStats.a;
                try {
                    drawable = packageManager.getApplicationIcon(str3);
                } catch (PackageManager.NameNotFoundException e2) {
                    oso.b("Application not found: %s. Cause: %s", (Object) str3, (Object) e2.getMessage());
                    drawable = null;
                }
                long j = getStorageStatsCall$PackageStats.b;
                long j2 = getStorageStatsCall$PackageStats.d;
                long j3 = j;
                pts pts = r11;
                pts pts2 = new pts(str2, str, drawable, j3);
                list.add(pts);
                ptm.c += getStorageStatsCall$PackageStats.d;
                i2++;
                k = k;
                i = 0;
            }
            ptm.c += ((GetStorageStatsCall$Response) ick.a).c;
            ptm.d = ick.l();
            ick.m();
        } catch (InterruptedException | ExecutionException e3) {
            if (e3.getCause() instanceof ibr) {
                ptm.a = ((ibr) e3.getCause()).a();
            } else {
                ptm.a = 8;
            }
        }
        return ptm;
    }
}
