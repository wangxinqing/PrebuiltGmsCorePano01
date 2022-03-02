package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: kdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdo {
    public static final kdo a = new kdo(0, false, true, Collections.emptyList(), (String) null, true);
    public final int b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final String f;
    public final boolean g;

    public kdo(int i, boolean z, boolean z2, List list, String str, boolean z3) {
        this.b = i;
        this.c = z;
        this.d = z2;
        iva.a((Object) list);
        this.e = list;
        this.f = str;
        this.g = z3;
    }

    public static kdo a(int i, boolean z, boolean z2, String str, String str2, boolean z3) {
        njc.a(jzn.b(i), "Invalid conflict strategy");
        return new kdo(i, z, z2, str == null ? Collections.emptyList() : Collections.singletonList(str), str2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kdo kdo = (kdo) obj;
            return this.b == kdo.b && this.c == kdo.c && this.d == kdo.d && ius.a(this.e, kdo.e) && ius.a(this.f, kdo.f) && this.g == kdo.g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g)});
    }

    public static kdo a(JSONObject jSONObject) {
        boolean z;
        int i = jSONObject.has("conflictStrategy") ? jSONObject.getInt("conflictStrategy") : a.b;
        boolean z2 = jSONObject.has("notifyOnCompletion") ? jSONObject.getBoolean("notifyOnCompletion") : a.c;
        if (jSONObject.has("usesDefaultAccount")) {
            z = jSONObject.getBoolean("usesDefaultAccount");
        } else {
            z = lrv.a(jSONObject, "unresolvedAccountName") == null ? a.d : false;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("operationTag")) {
            Object obj = jSONObject.get("operationTag");
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(jSONArray.getString(i2));
                }
            } else {
                arrayList.add(String.valueOf(obj));
            }
        }
        return new kdo(i, z2, z, arrayList, jSONObject.has("binderPackageName") ? jSONObject.getString("binderPackageName") : a.f, jSONObject.has("mustCreateNewRevision") ? jSONObject.getBoolean("mustCreateNewRevision") : a.g);
    }

    public final boolean a() {
        return jzn.a(this.b);
    }

    public final boolean a(kdo kdo) {
        return !a() && !kdo.a() && this.b == kdo.b && this.c == kdo.c && this.d == kdo.d && ius.a(this.f, kdo.f) && !this.g;
    }
}
