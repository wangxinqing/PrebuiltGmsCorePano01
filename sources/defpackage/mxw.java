package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.TimeUnit;

/* renamed from: mxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxw extends oga {
    private final oab a;
    private final String l;

    public mxw(Context context, HelpConfig helpConfig, aoru aoru, oab oab, String str) {
        super(context, helpConfig, aoru);
        this.a = oab;
        this.l = str.charAt(0) == '/' ? str.substring(1) : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c A[Catch:{ UnsupportedEncodingException | JSONException -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x005d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair a(android.content.Context r9, com.google.android.gms.googlehelp.common.HelpConfig r10, defpackage.aoru r11, defpackage.oab r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "validation_error"
            java.lang.String r1 = "gF_URApiSuggestionCReq"
            java.lang.String r2 = "Must be called from a worker thread."
            defpackage.iva.b((java.lang.String) r2)
            mxw r2 = new mxw
            r3 = r2
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r9 = 0
            ogi r10 = r2.k()     // Catch:{ InterruptedException -> 0x006c, ExecutionException -> 0x006a, TimeoutException -> 0x0068 }
            boolean r11 = r2.a((defpackage.ogi) r10)
            if (r11 == 0) goto L_0x0066
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            byte[] r12 = r10.c     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            anaf r10 = r10.b     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            java.lang.String r10 = defpackage.oap.a(r10)     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            r11.<init>(r12, r10)     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            r10.<init>(r11)     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            boolean r11 = r10.has(r0)     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            if (r11 == 0) goto L_0x0044
            org.json.JSONArray r11 = r10.getJSONArray(r0)     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            int r11 = r11.length()     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            if (r11 > 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r10 = r9
            goto L_0x004a
        L_0x0044:
            oab r11 = r2.a     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            oab r10 = defpackage.oab.a((org.json.JSONObject) r10, (defpackage.oab) r11)     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
        L_0x004a:
            if (r10 == 0) goto L_0x0057
            oab r11 = r2.a     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            java.lang.String r11 = r11.r()     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            android.util.Pair r9 = android.util.Pair.create(r11, r10)     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            goto L_0x0067
        L_0x0057:
            java.lang.String r10 = "Unsupported/empty response received"
            android.util.Log.e(r1, r10)     // Catch:{ UnsupportedEncodingException -> 0x005f, JSONException -> 0x005d }
            goto L_0x0066
        L_0x005d:
            r10 = move-exception
            goto L_0x0060
        L_0x005f:
            r10 = move-exception
        L_0x0060:
            java.lang.String r11 = "Parsing suggestion response data failed."
            android.util.Log.e(r1, r11, r10)
            goto L_0x0067
        L_0x0066:
        L_0x0067:
            return r9
        L_0x0068:
            r10 = move-exception
            goto L_0x006d
        L_0x006a:
            r10 = move-exception
            goto L_0x006d
        L_0x006c:
            r10 = move-exception
        L_0x006d:
            java.lang.String r11 = "Fetching suggestion failed."
            android.util.Log.e(r1, r11, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxw.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, aoru, oab, java.lang.String):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    public final String b() {
        String valueOf = String.valueOf(axmj.z());
        String valueOf2 = String.valueOf(String.format(axmj.A(), new Object[]{this.l}));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return (int) TimeUnit.SECONDS.convert(axgy.k(), TimeUnit.MILLISECONDS);
    }

    public final void onPreNetworkDispatch() {
        izj.b(3074);
    }

    /* access modifiers changed from: protected */
    public final byte[] d() {
        aucd o = avml.n.o();
        String uri = (ofy.b() && ofy.b(this.c, R.attr.gf_isInDarkMode)) ? Uri.parse(this.a.e).buildUpon().appendQueryParameter("dark", "1").build().toString() : this.a.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avml avml = (avml) o.b;
        uri.getClass();
        avml.a |= 1;
        avml.b = uri;
        String a2 = oal.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avml avml2 = (avml) o.b;
        a2.getClass();
        int i = avml2.a | 16;
        avml2.a = i;
        avml2.g = a2;
        avml2.d = 1;
        avml2.a = i | 4;
        return ((avml) o.i()).k();
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axhb.a.a().c());
    }
}
