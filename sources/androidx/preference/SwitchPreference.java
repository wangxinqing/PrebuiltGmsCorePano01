package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SwitchPreference extends TwoStatePreference {
    private final ang c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void c(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.d);
            switchR.setTextOff(this.e);
            switchR.setOnCheckedChangeListener(this.c);
        }
    }

    public final void a(anb anb) {
        super.a(anb);
        c(anb.c(16908352));
        b(anb);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130970065(0x7f0405d1, float:1.754883E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = defpackage.lj.a((android.content.Context) r4, (int) r0, (int) r1)
            r3.<init>(r4, r5, r0)
            ang r1 = new ang
            r1.<init>(r3)
            r3.c = r1
            int[] r1 = defpackage.anc.k
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 7
            java.lang.String r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r5, (int) r2)
            r3.c(r5)
            r5 = 6
            r0 = 1
            java.lang.String r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r5, (int) r0)
            r3.d(r5)
            r5 = 9
            r0 = 3
            java.lang.String r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r5, (int) r0)
            r3.d = r5
            r3.b()
            r5 = 8
            r0 = 4
            java.lang.String r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r5, (int) r0)
            r3.e = r5
            r3.b()
            r5 = 5
            r0 = 2
            boolean r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r5, (int) r0, (boolean) r2)
            r3.b = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(View view) {
        k();
        if (((AccessibilityManager) this.k.getSystemService("accessibility")).isEnabled()) {
            c(view.findViewById(16908352));
            b(view.findViewById(16908304));
        }
    }
}
