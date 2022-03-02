package defpackage;

/* renamed from: afpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpa implements aoqb {
    private final afpf a;
    private final aflf b;

    public afpa(afpf afpf, aflf aflf) {
        this.a = afpf;
        this.b = aflf;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        aflf aflf = this.b;
        Exception exc = (Exception) obj;
        aorr a2 = aorl.a((Object) null);
        if (exc instanceof afkf) {
            a2 = aopr.a(a2, (aoqb) new afok(afpf, aflf, (afkf) exc), afpf.h);
        } else if (exc instanceof afjq) {
            anhk i = ((afjq) exc).a.listIterator();
            while (i.hasNext()) {
                Throwable th = (Throwable) i.next();
                if (th instanceof afkf) {
                    a2 = aopr.a(a2, (aoqb) new afol(afpf, aflf, (afkf) th), afpf.h);
                } else {
                    afsh.a("%s: Expecting DownloadException's in AggregateException", (Object) "FileGroupManager");
                }
            }
        }
        return aopr.a(a2, (aoqb) new afom(exc), afpf.h);
    }
}
