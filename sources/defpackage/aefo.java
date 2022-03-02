package defpackage;

/* renamed from: aefo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aefo {
    REQUEST_DISCOVERABLE(Byte.MIN_VALUE),
    PROVIDER_INITIATES_BONDING((byte) 64),
    REQUEST_DEVICE_NAME((byte) 32),
    REQUEST_RETROACTIVE_PAIR((byte) 16);
    
    public final byte e;

    private aefo(byte b) {
        this.e = b;
    }
}
