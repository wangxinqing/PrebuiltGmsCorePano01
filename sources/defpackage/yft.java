package defpackage;

import java.util.ArrayList;

/* renamed from: yft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class yft implements amsv {
    static final amsv a = new yft();

    private yft() {
    }

    public final Object a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("packageName");
        arrayList.add("version");
        arrayList.add("params");
        arrayList.add("dynamicParams");
        arrayList.add("weak");
        arrayList.add("androidPackageName");
        arrayList.add("isSynced");
        arrayList.add("serializedDeclarativeRegInfo");
        if (((Integer) yfw.b.a()).intValue() >= 23) {
            arrayList.add("configTier");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
