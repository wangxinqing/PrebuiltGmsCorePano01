package defpackage;

/* renamed from: apkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum apkd implements auco {
    UNKNOWN_CAPABILITY(1),
    CAN_REMOVE_MEMBER(2),
    CAN_MANAGE_MEMBER(3),
    CAN_REMOVE_PRIVILEGE(4);
    
    private final int e;

    private apkd(int i) {
        this.e = i;
    }

    public static apkd a(int i) {
        if (i == 1) {
            return UNKNOWN_CAPABILITY;
        }
        if (i == 2) {
            return CAN_REMOVE_MEMBER;
        }
        if (i == 3) {
            return CAN_MANAGE_MEMBER;
        }
        if (i != 4) {
            return null;
        }
        return CAN_REMOVE_PRIVILEGE;
    }

    public static aucq b() {
        return apkc.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
