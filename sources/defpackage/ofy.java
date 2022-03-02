package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Locale;

/* renamed from: ofy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofy {
    public static int a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new Resources.NotFoundException(String.format(Locale.getDefault(), "Attribute not defined by theme (attr = %d)", new Object[]{Integer.valueOf(i)}));
        } else if (typedValue.type >= 28 && typedValue.type <= 31) {
            return typedValue.data;
        } else {
            if (typedValue.type == 3) {
                try {
                    return context.getResources().getColor(typedValue.resourceId);
                } catch (Resources.NotFoundException e) {
                    throw new UnsupportedOperationException(String.format(Locale.getDefault(), "Type of attribute is not a color (attr = %d, type = %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(typedValue.type)}), e);
                }
            } else {
                throw new UnsupportedOperationException(String.format(Locale.getDefault(), "Type of attribute is not a color (attr = %d, type = %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(typedValue.type)}));
            }
        }
    }

    public static boolean b() {
        return ofq.a(axox.b());
    }

    public static boolean b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new Resources.NotFoundException(String.format(Locale.getDefault(), "Attribute not defined by theme (attr = %d)", new Object[]{Integer.valueOf(i)}));
        } else if (typedValue.type == 18) {
            return typedValue.data != 0;
        } else {
            throw new UnsupportedOperationException(String.format(Locale.getDefault(), "Type of attribute is not a boolean (attr = %d, type = %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(typedValue.type)}));
        }
    }

    public static void a(Activity activity, ErrorReport errorReport, int i, int i2, int i3) {
        a(activity, errorReport.Y, i, i2, i3);
    }

    private static void a(Activity activity, ThemeSettings themeSettings, int i, int i2, int i3) {
        if (themeSettings != null) {
            int i4 = themeSettings.a;
            if (i4 == 0 || i4 == 1) {
                activity.setTheme(i);
            } else if (i4 == 2) {
                activity.setTheme(i2);
            } else {
                activity.setTheme(i3);
            }
        } else {
            activity.setTheme(i3);
        }
    }

    public static void a(Activity activity, HelpConfig helpConfig, int i, int i2, int i3) {
        a(activity, helpConfig.A, i, i2, i3);
    }

    public static boolean a() {
        return ofq.a(axps.a.a().a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.google.android.gms.feedback.ErrorReport r1) {
        /*
            boolean r0 = b()
            if (r0 == 0) goto L_0x0011
            com.google.android.gms.feedback.ThemeSettings r1 = r1.Y
            if (r1 == 0) goto L_0x0011
            int r1 = r1.a
            r0 = 2
            if (r1 != r0) goto L_0x0011
            r1 = 1
            return r1
        L_0x0011:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofy.a(com.google.android.gms.feedback.ErrorReport):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.google.android.gms.googlehelp.common.HelpConfig r1) {
        /*
            boolean r0 = b()
            if (r0 == 0) goto L_0x0011
            com.google.android.gms.feedback.ThemeSettings r1 = r1.A
            if (r1 == 0) goto L_0x0011
            int r1 = r1.a
            r0 = 2
            if (r1 != r0) goto L_0x0011
            r1 = 1
            return r1
        L_0x0011:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofy.a(com.google.android.gms.googlehelp.common.HelpConfig):boolean");
    }
}
