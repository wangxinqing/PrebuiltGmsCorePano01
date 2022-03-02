package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: aga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aga implements ah {
    private static int a = 0;
    private static Field b;
    private static Field c;
    private static Field d;
    private final Activity e;

    public aga(Activity activity) {
        this.e = activity;
    }

    private static void a() {
        try {
            a = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            c = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            d = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            b = declaredField3;
            declaredField3.setAccessible(true);
            a = 1;
        } catch (NoSuchFieldException e2) {
        }
    }

    public final void a(aj ajVar, ac acVar) {
        if (acVar == ac.ON_DESTROY) {
            if (a == 0) {
                a();
            }
            if (a == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.e.getSystemService("input_method");
                try {
                    Object obj = b.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) c.get(inputMethodManager);
                                if (view != null) {
                                    try {
                                        if (!view.isAttachedToWindow()) {
                                            d.set(inputMethodManager, (Object) null);
                                            inputMethodManager.isActive();
                                        }
                                    } catch (IllegalAccessException e2) {
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (IllegalAccessException e3) {
                            } catch (ClassCastException e4) {
                            }
                        }
                    }
                } catch (IllegalAccessException e5) {
                }
            }
        }
    }
}
