package defpackage;

/* renamed from: apka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum apka implements auco {
    UNKNOWN_MANAGE_FAMILY_CAPABILITY(0),
    CAN_DISSOLVE_FAMILY(1),
    CAN_INVITE_MEMBERS(2),
    CAN_REMOVE_INVITATIONS(3),
    CAN_CREATE_NEW_ACCOUNT(4),
    CAN_MANAGE_PARENTS(5),
    CAN_RECOVER_KIDS_ACCOUNTS(6);
    
    private final int h;

    private apka(int i2) {
        this.h = i2;
    }

    public static apka a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_MANAGE_FAMILY_CAPABILITY;
            case 1:
                return CAN_DISSOLVE_FAMILY;
            case 2:
                return CAN_INVITE_MEMBERS;
            case 3:
                return CAN_REMOVE_INVITATIONS;
            case 4:
                return CAN_CREATE_NEW_ACCOUNT;
            case 5:
                return CAN_MANAGE_PARENTS;
            case 6:
                return CAN_RECOVER_KIDS_ACCOUNTS;
            default:
                return null;
        }
    }

    public static aucq b() {
        return apjz.a;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
