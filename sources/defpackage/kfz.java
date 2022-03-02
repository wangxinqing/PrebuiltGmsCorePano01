package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: kfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfz extends kez {
    private final GetDriveIdFromUniqueIdentifierRequest f;

    public kfz(kec kec, GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, kwg kwg) {
        super("GetDriveIdFromUniqueIdentifierOperation", kec, kwg, 9);
        this.f = getDriveIdFromUniqueIdentifierRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void d(Context context) {
        njc.a((Object) this.f, "Invalid request.");
        String str = this.f.a;
        if (str == null || str.isEmpty()) {
            throw new nja(10, "uniqueIdentifier cannot be null or empty.");
        }
        GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest = this.f;
        if (getDriveIdFromUniqueIdentifierRequest.b) {
            kec kec = this.a;
            String str2 = getDriveIdFromUniqueIdentifierRequest.a;
            if (kec.d.e.contains(jzl.APPDATA)) {
                kkf kkf = kec.e;
                khq khq = kec.d;
                List a = kkf.a(khq, str2, khq.b, true);
                DriveId driveId = null;
                if (!a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            kec.a.b("Drive item not found, or you are not authorized to access it.");
                            break;
                        }
                        kmp kmp = (kmp) it.next();
                        if (!kmp.A()) {
                            driveId = kmp.g();
                            break;
                        }
                    }
                } else {
                    try {
                        kec.h.a(kec.d, str2, true, lnk.a);
                        kkf kkf2 = kec.e;
                        khq khq2 = kec.d;
                        kmp b = kkf2.b(khq2, str2, khq2.b, true);
                        if (b != null) {
                            driveId = b.g();
                        } else {
                            kec.a.b("Drive item not found, or you are not authorized to access it.");
                        }
                    } catch (VolleyError e) {
                    } catch (eif e2) {
                        throw kec.n();
                    }
                }
                if (driveId == null) {
                    this.b.a(new Status(1502));
                } else {
                    this.b.a(new OnDriveIdResponse(driveId));
                }
            } else {
                throw new nja(10, "The current scope of your application does not allow use of the App Folder");
            }
        } else {
            throw new nja(10, "Singletons are only supported in appFolder.");
        }
    }
}
