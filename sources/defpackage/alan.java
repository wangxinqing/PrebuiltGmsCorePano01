package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: alan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alan {
    public static int a(float f, Context context) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static void a(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void a(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new alam(view, runnable));
    }
}
