package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: tr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class tr {
    public static final int[] a = {16843375};
    public static final String[] b = {"android.widget.", "android.view.", "android.webkit."};
    private static final Class[] d = {Context.class, AttributeSet.class};
    private static final ou e = new ou();
    public final Object[] c = new Object[2];

    /* access modifiers changed from: protected */
    public AppCompatTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public yq c(Context context, AttributeSet attributeSet) {
        return new yq(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public zb d(Context context, AttributeSet attributeSet) {
        return new zb(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public yo e(Context context, AttributeSet attributeSet) {
        return new yo(context, attributeSet);
    }

    public final View a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = (Constructor) e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception e2) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(d);
            e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.c);
    }

    public final void a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
