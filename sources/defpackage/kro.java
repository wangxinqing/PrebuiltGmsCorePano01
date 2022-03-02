package defpackage;

import com.google.android.gms.drive.DriveId;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: kro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kro {
    public final ConcurrentMap a = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final void b(DriveId driveId, kta kta) {
        iva.a((Object) driveId);
        krq krq = (krq) this.a.get(driveId);
        if (krq != null && krq.b(kta)) {
            synchronized (krq.a) {
                if (krq.b()) {
                    this.a.remove(driveId);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(DriveId driveId, krp krp) {
        krq krq = (krq) this.a.get(driveId);
        if (krq != null && krq.a(krp)) {
            synchronized (krq.a) {
                if (krq.b()) {
                    this.a.remove(driveId);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(DriveId driveId, kta kta) {
        krq krq;
        iva.a((Object) driveId);
        synchronized (this.a) {
            krq = (krq) this.a.get(driveId);
            if (krq == null) {
                krq = new krq();
                this.a.put(driveId, krq);
            }
        }
        return krq.a(kta);
    }
}
