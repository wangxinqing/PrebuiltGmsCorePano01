package defpackage;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import java.io.UnsupportedEncodingException;

/* renamed from: appu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appu implements acvf {
    final /* synthetic */ ProxyRequest a;
    final /* synthetic */ auef b;

    public appu(ProxyRequest proxyRequest, auef auef) {
        this.a = proxyRequest;
        this.b = auef;
    }

    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        audx audx;
        if (acwa.b()) {
            ProxyResponse proxyResponse = (ProxyResponse) acwa.d();
            if (proxyResponse == null) {
                return acws.a((Exception) new apqd("Invalid proxy response."));
            }
            byte[] bArr = proxyResponse.f;
            if (bArr != null) {
                int i = proxyResponse.d;
                if (i == 3000 || i == 3001 || i == 3002 || i == 3003) {
                    ProxyRequest proxyRequest = this.a;
                    String str = "Error parsing backend api error response.";
                    if (proxyRequest.b.contains(axic.d()) || proxyRequest.b.contains(axic.c())) {
                        try {
                            str = new String(proxyResponse.f, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                        }
                    } else {
                        try {
                            str = ((almk) ((auef) almk.b.c(7)).a(proxyResponse.f)).a;
                        } catch (auda e2) {
                        }
                    }
                    return acws.a((Exception) new apqd(str));
                }
                auef auef = this.b;
                if (auef != null) {
                    try {
                        audx = (audx) auef.a(aubc.a(bArr), aubs.c());
                    } catch (Exception e3) {
                        throw new apqd("Error parsing backend api response.");
                    }
                } else {
                    audx = null;
                }
                return acws.a((Object) audx);
            } else if (proxyResponse.b != 7) {
                return acws.a((Exception) new apqd("Internal error."));
            } else {
                return acws.a((Exception) new apqd("<<Network Error>>"));
            }
        } else if (!(acwa.e() instanceof ibr)) {
            return acws.a((Exception) new apqd(acwa.e().getMessage()));
        } else {
            return acws.a((Exception) new apqd("<<Network Error>>"));
        }
    }
}
