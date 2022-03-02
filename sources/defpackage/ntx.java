package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;

/* renamed from: ntx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntx implements Comparable {
    public final String a;
    public final int b;

    private ntx(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final PackageManager a(ntv ntv) {
        PackageManager c = ntv.c(this.b);
        if (c != null) {
            return c;
        }
        throw new PackageManager.NameNotFoundException("Unable to get PackageManager for user");
    }

    public final PackageInfo b(ntv ntv, int i) {
        return a(ntv).getPackageInfo(this.a, i);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return toString().compareTo(((ntx) obj).toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ntx) {
            ntx ntx = (ntx) obj;
            if (this.b != ntx.b || !ius.a(this.a, ntx.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    public static ntx a(amnc amnc) {
        return a(amnc.e, (int) amnc.k);
    }

    public static ntx a(String str, int i) {
        return new ntx(str, i);
    }

    public final ApplicationInfo a(ntv ntv, int i) {
        return a(ntv).getApplicationInfo(this.a, i);
    }

    public final qyl a() {
        qyk qyk = new qyk();
        qyk.a(this.b);
        qyk.b(this.a);
        return qyk.a();
    }
}
