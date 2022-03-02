package defpackage;

import android.content.res.TypedArray;
import android.view.View;

/* renamed from: ajtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajtq implements View.OnClickListener {
    final /* synthetic */ ajtu a;

    public ajtq(ajtu ajtu) {
        this.a = ajtu;
    }

    public void onClick(View view) {
        ajtu ajtu = this.a;
        if (ajtu.a && ajtu.isShowing()) {
            ajtu ajtu2 = this.a;
            if (!ajtu2.c) {
                TypedArray obtainStyledAttributes = ajtu2.getContext().obtainStyledAttributes(new int[]{16843611});
                ajtu2.b = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                ajtu2.c = true;
            }
            if (ajtu2.b) {
                this.a.cancel();
            }
        }
    }
}
