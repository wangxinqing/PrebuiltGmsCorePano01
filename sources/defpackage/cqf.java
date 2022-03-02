package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* renamed from: cqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqf {
    private final Context a;

    public cqf(Context context) {
        this.a = context;
    }

    static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("dl-");
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append(".apk");
        return sb.toString();
    }

    static String c(cpx cpx) {
        return b(cpx.a, cpx.b);
    }

    /* access modifiers changed from: package-private */
    public final cpx a(String str, String str2) {
        String a2 = cpx.a(str, str2);
        SharedPreferences b = b();
        if (b.contains(a2)) {
            return cpx.a(b.getString(a2, (String) null));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences b() {
        return this.a.getSharedPreferences("AndroidDynamicModules", 0);
    }

    /* access modifiers changed from: package-private */
    public final File a() {
        File dir = this.a.getDir("zapp_modules", 0);
        dir.mkdir();
        if (dir.isDirectory()) {
            return dir;
        }
        dir.delete();
        if (!dir.mkdir()) {
            return null;
        }
        return dir;
    }

    /* access modifiers changed from: package-private */
    public final File b(cpx cpx) {
        return new File(a(), c(cpx));
    }

    /* access modifiers changed from: package-private */
    public final String a(cpx cpx) {
        File b = b(cpx);
        if (b.exists()) {
            return b.getAbsolutePath();
        }
        return null;
    }
}
