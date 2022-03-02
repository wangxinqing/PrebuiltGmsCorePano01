package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFileRequest;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfp extends key {
    private final kei f;
    private final kkf g;
    private final CreateFileRequest h;

    public kfp(kec kec, kei kei, kkf kkf, CreateFileRequest createFileRequest, kwg kwg) {
        super("CreateFileOperation", kec, kwg, 4);
        this.f = kei;
        this.g = kkf;
        this.h = createFileRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        int i;
        DriveId driveId;
        boolean z;
        njc.a((Object) this.h, "Invalid create request: no request");
        int b = this.h.b();
        this.c.d(b);
        int a = this.h.a();
        boolean z2 = false;
        if (b == 0) {
            if (a != 0) {
                z = true;
            } else {
                z = false;
            }
            njc.a(z, "Invalid create request: invalid contents");
        } else if (a != 0) {
            throw new nja(10, "Shortcut files may not have content");
        }
        MetadataBundle metadataBundle = this.h.b;
        njc.a((Object) metadataBundle, "Invalid create request: no metadata");
        this.c.a(metadataBundle);
        DriveId driveId2 = this.h.a;
        njc.a((Object) driveId2, "Invalid create request: no parent");
        lbq a2 = lbq.a((String) metadataBundle.a((kyq) lce.N));
        this.c.a(this.a.a(driveId2), a2 != null ? a2.a : null);
        CreateFileRequest createFileRequest = this.h;
        int i2 = createFileRequest.g;
        String str = createFileRequest.f;
        this.c.a(createFileRequest.e, str != null, Integer.valueOf(i2));
        if (b != 0 || a2 == null || !a2.a.startsWith("application/vnd.google-apps")) {
            if (b == 1) {
                if (a2 == null) {
                    metadataBundle.b(lce.N, "application/vnd.google-apps.drive-sdk");
                } else if (!a2.a()) {
                    throw new nja(10, "Shortcut files must have MIME type application/vnd.google-apps.drive-sdk");
                }
            }
            khq b2 = b();
            if (!(a == 1 || b == 1)) {
                if (this.f.a(b2, a) > this.g.b(b2.a.a).c) {
                    throw new nja(1508, "Contents too large to create or save file");
                }
            }
            njc.a(jzn.b(i2), "Invalid commitStrategy.");
            if (!(i2 == 0 || str == null)) {
                njc.a(jzn.a(str), "Tracking tag is invalid");
            }
            MetadataBundle metadataBundle2 = this.h.b;
            Date date = new Date();
            metadataBundle2.b(lch.c, date);
            metadataBundle2.b(lch.d, date);
            metadataBundle2.b(lch.a, date);
            int a3 = this.h.a();
            if (a3 == 1) {
                a3 = this.f.a(b(), 536870912, this.b.asBinder()).b;
            }
            CreateFileRequest createFileRequest2 = this.h;
            DriveId driveId3 = createFileRequest2.a;
            int b3 = createFileRequest2.b();
            CreateFileRequest createFileRequest3 = this.h;
            int i3 = createFileRequest3.g;
            boolean z3 = createFileRequest3.e;
            String str2 = createFileRequest3.f;
            kec kec = this.a;
            DriveId e = kec.e(driveId3);
            kyp.a(kec.d, metadataBundle2, false);
            if (b3 != 1) {
                i = a3;
            } else {
                i = 0;
            }
            kdo a4 = kdo.a(i3, z3, kec.d(), str2, kec.h(), kdo.a.g);
            kyo kyo = kec.i;
            khq khq = kec.d;
            if (b3 == 0) {
                kyo.b.a(khq.c, i);
            }
            String str3 = (String) metadataBundle2.a((kyq) lce.N);
            lbq a5 = lbq.a(str3);
            if (a5 == null || !a5.a.equals("application/vnd.google-apps.folder")) {
                z2 = true;
            }
            iva.b(z2, "This method may not be used to create folders.");
            if (TextUtils.isEmpty((CharSequence) metadataBundle2.a((kyq) lce.Q))) {
                metadataBundle2.b(lce.Q, kyo.c.getResources().getString(R.string.drive_create_file_default_title));
            }
            if (b3 != 0) {
                iva.b(!kyo.a(metadataBundle2), "Creating singleton shortcut file is not supported.");
                metadataBundle2.b(lce.N, "application/vnd.google-apps.drive-sdk");
                kaz kaz = new kaz(khq.a, khq.c, metadataBundle2, e);
                kyo.d.a(kaz);
                driveId = kaz.g;
            } else {
                if (str3 == null) {
                    metadataBundle2.b(lce.N, "application/octet-stream");
                }
                if (kyo.a(metadataBundle2)) {
                    kyo.a(kyo.a, khq.a, e, metadataBundle2, khq.b);
                }
                driveId = kyo.b.a(khq, i, metadataBundle2, e, a4);
            }
            this.b.a(new OnDriveIdResponse(driveId));
            return;
        }
        throw new nja(10, "This method may not be used to create Google Apps files.");
    }
}
