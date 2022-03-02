package defpackage;

import android.content.Context;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfl extends key {
    private final kei f;
    private final khw g;
    private final kkf h;
    private final lih i;
    private final CloseContentsAndUpdateMetadataRequest j;

    public kfl(kec kec, kei kei, khw khw, kkf kkf, lih lih, CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, kwg kwg) {
        super("CommitContentsOperation", kec, kwg, 2);
        this.f = kei;
        this.g = khw;
        this.h = kkf;
        this.i = lih;
        this.j = closeContentsAndUpdateMetadataRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        int i2;
        boolean z;
        boolean z2;
        njc.a((Object) this.j, "Invalid close request: no request");
        if (!this.a.f() && !this.j.i) {
            throw new nja(10, "Invalid file update options");
        }
        CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest = this.j;
        DriveId driveId = closeContentsAndUpdateMetadataRequest.a;
        MetadataBundle metadataBundle = closeContentsAndUpdateMetadataRequest.b;
        Contents contents = closeContentsAndUpdateMetadataRequest.c;
        if (contents != null) {
            int i3 = contents.b;
            z = contents.e;
            jjt.a(contents.a);
            i2 = i3;
        } else {
            int i4 = closeContentsAndUpdateMetadataRequest.g;
            z = closeContentsAndUpdateMetadataRequest.h;
            i2 = i4;
        }
        boolean z3 = true;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        njc.a(z2, "Invalid close request: no contents");
        njc.a((Object) driveId, "Invalid close request: no DriveId");
        njc.a((Object) metadataBundle, "Invalid close request: no metadata");
        CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest2 = this.j;
        String str = closeContentsAndUpdateMetadataRequest2.e;
        boolean z4 = closeContentsAndUpdateMetadataRequest2.d;
        kmp b = this.a.b(driveId);
        if (!b.B() || driveId.equals(this.a.b())) {
            throw new nja(10, "The user cannot edit the resource.");
        }
        khq b2 = b();
        kyp.a(b2, b, metadataBundle);
        if (this.f.a(b2, i2) <= this.h.b(b2.a.a).c) {
            int i5 = this.j.f;
            njc.a(jzn.b(i5), "Invalid commitStrategy.");
            if (jzn.a(i5)) {
                njc.a(z, "Invalid close request: contents not valid for conflict detection");
                if (str != null) {
                    njc.a(jzn.a(str), "Invalid tracking tag");
                }
            }
            boolean z5 = this.j.i;
            lfq lfq = this.c;
            lfq.a(b);
            if (str == null) {
                z3 = false;
            }
            lfq.a(z4, z3, Integer.valueOf(i5));
            lfq.a(metadataBundle);
            Date date = new Date();
            metadataBundle.b(lch.c, date);
            metadataBundle.b(lch.d, date);
            Boolean bool = (Boolean) metadataBundle.b(lce.M);
            this.f.a(b2, i2, metadataBundle, true, kdo.a(i5, z4, this.a.d(), str, this.a.h(), z5));
            if (bool != null) {
                lii.a(this.i, this.g, this.h, b2, b.a(), !bool.booleanValue() ? kpd.UNPINNED : kpd.PINNED_ACTIVE);
            }
            this.b.b();
            return;
        }
        throw new nja(1508, "Contents too large to commit");
    }
}
