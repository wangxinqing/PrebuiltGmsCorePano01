package defpackage;

import com.google.android.gms.drive.DriveId;
import java.util.Arrays;

/* renamed from: ljt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljt {
    public DriveId a;
    public String b;
    public final khq c;
    public final kkz d;
    public final String e;

    public ljt(DriveId driveId, khq khq) {
        this.a = driveId;
        this.c = khq;
        this.d = khq.a;
        this.e = khq.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ljt ljt = (ljt) obj;
            return alyr.a(this.a, ljt.a) && alyr.a(this.d, ljt.d) && alyr.a(this.e, ljt.e) && alyr.a(this.b, ljt.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 44 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("[driveId: ");
        sb.append(valueOf);
        sb.append(", localId: ");
        sb.append(str);
        sb.append(", account: ");
        sb.append(valueOf2);
        sb.append(", sdkAppId:");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    public ljt(DriveId driveId, kkz kkz, String str) {
        this.a = driveId;
        this.c = null;
        this.d = kkz;
        this.e = str;
    }

    public ljt(String str, khq khq) {
        this.b = str;
        this.c = khq;
        this.d = khq.a;
        this.e = khq.b;
    }
}
