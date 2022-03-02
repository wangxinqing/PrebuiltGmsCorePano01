package defpackage;

import android.os.Bundle;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wns implements Response.Listener {
    final /* synthetic */ Bundle a;
    final /* synthetic */ wsr b;

    public wns(Bundle bundle, wsr wsr) {
        this.a = bundle;
        this.b = wsr;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        NetworkResponse networkResponse = (NetworkResponse) obj;
        Map map = networkResponse.headers;
        HashMap hashMap = map != null ? new HashMap(map) : null;
        this.a.putInt("get.server_blob.format", this.b.b);
        this.a.putInt("get.server_blob.code", networkResponse.statusCode);
        this.a.putByteArray("get.server_blob.body", networkResponse.data);
        this.a.putSerializable("get.server_blob.headers", hashMap);
    }
}
