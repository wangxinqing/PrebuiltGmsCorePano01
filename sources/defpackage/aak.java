package defpackage;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: aak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aak {
    public static final Rect a = new Rect();
    private static final int[] b = {16842912};
    private static final int[] c = new int[0];
    private static Class d;

    static {
        int i = Build.VERSION.SDK_INT;
        try {
            d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return PorterDuff.Mode.MULTIPLY;
            case Service.START_CONTINUATION_MASK /*15*/:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(b);
            } else {
                drawable.setState(c);
            }
            drawable.setState(state);
        }
    }

    public static boolean c(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable c2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!c(c2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof mc) {
            return c(((mc) drawable).a());
        } else {
            if (drawable instanceof uv) {
                return c(((uv) drawable).a);
            }
            if (drawable instanceof ScaleDrawable) {
                return c(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect a(android.graphics.drawable.Drawable r12) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0020
            android.graphics.Insets r12 = r12.getOpticalInsets()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = r12.left
            r0.left = r1
            int r1 = r12.right
            r0.right = r1
            int r1 = r12.top
            r0.top = r1
            int r12 = r12.bottom
            r0.bottom = r12
            return r0
        L_0x0020:
            java.lang.Class r0 = d
            if (r0 == 0) goto L_0x00b5
            android.graphics.drawable.Drawable r12 = defpackage.ma.g(r12)     // Catch:{ Exception -> 0x00ad }
            java.lang.Class r0 = r12.getClass()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r1 = "getOpticalInsets"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00ad }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x00ad }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00ad }
            java.lang.Object r12 = r0.invoke(r12, r1)     // Catch:{ Exception -> 0x00ad }
            if (r12 == 0) goto L_0x00b5
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ad }
            r0.<init>()     // Catch:{ Exception -> 0x00ad }
            java.lang.Class r1 = d     // Catch:{ Exception -> 0x00ad }
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch:{ Exception -> 0x00ad }
            int r3 = r1.length     // Catch:{ Exception -> 0x00ad }
            r4 = 0
        L_0x004a:
            if (r4 >= r3) goto L_0x00ac
            r5 = r1[r4]     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x00ad }
            int r7 = r6.hashCode()     // Catch:{ Exception -> 0x00ad }
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = -1
            switch(r7) {
                case -1383228885: goto L_0x007c;
                case 115029: goto L_0x0072;
                case 3317767: goto L_0x0068;
                case 108511772: goto L_0x005e;
                default: goto L_0x005d;
            }     // Catch:{ Exception -> 0x00ad }
        L_0x005d:
            goto L_0x0085
        L_0x005e:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00ad }
            if (r6 == 0) goto L_0x005d
            r11 = 2
            goto L_0x0085
        L_0x0068:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00ad }
            if (r6 == 0) goto L_0x005d
            r11 = 0
            goto L_0x0085
        L_0x0072:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00ad }
            if (r6 == 0) goto L_0x005d
            r11 = 1
            goto L_0x0085
        L_0x007c:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00ad }
            if (r6 == 0) goto L_0x005d
            r11 = 3
        L_0x0085:
            if (r11 == 0) goto L_0x00a3
            if (r11 == r10) goto L_0x009c
            if (r11 == r9) goto L_0x0095
            if (r11 == r8) goto L_0x008e
            goto L_0x00a9
        L_0x008e:
            int r5 = r5.getInt(r12)     // Catch:{ Exception -> 0x00ad }
            r0.bottom = r5     // Catch:{ Exception -> 0x00ad }
            goto L_0x00a9
        L_0x0095:
            int r5 = r5.getInt(r12)     // Catch:{ Exception -> 0x00ad }
            r0.right = r5     // Catch:{ Exception -> 0x00ad }
            goto L_0x00a9
        L_0x009c:
            int r5 = r5.getInt(r12)     // Catch:{ Exception -> 0x00ad }
            r0.top = r5     // Catch:{ Exception -> 0x00ad }
            goto L_0x00a9
        L_0x00a3:
            int r5 = r5.getInt(r12)     // Catch:{ Exception -> 0x00ad }
            r0.left = r5     // Catch:{ Exception -> 0x00ad }
        L_0x00a9:
            int r4 = r4 + 1
            goto L_0x004a
        L_0x00ac:
            return r0
        L_0x00ad:
            r12 = move-exception
            java.lang.String r12 = "DrawableUtils"
            java.lang.String r0 = "Couldn't obtain the optical insets. Ignoring."
            android.util.Log.e(r12, r0)
        L_0x00b5:
            android.graphics.Rect r12 = a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aak.a(android.graphics.drawable.Drawable):android.graphics.Rect");
    }
}
