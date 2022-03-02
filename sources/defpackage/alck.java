package defpackage;

import android.graphics.Rect;
import com.google.android.gms.R;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: alck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alck implements Runnable {
    final /* synthetic */ AutocompleteChimeraActivity a;

    public alck(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.a = autocompleteChimeraActivity;
    }

    public final void run() {
        String charSequence = this.a.getResources().getText(R.string.place_autocomplete_search_detailed_hint).toString();
        Rect rect = new Rect();
        this.a.f.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
        if (rect.width() < this.a.f.getWidth()) {
            this.a.f.setHint(R.string.place_autocomplete_search_detailed_hint);
        }
    }
}
