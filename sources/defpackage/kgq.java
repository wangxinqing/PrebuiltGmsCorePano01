package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.RemovePermissionRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgq extends kfa {
    private final RemovePermissionRequest f;

    public kgq(kec kec, RemovePermissionRequest removePermissionRequest, kwg kwg) {
        super("RemovePermissionOperation", kec, kwg, (String) jzq.aj.c(), 50);
        this.f = removePermissionRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE);
    }

    public final void c(Context context) {
        boolean z;
        kmp kmp;
        njc.a((Object) this.f, "Invalid removePermission request.");
        njc.a((Object) this.f.a, "Invalid removePermission request - No DriveId");
        RemovePermissionRequest removePermissionRequest = this.f;
        boolean z2 = removePermissionRequest.c;
        String str = removePermissionRequest.d;
        lfq lfq = this.c;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        lfq.a(z2, z, (Integer) null);
        kec kec = this.a;
        RemovePermissionRequest removePermissionRequest2 = this.f;
        DriveId driveId = removePermissionRequest2.a;
        String str2 = removePermissionRequest2.b;
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
            throw new nja(10, "The permission to remove doesn't exist.");
        }
        lfq2.a(a.d, -100);
        lrz.a(kec.d.a, kmp, str2, -100, a.f, a.d);
        khq khq = kec.d;
        int a2 = kec.g.a(new kbl(khq.a, khq.c, kmp.a(), str2, kec.a(z2, str)), lfq2);
        if (a2 == 0) {
            this.b.b();
        } else if (a2 != 6) {
            throw new nja(8, "Failed to process removePermission request.");
        } else {
            throw new nja(10, "The permission to remove doesn't exist.");
        }
    }
}
