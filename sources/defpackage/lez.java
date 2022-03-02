package defpackage;

import android.content.SyncResult;
import com.google.android.gms.drive.DriveId;

/* renamed from: lez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lez implements ldz {
    private final SyncResult a;
    private boolean b = false;

    public lez(SyncResult syncResult) {
        this.a = syncResult;
    }

    public final DriveId a(krk krk, lnj lnj, boolean z) {
        if (lnj.c()) {
            DriveId a2 = ldx.a(krk, lnj);
            this.a.stats.numEntries++;
            this.a.stats.numDeletes++;
            return a2;
        }
        DriveId a3 = ldx.a(krk, lnj, z);
        this.a.stats.numInserts++;
        this.a.stats.numEntries++;
        return a3;
    }

    public final void a(long j) {
        iva.a(!this.b, (Object) "Already started");
        this.b = true;
    }

    public final void a(String str) {
        iva.a(this.b, (Object) "Not started yet");
    }

    public final void a(krk krk) {
        iva.a(this.b, (Object) "Not started yet");
    }

    public final void a(krk krk, lno lno) {
        iva.a(this.b, (Object) "Not started yet");
    }
}
