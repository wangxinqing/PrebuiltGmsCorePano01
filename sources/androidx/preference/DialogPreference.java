package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lj.a(context, (int) R.attr.dialogPreferenceStyle, 16842897));
    }

    /* access modifiers changed from: protected */
    public void a() {
        amv amv = this.l.e;
        if (amv != null) {
            amv.a(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, anc.c, i, 0);
        String a2 = lj.a(obtainStyledAttributes, 9, 0);
        this.a = a2;
        if (a2 == null) {
            this.a = this.r;
        }
        this.b = lj.a(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.d = lj.a(obtainStyledAttributes, 11, 3);
        this.e = lj.a(obtainStyledAttributes, 10, 4);
        this.f = lj.a(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
}
