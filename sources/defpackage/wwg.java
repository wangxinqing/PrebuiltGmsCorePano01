package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wwg {
    protected final wwf a;

    public wwg(wwf wwf) {
        this.a = wwf;
    }

    public static Object a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean z = true;
        if (arrayList.size() != 1) {
            z = false;
        }
        iva.a(z);
        return arrayList.get(0);
    }

    public abstract String a();

    public abstract String b();

    public abstract boolean c();

    public abstract String d();

    public abstract int e();

    public abstract String f();

    public abstract List g();

    public abstract List h();

    public abstract List i();

    public abstract List j();

    public static ArrayList a(DataHolder dataHolder, int i) {
        ArrayList arrayList = new ArrayList();
        if (dataHolder != null) {
            for (int i2 = 0; i2 < dataHolder.h; i2++) {
                if (i == dataHolder.b("ordinal", i2, dataHolder.a(i2))) {
                    arrayList.add(new wwf(dataHolder, i2));
                } else if (!arrayList.isEmpty()) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        return this.a.j(str);
    }
}
