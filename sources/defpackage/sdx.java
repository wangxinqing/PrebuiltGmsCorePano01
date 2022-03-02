package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: sdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sdx implements Callable {
    private final sdz a;
    private final Uri b;

    public sdx(sdz sdz, Uri uri) {
        this.a = sdz;
        this.b = uri;
    }

    public final Object call() {
        osw osw;
        sdz sdz = this.a;
        ost a2 = sea.a(this.b, axsy.b().a);
        if (a2 == null) {
            return anfv.a;
        }
        oss oss = a2.b;
        if (oss == null) {
            oss = oss.c;
        }
        int b2 = osr.b(oss.a);
        int i = b2 - 1;
        if (b2 == 0) {
            throw null;
        } else if (i != 0) {
            if (i == 1) {
                amsn b3 = amsn.b(ampt.a);
                List<PackageInfo> installedPackages = sdz.a.getPackageManager().getInstalledPackages(0);
                int b4 = aoog.b(b3.a(TimeUnit.MICROSECONDS));
                hya a3 = hya.a(sdz.a);
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                b3.c();
                b3.d();
                for (PackageInfo packageInfo : installedPackages) {
                    String str = packageInfo.packageName;
                    if (a3.b(str)) {
                        hashSet.add(str);
                    } else if (str.startsWith("com.google")) {
                        hashSet2.add(str);
                    }
                }
                sdz.b.a(installedPackages.size(), (Set) hashSet2, b4, aoog.b(b3.a(TimeUnit.MICROSECONDS)));
                return hashSet;
            } else if (i == 2) {
                if (oss.a == 3) {
                    osw = (osw) oss.b;
                } else {
                    osw = osw.b;
                }
                hya a4 = hya.a(sdz.a);
                HashSet hashSet3 = new HashSet();
                aucx aucx = osw.a;
                int size = aucx.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = ((osv) aucx.get(i2)).a;
                    if (a4.b(str2)) {
                        hashSet3.add(str2);
                    }
                }
                return hashSet3;
            } else if (i == 3) {
                return anfv.a;
            } else {
                String a5 = osr.a(osr.b(oss.a));
                StringBuilder sb = new StringBuilder(a5.length() + 28);
                sb.append("Unrecognized ClientMatcher: ");
                sb.append(a5);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            String a6 = osr.a(osr.b(oss.a));
            StringBuilder sb2 = new StringBuilder(a6.length() + 27);
            sb2.append("Unsupported ClientMatcher: ");
            sb2.append(a6);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
