package defpackage;

import android.accounts.Account;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* renamed from: ogb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ogb implements amsv {
    private final ogg a;

    public ogb(ogg ogg) {
        this.a = ogg;
    }

    public final Object a() {
        Account account;
        ogg ogg = this.a;
        aosh f = aosh.f();
        UrlRequest.Builder newUrlRequestBuilder = ogg.f.newUrlRequestBuilder(ogg.b(), new oge(f), ogg.g);
        newUrlRequestBuilder.setHttpMethod(ogg.h());
        newUrlRequestBuilder.setPriority(ogg.a());
        UploadDataProvider i = ogg.i();
        if (i != null) {
            newUrlRequestBuilder.setUploadDataProvider(i, ogg.g);
        }
        nz nzVar = new nz();
        ogg.a((Map) nzVar);
        if (ogg.c() && (account = ogg.e) != null) {
            try {
                ogg.j = eig.a(ogg.c, account, "oauth2:https://www.googleapis.com/auth/supportcontent");
                iyt.a(nzVar, ogg.j, (String) null);
            } catch (eif | IOException e) {
                String valueOf = String.valueOf(ogg.e.name);
                Log.e("gH_CronetBaseRequest", valueOf.length() == 0 ? new String("Updating auth token failed for ") : "Updating auth token failed for ".concat(valueOf), e);
            }
        }
        for (Map.Entry entry : nzVar.entrySet()) {
            newUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        UrlRequest build = newUrlRequestBuilder.build();
        if (!(ogg.i == null || ogg.k == 0)) {
            myp myp = new myp();
            myp.c();
            ogg.h = myp;
        }
        build.start();
        return f;
    }
}
