package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;
import com.google.android.gms.drive.internal.AddEventListenerRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: keu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class keu extends key {
    private final AddEventListenerRequest f;
    private final kwj g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public keu(defpackage.kec r5, com.google.android.gms.drive.internal.AddEventListenerRequest r6, defpackage.kwj r7, defpackage.kwg r8) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0027
            int r1 = r6.b
            r2 = 1
            if (r1 == r2) goto L_0x0027
            r3 = 4
            if (r1 == r3) goto L_0x0024
            r3 = 7
            if (r1 == r3) goto L_0x0021
            r3 = 8
            if (r1 == r3) goto L_0x0013
            goto L_0x0028
        L_0x0013:
            com.google.android.gms.drive.events.TransferProgressOptions r1 = r6.e
            int r1 = r1.a
            if (r1 == 0) goto L_0x001e
            if (r1 != r2) goto L_0x0027
            r0 = 57
            goto L_0x0028
        L_0x001e:
            r0 = 58
            goto L_0x0028
        L_0x0021:
            r0 = 69
            goto L_0x0028
        L_0x0024:
            r0 = 45
            goto L_0x0028
        L_0x0027:
        L_0x0028:
            java.lang.String r1 = "AddEventListenerOperation"
            r4.<init>(r1, r5, r8, r0)
            r4.f = r6
            r4.g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keu.<init>(kec, com.google.android.gms.drive.internal.AddEventListenerRequest, kwj, kwg):void");
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid add event listener request: no request");
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
        AddEventListenerRequest addEventListenerRequest = this.f;
        DriveId driveId = addEventListenerRequest.a;
        int i2 = addEventListenerRequest.b;
        njc.a(ksx.a(i2, driveId), "Invalid add event listener request: invalid drive id");
        AddEventListenerRequest addEventListenerRequest2 = this.f;
        ChangesAvailableOptions changesAvailableOptions = addEventListenerRequest2.c;
        TransferStateOptions transferStateOptions = addEventListenerRequest2.d;
        TransferProgressOptions transferProgressOptions = addEventListenerRequest2.e;
        if (i2 == 4) {
            njc.a((Object) changesAvailableOptions, "Invalid add event listener request: null changes available options");
        } else if (i2 == 7) {
            njc.a((Object) transferStateOptions, "Invalid add event listener request: null transfer state options");
        } else if (i2 == 8) {
            njc.a((Object) transferProgressOptions, "Invalid add event listener request: null transfer progress options");
        }
        if (driveId != null) {
            this.c.a(this.a.b(driveId));
        }
        if (this.g == null) {
            this.c.c(1);
            if (i2 == 1) {
                kec kec = this.a;
                kec.m.a(kec.d, kec.f(), driveId);
            } else if (i2 == 4) {
                kec kec2 = this.a;
                khq khq = kec2.d;
                String a = kec2.a();
                Set a2 = lsn.a(khq, changesAvailableOptions.a());
                kec kec3 = this.a;
                kec3.m.a(khq, kec3.f(), changesAvailableOptions, a, a2);
            } else if (i2 == 7) {
                kec kec4 = this.a;
                khq khq2 = kec4.d;
                String a3 = kec4.a();
                Set a4 = lsn.a(khq2, transferStateOptions.a());
                kec kec5 = this.a;
                kec5.m.a(khq2, kec5.f(), transferStateOptions, a3, a4);
            } else {
                throw new nja(8, "Unexpected event type");
            }
        } else {
            this.c.c(0);
            if (i2 == 1) {
                this.a.l.a(driveId, this.a.k().a, this.g);
            } else if (i2 == 4) {
                kwj kwj = this.g;
                kec kec6 = this.a;
                khq khq3 = kec6.d;
                kec6.a();
                this.a.l.a(kwj, this.a.k().a, changesAvailableOptions, lsn.a(khq3, changesAvailableOptions.a()));
            } else if (i2 == 8) {
                this.a.l.a(new ktn(this.g, driveId, transferProgressOptions));
            } else {
                throw new nja(8, "Unexpected event type");
            }
        }
        this.b.b();
    }
}
