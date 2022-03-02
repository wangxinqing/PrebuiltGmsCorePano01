package defpackage;

import android.view.View;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: alby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alby implements View.OnClickListener {
    final /* synthetic */ AutocompleteChimeraActivity a;

    public alby(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.a = autocompleteChimeraActivity;
    }

    public void onClick(View view) {
        AutocompleteChimeraActivity autocompleteChimeraActivity = this.a;
        autocompleteChimeraActivity.d.m++;
        autocompleteChimeraActivity.f.setText("");
    }
}
