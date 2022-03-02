package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: alci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alci extends acy {
    final /* synthetic */ AutocompleteChimeraActivity a;

    public alci(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.a = autocompleteChimeraActivity;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            AutocompleteChimeraActivity autocompleteChimeraActivity = this.a;
            autocompleteChimeraActivity.d.n = true;
            alan.a((Context) autocompleteChimeraActivity, (View) autocompleteChimeraActivity.f);
        }
    }
}
