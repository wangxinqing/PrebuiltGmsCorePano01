package defpackage;

import android.content.ContentValues;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ilm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ilm {
    public final String[] a;
    public final ArrayList b = new ArrayList();

    public final int a() {
        return this.b.size();
    }

    public /* synthetic */ ilm(String[] strArr) {
        this.a = (String[]) iva.a((Object) strArr);
        new HashMap();
    }

    public final DataHolder a(int i) {
        return new DataHolder(this, i, (Bundle) null);
    }

    public final DataHolder a(int i, Bundle bundle) {
        return new DataHolder(this.a, DataHolder.a(this), i, bundle);
    }

    public void a(ContentValues contentValues) {
        irk.b(contentValues);
        HashMap hashMap = new HashMap(contentValues.size());
        for (Map.Entry next : contentValues.valueSet()) {
            hashMap.put((String) next.getKey(), next.getValue());
        }
        a(hashMap);
    }

    public void a(HashMap hashMap) {
        irk.b(hashMap);
        this.b.add(hashMap);
    }
}
