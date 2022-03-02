package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: alce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alce implements View.OnTouchListener {
    final /* synthetic */ AutocompleteChimeraActivity a;

    public alce(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.a = autocompleteChimeraActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.i();
        return true;
    }
}
