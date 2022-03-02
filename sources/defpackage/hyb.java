package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hyb {
    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"com.android.settings", "com.android.systemui"})));
    public final boolean b;
    public final PackageManager c;

    public hyb(PackageManager packageManager) {
        this.c = packageManager;
        boolean z = false;
        if ("google".equals(Build.BRAND) && packageManager.hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE")) {
            z = true;
        }
        this.b = z;
    }
}
