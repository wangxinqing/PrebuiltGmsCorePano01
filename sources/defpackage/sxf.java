package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sxf implements Runnable {
    private final sxg a;
    private final int b;
    private final Exception c;
    private final byte[] d;

    public sxf(sxg sxg, int i, Exception exc, byte[] bArr) {
        this.a = sxg;
        this.b = i;
        this.c = exc;
        this.d = bArr;
    }

    public final void run() {
        List<ResolveInfo> queryIntentActivities;
        sxg sxg = this.a;
        int i = this.b;
        Exception exc = this.c;
        byte[] bArr = this.d;
        svv svv = sxg.b.a;
        if ((i == 200 || i == 204 || i == 304) && exc == null) {
            svv.a().u.a(true);
            if (bArr.length == 0) {
                svv.E().j.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    svv.E().j.a("Deferred Deep Link is empty.");
                    return;
                }
                szj f = svv.f();
                f.i();
                if (TextUtils.isEmpty(optString) || (queryIntentActivities = f.z().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                    svv.E().f.a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gclid", optString2);
                bundle.putString("_cis", "ddp");
                svv.m.a("auto", "_cmp", bundle);
                szj f2 = svv.f();
                if (!TextUtils.isEmpty(optString)) {
                    try {
                        SharedPreferences.Editor edit = f2.z().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            f2.z().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                        }
                    } catch (Exception e) {
                        f2.E().c.a("Failed to persist Deferred Deep Link. exception", e);
                    }
                }
            } catch (JSONException e2) {
                svv.E().c.a("Failed to parse the Deferred Deep Link response. exception", e2);
            }
        } else {
            svv.E().f.a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), exc);
        }
    }
}
