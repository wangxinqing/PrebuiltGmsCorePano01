package defpackage;

import android.database.Cursor;
import com.google.android.gms.drive.DriveId;

/* renamed from: kpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kpe implements kkp {
    private final kkf a;

    public kpe(kkf kkf) {
        this.a = kkf;
    }

    public final /* bridge */ /* synthetic */ Object a(kqg kqg, Cursor cursor) {
        DriveId driveId;
        kpf a2 = kpf.a(kqg, cursor);
        kmd f = this.a.f(a2.b);
        kkz c = this.a.c(f.a);
        knc knc = a2.a;
        if (knc != null) {
            driveId = new DriveId(a2.d, knc.a, a2.am.g(), 0);
        } else {
            String str = a2.d;
            driveId = str != null ? DriveId.a(str) : null;
        }
        return new ljt(driveId, c, f.b);
    }
}
