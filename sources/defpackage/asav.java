package defpackage;

/* renamed from: asav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asav implements auco {
    UNKNOWN_FRAME_TYPE(0),
    CONNECTION_REQUEST(1),
    CONNECTION_RESPONSE(2),
    PAYLOAD_TRANSFER(3),
    BANDWIDTH_UPGRADE_NEGOTIATION(4),
    KEEP_ALIVE(5),
    DISCONNECTION(6),
    PAIRED_KEY_ENCRYPTION(7);
    
    public final int i;

    private asav(int i2) {
        this.i = i2;
    }

    public static asav a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_FRAME_TYPE;
            case 1:
                return CONNECTION_REQUEST;
            case 2:
                return CONNECTION_RESPONSE;
            case 3:
                return PAYLOAD_TRANSFER;
            case 4:
                return BANDWIDTH_UPGRADE_NEGOTIATION;
            case 5:
                return KEEP_ALIVE;
            case 6:
                return DISCONNECTION;
            case 7:
                return PAIRED_KEY_ENCRYPTION;
            default:
                return null;
        }
    }

    public static aucq b() {
        return asau.a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
