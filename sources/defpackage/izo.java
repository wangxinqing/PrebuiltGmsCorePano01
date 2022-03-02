package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.server.NetworkCallbacks;

/* renamed from: izo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izo extends Request implements NetworkCallbacks {
    private final Context d;
    private final Uri e;
    private final Response.Listener f;
    private final boolean g;
    private final int h;
    private final int i;

    public izo(Context context, Uri uri, String str, boolean z, Response.Listener listener, Response.ErrorListener errorListener, int i2, int i3) {
        super(str, errorListener);
        this.d = context;
        this.e = uri;
        this.f = listener;
        this.g = z;
        this.h = i2;
        this.i = i3;
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f.onResponse((byte[]) obj);
    }

    public final Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public final void onPreNetworkDispatch() {
        izj.a(this.h, this.i);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        Cache.Entry entry = null;
        if (this.e != null) {
            ContentResolver contentResolver = this.d.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", getUrl());
            contentValues.put("image_data", networkResponse.data);
            contentResolver.insert(this.e, contentValues);
            return Response.success(networkResponse.data, (Cache.Entry) null);
        }
        byte[] bArr = networkResponse.data;
        if (this.g) {
            entry = HttpHeaderParser.parseCacheHeaders(networkResponse);
        }
        return Response.success(bArr, entry);
    }
}
