package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.auth.firstparty.dataservice.PasswordSettings;
import com.google.android.gms.auth.firstparty.dataservice.PinSettings;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: elw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elw {
    private static final SparseArray c;
    public final fyk a;
    public final qub b;
    private final eny d;

    static {
        SparseArray sparseArray = new SparseArray(3);
        c = sparseArray;
        sparseArray.append(7, 4);
        c.append(3, 3);
        c.append(16, 5);
    }

    public elw(fyk fyk) {
        qub a2 = qub.a((Context) ihs.b());
        eny eny = (eny) eny.a.b();
        amrl.a((Object) fyk);
        this.a = fyk;
        amrl.a((Object) a2);
        this.b = a2;
        amrl.a((Object) eny);
        this.d = eny;
    }

    public static final int a(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("errorCode", -1);
        if (optInt == -1) {
            return -1;
        }
        Object[] objArr = {Integer.valueOf(optInt), jSONObject.optString("errorMessage", (String) null)};
        Integer num = (Integer) c.get(optInt);
        if (num == null) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unknown errorCode: ");
            sb.append(optInt);
            Log.w("ReauthClient", sb.toString());
            num = 1;
        }
        return num.intValue();
    }

    public final ReauthSettingsResponse a(ReauthSettingsRequest reauthSettingsRequest) {
        String str;
        ReauthSettingsResponse reauthSettingsResponse;
        ReauthSettingsRequest reauthSettingsRequest2 = reauthSettingsRequest;
        amrl.a((Object) reauthSettingsRequest);
        Account account = reauthSettingsRequest2.d;
        amrl.a((Object) account);
        String str2 = this.a.d;
        String str3 = reauthSettingsRequest2.e;
        if (str3 != null) {
            str2 = str3;
        }
        if (!reauthSettingsRequest2.c) {
            str = (String) this.d.a(account, eqb.j);
            if (str == null) {
                Log.i("ReauthClient", "Reauth settings not cached. Set force=true to hit server.");
                return null;
            }
        } else {
            String a2 = this.b.a(account);
            if (!TextUtils.isEmpty(a2)) {
                try {
                    String b2 = this.a.b(str2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("token", a2);
                    hashMap.put("packageName", str2);
                    hashMap.put("packageSignature", b2);
                    str = a((String) ent.b.c(), str2, hashMap);
                } catch (IOException e) {
                    Log.w("ReauthClient", "Network error calling reauth settings.", e);
                    return new ReauthSettingsResponse(2);
                }
            } else {
                Log.w("ReauthClient", "Not able to getReauthSettings. No LST for the account.");
                return new ReauthSettingsResponse(5);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int a3 = a(jSONObject);
            if (a3 == -1) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("password");
                JSONObject jSONObject3 = jSONObject.getJSONObject("pin");
                reauthSettingsResponse = new ReauthSettingsResponse(1, 0, new PasswordSettings(2, jSONObject2.getString("status"), jSONObject2.optString("recovery_url", (String) null)), new PinSettings(2, jSONObject3.getString("status"), jSONObject3.optString("reset_url", (String) null), jSONObject3.optString("setup_url", (String) null), jSONObject3.optString("recovery_url", (String) null), jSONObject3.optInt("length")));
            } else {
                reauthSettingsResponse = new ReauthSettingsResponse(a3);
            }
            if (reauthSettingsResponse.b == 0) {
                this.d.b(account, eqb.j, str);
            }
            return reauthSettingsResponse;
        } catch (JSONException e2) {
            Log.e("ReauthClient", "Error deserializing reauth settings response.", e2);
            return new ReauthSettingsResponse(1);
        }
    }

    public final String a(String str, String str2, Map map) {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry entry : map.entrySet()) {
            linkedList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        return emt.b(emt.a(str, str2, new UrlEncodedFormEntity(linkedList), this.a.a));
    }
}
