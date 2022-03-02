package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: albx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albx implements TextView.OnEditorActionListener {
    final /* synthetic */ AutocompleteChimeraActivity a;

    public albx(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.a = autocompleteChimeraActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        AutocompleteChimeraActivity autocompleteChimeraActivity = this.a;
        alan.a((Context) autocompleteChimeraActivity, (View) autocompleteChimeraActivity.f);
        return true;
    }
}
