package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Objects;

/* renamed from: bnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bnf extends bll {
    private final String a;
    private final String b;

    public bnf(Context context, int i, String str, String str2, bmr bmr) {
        super(context, 5, i, bmr, str2);
        this.a = context.getPackageName();
        this.b = str;
    }

    public final ClassLoader a(ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                ClassLoader classLoader2 = this.e.createContextForSplit(this.b).getClassLoader();
                amtf.a(!classLoader2.equals(this.e.getClassLoader()), "isolatedSplits not working as expected!", new Object[0]);
                String valueOf = String.valueOf(classLoader2);
                String valueOf2 = String.valueOf(classLoader2.getParent());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
                sb.append("Classloader=");
                sb.append(valueOf);
                sb.append(", parent=");
                sb.append(valueOf2);
                sb.toString();
                return classLoader2;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf3 = String.valueOf(h());
                throw new bop(valueOf3.length() == 0 ? new String("Failed loading split APK ") : "Failed loading split APK ".concat(valueOf3), e);
            }
        } else {
            throw new bop("Split module APK supported on SDK >= O only");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnf) {
            bnf bnf = (bnf) obj;
            if (!Objects.equals(this.a, bnf.a) || !Objects.equals(this.b, bnf.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final bnm f() {
        PackageInfo packageInfo = this.e.getPackageManager().getPackageInfo(this.a, 0);
        if (packageInfo == null) {
            String valueOf = String.valueOf(h());
            throw new PackageManager.NameNotFoundException(valueOf.length() == 0 ? new String("Failed reading stored package info from ") : "Failed reading stored package info from ".concat(valueOf));
        }
        aucd j = j();
        long l = l();
        if (j.c) {
            j.c();
            j.c = false;
        }
        bnm bnm = (bnm) j.b;
        bnm bnm2 = bnm.r;
        bnm.a |= 4;
        bnm.d = l;
        String b2 = amrk.b(packageInfo.versionName);
        if (j.c) {
            j.c();
            j.c = false;
        }
        bnm bnm3 = (bnm) j.b;
        b2.getClass();
        bnm3.a |= 32;
        bnm3.g = b2;
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

    public final String h() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("split:/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    /* access modifiers changed from: protected */
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
        bnm.a |= 16;
        bnm.f = str;
        String h = h();
        if (j.c) {
            j.c();
            j.c = false;
        }
        bnm bnm3 = (bnm) j.b;
        h.getClass();
        bnm3.a |= 2048;
        bnm3.n = h;
        return j;
    }

    public final boolean o() {
        return false;
    }

    public final boolean p() {
        return false;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb.append("SplitApk(");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(')');
        return sb.toString();
    }

    public final boolean a(boy boy) {
        return l() == boy.d() && this.e.getPackageManager().getPackageInfo(this.a, 0).versionCode == boy.h();
    }
}
