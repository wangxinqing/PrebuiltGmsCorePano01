package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.SetResourceParentsRequest;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: kgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgw extends key {
    private final SetResourceParentsRequest f;

    public kgw(kec kec, SetResourceParentsRequest setResourceParentsRequest, kwg kwg) {
        super("SetResourceParentsOperation", kec, kwg, 20);
        this.f = setResourceParentsRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid set parents request.");
        njc.a((Object) this.f.a, "Invalid set parents request: no target id provided.");
        njc.a((Object) this.f.b, "Invalid set parents request: no parent id list provided.");
        kec kec = this.a;
        SetResourceParentsRequest setResourceParentsRequest = this.f;
        DriveId driveId = setResourceParentsRequest.a;
        List list = setResourceParentsRequest.b;
        lfq lfq = this.c;
        if (!kec.c(driveId)) {
            kmp b = kec.b(driveId);
            boolean ai = b.ai();
            if (ai) {
                kec.a(driveId, "Cannot set parents of the App folder.");
            }
            ArrayList arrayList = new ArrayList(list);
            Set a = kec.e.a(kec.d, b);
            arrayList.removeAll(a);
            Set a2 = kec.a(driveId, ai, (List) arrayList, b.aj());
            a.removeAll(list);
            kec.a((Iterable) a);
            HashSet hashSet = new HashSet(list);
            hashSet.addAll(kec.e.b(kec.d, b));
            if (b.w()) {
                kec.a(driveId, (Iterable) hashSet);
            }
            lfq.a(b);
            knc a3 = b.a();
            khq khq = kec.d;
            if (kec.g.a(new kbr(khq.a, khq.c, a3, hashSet, a2, kbi.NORMAL)) == 0) {
                this.b.b();
                return;
            }
            throw new nja(8, "Failed to process update");
        }
        throw new nja(10, "Cannot set parents of the root folder.");
    }
}
