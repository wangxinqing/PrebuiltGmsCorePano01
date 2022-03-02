package defpackage;

import java.io.IOException;

/* renamed from: afoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afoo implements aoqb {
    static final aoqb a = new afoo();

    private afoo() {
    }

    public final aorr a(Object obj) {
        afkd a2 = afkf.a();
        a2.a = afke.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
        a2.c = (IOException) obj;
        return aorl.a((Throwable) a2.a());
    }
}
