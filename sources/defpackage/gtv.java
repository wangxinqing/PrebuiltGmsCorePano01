package defpackage;

import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gtv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtv {
    private static final byte[] d = {-16};
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    private final List e = new ArrayList();
    private boolean f = false;
    private boolean g = false;

    public final List a() {
        ArrayList arrayList = new ArrayList();
        if (!this.f) {
            List list = this.e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ParcelUuid parcelUuid = (ParcelUuid) list.get(i);
                byte[] bArr = gts.a;
                byte[] bArr2 = new byte[18];
                bArr2[0] = 2;
                bArr2[1] = 21;
                if (parcelUuid != null) {
                    ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
                    wrap.putLong(parcelUuid.getUuid().getMostSignificantBits());
                    wrap.putLong(parcelUuid.getUuid().getLeastSignificantBits());
                    byte[] array = wrap.array();
                    for (int i2 = 0; i2 < 16; i2++) {
                        bArr2[i2 + 2] = array[i2];
                    }
                }
                byte[] bArr3 = new byte[18];
                bArr3[0] = -1;
                bArr3[1] = -1;
                if (parcelUuid != null) {
                    for (int i3 = 0; i3 < 16; i3++) {
                        bArr3[i3 + 2] = -1;
                    }
                }
                gtf gtf = new gtf();
                gtf.a(76, bArr2, bArr3);
                arrayList.add(gtf.a());
            }
        } else {
            byte[] bArr4 = gts.a;
            byte[] bArr5 = gts.b;
            gtf gtf2 = new gtf();
            gtf2.a(76, bArr4, bArr5);
            arrayList.add(gtf2.a());
        }
        if (!this.g) {
            if (this.c) {
                if (!this.a || !this.b) {
                    gtf gtf3 = new gtf();
                    gtf3.a(gtw.a);
                    gtf3.a(gtw.a, new byte[]{48}, d);
                    arrayList.add(gtf3.a());
                }
            }
            if (this.b) {
                gtf gtf4 = new gtf();
                gtf4.a(gtw.a);
                gtf4.a(gtw.a, new byte[]{16}, d);
                arrayList.add(gtf4.a());
            }
            if (this.a) {
                gtf gtf5 = new gtf();
                gtf5.a(gtw.a);
                gtf5.a(gtw.a, new byte[]{0}, d);
                arrayList.add(gtf5.a());
            }
            return arrayList;
        }
        gtf gtf6 = new gtf();
        gtf6.a(gtw.a);
        arrayList.add(gtf6.a());
        return arrayList;
    }

    public final void b() {
        this.g = true;
    }

    public final void c() {
        this.f = true;
    }
}
