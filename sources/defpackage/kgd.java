package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.GetPermissionsRequest;
import com.google.android.gms.drive.internal.GetPermissionsResponse;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: kgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgd extends kfa {
    private final GetPermissionsRequest f;

    public kgd(kec kec, GetPermissionsRequest getPermissionsRequest, kwg kwg) {
        super("GetPermissionsOperation", kec, kwg, (String) jzq.aj.c(), 51);
        this.f = getPermissionsRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE);
    }

    public final void c(Context context) {
        Pair pair;
        njc.a((Object) this.f, "Invalid getPermissions request.");
        njc.a((Object) this.f.a, "Invalid getPermissions request.");
        kec kec = this.a;
        DriveId driveId = this.f.a;
        lfq lfq = this.c;
        kmp a = kec.a(kec.d, driveId);
        int i = 0;
        if (a == null || a.al() < a.ae()) {
            if (driveId.a != null) {
                a = kec.g(driveId);
            }
            if (a != null) {
                lfq.a(a);
                if (a.al() < a.ae()) {
                    i = -1;
                }
                pair = Pair.create(kec.a(a), Integer.valueOf(i));
            } else {
                throw kec.m();
            }
        } else {
            lfq.a(a);
            pair = Pair.create(kec.a(a), 0);
        }
        this.b.a(new GetPermissionsResponse((List) pair.first, ((Integer) pair.second).intValue()));
    }
}
