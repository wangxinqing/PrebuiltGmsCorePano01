package defpackage;

import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: izs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class izs extends Request implements NetworkCallbacks {
    final int d;
    private final byte[] e;
    private final Response.Listener f;
    private final Object g;
    private final HashMap h;
    private final int i;

    public izs(int i2, String str, byte[] bArr, Object obj, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, int i3, int i4) {
        super(i2, str, errorListener);
        this.f = listener;
        this.e = bArr;
        this.g = obj;
        this.h = hashMap;
        iyt.a(hashMap, str2, str3);
        this.h.put("Accept-Encoding", "gzip");
        setShouldCache(z);
        this.d = i3;
        this.i = i4;
    }

    public final void deliverResponse(Object obj) {
        this.f.onResponse(obj);
    }

    public final byte[] getBody() {
        return this.e;
    }

    public String getBodyContentType() {
        return "application/x-protobuf";
    }

    public final Map getHeaders() {
        return this.h;
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public final void onPreNetworkDispatch() {
        izj.a(this.d, this.i);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [audx, java.lang.Object] */
    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        Cache.Entry entry;
        Object obj;
        try {
            if (shouldCache()) {
                entry = HttpHeaderParser.parseCacheHeaders(networkResponse);
            } else {
                entry = null;
            }
            byte[] bArr = networkResponse.data;
            if (jjt.a(bArr)) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                byte[] bArr2 = new byte[FragmentTransaction.TRANSIT_ENTER_MASK];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = gZIPInputStream.read(bArr2, 0, FragmentTransaction.TRANSIT_ENTER_MASK);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                bArr = byteArray;
            }
            ? r3 = this.g;
            if (r3 instanceof auge) {
                auge auge = (auge) r3;
                int length = bArr.length;
                auge.a();
                obj = this.g;
            } else if (r3 instanceof audx) {
                obj = r3.av().a(bArr, aubs.c()).i();
            } else {
                throw new IllegalStateException("Invalid ProtoType provided.");
            }
            return Response.success(obj, entry);
        } catch (augd e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e3);
        } catch (augd e4) {
            Log.e("ProtiaryRequest", "Unable to parse the network response", e4);
            return Response.error(new ParseError((Throwable) e4));
        } catch (IOException e5) {
            Log.e("ProtiaryRequest", "Unable to parse the network response", e5);
            return Response.error(new ParseError((Throwable) e5));
        }
    }
}
