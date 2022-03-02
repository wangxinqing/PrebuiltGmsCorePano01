package defpackage;

/* renamed from: cuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cuc extends dr {
    public cuc(eb ebVar) {
        super(ebVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `resource_info` (`accountName`,`language`,`resourceKey`,`darkModeEnabled`,`callingAndroidApp`,`resource`,`lastUpdatedMs`) VALUES (?,?,?,?,?,?,?)";
    }

    public final /* bridge */ /* synthetic */ void a(C0000do doVar, Object obj) {
        cui cui = (cui) obj;
        String str = cui.a;
        if (str == null) {
            doVar.a(1);
        } else {
            doVar.a(1, str);
        }
        String str2 = cui.b;
        if (str2 == null) {
            doVar.a(2);
        } else {
            doVar.a(2, str2);
        }
        byte[] a = csk.a(cui.c);
        if (a == null) {
            doVar.a(3);
        } else {
            doVar.a(3, a);
        }
        doVar.a(4, cui.d ? 1 : 0);
        String str3 = cui.e;
        if (str3 == null) {
            doVar.a(5);
        } else {
            doVar.a(5, str3);
        }
        csl csl = cui.f;
        if (csl != null) {
            byte[] a2 = csk.a(csl.a);
            if (a2 == null) {
                doVar.a(6);
            } else {
                doVar.a(6, a2);
            }
            doVar.a(7, csl.b);
            return;
        }
        doVar.a(6);
        doVar.a(7);
    }
}
