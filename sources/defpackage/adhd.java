package defpackage;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: adhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhd implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private final View a;
    private final CompoundButton b;
    private final int c;
    private final adgg d;

    public adhd(View view, CompoundButton compoundButton, int i, adgg adgg) {
        this.a = view;
        this.b = compoundButton;
        this.c = i;
        this.d = adgg;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.setVisibility(!z ? 8 : 0);
        this.d.a(this.c, z);
    }

    public void onClick(View view) {
        this.b.toggle();
    }
}
