package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.cast.JGCastService;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.ControlProgressRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfn extends kfa {
    private static final ith f = new ith("ControlProgressOperatio", "");
    private final ControlProgressRequest g;

    public kfn(kec kec, ControlProgressRequest controlProgressRequest, kwg kwg) {
        super("ControlProgressOperatio", kec, kwg, (String) jzq.G.c(), 56);
        this.g = controlProgressRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void c(Context context) {
        boolean z;
        int i;
        boolean z2;
        njc.a((Object) this.g, "Invalid control progress request: no request");
        DriveId driveId = this.g.c;
        njc.a((Object) driveId, "Invalid control progress request: no driveId");
        lfq lfq = this.c;
        ControlProgressRequest controlProgressRequest = this.g;
        int i2 = controlProgressRequest.a;
        int i3 = controlProgressRequest.b;
        lgc lgc = (lgc) lfq;
        lgc.k();
        if ((((ambk) lgc.e.b).a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setControlProgressDetails() twice");
        aucd o = amaq.d.o();
        int i4 = 3;
        if (i2 == 0) {
            i = 2;
        } else if (i2 != 1) {
            lgc.a.b("ImpressionLogEvent", "Unknown progress controller type: %d", Integer.valueOf(i2));
            i = 1;
        } else {
            i = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        amaq amaq = (amaq) o.b;
        amaq.b = i - 1;
        amaq.a |= 1;
        if (i3 == 0) {
            i4 = 2;
        } else if (i3 != 1) {
            if (i3 != 2) {
                lgc.a.b("ImpressionLogEvent", "Unknown progress method code: %d", Integer.valueOf(i3));
                i4 = 1;
            } else {
                i4 = 4;
            }
        }
        aucd aucd = lgc.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        amaq amaq2 = (amaq) o.b;
        amaq2.c = i4 - 1;
        amaq2.a |= 2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amaq amaq3 = (amaq) o.i();
        ambk ambk2 = ambk.K;
        amaq3.getClass();
        ambk.G = amaq3;
        ambk.a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        this.a.a(this.c, driveId);
        if (driveId.d == 0) {
            ControlProgressRequest controlProgressRequest2 = this.g;
            int i5 = controlProgressRequest2.a;
            if (i5 == 0) {
                DriveId driveId2 = controlProgressRequest2.c;
                int i6 = controlProgressRequest2.b;
                if (i6 == 0) {
                    kec kec = this.a;
                    khq j = kec.j();
                    kec.f(driveId2);
                    z2 = kec.g.a().a(j.a, driveId2);
                } else if (i6 == 1) {
                    kec kec2 = this.a;
                    khq j2 = kec2.j();
                    kec2.f(driveId2);
                    z2 = kec2.g.a().b(j2.a, driveId2);
                } else if (i6 == 2) {
                    kec kec3 = this.a;
                    khq j3 = kec3.j();
                    kec3.f(driveId2);
                    z2 = kec3.g.a().c(j3.a, driveId2);
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Unknown method code: ");
                    sb.append(i6);
                    throw new nja(8, sb.toString());
                }
            } else if (i5 == 1) {
                DriveId driveId3 = controlProgressRequest2.c;
                int i7 = controlProgressRequest2.b;
                if (i7 == 0) {
                    throw new UnsupportedOperationException("Not supported");
                } else if (i7 == 1) {
                    z2 = this.a.b(driveId3, true);
                } else if (i7 == 2) {
                    z2 = this.a.b(driveId3, false);
                } else {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("Unknown method code: ");
                    sb2.append(i7);
                    throw new nja(8, sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Unknown controller type : ");
                sb3.append(i5);
                throw new nja(8, sb3.toString());
            }
            if (!z2) {
                Object[] objArr = new Object[2];
                ControlProgressRequest controlProgressRequest3 = this.g;
                int i8 = controlProgressRequest3.a;
                String str = "UNKNOWN";
                objArr[0] = i8 != 0 ? i8 != 1 ? str : "PIN" : "UPLOAD";
                int i9 = controlProgressRequest3.b;
                if (i9 == 0) {
                    str = "CANCEL";
                } else if (i9 == 1) {
                    str = "PAUSE";
                } else if (i9 == 2) {
                    str = "RESUME";
                }
                objArr[1] = str;
                throw new nja(1510, String.valueOf(String.format("%s %s operation", objArr)).concat(" not applicable"));
            }
            try {
                this.b.b();
            } catch (RemoteException e) {
                f.b("ControlProgressOperatio", "Failed to report success to client", (Throwable) e);
                lfn g2 = this.c.g();
                g2.b();
                g2.a();
            }
        } else {
            throw new nja(10, "Operation supports files only");
        }
    }
}
