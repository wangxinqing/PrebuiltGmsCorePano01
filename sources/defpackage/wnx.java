package defpackage;

import android.os.Bundle;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wnx implements Response.Listener {
    final /* synthetic */ wsr a;
    final /* synthetic */ Bundle b;

    public wnx(wsr wsr, Bundle bundle) {
        this.a = wsr;
        this.b = bundle;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        HashMap hashMap;
        NetworkResponse networkResponse = (NetworkResponse) obj;
        Map map = networkResponse.headers;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("get.server_blob.format", this.a.b);
        bundle.putInt("get.server_blob.code", networkResponse.statusCode);
        bundle.putByteArray("get.server_blob.body", networkResponse.data);
        bundle.putSerializable("get.server_blob.headers", hashMap);
        this.b.putBundle("get.server_blob", bundle);
    }
}
