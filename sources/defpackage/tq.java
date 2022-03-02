package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: tq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tq implements View.OnClickListener {
    private final View a;
    private final String b;
    private Method c;
    private Context d;

    public tq(View view, String str) {
        this.a = view;
        this.b = str;
    }

    public void onClick(View view) {
        String str;
        Method method;
        if (this.c == null) {
            for (Context context = this.a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.b, new Class[]{View.class})) != null) {
                        this.c = method;
                        this.d = context;
                    }
                } catch (NoSuchMethodException e) {
                }
            }
            int id = this.a.getId();
            if (id != -1) {
                str = " with id '" + this.a.getContext().getResources().getResourceEntryName(id) + "'";
            } else {
                str = "";
            }
            throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.a.getClass() + str);
        }
        try {
            this.c.invoke(this.d, new Object[]{view});
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
