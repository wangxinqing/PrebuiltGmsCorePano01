package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.places.ui.placepicker.PlacePickerChimeraActivity;

/* renamed from: aleq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aleq implements icm {
    final /* synthetic */ PlacePickerChimeraActivity a;

    public aleq(PlacePickerChimeraActivity placePickerChimeraActivity) {
        this.a = placePickerChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status = (Status) icl;
        if (alaa.a(status)) {
            if (Log.isLoggable("Places", 6)) {
                String valueOf = String.valueOf(ris.g(status.i));
                Log.e("Places", valueOf.length() == 0 ? new String("Place Picker closing due to ") : "Place Picker closing due to ".concat(valueOf));
            }
            this.a.finishActivity(2);
            this.a.setResult(2);
            this.a.finish();
            return;
        }
        this.a.a = true;
    }
}
