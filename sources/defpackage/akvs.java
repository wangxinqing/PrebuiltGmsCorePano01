package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeoutException;

/* renamed from: akvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvs extends akwd {
    private final rla b;

    public akvs(PlacesParams placesParams, rla rla, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "GetNicknames", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) rla);
        this.b = rla;
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
        return akig.a(this.a, Arrays.asList(new String[]{"Nicknames"}));
    }

    public final void a(Context context) {
        super.a(context);
        aksc f = f();
        try {
            PlacesParams placesParams = this.a;
            this.b.c(new AliasedPlacesResult(ris.h(0), aksd.a(f.a, (assa) f.a((aktf) new aksx(f.e, f.a, f.b, "getAliases", placesParams), placesParams))));
        } catch (VolleyError | eif | TimeoutException e) {
            throw akwd.a(e);
        }
    }

    public final void a(Status status) {
        this.b.c(new AliasedPlacesResult(status, Collections.emptyList()));
    }
}
