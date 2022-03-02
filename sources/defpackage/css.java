package defpackage;

/* renamed from: css  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class css extends dr {
    public css(eb ebVar) {
        super(ebVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `dismissed_prompt_item` (`accountName`,`promptItemId`) VALUES (?,?)";
    }

    public final /* bridge */ /* synthetic */ void a(C0000do doVar, Object obj) {
        csw csw = (csw) obj;
        String str = csw.a;
        if (str == null) {
            doVar.a(1);
        } else {
            doVar.a(1, str);
        }
        Long l = csw.b;
        if (l == null) {
            doVar.a(2);
        } else {
            doVar.a(2, l.longValue());
        }
    }
}
