package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.internal.AddPermissionRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kev extends kfa {
    private final AddPermissionRequest f;

    public kev(kec kec, AddPermissionRequest addPermissionRequest, kwg kwg) {
        super("AddPermissionOperation", kec, kwg, (String) jzq.aj.c(), 48);
        this.f = addPermissionRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE);
    }

    public final void c(Context context) {
        njc.a((Object) this.f, "Invalid addPermission request.");
        njc.a((Object) this.f.a, "Invalid addPermission request - No DriveId");
        njc.a((Object) this.f.b, "Invalid addPermission request - No Permission");
        AddPermissionRequest addPermissionRequest = this.f;
        boolean z = addPermissionRequest.e;
        String str = addPermissionRequest.f;
        this.c.a(z, str != null, (Integer) null);
        Permission permission = this.f.b;
        this.c.a(permission.b(), permission.c());
        kec kec = this.a;
        AddPermissionRequest addPermissionRequest2 = this.f;
        DriveId driveId = addPermissionRequest2.a;
        boolean z2 = addPermissionRequest2.c;
        String str2 = addPermissionRequest2.d;
        lfq lfq = this.c;
        kec.h(driveId);
        kmp b = kec.b(driveId);
        lfq.a(b);
        kmu a = kec.e.a(b, permission.a());
        if (a == null || a.b()) {
            lrz.a(kec.d.a, b, permission.a(), permission.c(), -100, permission.b());
            khq khq = kec.d;
            if (kec.g.a(new kal(khq.a, khq.c, b.a(), permission, z2, str2, kec.a(z, str)), lfq) == 0) {
                this.b.b();
                return;
            }
            throw new nja(8, "Failed to process addPermission request.");
        }
        String valueOf = String.valueOf(permission.a());
        throw new nja(10, valueOf.length() == 0 ? new String("Permission already exists for account identifier:") : "Permission already exists for account identifier:".concat(valueOf));
    }
}
