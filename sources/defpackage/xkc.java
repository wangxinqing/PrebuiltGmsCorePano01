package defpackage;

/* renamed from: xkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xkc implements auco {
    UNKNOWN_STATUS(0),
    SUCCESS(1),
    OTHER_REMOTE_EXCEPTION(2),
    NO_SYNCED_GROUP_WITH_SAME_TITLE(3),
    MULTIPLE_SYNCED_GROUPS_WITH_SAME_TITLE(4),
    TOO_MANY_CONTACTS(5),
    OTHER_MOVE_CONTACTS_FAILURE(6),
    DELETE_GROUP_FAILURE(7),
    CLEAR_SYNC_TOKEN_FAILURE(8);
    
    public final int j;

    private xkc(int i) {
        this.j = i;
    }

    public static xkc a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return SUCCESS;
            case 2:
                return OTHER_REMOTE_EXCEPTION;
            case 3:
                return NO_SYNCED_GROUP_WITH_SAME_TITLE;
            case 4:
                return MULTIPLE_SYNCED_GROUPS_WITH_SAME_TITLE;
            case 5:
                return TOO_MANY_CONTACTS;
            case 6:
                return OTHER_MOVE_CONTACTS_FAILURE;
            case 7:
                return DELETE_GROUP_FAILURE;
            case 8:
                return CLEAR_SYNC_TOKEN_FAILURE;
            default:
                return null;
        }
    }

    public static aucq b() {
        return xkb.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
