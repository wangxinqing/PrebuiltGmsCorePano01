package defpackage;

import android.content.Context;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: ovr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ovr extends aaib {
    final /* synthetic */ String a;
    final /* synthetic */ oxe b;
    final /* synthetic */ CorpusStatus c;
    final /* synthetic */ osf d;
    final /* synthetic */ ovw e;
    final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ovr(ovw ovw, Context context, orf orf, RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ozc ozc, String str, oxe oxe, CorpusStatus corpusStatus, osf osf, int i) {
        super(context, orf, registerCorpusInfoCall$Request, ozc);
        this.e = ovw;
        this.a = str;
        this.b = oxe;
        this.c = corpusStatus;
        this.d = osf;
        this.f = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = (RegisterCorpusInfoCall$Response) obj;
        if (!registerCorpusInfoCall$Response.a.c()) {
            oso.b("Failed to register corpus '%s':'%s'.", (Object) this.a, (Object) registerCorpusInfoCall$Response.a);
        } else {
            ovw.a(this.e.getWritableDatabase(), this.b, this.o, this.c, this.d, this.f);
        }
    }
}
