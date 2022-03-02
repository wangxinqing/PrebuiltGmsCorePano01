package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: arz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arz {
    private static boolean a = true;

    static ary a(ViewGroup viewGroup) {
        int i = Build.VERSION.SDK_INT;
        return new ary(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError e) {
                a = false;
            }
        }
    }

    static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        b(viewGroup, z);
    }
}
