package defpackage;

import android.os.Build;
import com.google.android.chimera.Activity;

/* renamed from: acpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpg {
    public static void a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.finishAndRemoveTask();
    }
}
