package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckBoxPreference extends TwoStatePreference {
    private final aly c = new aly(this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968814(0x7f0400ee, float:1.7546292E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.lj.a((android.content.Context) r4, (int) r0, (int) r1)
            r3.<init>(r4, r5, r0)
            aly r1 = new aly
            r1.<init>(r3)
            r3.c = r1
            int[] r1 = defpackage.anc.b
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r5, (int) r2)
            r3.c(r5)
            r5 = 4
            r0 = 1
            java.lang.String r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r5, (int) r0)
            r3.d(r5)
            r5 = 3
            r0 = 2
            boolean r5 = defpackage.lj.a((android.content.res.TypedArray) r4, (int) r5, (int) r0, (boolean) r2)
            r3.b = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final void c(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    public final void a(anb anb) {
        super.a(anb);
        c(anb.c(16908289));
        b(anb);
    }

    public final void a(View view) {
        k();
        if (((AccessibilityManager) this.k.getSystemService("accessibility")).isEnabled()) {
            c(view.findViewById(16908289));
            b(view.findViewById(16908304));
        }
    }
}
