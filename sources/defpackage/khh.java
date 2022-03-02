package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.UpdatePermissionRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: khh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khh extends kfa {
    private final UpdatePermissionRequest f;

    public khh(kec kec, UpdatePermissionRequest updatePermissionRequest, kwg kwg) {
        super("UpdatePermissionOperation", kec, kwg, (String) jzq.aj.c(), 49);
        this.f = updatePermissionRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE);
    }

    public final void c(Context context) {
        boolean z;
        kmp kmp;
        njc.a((Object) this.f, "Invalid updatePermission request.");
        njc.a((Object) this.f.a, "Invalid updatePermission request - No DriveId");
        UpdatePermissionRequest updatePermissionRequest = this.f;
        boolean z2 = updatePermissionRequest.d;
        String str = updatePermissionRequest.e;
        lfq lfq = this.c;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        lfq.a(z2, z, (Integer) null);
        kec kec = this.a;
        UpdatePermissionRequest updatePermissionRequest2 = this.f;
        DriveId driveId = updatePermissionRequest2.a;
        String str2 = updatePermissionRequest2.b;
        int i = updatePermissionRequest2.c;
        lfq lfq2 = this.c;
        kec.h(driveId);
        kmp b = kec.b(driveId);
        lfq2.a(b);
        kmu a = kec.e.a(b, str2);
        if (a == null) {
            kmp g = kec.g(driveId);
            a = kec.e.a(g, str2);
            kmp = g;
        } else {
            kmp = b;
        }
        if (a == null || a.b()) {
            throw new nja(10, "The permission to update doesn't exist.");
        }
        lfq2.a(a.d, i);
        lrz.a(kec.d.a, kmp, str2, i, a.f, a.d);
        khq khq = kec.d;
        kkz kkz = khq.a;
        AppIdentity appIdentity = khq.c;
        knc a2 = kmp.a();
        kdo a3 = kec.a(z2, str);
        kcl kcl = r6;
        kcl kcl2 = new kcl(kkz, appIdentity, a2, str2, i, a3);
        int a4 = kec.g.a(kcl, lfq2);
        if (a4 == 0) {
            this.b.b();
        } else if (a4 != 6) {
            throw new nja(8, "Failed to process updatePermission request.");
        } else {
            throw new nja(10, "The permission to update doesn't exist.");
        }
    }
}
