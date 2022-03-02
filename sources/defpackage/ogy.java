package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ogy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ogy extends ohc {
    final /* synthetic */ HelpChimeraActivity a;
    final /* synthetic */ nzv b;

    public ogy(HelpChimeraActivity helpChimeraActivity, nzv nzv) {
        this.a = helpChimeraActivity;
        this.b = nzv;
    }

    @JavascriptInterface
    public void prefetchResults(String str) {
        oab a2;
        ofn ofn = this.a.k;
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject.has("url")) {
                        String string = jSONObject.getString("url");
                        if (!TextUtils.isEmpty(string) && (a2 = oab.a(string, this.b.d(), this.a.x)) != null) {
                            String a3 = ofn.a(string);
                            if (!TextUtils.isEmpty(a3)) {
                                a2.l = a3;
                            }
                            arrayList.add(a2);
                        }
                    }
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder(84);
                    sb.append("Couldn't parse the JSON for a search results (rank: ");
                    sb.append(i);
                    sb.append("). Can't prefetch it.");
                    Log.e("gH_HelpContentFragment", sb.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                HelpChimeraActivity helpChimeraActivity = this.a;
                ook.a(helpChimeraActivity.c, helpChimeraActivity, ofn, arrayList);
            }
        } catch (JSONException e2) {
            Log.e("gH_HelpContentFragment", "Couldn't parse the search results JSON. Can't prefetch");
        }
    }
}
