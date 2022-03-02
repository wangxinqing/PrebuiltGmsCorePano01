package defpackage;

import android.content.Context;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: ovy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ovy extends aaib {
    final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ovy(Context context, orf orf, RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ozc ozc, String str) {
        super(context, orf, registerCorpusInfoCall$Request, ozc);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = (RegisterCorpusInfoCall$Response) obj;
        if (!registerCorpusInfoCall$Response.a.c()) {
            oso.b("Failed to register corpus '%s':'%s'.", (Object) this.a, (Object) registerCorpusInfoCall$Response.a);
        }
    }
}
