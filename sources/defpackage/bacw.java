package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bacw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacw implements balw {
    public final balv a(int i) {
        return new bacv(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }
}
