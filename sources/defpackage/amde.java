package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: amde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amde {
    public int a;
    public final ov b;

    public amde() {
        this.a = 0;
        this.b = new ov();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amde) {
            amde amde = (amde) obj;
            if (amde.a == this.a) {
                for (int i = 0; i < this.b.c(); i++) {
                    if (!((List) this.b.d(i)).equals(amde.b.a(this.b.c(i)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.b.c(); i2++) {
            arrayList.add(Integer.valueOf(this.b.c(i2)));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) arrayList.get(i3);
            i = (((i * 37) + num.intValue()) * 37) + ((List) this.b.a(num.intValue())).hashCode();
        }
        return i;
    }

    public amde(amde amde) {
        this.a = 0;
        ov a2 = amde.b.clone();
        amrl.a((Object) a2);
        this.b = a2;
        this.a = amde.a;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("size", this.a);
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 0; i < this.b.c(); i++) {
                JSONArray jSONArray = new JSONArray();
                for (amdd amdd : (List) this.b.d(i)) {
                    jSONArray.put(new JSONObject().put("md5", amdd.b).put("start", amdd.a));
                }
                jSONObject2.putOpt(Integer.toString(this.b.c(i)), jSONArray);
            }
            jSONObject.put("map", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            return super.toString();
        }
    }
}
