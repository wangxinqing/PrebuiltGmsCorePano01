package defpackage;

import java.util.List;

/* renamed from: afos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afos implements aoqb {
    private final List a;
    private final afkr b;
    private final aflf c;

    public afos(List list, afkr afkr, aflf aflf) {
        this.a = list;
        this.b = afkr;
        this.c = aflf;
    }

    public final aorr a(Object obj) {
        List list = this.a;
        afkr afkr = this.b;
        aflf aflf = this.c;
        if (((afpe) obj) == afpe.DOWNLOADED) {
            return aorl.a((Object) afkr);
        }
        afsh.b("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", aflf.b, aflf.c);
        afjq.a(list, "Failed to download file group %s", aflf.b);
        afsh.a("%s: An unknown error has occurred during download", (Object) "FileGroupManager");
        afkd a2 = afkf.a();
        a2.a = afke.UNKNOWN_ERROR;
        throw a2.a();
    }
}
