package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: esj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class esj {
    public static final fzh a = new esi();
    public final SharedPreferences b;
    private final jnh c;

    public esj(Context context) {
        jnh b2 = jni.b(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("auth.account.visibility.whitelist.prefs", 0);
        iva.a((Object) b2);
        this.c = b2;
        iva.a((Object) sharedPreferences);
        this.b = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public final long a(String str) {
        try {
            PackageInfo b2 = this.c.b(str, 0);
            if (b2 != null) {
                return b2.firstInstallTime;
            }
            throw new ekp("Invalid Info");
        } catch (PackageManager.NameNotFoundException e) {
            throw new ekp("Invalid package name.");
        }
    }

    public final boolean b(String str) {
        iva.a(str, (Object) "Package name must not be empty");
        long j = this.b.getLong(str, 0);
        if (j == 0 || j != a(str)) {
            return false;
        }
        return true;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry next : this.b.getAll().entrySet()) {
            String str = (String) next.getKey();
            try {
                if (!((Long) next.getValue()).equals(Long.valueOf(a(str)))) {
                    arrayList.add(str);
                } else {
                    arrayList2.add(str);
                }
            } catch (ekp e) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            SharedPreferences.Editor edit = this.b.edit();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                edit.remove((String) arrayList.get(i));
            }
            edit.commit();
        }
        return arrayList2;
    }
}
