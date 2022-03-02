package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Arrays;

/* renamed from: ktt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ktt {
    private final DriveId a;
    private final int b;
    private final int c;

    public ktt(TransferProgressData transferProgressData) {
        this.a = transferProgressData.b;
        this.b = transferProgressData.a;
        this.c = transferProgressData.c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ktt ktt = (ktt) obj;
        return ius.a(this.a, ktt.a) && this.b == ktt.b && this.c == ktt.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", new Object[]{Integer.valueOf(this.b), this.a, Integer.valueOf(this.c)});
    }
}
