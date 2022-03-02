package defpackage;

/* renamed from: atob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atob implements auco {
    UNKNOWN_FENCE_OPERATION_TYPE(0),
    ADD_LISTENER(1),
    ADD_PENDING_INTENT(2),
    REMOVE_LISTENER(3),
    REMOVE_PENDING_INTENT(4),
    REMOVE_FENCE_KEY(5),
    SET_FENCE_RESPONSIVENESS(6),
    REMOVE_FENCE_RESPONSIVENESS(7),
    PROBE_FENCE(8);
    
    public final int j;

    private atob(int i) {
        this.j = i;
    }

    public static atob a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FENCE_OPERATION_TYPE;
            case 1:
                return ADD_LISTENER;
            case 2:
                return ADD_PENDING_INTENT;
            case 3:
                return REMOVE_LISTENER;
            case 4:
                return REMOVE_PENDING_INTENT;
            case 5:
                return REMOVE_FENCE_KEY;
            case 6:
                return SET_FENCE_RESPONSIVENESS;
            case 7:
                return REMOVE_FENCE_RESPONSIVENESS;
            case 8:
                return PROBE_FENCE;
            default:
                return null;
        }
    }

    public static aucq b() {
        return atoa.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
