package defpackage;

import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: kts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kts {
    private final long a;
    private final long b;
    private final ktt c;

    public kts(TransferProgressData transferProgressData) {
        this.c = new ktt(transferProgressData);
        this.a = transferProgressData.d;
        this.b = transferProgressData.e;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        kts kts = (kts) obj;
        return ius.a(this.c, kts.c) && this.a == kts.a && this.b == kts.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        return String.format(Locale.US, "FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", new Object[]{this.c.toString(), Long.valueOf(this.a), Long.valueOf(this.b)});
    }
}
