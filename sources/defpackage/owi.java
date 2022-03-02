package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.GetOptions;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: owi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owi extends oxu {
    final /* synthetic */ String a;
    final /* synthetic */ GetOptions b;
    final /* synthetic */ ovw c;
    final /* synthetic */ String[] d;
    final /* synthetic */ apmq e;
    final /* synthetic */ apms f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public owi(apms apms, oyt oyt, oxc oxc, oyq oyq, oxx oxx, String str, GetOptions getOptions, ovw ovw, String[] strArr, apmq apmq) {
        super(oyt, oxc, oyq, oxx);
        this.f = apms;
        this.a = str;
        this.b = getOptions;
        this.c = ovw;
        this.d = strArr;
        this.e = apmq;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        Thing a2;
        List a3 = this.f.a(this.a);
        if (this.b.b && (a2 = this.f.a(this.c, a3, this.a, this.d[0])) != null) {
            return Arrays.asList(new Thing[]{a2});
        }
        List a4 = this.f.a(a3, this.d);
        return a4.isEmpty() ? Collections.emptyList() : a4;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Status status, Object obj) {
        this.e.a(status, (List) obj);
    }
}
