package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.TimeoutException;

/* renamed from: aktg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktg {
    public final Context a;
    public final aktn b;
    public final aktj c;
    public final ClientContext d;
    private final akhj e;

    public aktg(Context context, ClientContext clientContext, aktn aktn, aktj aktj, akhj akhj) {
        this.a = context;
        this.d = clientContext;
        this.e = akhj;
        this.b = aktn;
        this.c = aktj;
    }

    public static aktg a(Context context, PlacesParams placesParams, akhj akhj) {
        ClientContext clientContext = new ClientContext();
        String str = placesParams.b;
        clientContext.e = str;
        clientContext.f = str;
        clientContext.d(azda.b());
        clientContext.b = jhg.i(context, placesParams.b);
        if (!TextUtils.isEmpty(placesParams.d)) {
            Account account = new Account(placesParams.d, "com.google");
            clientContext.d = account;
            clientContext.c = account;
        }
        akti akti = new akti(context, jhg.a(context, placesParams.b, "com.google.android.geo.API_KEY"), placesParams.b, jhg.h(context, placesParams.b));
        return new aktg(context, clientContext, new aktn(akti), new aktj(akti), akhj);
    }

    public aktg(Context context, String str, String str2, String str3, ClientContext clientContext, akhj akhj) {
        this.a = context;
        this.d = clientContext;
        this.e = akhj;
        akti akti = new akti(context, str, str2, str3);
        this.b = new aktn(akti);
        this.c = new aktj(akti);
    }

    public final Object a(akua akua, PlacesParams placesParams) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Object a2 = akua.a();
            if (azbe.c()) {
                this.e.a(akua.a(1, currentTimeMillis, placesParams, a2));
            }
            return a2;
        } catch (TimeoutException e2) {
            if (azbe.c()) {
                this.e.a(akua.a(2, currentTimeMillis, placesParams, (Object) null));
            }
            throw e2;
        } catch (VolleyError | eif e3) {
            Throwable th = e3;
            if (azbe.c()) {
                this.e.a(akua.a(3, currentTimeMillis, placesParams, (Object) null));
            }
            throw th;
        }
    }
}
