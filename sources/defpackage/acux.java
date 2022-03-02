package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: acux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acux implements avwt {
    public final ContentResolver a;
    private final opc b;

    public final InputStream a(acuv acuv, String str, String str2) {
        InputStream ungzippedContent;
        try {
            URI uri = new URI(str);
            int i = 500;
            int i2 = 10;
            String str3 = null;
            HttpResponse httpResponse = null;
            while (i2 > 0) {
                HttpUriRequest a2 = acuv.a(uri);
                AndroidHttpClient.modifyRequestToAcceptGzipResponse(a2);
                if (!TextUtils.isEmpty(str2)) {
                    String valueOf = String.valueOf(str2);
                    a2.addHeader("Authorization", valueOf.length() == 0 ? new String("GoogleLogin auth=") : "GoogleLogin auth=".concat(valueOf));
                }
                try {
                    httpResponse = this.b.execute(a2);
                    StatusLine statusLine = httpResponse.getStatusLine();
                    if (statusLine != null) {
                        i = statusLine.getStatusCode();
                        HttpEntity entity = httpResponse.getEntity();
                        if (i < 200 || i >= 300 || entity == null) {
                            if (i != 302) {
                                break;
                            }
                            entity.consumeContent();
                            Header firstHeader = httpResponse.getFirstHeader("Location");
                            if (firstHeader == null) {
                                break;
                            }
                            try {
                                i2--;
                                uri = new URI(firstHeader.getValue());
                            } catch (URISyntaxException e) {
                            }
                        } else {
                            return AndroidHttpClient.getUngzippedContent(entity);
                        }
                    } else {
                        Log.w("GDataClient", "StatusLine is null.");
                        throw new NullPointerException("StatusLine is null -- should not happen.");
                    }
                } catch (IOException e2) {
                    String valueOf2 = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                    sb.append("Unable to execute HTTP request.");
                    sb.append(valueOf2);
                    Log.w("GDataClient", sb.toString());
                    throw e2;
                }
            }
            HttpEntity entity2 = httpResponse.getEntity();
            if (!(httpResponse == null || entity2 == null)) {
                try {
                    ungzippedContent = AndroidHttpClient.getUngzippedContent(entity2);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                    while (true) {
                        int read = ungzippedContent.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    ungzippedContent.close();
                    str3 = new String(byteArrayOutputStream.toByteArray());
                } catch (Throwable th) {
                    entity2.consumeContent();
                    throw th;
                }
            }
            if (entity2 != null) {
                entity2.consumeContent();
            }
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Received ");
            sb2.append(i);
            sb2.append(" status code");
            String sb3 = sb2.toString();
            if (str3 != null) {
                String valueOf3 = String.valueOf(sb3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 2 + String.valueOf(str3).length());
                sb4.append(valueOf3);
                sb4.append(": ");
                sb4.append(str3);
                sb3 = sb4.toString();
            }
            throw new avwv(sb3, i);
        } catch (URISyntaxException e3) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 24);
            sb5.append("Unable to parse ");
            sb5.append(str);
            sb5.append(" as URI.");
            Log.w("GDataClient", sb5.toString(), e3);
            String message = e3.getMessage();
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(message).length());
            sb6.append("Unable to parse ");
            sb6.append(str);
            sb6.append(" as URI: ");
            sb6.append(message);
            throw new IOException(sb6.toString());
        }
    }

    public acux(Context context) {
        this.b = new opc(context, "Android-GData/1.1", true);
        this.a = context.getContentResolver();
        this.b.a("GDataClient");
    }
}
