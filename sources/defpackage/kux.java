package defpackage;

import com.google.android.gms.drive.DriveId;

@Deprecated
/* renamed from: kux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kux implements jzg {
    public static final kvt a(kvf kvf, lou lou) {
        kvt kvt = new kvt(kvf.d, kvf.c, lou);
        kvt.b.add(3);
        return kvt;
    }

    public final kvp a(icc icc) {
        kvf kvf = (kvf) icc.a(jzf.f);
        if (kvf.u) {
            DriveId driveId = kvf.a;
            if (driveId != null) {
                return new kvp(driveId);
            }
            return null;
        }
        throw new IllegalStateException("Client is not yet connected");
    }

    public final kvp a(icc icc, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (icc.i()) {
            return new kvp(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }
}
