package defpackage;

import java.io.DataOutput;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: acpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acpu implements Callable {
    private final DataOutput a;
    private final byte[] b;

    public acpu(DataOutput dataOutput, byte[] bArr) {
        this.a = dataOutput;
        this.b = bArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        iwd iwd = acpv.a;
        byte[] bArr = this.b;
        int length = bArr.length;
        int hashCode = Arrays.hashCode(bArr);
        StringBuilder sb = new StringBuilder(47);
        sb.append("Writing ");
        sb.append(length);
        sb.append(" bytes with hash ");
        sb.append(hashCode);
        iwd.a(sb.toString(), new Object[0]);
        this.a.writeInt(this.b.length);
        this.a.write(this.b);
        return null;
    }
}
