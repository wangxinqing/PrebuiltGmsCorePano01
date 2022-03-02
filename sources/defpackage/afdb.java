package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.BitSet;

/* renamed from: afdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afdb {
    private final BitSet a = new BitSet(PSKKeyManager.MAX_KEY_LENGTH_BYTES);

    public final afdc a() {
        return new afdc(this.a);
    }

    public final void a(byte b) {
        this.a.set(b);
    }
}
