package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.ChangeResourceParentsRequest;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: kfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfh extends key {
    private final ChangeResourceParentsRequest f;

    public kfh(kec kec, ChangeResourceParentsRequest changeResourceParentsRequest, kwg kwg) {
        super("ChangeResourceParentsOperation", kec, kwg, 63);
        this.f = changeResourceParentsRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid change parents request.");
        njc.a((Object) this.f.a, "Invalid change parents request: no target id provided.");
        njc.a((Object) this.f.b, "Invalid set parents request: no add parent id list provided.");
        njc.a((Object) this.f.c, "Invalid set parents request: no remove parent id list provided.");
        kec kec = this.a;
        ChangeResourceParentsRequest changeResourceParentsRequest = this.f;
        DriveId driveId = changeResourceParentsRequest.a;
        List list = changeResourceParentsRequest.b;
        List list2 = changeResourceParentsRequest.c;
        lfq lfq = this.c;
        if (!kec.c(driveId)) {
            kmp b = kec.b(driveId);
            boolean ai = b.ai();
            if (ai) {
                kec.a(driveId, "Cannot set parents of the App folder.");
            }
            Set a = kec.a(driveId, ai, list, b.aj());
            kec.a((Iterable) list2);
            if (b.w()) {
                kec.a(driveId, (Iterable) list);
            }
            lfq.a(b);
            knc a2 = b.a();
            khq khq = kec.d;
            if (kec.g.a(new kar(khq.a, khq.c, a2, new ob((Collection) list), new ob((Collection) list2), a)) == 0) {
                this.b.b();
                return;
            }
            throw new nja(8, "Failed to process update");
        }
        throw new nja(10, "Cannot set parents of the root folder.");
    }
}
