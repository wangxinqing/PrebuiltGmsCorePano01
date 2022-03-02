package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: oza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oza {
    public final prp a;
    public final Context b;
    public final PackageManager c;
    public final pas d;
    public final orv e;

    public oza(prp prp, Context context, PackageManager packageManager, orv orv, pas pas) {
        this.a = prp;
        this.b = context;
        this.c = packageManager;
        this.e = orv;
        this.d = pas;
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.d.a());
    }

    /* access modifiers changed from: package-private */
    public final oq b(String str) {
        try {
            PackageInfo packageInfo = this.c.getPackageInfo(str, 64);
            if (packageInfo == null) {
                return new oq(0, "");
            }
            return new oq(Integer.valueOf(packageInfo.versionCode), jhg.a(packageInfo));
        } catch (PackageManager.NameNotFoundException e2) {
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        return hya.a(this.b).b(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return a("com.google.android.googlequicksearchbox");
    }
}
