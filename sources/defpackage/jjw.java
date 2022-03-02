package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: jjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjw {
    public static InputMethodManager a(Context context) {
        return (InputMethodManager) context.getSystemService("input_method");
    }

    public static void b(Context context, View view) {
        InputMethodManager a = a(context);
        if (a != null) {
            a.showSoftInput(view, 0);
        }
    }

    public static void a(Context context, View view) {
        InputMethodManager a = a(context);
        if (a != null) {
            a.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
