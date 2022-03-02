package com.google.android.gms.accountsettings.mg.poc.model.repository;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class RepositoryDatabase extends eb {
    static final ej f = new ctv();
    static final ej g = new ctw();
    static final ej h = new ctx();
    static final ej i = new cty();
    static final ej j = new ctz();

    public abstract cub k();

    public abstract csr l();

    public abstract ctj m();

    public static RepositoryDatabase a(Context context) {
        int i2;
        int i3;
        Executor executor;
        if ("account_settings_repository.db".trim().length() != 0) {
            dz dzVar = new dz(context, RepositoryDatabase.class, "account_settings_repository.db");
            boolean z = false;
            ej[] ejVarArr = {f, g, h, i, j};
            if (dzVar.i == null) {
                dzVar.i = new HashSet();
                i2 = 0;
            } else {
                i2 = 0;
            }
            while (i2 < 5) {
                ej ejVar = ejVarArr[i2];
                dzVar.i.add(Integer.valueOf(ejVar.a));
                dzVar.i.add(Integer.valueOf(ejVar.b));
                i2++;
            }
            ea eaVar = dzVar.h;
            for (int i4 = 0; i4 < 5; i4++) {
                ej ejVar2 = ejVarArr[i4];
                int i5 = ejVar2.a;
                int i6 = ejVar2.b;
                HashMap hashMap = eaVar.a;
                Integer valueOf = Integer.valueOf(i5);
                TreeMap treeMap = (TreeMap) hashMap.get(valueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    eaVar.a.put(valueOf, treeMap);
                }
                Integer valueOf2 = Integer.valueOf(i6);
                ej ejVar3 = (ej) treeMap.get(valueOf2);
                if (ejVar3 != null) {
                    Log.w("ROOM", "Overriding migration " + ejVar3 + " with " + ejVar2);
                }
                treeMap.put(valueOf2, ejVar2);
            }
            dzVar.f = false;
            dzVar.g = true;
            if (dzVar.c != null) {
                Executor executor2 = dzVar.d;
                if (executor2 == null && dzVar.e == null) {
                    Executor executor3 = c.c;
                    dzVar.e = executor3;
                    dzVar.d = executor3;
                } else if (executor2 != null && dzVar.e == null) {
                    dzVar.e = executor2;
                } else if (executor2 == null && (executor = dzVar.e) != null) {
                    dzVar.d = executor;
                }
                if (dzVar.j == null) {
                    dzVar.j = new dm();
                }
                Context context2 = dzVar.c;
                String str = dzVar.b;
                ea eaVar2 = dzVar.h;
                int i7 = Build.VERSION.SDK_INT;
                ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                if (activityManager != null) {
                    int i8 = Build.VERSION.SDK_INT;
                    i3 = activityManager.isLowRamDevice() ? 2 : 3;
                } else {
                    i3 = 2;
                }
                dp dpVar = new dp(context2, str, eaVar2, i3, dzVar.d, dzVar.e, dzVar.f, dzVar.g);
                eb ebVar = (eb) dy.a(dzVar.a, "_Impl");
                ebVar.b = ebVar.a(dpVar);
                de deVar = ebVar.b;
                if (!(deVar instanceof ef)) {
                    int i9 = Build.VERSION.SDK_INT;
                    if (dpVar.h == 3) {
                        z = true;
                    }
                    ebVar.b.a(z);
                    ebVar.a = dpVar.d;
                    new ei(dpVar.e);
                    ebVar.d = z;
                    return (RepositoryDatabase) ebVar;
                }
                ef efVar = (ef) deVar;
                throw null;
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
