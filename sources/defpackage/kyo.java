package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: kyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kyo {
    public final kkf a;
    public final kei b;
    public final Context c;
    public final kdb d;

    public kyo(lsm lsm) {
        this.a = lsm.d;
        this.b = lsm.e;
        this.c = lsm.b;
        this.d = lsm.f;
    }

    public static void a(kkf kkf, kkz kkz, DriveId driveId, MetadataBundle metadataBundle, String str) {
        iva.a((Object) driveId, (Object) "Parent Drive ID cannot be null.");
        khq a2 = khq.a(kkz);
        try {
            if (!kkf.a(a2, knc.a(driveId.b)).ai()) {
                throw new nja(10, "Creating singletons is only supported in appFolder.");
            } else if (kkf.b(a2, (String) metadataBundle.a(lce.E), str, true) != null) {
                throw new nja(1501, "Unique resource with the same identifier already exists.");
            }
        } catch (kcs e) {
            throw new nja(8, "Application is no longer authorized.");
        }
    }

    public static boolean a(MetadataBundle metadataBundle) {
        return metadataBundle.c(lce.E);
    }
}
