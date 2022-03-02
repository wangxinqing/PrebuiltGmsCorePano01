package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: lbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbx extends kym {
    public lbx(String str) {
        super(str, Collections.singleton(str), Collections.emptySet(), 4300000);
    }

    public static String a(Collection collection) {
        if (collection != null) {
            return new JSONArray(collection).toString();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.getStringArrayList(this.a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return c(dataHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    public final Collection d(DataHolder dataHolder, int i, int i2) {
        try {
            return a(dataHolder.c(this.a, i, i2));
        } catch (JSONException e) {
            throw new IllegalStateException("DataHolder supplied invalid JSON", e);
        }
    }

    public static Collection a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Bundle bundle, Object obj) {
        bundle.putStringArrayList(this.a, new ArrayList((Collection) obj));
    }
}
