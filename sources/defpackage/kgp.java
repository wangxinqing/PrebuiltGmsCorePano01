package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.internal.RemoveEventListenerRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgp extends key {
    private final RemoveEventListenerRequest f;
    private final kwj g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kgp(defpackage.kec r5, com.google.android.gms.drive.internal.RemoveEventListenerRequest r6, defpackage.kwj r7, defpackage.kwg r8) {
        /*
            r4 = this;
            r0 = 17
            if (r6 == 0) goto L_0x002a
            int r1 = r6.b
            r2 = 1
            if (r1 == r2) goto L_0x002a
            r3 = 4
            if (r1 == r3) goto L_0x0027
            r3 = 7
            if (r1 == r3) goto L_0x0024
            r3 = 8
            if (r1 == r3) goto L_0x0014
            goto L_0x002b
        L_0x0014:
            com.google.android.gms.drive.events.TransferProgressOptions r0 = r6.c
            int r0 = r0.a
            if (r0 == 0) goto L_0x0021
            if (r0 != r2) goto L_0x001f
            r0 = 59
            goto L_0x002b
        L_0x001f:
            r0 = 0
            goto L_0x002b
        L_0x0021:
            r0 = 60
            goto L_0x002b
        L_0x0024:
            r0 = 70
            goto L_0x002b
        L_0x0027:
            r0 = 46
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            java.lang.String r1 = "RemoveEventListenerOperation"
            r4.<init>(r1, r5, r8, r0)
            r4.f = r6
            r4.g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgp.<init>(kec, com.google.android.gms.drive.internal.RemoveEventListenerRequest, kwj, kwg):void");
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        kmp d;
        njc.a((Object) this.f, "Invalid remove event listener request: no request");
        int i = this.f.b;
        if (i != 1) {
            if (i != 4) {
                if (i == 7 || i == 8) {
                    String str = this.e.b;
                    if (!this.a.g()) {
                        if (!(jzq.G.c() == null ? Collections.EMPTY_LIST : Arrays.asList(((String) jzq.G.c()).split("\\s*,\\s*"))).contains(str)) {
                            throw new nja(10, "App is not whitelisted to make this request.");
                        }
                    }
                } else {
                    throw new nja(8, "Unexpected event type");
                }
            } else if (!this.a.f()) {
                throw new nja(10, "App is not authorized to make this request.");
            }
        }
        RemoveEventListenerRequest removeEventListenerRequest = this.f;
        DriveId driveId = removeEventListenerRequest.a;
        int i2 = removeEventListenerRequest.b;
        TransferProgressOptions transferProgressOptions = removeEventListenerRequest.c;
        njc.a(ksx.a(i2, driveId), "Invalid remove event listener request: invalid drive id");
        if (!(driveId == null || (d = this.a.d(driveId)) == null)) {
            this.c.a(d);
        }
        if (this.g == null) {
            this.c.c(1);
            kec kec = this.a;
            khq khq = kec.d;
            if (i2 == 1) {
                kec.m.a(khq, driveId);
            } else if (i2 == 4) {
                kec.m.a(khq);
            } else if (i2 == 7) {
                kec.m.b(khq);
            } else {
                throw new nja(8, "Unexpected event type");
            }
        } else {
            this.c.c(0);
            if (i2 == 1) {
                this.a.l.a(driveId, this.g);
            } else if (i2 == 4) {
                this.a.l.b(this.g);
            } else if (i2 == 8) {
                njc.a((Object) transferProgressOptions, "Invalid remove transfer progress listener request: no options");
                this.a.l.a(driveId, this.g, transferProgressOptions);
            } else {
                throw new nja(8, "Unexpected event type");
            }
        }
        this.b.b();
    }
}
