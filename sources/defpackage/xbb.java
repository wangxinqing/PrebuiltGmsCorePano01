package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: xbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbb extends wzu {
    private final idg a;

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        ArrayList<String> arrayList;
        Status a2 = xbi.a(i, bundle);
        ArrayList<String> arrayList2 = null;
        if (a2.c()) {
            arrayList2 = bundle2.getStringArrayList("added_circles");
            arrayList = bundle2.getStringArrayList("removed_circles");
        } else {
            arrayList = null;
        }
        this.a.a((Object) new xbc(a2, arrayList2, arrayList));
    }

    public xbb(idg idg) {
        this.a = idg;
    }
}
