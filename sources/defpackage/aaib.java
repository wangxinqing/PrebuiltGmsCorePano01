package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: aaib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aaib extends aafb {
    private final orf a;

    public aaib(Context context, orf orf, RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ozc ozc) {
        super(aonk.REGISTER_CORPUS_INFO, 2, 1, context, registerCorpusInfoCall$Request, ozc);
        this.a = orf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = new RegisterCorpusInfoCall$Response();
        registerCorpusInfoCall$Response.a = Status.a;
        RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = (RegisterCorpusInfoCall$Request) this.n;
        String str = registerCorpusInfoCall$Request.a;
        String a2 = osn.a(registerCorpusInfoCall$Request.c);
        if (a2 != null) {
            registerCorpusInfoCall$Response.a = new Status(8, a2, (PendingIntent) null);
        } else {
            ozv a3 = ozv.a(((RegisterCorpusInfoCall$Request) this.n).c, System.currentTimeMillis());
            try {
                oso.a("IndexManager starting to doRegisterCorpusInfo");
                registerCorpusInfoCall$Response.b = this.a.a(this.o, a3);
            } catch (SecurityException | pau | pax e) {
                registerCorpusInfoCall$Response.a = new Status(8, e.getMessage(), (PendingIntent) null);
            }
        }
        return registerCorpusInfoCall$Response;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = (RegisterCorpusInfoCall$Request) this.n;
        return String.format("%s, package[%s], corpus[%s]", new Object[]{super.f(), registerCorpusInfoCall$Request.a, registerCorpusInfoCall$Request.b});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = new RegisterCorpusInfoCall$Response();
        registerCorpusInfoCall$Response.a = status;
        return registerCorpusInfoCall$Response;
    }
}
