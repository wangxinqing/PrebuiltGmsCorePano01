package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: apwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apwx {
    public final Bundle a;

    public apwx(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static String e(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final String b(Resources resources, String str, String str2) {
        String a2 = a(str2);
        return TextUtils.isEmpty(a2) ? a(resources, str, str2) : a2;
    }

    public final Integer c(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a2));
        } catch (NumberFormatException e) {
            String e2 = e(str);
            StringBuilder sb = new StringBuilder(String.valueOf(e2).length() + 38 + String.valueOf(a2).length());
            sb.append("Couldn't parse value of ");
            sb.append(e2);
            sb.append("(");
            sb.append(a2);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final JSONArray d(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return new JSONArray(a2);
        } catch (JSONException e) {
            String e2 = e(str);
            StringBuilder sb = new StringBuilder(String.valueOf(e2).length() + 50 + String.valueOf(a2).length());
            sb.append("Malformed JSON for key ");
            sb.append(e2);
            sb.append(": ");
            sb.append(a2);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final boolean b(String str) {
        String a2 = a(str);
        return "1".equals(a2) || Boolean.parseBoolean(a2);
    }

    public final String a(Resources resources, String str, String str2) {
        String[] strArr;
        String a2 = a(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        int identifier = resources.getIdentifier(a2, "string", str);
        if (identifier == 0) {
            String e = e(str2.concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 49 + str2.length());
            sb.append(e);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        JSONArray d = d(str2.concat("_loc_args"));
        if (d != null) {
            int length = d.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = d.optString(i);
            }
        } else {
            strArr = null;
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            String e3 = e(str2);
            String arrays = Arrays.toString(strArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(e3).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(e3);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e2);
            return null;
        }
    }

    public final String a(String str) {
        String str2;
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (str.startsWith("gcm.n.")) {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            } else {
                str2 = str;
            }
            if (this.a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }
}
