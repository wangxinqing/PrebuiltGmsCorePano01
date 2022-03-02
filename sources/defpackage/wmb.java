package defpackage;

/* renamed from: wmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum wmb implements auco {
    UNKNOWN(0),
    NULL_ACCOUNT(1),
    GOOGLE(2),
    DEVICE(3),
    SIM(4),
    EXCHANGE(5),
    THIRD_PARTY_EDITABLE(6),
    THIRD_PARTY_READONLY(7),
    SIM_SDN(8);
    
    public final int j;

    private wmb(int i) {
        this.j = i;
    }

    public static wmb a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return NULL_ACCOUNT;
            case 2:
                return GOOGLE;
            case 3:
                return DEVICE;
            case 4:
                return SIM;
            case 5:
                return EXCHANGE;
            case 6:
                return THIRD_PARTY_EDITABLE;
            case 7:
                return THIRD_PARTY_READONLY;
            case 8:
                return SIM_SDN;
            default:
                return null;
        }
    }

    public static aucq b() {
        return wma.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
