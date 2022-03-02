package defpackage;

import android.app.PendingIntent;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnFetchThumbnailResponse;
import java.io.IOException;

/* renamed from: kfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kfu implements kip {
    final /* synthetic */ kfv a;

    public kfu(kfv kfv) {
        this.a = kfv;
    }

    public final void a(int i) {
        boolean z;
        if (kiq.a(i)) {
            String str = null;
            if (kiq.b(i)) {
                kfv kfv = this.a;
                boolean c = kiq.c(i);
                try {
                    kec kec = kfv.a;
                    kmp a2 = kec.a(kec.d, kfv.f.a);
                    if (a2 != null) {
                        str = kec.e.a(a2, true);
                    }
                    if (str != null) {
                        ParcelFileDescriptor a3 = kfv.a.c.k.a(str);
                        if (a3 == null) {
                            kfv.b(new Status(8, "Failed to open downloaded thumbnail"));
                        } else {
                            lfq lfq = kfv.c;
                            int statSize = (int) a3.getStatSize();
                            ((lgc) lfq).k();
                            if ((((ambk) ((lgc) lfq).e.b).a & 2097152) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            iva.a(!z, (Object) "Can't call setFetchThumbnailDetails() twice");
                            aucd aucd = ((lgc) lfq).e;
                            aucd o = amav.d.o();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            amav amav = (amav) o.b;
                            int i2 = 1 | amav.a;
                            amav.a = i2;
                            amav.b = statSize;
                            amav.a = i2 | 2;
                            amav.c = c;
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            ambk ambk = (ambk) aucd.b;
                            amav amav2 = (amav) o.i();
                            ambk ambk2 = ambk.K;
                            amav2.getClass();
                            ambk.x = amav2;
                            ambk.a |= 2097152;
                            try {
                                kfv.b.a(new OnFetchThumbnailResponse(a3));
                            } catch (RemoteException e) {
                                lfn g = kfv.c.g();
                                g.b();
                                g.a();
                            }
                        }
                    } else {
                        throw new nja(1502, "Thumbnail not found, or you are not authorized to access it.");
                    }
                } catch (IOException e2) {
                    kfv.b(new Status(8, "Failed to open downloaded thumbnail"));
                } catch (nja e3) {
                    kfv.b(e3.a);
                }
            } else {
                this.a.b(new Status(kiq.d(i), "Error downloading thumbnail", (PendingIntent) null));
            }
            lfq lfq2 = this.a.c;
            lfq2.h();
            lfq2.a();
        }
    }

    public final void a(long j, long j2) {
    }
}
