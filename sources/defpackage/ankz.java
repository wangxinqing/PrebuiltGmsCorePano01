package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: ankz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ankz extends ankv {
    public final anlh a(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer order = ByteBuffer.allocate(length + length).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            order.putChar(charSequence.charAt(i));
        }
        return a(order.array());
    }

    public final anlh a(CharSequence charSequence, Charset charset) {
        return a(charSequence.toString().getBytes(charset));
    }

    public final anlj a() {
        return a(32);
    }

    public final anlj a(int i) {
        amrl.a(i >= 0);
        return new ankx(this, i);
    }
}
