package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.ParentReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: kza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kza extends lao {
    public kza(kym kym, lcv lcv) {
        super(kym, false, lcv);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return null;
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Cannot query Drive API v2 for a collection of items.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(this.b.a());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(DriveId.b(jSONArray.getString(i)));
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ String a(Object obj, String str) {
        return lak.a.b((DriveId) obj, str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (DriveId driveId : (Collection) obj) {
            String str = driveId.a;
            if (str != null && !"root".equals(str)) {
                ParentReference parentReference = new ParentReference();
                if (driveId.a.startsWith("appdata")) {
                    parentReference.e("appdata");
                } else {
                    parentReference.e(driveId.a);
                }
                parentReference.c = false;
                parentReference.a.add(3);
                arrayList.add(parentReference);
            }
        }
        file.a((List) arrayList);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Cannot currently set collections.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        JSONArray jSONArray = new JSONArray();
        for (DriveId a : (Collection) obj) {
            jSONArray.put(a.a());
        }
        jSONObject.put(this.b.a(), jSONArray);
    }
}
