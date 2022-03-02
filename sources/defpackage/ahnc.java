package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ahnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnc {
    public final ahnb a;
    public final ahnb b;

    public ahnc(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.a = new ahnb(byteBuffer, ahna.PHONE_POSITION.s);
        this.b = new ahnb(byteBuffer2, ahna.PHONE_POSITION_IN_VEHICLE.s);
    }
}
