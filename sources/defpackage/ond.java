package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: ond  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ond extends ogg {
    private final String a;

    public ond(Context context, HelpConfig helpConfig, aoru aoru, okc okc, String str) {
        super(context, helpConfig, aoru, okc, 181);
        Uri.Builder encodedPath = Uri.parse(axmj.a.a().e()).buildUpon().encodedPath(axmj.a.a().O());
        String a2 = helpConfig.a(nzh.o);
        try {
            a2 = URLEncoder.encode(a2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(a2);
            Log.e("gH_GetQSuggestionsCRq", valueOf.length() == 0 ? new String("Failed to encode ") : "Failed to encode ".concat(valueOf));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 26 + String.valueOf(a2).length() + String.valueOf(a2).length());
        sb.append("client=");
        sb.append(a2);
        sb.append("&gs_ri=");
        sb.append(a2);
        sb.append("&ds=");
        sb.append(a2);
        sb.append("&hjson=t");
        Uri.Builder appendQueryParameter = encodedPath.encodedQuery(sb.toString()).appendQueryParameter("hl", Locale.getDefault().getLanguage());
        int i = helpConfig.i();
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append("productId:");
        sb2.append(i);
        this.a = appendQueryParameter.appendQueryParameter("requiredfields", sb2.toString()).appendQueryParameter("q", str).build().toString();
    }

    public static List a(Context context, HelpConfig helpConfig, aoru aoru, okc okc, String str) {
        iva.b("Must be called from a worker thread.");
        ond ond = new ond(context, helpConfig, aoru, okc, str);
        try {
            ogi k = ond.k();
            if (!ond.a(k)) {
                Log.e("gH_GetQSuggestionsCRq", String.format("No data returned for autocomplete suggestions. Got %d status code", new Object[]{Integer.valueOf(k.a)}));
                return Collections.emptyList();
            }
            try {
                String str2 = new String(k.c, oap.a(k.b));
                Context context2 = ond.c;
                HelpConfig helpConfig2 = ond.d;
                JSONArray jSONArray = new JSONArray(str2).getJSONArray(1);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    omv omv = new omv(jSONArray.getJSONArray(i), context2, helpConfig2);
                    if (omv.a != -1) {
                        arrayList.add(omv);
                    }
                }
                return arrayList;
            } catch (UnsupportedEncodingException | JSONException e) {
                Log.e("gH_GetQSuggestionsCRq", "Parsing autocomplete suggestions failed.", e);
                return Collections.emptyList();
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_GetQSuggestionsCRq", "Fetching query suggestions failed.", e2);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final String h() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().b());
    }
}
