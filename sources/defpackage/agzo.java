package defpackage;

import java.io.OutputStream;
import java.util.List;

/* renamed from: agzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzo extends ahbv {
    private final List a;

    public agzo(OutputStream outputStream, List list) {
        super(outputStream);
        boolean z;
        this.a = list;
        if (outputStream != null) {
            z = true;
        } else {
            z = false;
        }
        ahbx.a(z, "Output was null", new Object[0]);
    }

    public final void close() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ahcc) list.get(i)).close();
            } catch (Throwable th) {
            }
        }
        super.close();
    }

    public final void write(int i) {
        this.out.write(i);
        List list = this.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ahcc) list.get(i2)).a(1);
        }
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ahcc) list.get(i)).a(bArr.length);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        List list = this.a;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ahcc) list.get(i3)).a(i2);
        }
    }
}
