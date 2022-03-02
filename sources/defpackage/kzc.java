package defpackage;

import com.google.android.gms.drive.internal.model.File;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: kzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kzc extends lao {
    public kzc(kym kym, lcv lcv) {
        super(kym, true, lcv);
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Cannot query Drive API v2 for a collection of items.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return kmp.S();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(this.b.a());
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ String a(Object obj, String str) {
        return lso.b((String) obj);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        Collection collection = (Collection) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        Collection collection = (Collection) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.b.a(), new JSONArray((Collection) obj));
    }
}
