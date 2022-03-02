package defpackage;

import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.List;

/* renamed from: yip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class yip implements Runnable {
    private final yiu a;

    public yip(yiu yiu) {
        this.a = yiu;
    }

    public final void run() {
        yiu yiu = this.a;
        List<PackageInfo> installedPackages = yiu.c.getPackageManager().getInstalledPackages(0);
        HashSet a2 = angm.a(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            a2.add(packageInfo.packageName);
        }
        SQLiteDatabase writableDatabase = yiu.d.getWritableDatabase();
        Cursor query = writableDatabase.query("Packages", new String[]{"packageName", "androidPackageName"}, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                if (!a2.contains(query.getString(1)) || azaf.a.a().x().a.contains(string)) {
                    yih.a(writableDatabase, string);
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (query != null) {
            query.close();
            return;
        }
        return;
        throw th;
    }
}
