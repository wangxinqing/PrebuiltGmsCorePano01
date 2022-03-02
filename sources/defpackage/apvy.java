package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: apvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvy {
    static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || !a.containsKey(string)) {
                String valueOf = String.valueOf(str);
                return apvs.a(valueOf.length() == 0 ? new String("WEB_INTERNAL_ERROR:") : "WEB_INTERNAL_ERROR:".concat(valueOf));
            }
            String str2 = (String) a.get(string);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
            sb.append(str2);
            sb.append(":");
            sb.append(string2);
            return apvs.a(sb.toString());
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(localizedMessage).length());
            sb2.append("WEB_INTERNAL_ERROR:");
            sb2.append(str);
            sb2.append("[ ");
            sb2.append(localizedMessage);
            sb2.append(" ]");
            return apvs.a(sb2.toString());
        }
    }

    public static Status b(Intent intent) {
        iva.a((Object) intent);
        iva.b(a(intent));
        return (Status) ivy.a(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static void a(Intent intent, Status status) {
        ivy.a((SafeParcelable) status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean a(Intent intent) {
        iva.a((Object) intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
