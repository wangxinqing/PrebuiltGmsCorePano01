package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: akcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcf implements View.OnTouchListener {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ akck b;

    public akcf(akck akck, AutoCompleteTextView autoCompleteTextView) {
        this.b = akck;
        this.a = autoCompleteTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.b.c()) {
                this.b.c = false;
            }
            this.b.a(this.a);
        }
        return false;
    }
}
