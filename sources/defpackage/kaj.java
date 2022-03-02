package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: kaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum kaj {
    NULL("null", new kbg()),
    SET_APP_AUTH_STATE("setAuthState", new kbo()),
    METADATA("metadata", new kbe()),
    UNDO_METADATA("undoMetadata", new kce()),
    CONTENT_AND_METADATA("contentAndMetadata", new kas()),
    UNDO_CONTENT_AND_METADATA("undoContentAndMetadata", new kby()),
    CREATE_FILE("createFile", new kau()),
    CREATE_SHORTCUT_FILE("createShortcutFile", new kay()),
    CREATE_FOLDER("createFolder", new kaw()),
    UNDO_CREATE_ENTRY("undoCreateEntry", new kca()),
    TRASH("trash", new kbw()),
    UNDO_TRASH("undoTrash", new kci()),
    DELETE_FILE("deleteFile", new kbb()),
    UNDO_DELETE_FILE("undoDeleteFile", new kcc()),
    SET_RESOURCE_PARENTS("setResourceParents", new kbq()),
    CHANGE_RESOURCE_PARENTS("changeResourceParents", new kaq()),
    SET_SUBSCRIBED("setSubscribed", new kbt()),
    ADD_PERMISSION("addPermission", new kak()),
    UPDATE_PERMISSION("updatePermission", new kck()),
    REMOVE_PERMISSION("removePermission", new kbk()),
    UNDO_PERMISSION("undoPermission", new kcg()),
    UNDO_CREATE_FILE("undoCreateFile", new kca()),
    UNDO_CREATE_SHORTCUT_FILE("undoCreateShortcutFile", new kca()),
    UNDO_CREATE_FOLDER("undoCreateFolder", new kca());
    
    private static final Map A = null;
    public final String y;
    public final kag z;

    static {
        int i;
        A = new HashMap();
        for (kaj kaj : values()) {
            A.put(kaj.y, kaj);
        }
    }

    private kaj(String str, kag kag) {
        this.y = str;
        this.z = kag;
    }

    public static kaj a(String str) {
        return (kaj) A.get(str);
    }
}
