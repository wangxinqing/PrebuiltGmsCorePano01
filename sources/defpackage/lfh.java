package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: lfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lfh {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("HEADERS.AUTHORIZATION", 1);
        a.put("HEADERS.IF-MATCH", 2);
        a.put("HEADERS.IF-NONE-MATCH", 3);
        a.put("PARAMETERS.ALT", 4);
        a.put("PARAMETERS.Q", 5);
        a.put("OTHER.PATH", 6);
        a.put("PARAMETERS.ORDERBY", 7);
        a.put("OTHER.REVISIONS", 8);
        a.put("OTHER.REVISIONS.DELETE", 9);
        a.put("OTHER.REVISIONS.LASTREVISION", 10);
        a.put("PARAMETERS.CLIENTVERSION", 11);
        a.put("PARAMETERS.ACKNOWLEDGEABUSE", 12);
        a.put("OTHER.APP.CONFIGURATION", 13);
        a.put("PARAMETERS.CONVERTTO", 14);
        a.put("OTHER.EXPORT.SIZE", 15);
        a.put("OTHER.FILE.OWNER", 16);
        a.put("OTHER.FILE.EMBEDPARENTID", 17);
        a.put("PARAMETERS.PARENTID", 18);
        a.put("OTHER.FILE.TRASHED", 19);
        a.put("OTHER.FILE", 20);
        a.put("OTHER.FILE.ID", 21);
        a.put("OTHER.PROPERTY.KEY", 22);
        a.put("OTHER.USER.OPERATION.OCR", 23);
        a.put("OTHER.SUBSCRIPTION", 24);
        a.put("OTHER.USER.SHARING", 25);
        a.put("OTHER.USER", 26);
        a.put("OTHER.FILE.CONTENTTYPE", 27);
        a.put("OTHER.FILE.INDEXABLETEXT", 28);
        a.put("OTHER.FILE.SIZE", 29);
        a.put("OTHER.PERMISSION.ID", 30);
        a.put("OTHER.PERMISSION.KEY", 31);
        a.put("OTHER.PERMISSION.ROLE", 32);
        a.put("OTHER.PERMISSION.TYPE", 33);
        a.put("OTHER.PERMISSION.VALUE", 34);
        a.put("OTHER.PERMISSION.WITHLINK", 35);
        a.put("OTHER.REVISION.ID", 36);
        a.put("OTHER.SETTING.KEY", 37);
        a.put("OTHER.SETTING.NAMESPACE", 38);
        a.put("PARAMETERS.APPID", 39);
        a.put("PARAMETERS.CHANGEID", 40);
        a.put("PARAMETERS.CHILDID", 41);
        a.put("PARAMETERS.EMAIL", 42);
        a.put("PARAMETERS.FILEID", 43);
        a.put("PARAMETERS.FOLDERID", 44);
        a.put("PARAMETERS.MAXCHANGEIDCOUNT", 45);
        a.put("PARAMETERS.MODIFIEDDATEBEHAVIOR", 46);
        a.put("PARAMETERS.OCRLANGUAGE", 47);
        a.put("PARAMETERS.PAGESELECTION.TOKEN", 48);
        a.put("PARAMETERS.PERMISSIONID", 49);
        a.put("PARAMETERS.PINNED", 50);
        a.put("PARAMETERS.PROPERTYKEY", 51);
        a.put("PARAMETERS.PROPERTYVISIBILITY", 52);
        a.put("PARAMETERS.REVISIONID", 53);
        a.put("PARAMETERS.SPACES", 54);
        a.put("PARAMETERS.STARTCHANGEID", 55);
        a.put("PARAMETERS.SPACE", 56);
        a.put("OTHER.PROPERTY.SIZE", 57);
        a.put("OTHER.PARENT.MIMETYPE", 58);
        a.put("OTHER.PARENT.PERMISSIONS", 59);
        a.put("OTHER.PARENT.PACKAGEID", 60);
        a.put("OTHER.QUOTA.DOWNLOAD", 61);
        a.put("OTHER.APP", 62);
        a.put("OTHER.CHANGE", 63);
        a.put("OTHER.CHILD", 64);
        a.put("OTHER.PARENT", 65);
        a.put("OTHER.PERMISSION", 66);
        a.put("OTHER.PROPERTY", 67);
        a.put("OTHER.REVISION", 68);
        a.put("OTHER.CHILDLINK", 69);
        a.put("OTHER.PARENTLINK", 70);
        a.put("OTHER.SCOPES.APPFOLDER", 71);
        a.put("OTHER.APPFOLDER.FILE.MIMETYPE", 72);
        a.put("OTHER.APPFOLDER", 73);
        a.put("OTHER.SCOPES.APPCONTENT", 74);
        a.put("OTHER.APPCONTENT.FILE.MIMETYPE", 75);
        a.put("OTHER.APPCONTENT", 76);
        a.put("OTHER.SCOPES.APPS.READONLY", 77);
        a.put("OTHER.FILE.FLAGGEDFORABUSE", 78);
        a.put("OTHER.FILE.IMMUTABLE", 79);
        a.put("OTHER.FILE.MIMETYPE", 80);
        a.put("OTHER.OPERATION.OCR", 81);
        a.put("OTHER.FILE.PERMISSIONS", 82);
        a.put("OTHER.PROPERTIES.COUNT", 83);
        a.put("OTHER.PROPERTY.VISIBILITY", 84);
        a.put("OTHER.REVISION.PUBLISHED", 85);
        a.put("OTHER.APP.FORCEINSTALLED", 86);
        a.put("OTHER.SCOPES", 87);
        a.put("OTHER.SCOPES.SCRIPT", 88);
        a.put("OTHER.FILE.LABELS.RESTRICTED", 89);
        a.put("OTHER.APPS.ALL_WEBSTORE", 90);
        a.put("OTHER.FILE.LOCALID", 91);
        a.put("PARAMETERS.FIELDS", 92);
        a.put("PARAMETERS.SECONDARYSORTBY", 93);
        a.put("OTHER.SETTING", 94);
        a.put("PARAMETERS.SETTINGNAMESPACE", 95);
        a.put("OTHER.SCOPES.ALL_APPDATA", 96);
        a.put("OTHER.FILE.CREATED_MILLIS", 97);
        a.put("OTHER.PERMISSION.EXPIRATIONDATE", 98);
        a.put("PARAMETERS.TEAMDRIVEID", 99);
        a.put("PARAMETERS.CORPORA", 100);
        a.put("PARAMETERS.CORPUS", 101);
        a.put("PARAMETERS.PRECONDITION", 102);
    }

    public static Integer a(String str) {
        if (str != null) {
            return (Integer) a.get(str.toUpperCase(Locale.US));
        }
        return null;
    }
}
