package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wwi extends wwg {
    private final List b;
    private final List c;
    private final List d;
    private final List e;

    public wwi(wwf wwf, DataHolder dataHolder, DataHolder dataHolder2, DataHolder dataHolder3, DataHolder dataHolder4, int i) {
        super(wwf);
        ArrayList arrayList = new ArrayList();
        ArrayList a = wwg.a(dataHolder4, i);
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new wwc((wwf) a.get(i2)));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList a2 = wwg.a(dataHolder, i);
        int size2 = a2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            wwf wwf2 = (wwf) a2.get(i3);
            arrayList2.add(new wwb(wwf2.j("postal_address"), wwf2.j("type")));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList a3 = wwg.a(dataHolder2, i);
        int size3 = a3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            wwf wwf3 = (wwf) a3.get(i4);
            arrayList3.add(new wwd(wwf3.j("email"), wwf3.j("type")));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList a4 = wwg.a(dataHolder3, i);
        int size4 = a4.size();
        for (int i5 = 0; i5 < size4; i5++) {
            wwf wwf4 = (wwf) a4.get(i5);
            arrayList4.add(new wwe(wwf4.j("phone"), wwf4.j("type")));
        }
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
    }

    public final String a() {
        return a("name");
    }

    public final String b() {
        return a("gaia_id");
    }

    public final boolean c() {
        return this.a.h("name_verified");
    }

    public final String d() {
        return a("tagline");
    }

    public final int e() {
        return this.a.i("profile_type");
    }

    public final String f() {
        return a("avatar");
    }

    public final List g() {
        return this.b;
    }

    public final List h() {
        return this.c;
    }

    public final List i() {
        return this.e;
    }

    public final List j() {
        return this.d;
    }
}
