package defpackage;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtl {
    public String a;
    public Uri b;
    public final List c = new ArrayList();
    public GlobalSearchCorpusConfig d;
    public boolean e;
    public Account f;
    public RegisterCorpusIMEInfo g;
    public String h;
    @Deprecated
    public boolean i;
    public int j;
    private final String k;

    public dtl(String str) {
        this.k = str;
    }

    public final RegisterCorpusInfo a() {
        String str = this.k;
        String str2 = this.a;
        Uri uri = this.b;
        List list = this.c;
        return new RegisterCorpusInfo(str, str2, uri, (RegisterSectionInfo[]) list.toArray(new RegisterSectionInfo[list.size()]), this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void a(RegisterSectionInfo registerSectionInfo) {
        this.c.add(registerSectionInfo);
    }

    public final void a(dtn dtn) {
        this.c.add(dtn.a());
    }

    public final void a(String str) {
        this.b = str != null ? Uri.parse(str) : null;
    }
}
