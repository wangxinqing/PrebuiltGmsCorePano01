package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final anh c = new anh(this);
    private CharSequence d;
    private CharSequence e;

    private final void c(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.a = this.d;
            switchCompat.requestLayout();
            switchCompat.b = this.e;
            switchCompat.requestLayout();
            switchCompat.setOnCheckedChangeListener(this.c);
        }
    }

    public final void a(anb anb) {
        super.a(anb);
        c(anb.c(R.id.switchWidget));
        b(anb);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, anc.l, R.attr.switchPreferenceCompatStyle, 0);
        c(lj.a(obtainStyledAttributes, 7, 0));
        d(lj.a(obtainStyledAttributes, 6, 1));
        this.d = lj.a(obtainStyledAttributes, 9, 3);
        b();
        this.e = lj.a(obtainStyledAttributes, 8, 4);
        b();
        this.b = lj.a(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    public final void a(View view) {
        k();
        if (((AccessibilityManager) this.k.getSystemService("accessibility")).isEnabled()) {
            c(view.findViewById(R.id.switchWidget));
            b(view.findViewById(16908304));
        }
    }
}
