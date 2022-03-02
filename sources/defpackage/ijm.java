package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.chimera.Activity;

/* renamed from: ijm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ijm {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0058
            aljk r0 = new aljk
            aljl r2 = defpackage.aljl.a()
            r0.<init>(r2)
            r0.a = r1
            r0.b = r1
            aljl r0 = r0.a()
            int r0 = r0.a((java.lang.String) r4)
            if (r0 != 0) goto L_0x0057
            int r0 = r4.hashCode()
            r2 = -180885253(0xfffffffff537e8fb, float:-2.3313372E32)
            r3 = 1
            if (r0 == r2) goto L_0x0038
            r2 = 1862631875(0x6f0581c3, float:4.131838E28)
            if (r0 == r2) goto L_0x002e
            goto L_0x0042
        L_0x002e:
            java.lang.String r0 = "minutemaid"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0042
            r4 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "clamshell"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = -1
        L_0x0043:
            if (r4 == 0) goto L_0x0053
            if (r4 == r3) goto L_0x0048
            goto L_0x0052
        L_0x0048:
            boolean r4 = defpackage.jkr.c()
            if (r4 == 0) goto L_0x0052
            r4 = 2132017665(0x7f140201, float:1.9673615E38)
            return r4
        L_0x0052:
            return r1
        L_0x0053:
            r4 = 2132019115(0x7f1407ab, float:1.9676556E38)
            return r4
        L_0x0057:
            return r0
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijm.b(java.lang.String):int");
    }

    public static void a(ViewGroup viewGroup) {
        int i = Build.VERSION.SDK_INT;
        viewGroup.requestApplyInsets();
        viewGroup.addOnLayoutChangeListener(new ijl());
    }

    public static void a(Activity activity, String str) {
        int b = b(str);
        if (b != 0) {
            activity.setTheme(b);
        } else {
            activity.setTheme(2132018098);
        }
    }

    @Deprecated
    public static void a(Activity activity, String str, boolean z) {
        int b = b(str);
        if (b != 0) {
            activity.setTheme(b);
        } else {
            activity.setTheme(2132018098);
        }
        if (z) {
            alhs.a(activity.getWindow());
        }
    }

    public static void a(Activity activity, boolean z, Context context) {
        if (!z) {
            Window window = activity.getWindow();
            int i = Build.VERSION.SDK_INT;
            alhs.b(window, 5634);
            alhs.d(window, 5634);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843857, 16843858});
            int color = obtainStyledAttributes.getColor(0, 0);
            int color2 = obtainStyledAttributes.getColor(1, 0);
            window.setStatusBarColor(color);
            window.setNavigationBarColor(color2);
            obtainStyledAttributes.recycle();
            return;
        }
        alhs.a(activity.getWindow());
    }

    public static boolean a(String str) {
        return "glif".equals(str) || "glif_light".equals(str) || "glif_v2".equals(str) || "glif_v2_light".equals(str) || "glif_v3".equals(str) || "glif_v3_light".equals(str);
    }
}
