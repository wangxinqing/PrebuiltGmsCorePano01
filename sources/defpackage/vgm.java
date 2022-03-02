package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;

/* renamed from: vgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgm {
    private final Context a;
    private final arwa b;

    public vgm(Context context) {
        this.a = context;
        this.b = new arwa(context, (byte[]) null);
    }

    private static final boolean c(String str) {
        return "com.google.android.gms".equals(str) || "com.google.android.play.games".equals(str);
    }

    private final SharedPreferences d() {
        return this.a.getSharedPreferences("nearby_message_packages", 4);
    }

    private final SharedPreferences.Editor e() {
        return d().edit();
    }

    private final SharedPreferences f() {
        return this.a.getSharedPreferences("nearby_message_packages_popup", 4);
    }

    public final SharedPreferences.Editor a() {
        return f().edit();
    }

    public final SharedPreferences b() {
        return this.a.getSharedPreferences("nearby_message_packages_denied", 4);
    }

    public final void a(String str, boolean z) {
        int i;
        if (!c(str)) {
            e().putBoolean(str, z).commit();
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            arwa arwa = this.b;
            aucd o = auxa.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auxa auxa = (auxa) o.b;
            auxa.b = i - 1;
            auxa.a |= 1;
            auxa auxa2 = (auxa) o.i();
            auvz a2 = arwa.a(str, (String) null, 5);
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            auvz auvz = (auvz) aucd.b;
            auvz auvz2 = auvz.k;
            auxa2.getClass();
            auvz.f = auxa2;
            auvz.a |= 32;
            arwa.a((auvz) aucd.i(), true);
        }
    }

    public final boolean b(String str) {
        c();
        if (!c(str)) {
            return d().getBoolean(str, false);
        }
        return true;
    }

    public final void c() {
        boolean z;
        ob obVar = new ob();
        for (PackageInfo packageInfo : this.a.getPackageManager().getInstalledPackages(0)) {
            obVar.add(packageInfo.packageName);
        }
        for (String next : d().getAll().keySet()) {
            if (next != null) {
                z = next.startsWith("0p:");
            } else {
                z = false;
            }
            if (!z && !obVar.contains(next)) {
                e().remove(next).commit();
                a().remove(next).commit();
            }
        }
    }

    public final boolean a(String str) {
        c();
        return f().getBoolean(str, true);
    }
}
