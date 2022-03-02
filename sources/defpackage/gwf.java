package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: gwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gwf implements gvv {
    protected final SSLSocketFactory a;
    private final gwq b;
    private final opc c;

    public gwf(gwr gwr) {
        this.b = gwr.e;
        boolean booleanValue = ((Boolean) iks.y.c()).booleanValue();
        Context context = gwr.m;
        int i = hxy.a;
        StringBuilder sb = new StringBuilder(30);
        sb.append("CheckinService-");
        sb.append(i);
        sb.append("/2.0");
        opc opc = new opc(context, sb.toString(), false, booleanValue);
        this.c = opc;
        SSLSocketFactory a2 = opc.a();
        if (a2 == null) {
            Log.w("CheckinConnFactory", "client socket factory is null, using default socket factory");
            a2 = (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
        this.a = a2;
    }

    public final afzd a() {
        gwq gwq = this.b;
        boolean z = gwq.c;
        return new afzd(new afzi(gwq.a), new afze(this.a));
    }

    public final HttpURLConnection b(String str) {
        HttpURLConnection a2 = a(str);
        if (a2 instanceof HttpsURLConnection) {
            ((HttpsURLConnection) a2).setSSLSocketFactory(this.a);
        }
        a2.setRequestMethod("POST");
        return a2;
    }

    /* access modifiers changed from: protected */
    public final opl b() {
        return (opl) this.c.a;
    }

    public String a(Context context) {
        int i;
        if (!jix.c(context)) {
            i = 250;
        } else {
            i = 500;
        }
        iby a2 = znu.a(context);
        try {
            iha b2 = ihb.b();
            b2.a = znv.a;
            return ((PseudonymousIdToken) acws.a(a2.a(b2.a()), (long) i, TimeUnit.MILLISECONDS)).a;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return null;
        }
    }

    public HttpURLConnection a(String str) {
        return ((opl) this.c.a).a(new URL(str));
    }

    public HttpURLConnection a(String str, afzd afzd) {
        URL url = new URL(str);
        avze avze = new avze();
        avze.m = afzd;
        HttpURLConnection a2 = new avzg(avze).a(url);
        if (a2 instanceof HttpsURLConnection) {
            ((HttpsURLConnection) a2).setSSLSocketFactory(this.a);
        }
        a2.setRequestMethod("POST");
        return a2;
    }
}
