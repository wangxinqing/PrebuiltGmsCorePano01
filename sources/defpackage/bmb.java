package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bmb extends bms {
    public final String a;

    protected bmb(Context context, int i, int i2, String str) {
        super(context, i, i2, (bmr) null);
        this.a = str;
    }

    public ApplicationInfo a() {
        return this.e.createPackageContext(this.a, 0).getApplicationInfo();
    }

    public String b() {
        try {
            return this.e.getPackageManager().getApplicationInfo(this.a, 0).sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bmb)) {
            return false;
        }
        return this.a.equals(((bmb) obj).a);
    }

    public bnm f() {
        PackageInfo packageInfo = this.e.getPackageManager().getPackageInfo(this.a, 0);
        aucd j = j();
        long j2 = packageInfo.lastUpdateTime;
        if (j.c) {
            j.c();
            j.c = false;
        }
        bnm bnm = (bnm) j.b;
        bnm bnm2 = bnm.r;
        bnm.a |= 4;
        bnm.d = j2;
        String str = packageInfo.versionName == null ? "" : packageInfo.versionName;
        if (j.c) {
            j.c();
            j.c = false;
        }
        bnm bnm3 = (bnm) j.b;
        str.getClass();
        bnm3.a |= 32;
        bnm3.g = str;
        int i = packageInfo.versionCode;
        if (j.c) {
            j.c();
            j.c = false;
        }
        bnm bnm4 = (bnm) j.b;
        bnm4.a |= 64;
        bnm4.h = i;
        return (bnm) j.i();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final aucd j() {
        aucd j = super.j();
        String str = this.a;
        if (j.c) {
            j.c();
            j.c = false;
        }
        bnm bnm = (bnm) j.b;
        bnm bnm2 = bnm.r;
        str.getClass();
        int i = bnm.a | 2;
        bnm.a = i;
        bnm.c = str;
        String str2 = this.a;
        str2.getClass();
        bnm.a = i | 16;
        bnm.f = str2;
        return j;
    }

    public String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("InstalledApk(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public bmb(Context context, int i, String str) {
        this(context, 3, i, str);
    }

    public ClassLoader a(ClassLoader classLoader) {
        String str;
        ApplicationInfo applicationInfo = this.e.getPackageManager().getApplicationInfo(this.a, 0);
        ArrayList arrayList = new ArrayList(3);
        if (applicationInfo.nativeLibraryDir != null) {
            arrayList.add(applicationInfo.nativeLibraryDir);
        }
        if (Build.VERSION.SDK_INT >= 23 && (applicationInfo.flags & 268435456) == 0) {
            List b = bor.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) b.get(i);
                String str3 = applicationInfo.sourceDir;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 6 + String.valueOf(str2).length());
                sb.append(str3);
                sb.append("!/lib/");
                sb.append(str2);
                arrayList.add(sb.toString());
            }
        }
        if (!TextUtils.isEmpty(this.h)) {
            arrayList.add(this.h);
        }
        if (arrayList.size() != 0) {
            str = TextUtils.join(File.pathSeparator, arrayList);
        } else {
            str = null;
        }
        String str4 = applicationInfo.sourceDir;
        if (!TextUtils.isEmpty(this.g)) {
            String valueOf = String.valueOf(str4);
            String str5 = File.pathSeparator;
            String str6 = this.g;
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
            sb2.append(valueOf);
            sb2.append(str5);
            sb2.append(str6);
            str4 = sb2.toString();
        }
        if (applicationInfo.sharedLibraryFiles != null && applicationInfo.sharedLibraryFiles.length > 0) {
            String valueOf2 = String.valueOf(str4);
            String str7 = File.pathSeparator;
            String join = TextUtils.join(File.pathSeparator, applicationInfo.sharedLibraryFiles);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(str7).length() + String.valueOf(join).length());
            sb3.append(valueOf2);
            sb3.append(str7);
            sb3.append(join);
            str4 = sb3.toString();
        }
        return bnx.a(str4, str, classLoader);
    }

    public boolean a(boy boy) {
        PackageInfo packageInfo = this.e.getPackageManager().getPackageInfo(this.a, 0);
        return packageInfo.lastUpdateTime == boy.d() && packageInfo.versionCode == boy.h();
    }
}
