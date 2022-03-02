package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;
import com.google.android.places.ui.autocomplete.SessionLogger;

/* renamed from: albw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albw implements TextWatcher {
    final /* synthetic */ AutocompleteChimeraActivity a;

    public albw(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.a = autocompleteChimeraActivity;
    }

    public final void afterTextChanged(Editable editable) {
        AutocompleteChimeraActivity autocompleteChimeraActivity = this.a;
        boolean z = false;
        if (!autocompleteChimeraActivity.l) {
            SessionLogger sessionLogger = autocompleteChimeraActivity.d;
            String obj = editable.toString();
            if (sessionLogger.k != null) {
                z = true;
            }
            amrl.b(z, (Object) "Input value must be initialized on start");
            sessionLogger.l++;
            sessionLogger.k = obj;
            this.a.e();
            this.a.f();
            return;
        }
        autocompleteChimeraActivity.l = false;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
