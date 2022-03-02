package defpackage;

/* renamed from: cue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cue extends dq {
    public cue(eb ebVar) {
        super(ebVar);
    }

    public final String a() {
        return "UPDATE OR ABORT `resource_info` SET `accountName` = ?,`language` = ?,`resourceKey` = ?,`darkModeEnabled` = ?,`callingAndroidApp` = ?,`resource` = ?,`lastUpdatedMs` = ? WHERE `accountName` = ? AND `language` = ? AND `resourceKey` = ? AND `darkModeEnabled` = ? AND `callingAndroidApp` = ?";
    }
}
