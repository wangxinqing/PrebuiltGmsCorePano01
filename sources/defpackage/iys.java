package defpackage;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: iys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iys extends iyw {
    private final Class f;
    private final Object g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public iys(int r16, java.lang.String r17, java.lang.Object r18, java.lang.Class r19, java.lang.Object r20, com.android.volley.Response.Listener r21, com.android.volley.Response.ErrorListener r22, java.lang.String r23, java.lang.String r24, boolean r25, java.util.HashMap r26, int r27, int r28) {
        /*
            r15 = this;
            if (r18 == 0) goto L_0x0008
            java.lang.String r0 = r18.toString()
            r4 = r0
            goto L_0x000a
        L_0x0008:
            r0 = 0
            r4 = r0
        L_0x000a:
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r1.<init>((int) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.Class) r5, (java.lang.Object) r6, (com.android.volley.Response.Listener) r7, (com.android.volley.Response.ErrorListener) r8, (java.lang.String) r9, (java.lang.String) r10, (boolean) r11, (java.util.HashMap) r12, (int) r13, (int) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iys.<init>(int, java.lang.String, java.lang.Object, java.lang.Class, java.lang.Object, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener, java.lang.String, java.lang.String, boolean, java.util.HashMap, int, int):void");
    }

    /* access modifiers changed from: protected */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        Cache.Entry entry;
        jag jag;
        try {
            if (shouldCache()) {
                entry = HttpHeaderParser.parseCacheHeaders(networkResponse);
            } else {
                entry = null;
            }
            Object obj = this.g;
            if (obj == null) {
                jag = (jag) this.f.newInstance();
            } else {
                jag = (jag) this.f.getConstructor(new Class[]{obj.getClass()}).newInstance(new Object[]{this.g});
            }
            int i = networkResponse.statusCode;
            jag.b(networkResponse.data);
            return Response.success(jag, entry);
        } catch (jaq e) {
            return Response.error(new ParseError((Throwable) e));
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        } catch (IllegalArgumentException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iys(int i, String str, String str2, Class cls, Object obj, Response.Listener listener, Response.ErrorListener errorListener, String str3, String str4, boolean z, HashMap hashMap, int i2, int i3) {
        super(i, str, str2, listener, errorListener, str3, str4, z, hashMap, i2, i3);
        this.f = cls;
        this.g = obj;
    }
}
