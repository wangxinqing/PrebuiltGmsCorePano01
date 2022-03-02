package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.DeleteResourceRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfr extends key {
    private final DeleteResourceRequest f;

    public kfr(kec kec, DeleteResourceRequest deleteResourceRequest, kwg kwg) {
        super("DeleteResourceOperation", kec, kwg, 7);
        this.f = deleteResourceRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid delete request.");
        njc.a((Object) this.f.a, "Invalid delete request.");
        kec kec = this.a;
        DriveId driveId = this.f.a;
        lfq lfq = this.c;
        if (!kec.c(driveId)) {
            kmp b = kec.b(driveId);
            if (b.ai()) {
                try {
                    DriveId c = kec.c();
                    if (c == null) {
                        throw new nja(10, "Check that your app has access to the App Folder.");
                    } else if (c.equals(driveId)) {
                        throw new nja(10, "Cannot delete App Folder");
                    }
                } catch (eif e) {
                    throw kec.n();
                }
            }
            if (b.j()) {
                lfq.a(b);
                knc a = b.a();
                khq khq = kec.d;
                int a2 = kec.g.a(new kbc(khq.a, khq.c, a), lfq);
                if (a2 == 0) {
                    this.b.b();
                } else if (a2 != 5) {
                    throw new nja(8, "Failed to delete resource.");
                } else {
                    throw new nja(10, "App has no access to a descendant of the folder to be deleted.");
                }
            } else {
                throw new nja(10, "Cannot delete resources that the user does not own.");
            }
        } else {
            throw new nja(10, "Cannot delete root folder");
        }
    }
}
