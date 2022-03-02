package defpackage;

import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.Property;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: laq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class laq extends lbc {
    public static final String a = String.format(Locale.US, "'%s'", new Object[]{"PUBLIC"});

    static {
        Locale locale = Locale.US;
        new Object[1][0] = "PRIVATE";
    }

    public laq() {
        super(lce.L, false, lcw.q);
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        boolean z;
        Iterator it = ((AppVisibleCustomProperties) obj).iterator();
        CustomProperty customProperty = (CustomProperty) it.next();
        iva.b(!it.hasNext(), "value should have only 1 element");
        if (customProperty.b != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Custom property value may not be null.");
        ArrayList arrayList = new ArrayList();
        arrayList.add(lck.c("key", lso.b(customProperty.a.a)));
        arrayList.add(lck.c("value", lso.b(customProperty.b)));
        if (customProperty.a.b == 1) {
            arrayList.add(lck.c("app_id", lso.b(str)));
        } else {
            arrayList.add(lck.c("visibility", a));
        }
        return lck.a((List) arrayList).b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        List a2 = kmp.a(str, false);
        lbh lbh = new lbh();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            krl krl = (krl) a2.get(i);
            lbh.a(new CustomProperty(new CustomPropertyKey(krl.d(), krl.h() ^ true ? 1 : 0), krl.e()));
        }
        return lbh.a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str, Object obj) {
        lbh lbh = new lbh();
        Map a2 = ((AppVisibleCustomProperties) a(kmp, str)).a();
        Iterator it = ((AppVisibleCustomProperties) obj).iterator();
        while (it.hasNext()) {
            CustomPropertyKey customPropertyKey = ((CustomProperty) it.next()).a;
            if (a2.containsKey(customPropertyKey)) {
                lbh.a(customPropertyKey, (String) a2.get(customPropertyKey));
            } else {
                lbh.a(customPropertyKey, (String) null);
            }
        }
        return lbh.a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        lbh lbh = new lbh();
        JSONArray jSONArray = jSONObject.getJSONArray(this.b.a());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            lbh.a(new CustomPropertyKey(jSONObject2.getString("key"), jSONObject2.getInt("visibility")), !jSONObject2.isNull("value") ? jSONObject2.getString("value") : null);
        }
        return lbh.a();
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) obj;
        throw new UnsupportedOperationException("Cannot convert Custom Properties directly to a database value.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        String str;
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) obj;
        ArrayList arrayList = new ArrayList(appVisibleCustomProperties.b.size());
        Iterator it = appVisibleCustomProperties.iterator();
        while (it.hasNext()) {
            CustomProperty customProperty = (CustomProperty) it.next();
            Property property = new Property();
            property.c = customProperty.a.a;
            property.a.add(4);
            if (customProperty.a.b != 0) {
                str = "PRIVATE";
            } else {
                str = "PUBLIC";
            }
            property.e = str;
            property.a.add(8);
            property.d = customProperty.b;
            property.a.add(7);
            arrayList.add(property);
        }
        file.I = arrayList;
        file.a.add(54);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        String str2;
        Iterator it = ((AppVisibleCustomProperties) obj).iterator();
        while (it.hasNext()) {
            CustomProperty customProperty = (CustomProperty) it.next();
            CustomPropertyKey customPropertyKey = customProperty.a;
            if (customPropertyKey.b == 1) {
                str2 = str;
            } else {
                str2 = null;
            }
            kmp.a(customPropertyKey.a, str2).a(customProperty.b, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((AppVisibleCustomProperties) obj).iterator();
        while (it.hasNext()) {
            CustomProperty customProperty = (CustomProperty) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", customProperty.a.a);
            jSONObject2.put("visibility", customProperty.a.b);
            Object obj2 = customProperty.b;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject2.put("value", obj2);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(this.b.a(), jSONArray);
    }
}
