package defpackage;

import com.google.android.gms.audit.LogAuditRecordsRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: egr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class egr {
    public int a;
    public String b;
    public byte[] c;
    private int d;
    private final List e = new ArrayList();

    public final LogAuditRecordsRequest a() {
        int i = this.d;
        if (i != 1 && i != 2) {
            throw new IllegalStateException("Invalid WriteMode.");
        } else if (!this.e.isEmpty()) {
            int i2 = this.a;
            if (i2 != 0) {
                return new LogAuditRecordsRequest(this.d, i2, this.b, (byte[][]) this.e.toArray(new byte[0][]), (byte[]) null, this.c);
            }
            throw new IllegalStateException("Invalid componentId.");
        } else {
            throw new IllegalStateException("Must specify at least one audit record.");
        }
    }

    public final void b() {
        this.d = 2;
    }

    public final void a(byte[] bArr) {
        this.e.add(bArr);
    }
}
