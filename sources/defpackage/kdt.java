package defpackage;

import com.google.android.gms.drive.DriveId;
import java.util.Set;

/* renamed from: kdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kdt implements jks {
    final /* synthetic */ kkz a;
    final /* synthetic */ DriveId b;

    public kdt(kkz kkz, DriveId driveId) {
        this.a = kkz;
        this.b = driveId;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        kdw kdw = (kdw) obj;
        if (!kdw.b().a(this.a)) {
            return false;
        }
        return kdw.b().a(this.b, kdw.b) && kdw.a((Set) kdv.a);
    }
}
