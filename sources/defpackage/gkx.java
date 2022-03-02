package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkx {
    private static final String b = gkx.class.getSimpleName();
    public final je a;
    private final Context c;
    private final JSONObject d = new JSONObject();

    public gkx(Context context) {
        this.c = context;
        this.a = new je(context);
    }

    public static gkx a(Context context, gkx gkx) {
        return a(context, gkx.a());
    }

    public final long b() {
        return this.d.optLong("notify_time");
    }

    public final long c() {
        return this.d.optLong("max_duration");
    }

    public final void d(CharSequence charSequence) {
        this.a.e(charSequence);
        a("content_title", (Object) charSequence.toString());
    }

    public final void e(CharSequence charSequence) {
        this.a.d(charSequence);
        a("ticker", (Object) charSequence.toString());
    }

    public static gkx a(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            gkx gkx = new gkx(context);
            gkx.b(jSONObject.optLong("notify_time"));
            gkx.a(jSONObject.optLong("max_duration"));
            gkx.a((CharSequence) jSONObject.optString("big_text"));
            gkx.a(Uri.parse(jSONObject.optString("content_intent_view")));
            gkx.c(jSONObject.optString("content_text"));
            gkx.d(jSONObject.optString("content_title"));
            gkx.b(jSONObject.optBoolean("key_ongoing"));
            gkx.a(jSONObject.optInt("small_icon"));
            gkx.e(jSONObject.optString("ticker"));
            gkx.a(jSONObject.optBoolean("auto_cancel"));
            gkx.b((CharSequence) jSONObject.optString("channel"));
            return gkx;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void b(long j) {
        a("notify_time", (Object) String.valueOf(j));
    }

    public final void c(CharSequence charSequence) {
        this.a.b(charSequence);
        a("content_text", (Object) charSequence.toString());
    }

    public final void b(CharSequence charSequence) {
        this.a.z = charSequence.toString();
        a("channel", (Object) charSequence.toString());
    }

    public final void b(boolean z) {
        this.a.b(z);
        a("key_ongoing", (Object) Boolean.valueOf(z));
    }

    private final void a(String str, Object obj) {
        try {
            this.d.put(str, obj);
        } catch (JSONException e) {
            Log.w(b, "JSONException putting field into object!", e);
        }
    }

    public final String a() {
        return this.d.toString();
    }

    public final void a(int i) {
        this.a.b(i);
        a("small_icon", (Object) Integer.valueOf(i));
    }

    public final void a(long j) {
        a("max_duration", (Object) String.valueOf(j));
    }

    public final void a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        this.a.f = PendingIntent.getActivity(this.c, 0, intent, 134217728);
        a("content_intent_view", (Object) uri.toString());
    }

    public final void a(CharSequence charSequence) {
        je jeVar = this.a;
        jd jdVar = new jd();
        jdVar.a(charSequence);
        jeVar.a((jh) jdVar);
        a("big_text", (Object) charSequence.toString());
    }

    public final void a(boolean z) {
        this.a.a(z);
        a("auto_cancel", (Object) Boolean.valueOf(z));
    }
}
