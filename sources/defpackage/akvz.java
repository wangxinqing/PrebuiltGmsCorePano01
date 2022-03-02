package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* renamed from: akvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvz extends akwd {
    private final rla b;

    public akvz(PlacesParams placesParams, rla rla, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "GetStandardAliases", placesParams, akuy, akvn, "", akhj);
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
        return akig.a(this.a, Arrays.asList(new String[]{"Home", "Work"}));
    }

    public final void a(Context context) {
        List list;
        String str;
        super.a(context);
        aksc f = f();
        aktg g = g();
        try {
            if (!azda.a.a().k()) {
                list = f.a(this.a);
            } else {
                aszv aszv = (aszv) g.a(new aktw(g.c, g.d, "GMS_CORE_PLACES"), this.a);
                if (aszv == null || aszv.a.size() == 0) {
                    list = amzy.h();
                } else {
                    ArrayList arrayList = new ArrayList(aszv.a.size());
                    for (atac atac : aszv.a) {
                        int i = atac.a;
                        if (!((i & 1) == 0 || (i & 2) == 0)) {
                            atab a = atab.a(atac.b);
                            if (a == null) {
                                a = atab.UNKNOWN_TYPE;
                            }
                            if (a != atab.CONFIRMED_HOME) {
                                str = a == atab.CONFIRMED_WORK ? "Work" : null;
                            } else {
                                str = "Home";
                            }
                            arrayList.add(AliasedPlace.a(atac.c, Arrays.asList(new String[]{str})));
                        }
                    }
                    list = amzy.a((Collection) arrayList);
                }
            }
            this.b.c(new AliasedPlacesResult(ris.h(0), list));
        } catch (babk | VolleyError | eif | TimeoutException e) {
            throw akwd.a(e);
        }
    }

    public final void a(Status status) {
        this.b.c(new AliasedPlacesResult(status, Collections.emptyList()));
    }
}
