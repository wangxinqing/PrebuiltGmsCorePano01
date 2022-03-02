package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import java.util.List;

/* renamed from: afie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afie {
    public static afhu a(MdhFootprint mdhFootprint, aubq aubq) {
        if (mdhFootprint != null) {
            return new afhu(mdhFootprint.a, mdhFootprint.b, mdhFootprint.c, aubq);
        }
        return null;
    }

    public static LatestFootprintFilter a(afhr afhr) {
        if (afhr == null) {
            return null;
        }
        ryc a = LatestFootprintFilter.a();
        List list = ((afho) afhr).a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            afhv afhv = (afhv) list.get(i);
            a.a(afhv.a(), afhv.b());
        }
        return a.a();
    }
}
