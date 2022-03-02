package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: puu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class puu extends put {
    final /* synthetic */ puv a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public puu(puv puv, String str) {
        super(str);
        this.a = puv;
    }

    /* access modifiers changed from: protected */
    public final Context a() {
        return this.a.getActivity();
    }

    /* access modifiers changed from: protected */
    public final View b() {
        return this.a.a;
    }

    /* access modifiers changed from: protected */
    public final View c() {
        return this.a.b;
    }

    /* access modifiers changed from: protected */
    public final TextView d() {
        return (TextView) this.a.c.findViewById(R.id.indexable_text);
    }
}
