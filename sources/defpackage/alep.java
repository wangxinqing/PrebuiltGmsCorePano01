package defpackage;

import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.places.ui.placepicker.PlacePickerChimeraActivity;

/* renamed from: alep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alep implements icm {
    final /* synthetic */ PlacePickerChimeraActivity a;

    public alep(PlacePickerChimeraActivity placePickerChimeraActivity) {
        this.a = placePickerChimeraActivity;
    }

    public final void a(LocationSettingsResult locationSettingsResult) {
        PlacePickerChimeraActivity placePickerChimeraActivity = this.a;
        placePickerChimeraActivity.b = null;
        Status status = locationSettingsResult.a;
        if (status.i == 6) {
            try {
                status.a(placePickerChimeraActivity.getContainerActivity(), 3);
            } catch (IntentSender.SendIntentException e) {
            }
        }
    }
}
