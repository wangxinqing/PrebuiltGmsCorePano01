package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* renamed from: dim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dim {
    public static void a(View view, AccessibilityManager accessibilityManager, CharSequence charSequence) {
        Context context = null;
        if (!(view == null || view.getContext() == null)) {
            context = view.getContext().getApplicationContext();
        }
        if (context != null && !TextUtils.isEmpty(charSequence)) {
            if (accessibilityManager == null) {
                accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            }
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                obtain.getText().add(charSequence);
                obtain.setEnabled(view.isEnabled());
                obtain.setClassName(view.getClass().getName());
                obtain.setPackageName(context.getPackageName());
                new qw(obtain).a(view);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
}
