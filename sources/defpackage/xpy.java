package defpackage;

import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.concurrent.Callable;

/* renamed from: xpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xpy implements Callable {
    private final PeopleGalChimeraProvider a;
    private final String[] b;
    private final String c;
    private final String d;
    private final aucd e;

    public xpy(PeopleGalChimeraProvider peopleGalChimeraProvider, String[] strArr, String str, String str2, aucd aucd) {
        this.a = peopleGalChimeraProvider;
        this.b = strArr;
        this.c = str;
        this.d = str2;
        this.e = aucd;
    }

    public final Object call() {
        return this.a.a(this.b, this.c, this.d, 1, this.e);
    }
}
