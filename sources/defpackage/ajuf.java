package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: ajuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajuf extends ajyr {
    final /* synthetic */ Chip a;

    public ajuf(Chip chip) {
        this.a = chip;
    }

    public final void a(int i) {
    }

    public final void a(Typeface typeface, boolean z) {
        CharSequence charSequence;
        Chip chip = this.a;
        ajuj ajuj = chip.b;
        if (!ajuj.q) {
            charSequence = chip.getText();
        } else {
            charSequence = ajuj.c;
        }
        chip.setText(charSequence);
        this.a.requestLayout();
        this.a.invalidate();
    }
}
