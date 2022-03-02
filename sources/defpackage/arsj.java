package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: arsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsj extends ahye {
    public static final arsj a = new arsj();
    public arsf b;
    public final AtomicBoolean c = new AtomicBoolean();
    public aqek d;
    public boolean e;

    private arsj() {
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr) {
        if (this.d == null) {
            try {
                aqek aqek = new aqek(ajck.br);
                aqek.a(bArr);
                if (ajck.br.equals(aqek.b)) {
                    arsf arsf = this.b;
                    if (ajck.br.equals(aqek.b)) {
                        arsf.a(aqek);
                    }
                }
            } catch (ClassCastException | NoSuchFieldError e2) {
                throw new IOException(e2);
            }
        }
    }
}
