package defpackage;

/* renamed from: cud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cud extends dq {
    public cud(eb ebVar) {
        super(ebVar);
    }

    public final String a() {
        return "DELETE FROM `resource_info` WHERE `accountName` = ? AND `language` = ? AND `resourceKey` = ? AND `darkModeEnabled` = ? AND `callingAndroidApp` = ?";
    }
}
