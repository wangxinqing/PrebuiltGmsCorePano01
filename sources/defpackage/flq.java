package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import com.android.volley.NetworkResponse;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.ClientContext;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: flq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class flq {
    private static final iwd a = ehv.b("CredentialsApiHelper");
    private final Context b;

    @Deprecated
    public flq(Context context) {
        iva.a((Object) context);
        this.b = context;
    }

    public static flq a(Context context) {
        return new flq(context);
    }

    public static qbf a(VolleyError volleyError) {
        byte[] bArr;
        byte[] bArr2;
        if (!(volleyError instanceof ServerError)) {
            qbe a2 = qbf.a();
            a2.a = "Network error.";
            a2.c = 7;
            a2.b = volleyError;
            return a2.a();
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        String str = null;
        if (!(networkResponse == null || (bArr = networkResponse.data) == null)) {
            if (jjt.a(bArr)) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(networkResponse.data);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    byte[] bArr3 = new byte[1024];
                    while (true) {
                        try {
                            int read = gZIPInputStream.read(bArr3);
                            if (read < 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr3, 0, read);
                        } catch (IOException e) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e2) {
                                a.e("Error closing gzip stream", e2, new Object[0]);
                            }
                        } catch (Throwable th) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e3) {
                                a.e("Error closing gzip stream", e3, new Object[0]);
                            }
                            throw th;
                        }
                    }
                    bArr2 = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e4) {
                        a.e("Error closing gzip stream", e4, new Object[0]);
                    }
                } catch (IOException e5) {
                    a.e("Unable to gzip decode error response", e5, new Object[0]);
                }
            } else {
                bArr2 = networkResponse.data;
            }
            try {
                str = new String(bArr2, "UTF-8");
            } catch (UnsupportedEncodingException e6) {
                a.f("UTF-8 encoding not supported!?", e6, new Object[0]);
            }
        }
        if (str != null) {
            try {
                String string = new JSONObject(str).getJSONObject("error").getString("message");
                if ("CUSTOM_PASSPHRASE".equals(string)) {
                    qbe a3 = qbf.a();
                    a3.a = "The current user is a custom passphrase user.";
                    a3.c = 28402;
                    a3.b = volleyError;
                    return a3.a();
                } else if ("NOT_A_SYNC_USER".equals(string)) {
                    qbe a4 = qbf.a();
                    a4.a = "The current user is not a ChromeSync user.";
                    a4.c = 28403;
                    a4.b = volleyError;
                    return a4.a();
                } else if ("RATE_LIMIT_EXCEEDED".equals(string)) {
                    qbe a5 = qbf.a();
                    a5.a = "Request throttled.";
                    a5.c = 28401;
                    a5.b = volleyError;
                    return a5.a();
                } else {
                    qbe a6 = qbf.a();
                    String valueOf = String.valueOf(string);
                    a6.a = valueOf.length() == 0 ? new String("Unknown error code: ") : "Unknown error code: ".concat(valueOf);
                    a6.c = 28404;
                    a6.b = volleyError;
                    return a6.a();
                }
            } catch (JSONException e7) {
                qbe a7 = qbf.a();
                a7.a = "Unable to parse the error.";
                a7.c = 28404;
                a7.b = volleyError;
                return a7.a();
            }
        } else {
            qbe a8 = qbf.a();
            a8.a = "Unable to extract network response data.";
            a8.c = 28404;
            a8.b = volleyError;
            return a8.a();
        }
    }

    public final auul a(String str) {
        aucd o = auul.e.o();
        String num = Integer.toString(201216073);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auul auul = (auul) o.b;
        num.getClass();
        auul.a |= 1;
        auul.b = num;
        if (str != null) {
            String host = Uri.parse(str).getHost();
            if (host != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                auul auul2 = (auul) o.b;
                host.getClass();
                auul2.a |= 4;
                auul2.d = host;
            }
            Context context = this.b;
            String host2 = Uri.parse(str).getHost();
            String str2 = null;
            if (host2 != null) {
                try {
                    byte[] c = jhg.c(context, host2, "SHA1");
                    if (c != null) {
                        str2 = Base64.encodeToString(c, 2);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            if (str2 == null) {
                throw new IllegalStateException(str.length() == 0 ? new String("Cannot construct request header for unknown app") : "Cannot construct request header for unknown app".concat(str));
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            auul auul3 = (auul) o.b;
            str2.getClass();
            auul3.a |= 2;
            auul3.c = str2;
        }
        return (auul) o.i();
    }

    public final IdToken a(pyv pyv, String str, String str2, String str3) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        try {
            aucd o = auuh.h.o();
            auul a2 = a(str);
            if (o.c) {
                o.c();
                o.c = false;
            }
            auuh auuh = (auuh) o.b;
            a2.getClass();
            auuh.b = a2;
            int i = auuh.a | 1;
            auuh.a = i;
            str.getClass();
            int i2 = i | 2;
            auuh.a = i2;
            auuh.c = str;
            String str4 = pyv.b;
            str4.getClass();
            int i3 = i2 | 4;
            auuh.a = i3;
            auuh.d = str4;
            if (str2 != null) {
                str2.getClass();
                i3 |= 32;
                auuh.a = i3;
                auuh.g = str2;
            }
            if (str3 != null) {
                str3.getClass();
                auuh.a = i3 | 16;
                auuh.f = str3;
            }
            fxq a3 = a();
            ClientContext a4 = a(pyv);
            auuh auuh2 = (auuh) o.i();
            iyn iyn = a3.a;
            StringBuilder sb = new StringBuilder();
            sb.append("/idToken?alt=proto");
            if (!(auuh2 == null || (auuh2.a & 1) == 0)) {
                auul auul = auuh2.b;
                if (auul == null) {
                    auul = auul.e;
                }
                if ((auul.a & 1) != 0) {
                    sb.append("&header.playServicesVersion=");
                    auul auul2 = auuh2.b;
                    if (auul2 == null) {
                        auul2 = auul.e;
                    }
                    sb.append(iyv.a(auul2.b));
                }
            }
            if (!(auuh2 == null || (auuh2.a & 1) == 0)) {
                auul auul3 = auuh2.b;
                if (auul3 == null) {
                    auul3 = auul.e;
                }
                if ((auul3.a & 2) != 0) {
                    sb.append("&header.certificateSha1=");
                    auul auul4 = auuh2.b;
                    if (auul4 == null) {
                        auul4 = auul.e;
                    }
                    sb.append(iyv.a(auul4.c));
                }
            }
            if (!(auuh2 == null || (auuh2.a & 1) == 0)) {
                auul auul5 = auuh2.b;
                if (auul5 == null) {
                    auul5 = auul.e;
                }
                if ((auul5.a & 4) != 0) {
                    sb.append("&header.packageName=");
                    auul auul6 = auuh2.b;
                    if (auul6 == null) {
                        auul6 = auul.e;
                    }
                    sb.append(iyv.a(auul6.d));
                }
            }
            if (!(auuh2 == null || (auuh2.a & 2) == 0)) {
                sb.append("&url=");
                sb.append(iyv.a(auuh2.c));
            }
            if (!(auuh2 == null || (auuh2.a & 4) == 0)) {
                sb.append("&email=");
                sb.append(iyv.a(auuh2.d));
            }
            if (!(auuh2 == null || (auuh2.a & 8) == 0)) {
                sb.append("&profileConsented=");
                sb.append(auuh2.e);
            }
            if (!(auuh2 == null || (auuh2.a & 16) == 0)) {
                sb.append("&nonce=");
                sb.append(iyv.a(auuh2.f));
            }
            if (!(auuh2 == null || (auuh2.a & 32) == 0)) {
                sb.append("&audience=");
                sb.append(iyv.a(auuh2.g));
            }
            return new IdToken("https://accounts.google.com", ((auui) iyn.a(a4, 0, sb.toString(), (byte[]) null, (Object) auui.b)).a);
        } catch (VolleyError e) {
            throw a(e);
        } catch (eif e2) {
            throw qbf.a(e2);
        }
    }

    public final ClientContext a(pyv pyv) {
        int i = this.b.getApplicationInfo().uid;
        String str = pyv.b;
        String packageName = this.b.getPackageName();
        ClientContext clientContext = new ClientContext(i, str, str, packageName, packageName);
        clientContext.d((String) fdj.d.c());
        return clientContext;
    }

    public final fxq a() {
        return new fxq(new iyn(this.b, (String) fdj.a.c(), (String) fdj.b.c(), false, false, (String) fdj.c.c(), (String) null));
    }
}
