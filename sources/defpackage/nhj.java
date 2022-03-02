package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nhj extends hed {
    public nhj() {
        super(false);
    }

    /* access modifiers changed from: protected */
    public final ngh a() {
        nhz nhz = nhz.a;
        Context applicationContext = getApplicationContext();
        iva.a((Object) applicationContext, (Object) "context");
        return nhz.b(applicationContext);
    }

    /* access modifiers changed from: protected */
    public final ngy b() {
        return nhz.a.a(getApplicationContext());
    }

    public abstract void c();

    /* access modifiers changed from: protected */
    public final void d(String str) {
        try {
            ngh a = a();
            ngz.c("FontsPackageChangeOp", "Remove all manifest dependencies for package [%s] on Disk.", str);
            a.a(str);
        } catch (Exception e) {
            ngz.a("FontsPackageChangeOp", (Throwable) e, "Error executing onPackageRemoved", new Object[0]);
            b().a(3, 23508, "com.google.android.gms.fonts.receiver");
        }
    }

    /* access modifiers changed from: protected */
    public final void e(String str) {
        a(str);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        String str2;
        List<FontMatchSpec> list;
        try {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                Bundle bundle = getApplicationContext().getPackageManager().getApplicationInfo(str, 128).metaData;
                if (bundle == null) {
                    ngz.b("FontsPackageChangeOp", "Package %s has no metadata", str);
                    str2 = null;
                } else {
                    str2 = bundle.getString("fontProviderRequests");
                }
            } catch (PackageManager.NameNotFoundException e) {
                Object[] objArr = {str};
                ngz ngz = ngz.a;
                Log.e("FontsPackageChangeOp", ngz.a("Failed to load meta-data for %s", objArr), e);
                ngz.a("E", "FontsPackageChangeOp", ngz.a("Failed to load meta-data for %s", objArr), (Throwable) e);
                str2 = null;
            }
            if (str2 == null) {
                list = Collections.emptyList();
            } else {
                list = nha.a(str2);
            }
            if (!list.isEmpty()) {
                c();
                nhf a = nhz.a.a();
                irk.a((Object) a, (Object) "fontServer");
                ngh a2 = a();
                ngz.c("FontsPackageChangeOp", "Setting manifest dependencies [%s] for package [%s] on Disk.", list, str);
                a2.a(str);
                ArrayList<FontMatchSpec> arrayList = new ArrayList<>();
                try {
                    sQLiteDatabase = a2.getWritableDatabase();
                    try {
                        for (FontMatchSpec fontMatchSpec : list) {
                            if (!a2.a(str, fontMatchSpec, sQLiteDatabase)) {
                                arrayList.add(fontMatchSpec);
                            }
                        }
                    } catch (SQLiteException e2) {
                    } catch (Throwable th) {
                        th = th;
                        a2.c(sQLiteDatabase);
                        throw th;
                    }
                } catch (SQLiteException e3) {
                } catch (Throwable th2) {
                    th = th2;
                    a2.c(sQLiteDatabase);
                    throw th;
                }
                a2.c(sQLiteDatabase);
                if (!arrayList.isEmpty()) {
                    ngz.c("FontsPackageChangeOp", "%d font(s) need to be downloaded; requesting from GMS core.", Integer.valueOf(arrayList.size()));
                    for (FontMatchSpec nhi : arrayList) {
                        new nhi(str, nhi, a2, a).run();
                    }
                }
            }
        } catch (Exception e4) {
            ngz.a("FontsPackageChangeOp", (Throwable) e4, "Error executing onPackageAdded", new Object[0]);
            b().a(3, 23507, "com.google.android.gms.fonts.receiver");
        }
    }
}
