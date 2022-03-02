package defpackage;

/* renamed from: oqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum oqz {
    UPDATE,
    b,
    REMOVE,
    REMOVE_ALL,
    REMOVE_TYPE,
    USER_ACTION,
    REQUEST_NOT_SET;

    public static oqz a(int i) {
        switch (i) {
            case 0:
                return REQUEST_NOT_SET;
            case 1:
                return UPDATE;
            case 2:
                return b;
            case 3:
                return REMOVE;
            case 4:
                return REMOVE_ALL;
            case 5:
                return REMOVE_TYPE;
            case 6:
                return USER_ACTION;
            default:
                return null;
        }
    }
}
