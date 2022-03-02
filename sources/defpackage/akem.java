package defpackage;

import java.util.ArrayList;

/* renamed from: akem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akem {
    public static final akem a = new akem();
    public final ArrayList b = new ArrayList(8);
    public final int c = 8;

    private akem() {
    }

    public final void a(byte[] bArr) {
        if (bArr != null && bArr.length == 16384) {
            synchronized (this.b) {
                if (this.b.size() < 8) {
                    this.b.add(bArr);
                }
            }
        }
    }

    public final byte[] a() {
        synchronized (this.b) {
            int size = this.b.size();
            if (size > 0) {
                byte[] bArr = (byte[]) this.b.remove(size - 1);
                return bArr;
            }
            byte[] bArr2 = new byte[16384];
            return bArr2;
        }
    }
}
