package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: abv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abv extends abs implements abt {
    public static Method a;
    public abt b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public abv(Context context, int i) {
        super(context, (AttributeSet) null, i, (byte[]) null);
    }

    public final aan a(Context context, boolean z) {
        abu abu = new abu(context, z);
        abu.e = this;
        return abu;
    }
}
