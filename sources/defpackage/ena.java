package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

/* renamed from: ena  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ena {
    public static final iwd a = ehv.a("AddAccountOperation");
    public final Context b;
    public final gsa c;
    public final eny d;
    public final elx e;
    public final AccountSignInRequest f;
    public final ekq g;

    public ena(Context context, AccountSignInRequest accountSignInRequest) {
        ild ild = new ild(context);
        gsa gsa = new gsa(context);
        eny eny = (eny) eny.a.b();
        elx elx = new elx(context);
        ekq ekq = (ekq) ekq.b.b();
        elr elr = new elr(context);
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) ild);
        iva.a((Object) gsa);
        this.c = gsa;
        iva.a((Object) eny);
        this.d = eny;
        iva.a((Object) elx);
        this.e = elx;
        iva.a((Object) accountSignInRequest);
        this.f = accountSignInRequest;
        iva.a((Object) ekq);
        this.g = ekq;
        iva.a((Object) elr);
    }

    public static CaptchaChallenge a(Context context, String str, String str2) {
        if (!str2.startsWith("http")) {
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() == 0 ? new String("https://www.google.com/accounts/") : "https://www.google.com/accounts/".concat(valueOf);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        iiv.a(context, linkedHashMap, context.getPackageName());
        try {
            gjm gjm = (gjm) gjm.a.b();
            HttpGet httpGet = new HttpGet(str2);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                httpGet.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            opc.a((HttpRequest) httpGet);
            byte[] a2 = a(gjm.a(httpGet));
            return new CaptchaChallenge(gei.SUCCESS, str, BitmapFactory.decodeByteArray(a2, 0, a2.length));
        } catch (IOException e2) {
            return new CaptchaChallenge(gei.NETWORK_ERROR, (String) null, (Bitmap) null);
        }
    }

    public static byte[] a(HttpResponse httpResponse) {
        try {
            return emt.a(httpResponse);
        } catch (IOException e2) {
            throw new iiy(gei.INTNERNAL_ERROR, "Error when parsing the response.", e2);
        }
    }
}
