package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.location.places.personalized.PlaceUserData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: akvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvx extends akwd {
    private final UserDataType b;
    private final rka c;

    public akvx(UserDataType userDataType, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "GetPlaceUserData", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) userDataType);
        iva.a((Object) rka);
        this.b = userDataType;
        this.c = rka;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 3;
    }

    public final aoei c() {
        return akig.a(this.a, Arrays.asList(new String[]{"Home", "Work"}));
    }

    public final void a(Context context) {
        PlaceUserData placeUserData;
        super.a(context);
        if (this.b.equals(UserDataType.b)) {
            try {
                List<AliasedPlace> a = f().a(this.a);
                ArrayList arrayList = new ArrayList(a.size());
                for (AliasedPlace aliasedPlace : a) {
                    String str = (String) aliasedPlace.b.get(0);
                    if (str.equals("Home")) {
                        placeUserData = PlaceUserData.a(this.a.d, aliasedPlace.a, Arrays.asList(new PlaceAlias[]{PlaceAlias.a}));
                    } else if (str.equals("Work")) {
                        placeUserData = PlaceUserData.a(this.a.d, aliasedPlace.a, Arrays.asList(new PlaceAlias[]{PlaceAlias.b}));
                    } else {
                        placeUserData = null;
                    }
                    if (placeUserData != null) {
                        arrayList.add(placeUserData);
                    }
                }
                alfs.c(0, arrayList, this.c);
            } catch (VolleyError | eif | TimeoutException e) {
                throw akwd.a(e);
            }
        } else {
            throw new akwc(9004);
        }
    }

    public final void a(Status status) {
        alfs.c(status.i, Collections.emptyList(), this.c);
    }
}
