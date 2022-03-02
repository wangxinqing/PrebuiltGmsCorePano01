package defpackage;

import android.content.ComponentName;
import java.util.zip.CRC32;

/* renamed from: plo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plo {
    private static CRC32 a;

    private plo() {
    }

    private static long a(String str) {
        long value;
        synchronized (plo.class) {
            if (a == null) {
                a = new CRC32();
            }
            a.reset();
            a.update(str.getBytes());
            value = a.getValue();
        }
        return value;
    }

    public static String a(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (flattenToShortString.length() <= 256) {
            return flattenToShortString;
        }
        String packageName = componentName.getPackageName();
        String className = componentName.getClassName();
        String valueOf = String.valueOf(a(packageName));
        String valueOf2 = String.valueOf(a(className));
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(packageName);
        sb.append("/");
        sb.append(valueOf2);
        String sb2 = sb.toString();
        if (sb2.length() > 256) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(className).length());
            sb3.append(valueOf);
            sb3.append("/");
            sb3.append(className);
            sb2 = sb3.toString();
            if (sb2.length() > 256) {
                amrl.b((valueOf.length() + 1) + valueOf2.length() <= 256);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
                sb4.append(valueOf);
                sb4.append("/");
                sb4.append(valueOf2);
                return sb4.toString();
            }
        }
        return sb2;
    }
}
