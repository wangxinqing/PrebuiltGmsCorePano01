package defpackage;

import android.os.SystemClock;
import android.util.JsonReader;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* renamed from: lnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lnr extends iys {
    private static final ith f = new ith("DriveApiaryRequest", "");
    private final Request.Priority g;
    private final leg h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lnr(int i, String str, Class cls, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, Request.Priority priority, leg leg, int i2, int i3) {
        super(i, str, (String) null, cls, (Object) null, listener, errorListener, str2, str3, z, hashMap, i2, i3);
        iva.a((Object) priority);
        this.g = priority;
        iva.a((Object) leg);
        this.h = leg;
    }

    public final Request.Priority getPriority() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        InputStream a;
        String str;
        SystemClock.elapsedRealtime();
        if (this.h != null) {
            try {
                a = jag.a(networkResponse.data);
                JsonReader jsonReader = new JsonReader(new InputStreamReader(a));
                jsonReader.beginObject();
                while (true) {
                    if (!jsonReader.hasNext()) {
                        str = null;
                        break;
                    } else if (jsonReader.nextName().equals("nextPageToken")) {
                        str = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jjt.a((Closeable) a);
                this.h.a.b((Object) str);
            } catch (Exception e) {
                f.c("DriveApiaryRequest", "Could not find next page token in final result", e);
                return Response.error(new ParseError(networkResponse));
            } catch (Throwable th) {
                jjt.a((Closeable) a);
                throw th;
            }
        }
        return super.parseNetworkResponse(networkResponse);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lnr(int i, String str, Object obj, Class cls, Object obj2, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, Request.Priority priority, int i2, int i3) {
        super(i, str, obj, cls, obj2, listener, errorListener, str2, str3, z, hashMap, i2, i3);
        iva.a((Object) priority);
        this.g = priority;
        this.h = null;
    }
}
