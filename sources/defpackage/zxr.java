package defpackage;

import android.util.Pair;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zxr implements acvz {
    private final zyg a;

    public zxr(zyg zyg) {
        this.a = zyg;
    }

    public final acwa a(Object obj) {
        zyg zyg = this.a;
        ArrayList arrayList = new ArrayList();
        for (BackedUpContactsPerDeviceEntity a2 : (List) obj) {
            arrayList.add(zyg.b.a(a2));
        }
        return acws.a((Object) Pair.create("footprint_backup", arrayList));
    }
}
