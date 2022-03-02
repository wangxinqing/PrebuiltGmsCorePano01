package defpackage;

import com.google.android.gms.drive.DriveId;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: lrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrv {
    public static String a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static Set a(JSONArray jSONArray) {
        iva.a((Object) jSONArray);
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(DriveId.b(jSONArray.getString(i)));
        }
        return hashSet;
    }

    public static JSONArray a(Set set) {
        iva.a((Object) set);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(((DriveId) it.next()).a());
        }
        return jSONArray;
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
    }
}
