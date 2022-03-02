package defpackage;

import android.content.Context;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: aaim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaim extends aaib {
    final /* synthetic */ aaiq a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaim(Context context, orf orf, RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ozc ozc, aaiq aaiq) {
        super(context, orf, registerCorpusInfoCall$Request, ozc);
        this.a = aaiq;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.a((RegisterCorpusInfoCall$Response) obj);
    }
}
