package defpackage;

import org.chromium.net.UrlRequest;

/* renamed from: alzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum alzy implements auco {
    UNKNOWN_ACTION_TYPE(0),
    CONTENT_AND_METADATA_ACTION(1),
    CREATE_FILE_ACTION(2),
    TRASH_ACTION(3),
    ADD_PERMISSION_ACTION(4),
    CREATE_FOLDER_ACTION(5),
    CREATE_SHORTCUT_FILE_ACTION(6),
    DELETE_FILE_ACTION(7),
    METADATA_ACTION(8),
    REMOVE_PERMISSION_ACTION(9),
    SET_APP_AUTH_STATE_ACTION(10),
    SET_RESOURCE_PARENTS_ACTION(11),
    SET_SUBSCRIBED_ACTION(12),
    UPDATE_PERMISSION_ACTION(13),
    CHANGE_RESOURCE_PARENTS_ACTION(14);
    
    public final int p;

    private alzy(int i) {
        this.p = i;
    }

    public static alzy a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION_TYPE;
            case 1:
                return CONTENT_AND_METADATA_ACTION;
            case 2:
                return CREATE_FILE_ACTION;
            case 3:
                return TRASH_ACTION;
            case 4:
                return ADD_PERMISSION_ACTION;
            case 5:
                return CREATE_FOLDER_ACTION;
            case 6:
                return CREATE_SHORTCUT_FILE_ACTION;
            case 7:
                return DELETE_FILE_ACTION;
            case 8:
                return METADATA_ACTION;
            case 9:
                return REMOVE_PERMISSION_ACTION;
            case 10:
                return SET_APP_AUTH_STATE_ACTION;
            case 11:
                return SET_RESOURCE_PARENTS_ACTION;
            case 12:
                return SET_SUBSCRIBED_ACTION;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return UPDATE_PERMISSION_ACTION;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return CHANGE_RESOURCE_PARENTS_ACTION;
            default:
                return null;
        }
    }

    public static aucq b() {
        return alzx.a;
    }

    public final int a() {
        return this.p;
    }

    public final String toString() {
        return Integer.toString(this.p);
    }
}
