package defpackage;

import android.widget.Button;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: alcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alcb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ AutocompleteChimeraActivity c;

    public alcb(AutocompleteChimeraActivity autocompleteChimeraActivity, String str, boolean z) {
        this.c = autocompleteChimeraActivity;
        this.a = str;
        this.b = z;
    }

    public final void run() {
        this.c.j.setText(this.a);
        int i = 0;
        this.c.h.setVisibility(0);
        this.c.i.setVisibility(8);
        this.c.g.setVisibility(8);
        Button button = this.c.k;
        if (!this.b) {
            i = 8;
        }
        button.setVisibility(i);
    }
}
