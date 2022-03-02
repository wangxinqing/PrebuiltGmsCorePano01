package defpackage;

import android.util.Pair;
import com.google.android.gms.backup.ParcelableDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zxx implements acvz {
    public final acwa a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (ParcelableDevice parcelableDevice : (List) obj) {
            arrayList.add((gsj) aucj.a((aucj) gsj.g, parcelableDevice.a, aubs.c()));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gsj gsj = (gsj) arrayList.get(i);
            if (gsj.e >= azfh.a.a().m()) {
                zyh zyh = new zyh((String) null, gsj.d);
                zyh.b = Long.valueOf(gsj.b);
                zyh.k = gsj;
                zyh.d = gsj.c;
                arrayList2.add(zyh.a());
            } else {
                String valueOf = String.valueOf(gsj.d);
                if (valueOf.length() == 0) {
                    new String("Skipping GMS backup from API level P and below : ");
                } else {
                    "Skipping GMS backup from API level P and below : ".concat(valueOf);
                }
            }
        }
        return acws.a((Object) Pair.create("gms_backup", arrayList2));
    }
}
