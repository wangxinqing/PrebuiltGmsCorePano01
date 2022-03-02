package defpackage;

/* renamed from: cst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cst extends dq {
    public cst(eb ebVar) {
        super(ebVar);
    }

    public final String a() {
        return "DELETE FROM `dismissed_prompt_item` WHERE `accountName` = ? AND `promptItemId` = ?";
    }
}
