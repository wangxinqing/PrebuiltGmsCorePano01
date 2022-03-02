package defpackage;

import com.google.android.gms.drive.DriveId;

/* renamed from: kmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kmm implements Runnable {
    final /* synthetic */ DriveId a;

    public kmm(DriveId driveId) {
        this.a = driveId;
    }

    public final void run() {
        lsm.a().v.a(this.a);
    }
}
