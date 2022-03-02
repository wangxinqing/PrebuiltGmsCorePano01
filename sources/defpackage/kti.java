package defpackage;

import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kti {
    public static anax a(JSONArray jSONArray) {
        anav anav = new anav();
        int i = 0;
        while (i < jSONArray.length()) {
            String string = jSONArray.getString(i);
            DriveSpace a = DriveSpace.a(string);
            if (a != null) {
                anav.b(a);
                i++;
            } else {
                String valueOf = String.valueOf(string);
                throw new JSONException(valueOf.length() == 0 ? new String("Invalid Drive space: ") : "Invalid Drive space: ".concat(valueOf));
            }
        }
        return anav.a();
    }

    static anax b(JSONObject jSONObject) {
        if (jSONObject.has("spaces")) {
            return a(jSONObject.getJSONArray("spaces"));
        }
        return anfv.a;
    }

    public static String a(ChangesAvailableOptions changesAvailableOptions, String str, Set set, long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionsSizeLimit", changesAvailableOptions.a);
        jSONObject.put("optionsRepeats", changesAvailableOptions.b);
        jSONObject.put("sequenceNumber", j);
        jSONObject.putOpt("optionsSpaces", a(changesAvailableOptions.a()));
        jSONObject.putOpt("account", str);
        jSONObject.put("spaces", a(set));
        return jSONObject.toString();
    }

    static String a(JSONObject jSONObject) {
        if (jSONObject.has("account")) {
            return jSONObject.getString("account");
        }
        return null;
    }

    public static JSONArray a(Set set) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(((DriveSpace) it.next()).f);
        }
        return jSONArray;
    }
}
