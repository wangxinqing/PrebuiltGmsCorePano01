package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.TimeoutException;

/* renamed from: akwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwb extends akwd {
    private final rka b;

    public akwb(PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "PlacePickerQuota", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) rka);
        this.b = rka;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 1;
    }

    public final aoei c() {
        return null;
    }

    public final void a(Context context) {
        super.a(context);
        try {
            Status a = f().a("placePicker", this.a);
            alfs.a(a.i, a.j, this.b);
        } catch (VolleyError | eif | TimeoutException e) {
            throw akwd.a(e);
        }
    }

    public final void a(Status status) {
        alfs.a(status.i, status.j, this.b);
    }
}
