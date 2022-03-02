package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: alcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alcl implements icm {
    final /* synthetic */ AutocompleteChimeraActivity a;

    public alcl(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.a = autocompleteChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status = (Status) icl;
        if (alaa.a(status)) {
            if (Log.isLoggable("Places", 6)) {
                String valueOf = String.valueOf(ris.g(status.i));
                Log.e("Places", valueOf.length() == 0 ? new String("Autocomplete widget closing due to ") : "Autocomplete widget closing due to ".concat(valueOf));
            }
            this.a.a(2, (rhq) null, status);
            return;
        }
        this.a.n = true;
    }
}
