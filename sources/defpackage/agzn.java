package defpackage;

import java.io.InputStream;
import java.util.List;

/* renamed from: agzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzn extends ahbu implements ahbn {
    private final List a;

    public agzn(InputStream inputStream, List list) {
        super(inputStream);
        boolean z;
        this.a = list;
        if (inputStream != null) {
            z = true;
        } else {
            z = false;
        }
        ahbx.a(z, "Input was null", new Object[0]);
    }

    public final Long a() {
        if (this.in instanceof ahbn) {
            return ((ahbn) this.in).a();
        }
        return null;
    }

    public final void close() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ahcp) list.get(i)).close();
            } catch (Throwable th) {
            }
        }
        super.close();
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ahcp) list.get(i)).a();
            }
        }
        return read;
    }

    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ahcp) list.get(i)).a();
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            List list = this.a;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ahcp) list.get(i3)).a();
            }
        }
        return read;
    }
}
