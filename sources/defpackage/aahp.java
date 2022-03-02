package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;

/* renamed from: aahp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aahp extends aafb {
    private final osf a;

    protected aahp(osf osf, ClearCorpusCall$Request clearCorpusCall$Request, ozc ozc) {
        super(aonk.CLEAR_CORPUS, 2, 1, osf.b, clearCorpusCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        String str;
        ClearCorpusCall$Response clearCorpusCall$Response = new ClearCorpusCall$Response();
        clearCorpusCall$Response.a = Status.a;
        ClearCorpusCall$Request clearCorpusCall$Request = (ClearCorpusCall$Request) this.n;
        String str2 = clearCorpusCall$Request.a;
        String str3 = clearCorpusCall$Request.b;
        if (str3 == null) {
            str = "Null corpus name specified";
        } else {
            try {
                osn.a("Corpus name", str3, 2048);
                str = null;
            } catch (IllegalArgumentException e) {
                str = e.getMessage();
            }
        }
        if (str == null) {
            try {
                osf osf = this.a;
                ozc ozc = this.o;
                String str4 = ((ClearCorpusCall$Request) this.n).b;
                osf.c.b(2);
                oyz a2 = osf.m.a(ozc);
                if (!a2.c()) {
                    osf.a(a2, str4);
                } else {
                    String str5 = a2.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 20);
                    sb.append("Package ");
                    sb.append(str5);
                    sb.append(" is blocked.");
                    throw new pax(sb.toString());
                }
            } catch (SecurityException | pau | pax e2) {
                clearCorpusCall$Response.a = new Status(8, e2.getMessage(), (PendingIntent) null);
            }
        } else {
            clearCorpusCall$Response.a = new Status(8, str, (PendingIntent) null);
        }
        return clearCorpusCall$Response;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return String.format("%s, corpus[%s]", new Object[]{super.f(), ((ClearCorpusCall$Request) this.n).b});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        ClearCorpusCall$Response clearCorpusCall$Response = new ClearCorpusCall$Response();
        clearCorpusCall$Response.a = status;
        return clearCorpusCall$Response;
    }
}
