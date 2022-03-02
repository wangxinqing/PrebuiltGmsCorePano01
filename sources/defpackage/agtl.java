package defpackage;

import java.io.File;

/* renamed from: agtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agtl implements aoqb {
    private final File a;

    public agtl(File file) {
        this.a = file;
    }

    public final aorr a(Object obj) {
        this.a.delete();
        return aorl.a((Throwable) new agog((Throwable) (agsx) obj));
    }
}
