package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akuy {
    public final Context a;
    public final String b;
    private boolean c = false;
    private String d;
    private String e;
    private boolean f = false;
    private int g;
    private ixk h;

    public akuy(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private final void a(ClientContext clientContext, PlacesParams placesParams, String str) {
        String str2 = placesParams.b;
        clientContext.e = str2;
        clientContext.f = str2;
        clientContext.d(str);
        clientContext.b = a(placesParams.b);
        if (!TextUtils.isEmpty(placesParams.d)) {
            Account account = new Account(placesParams.d, "com.google");
            clientContext.d = account;
            clientContext.c = account;
        }
    }

    public final synchronized aktg b(PlacesParams placesParams, akhj akhj) {
        ClientContext clientContext;
        if (!this.c) {
            this.d = jhg.h(this.a, placesParams.b);
            this.e = jhg.a(this.a, placesParams.b, "com.google.android.geo.API_KEY");
            this.c = true;
        }
        clientContext = new ClientContext();
        a(clientContext, placesParams, azda.b());
        return new aktg(this.a, this.e, placesParams.b, this.d, clientContext, akhj);
    }

    public final synchronized int a(String str) {
        if (!this.f) {
            this.g = jhg.i(this.a, str);
            this.f = true;
        }
        return this.g;
    }

    public final synchronized aksc a(PlacesParams placesParams, akhj akhj) {
        ClientContext clientContext;
        if (!this.c) {
            this.d = jhg.h(this.a, placesParams.b);
            this.e = jhg.a(this.a, placesParams.b, "com.google.android.geo.API_KEY");
            this.c = true;
        }
        clientContext = new ClientContext();
        a(clientContext, placesParams, azcl.b());
        return new aksc(this.a, this.e, clientContext, placesParams.b, this.d, akhj);
    }

    public final synchronized ixk a(PlacesParams placesParams) {
        if (this.h == null) {
            ClientContext clientContext = new ClientContext();
            String str = placesParams.b;
            clientContext.e = str;
            clientContext.b = a(str);
            this.h = ixk.a(this.a, clientContext);
        }
        return this.h;
    }
}
