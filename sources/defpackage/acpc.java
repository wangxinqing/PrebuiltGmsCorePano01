package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;

/* renamed from: acpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpc {
    public static void a(Activity activity, CharSequence charSequence) {
        AccessibilityManager accessibilityManager;
        if (!TextUtils.isEmpty(charSequence) && (accessibilityManager = (AccessibilityManager) activity.getApplicationContext().getSystemService("accessibility")) != null && accessibilityManager.isEnabled()) {
            activity.setTitle(charSequence);
            activity.getWindow().getDecorView().sendAccessibilityEvent(32);
        }
    }
}
