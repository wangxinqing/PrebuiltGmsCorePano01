package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;

/* renamed from: eat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eat {
    public static View a(Context context, String str, boolean z, boolean z2) {
        return a(context, str, z, z2, 5000, (dxu) null);
    }

    public static void b(Context context, View view) {
        if (view.getParent() != null) {
            ((WindowManager) context.getApplicationContext().getSystemService("window")).removeView(view);
        }
    }

    public static View a(Context context, String str, boolean z, boolean z2, long j, dxu dxu) {
        int i;
        int i2;
        int i3;
        if (((AccessibilityManager) context.getSystemService("accessibility")).isEnabled() || (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context))) {
            Toast.makeText(context, str, 1).show();
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        View inflate = LayoutInflater.from(applicationContext).inflate(R.layout.appinvite_message, (ViewGroup) null);
        if (j > 0) {
            inflate.postDelayed(new ear(inflate, windowManager, dxu), j);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setText(str);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dismiss);
        textView2.setOnClickListener(new eas(inflate, windowManager, dxu));
        if (z2) {
            int i4 = Build.VERSION.SDK_INT;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.quantum_ic_warning_white_24, 0, 0, 0);
            i2 = R.color.appinvite_error_message_background;
            i = R.color.appinvite_error_message_text;
            i3 = R.color.appinvite_error_message_dismiss;
        } else {
            i2 = R.color.appinvite_message_background;
            i = R.color.appinvite_message_text;
            i3 = R.color.appinvite_message_dismiss;
        }
        View findViewById = inflate.findViewById(R.id.content);
        Resources resources = applicationContext.getResources();
        if (z) {
            findViewById.setBackgroundResource(R.drawable.appinvite_contextual_selection_sms_warning_background);
        } else {
            inflate.setPadding(0, 0, 0, 0);
            findViewById.setBackgroundColor(resources.getColor(i2));
        }
        textView.setTextColor(resources.getColor(i));
        textView2.setTextColor(resources.getColor(i3));
        a(context, inflate);
        return inflate;
    }

    public static void a(Context context, View view) {
        int i;
        int i2;
        if (view.getParent() == null) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (Build.VERSION.SDK_INT >= 26) {
                i = 2038;
            } else {
                i = 2003;
            }
            if (!accessibilityManager.isEnabled()) {
                i2 = 8;
            } else {
                i2 = 32;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, i, i2, -3);
            layoutParams.gravity = 80;
            ((WindowManager) context.getApplicationContext().getSystemService("window")).addView(view, layoutParams);
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(64);
                obtain.setClassName(view.getContext().getClass().getName());
                obtain.setPackageName(view.getContext().getPackageName());
                view.dispatchPopulateAccessibilityEvent(obtain);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public static void a(View view, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        view.announceForAccessibility(charSequence);
    }
}
