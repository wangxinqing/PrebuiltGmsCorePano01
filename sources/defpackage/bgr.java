package defpackage;

import android.content.Context;
import com.google.android.ads.tasks.g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bgr extends bgq {
    public static final /* synthetic */ int h = 0;

    public bgr(Context context, String str) {
        super(context, str);
    }

    public final List a(bhm bhm, Context context, aucd aucd) {
        if (bhm.b == null) {
            return super.a(bhm, context, aucd);
        }
        int b = bhm.b();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.a(bhm, context, aucd));
        arrayList.add(new g(bhm, "HTVfuTZB/oxuZhdJUN7AuWr9en73MM+d9FEd1etLbXmZzANRMfXYbOTacA0uH2zu", "2s8nOMXCn5X7K8/JhSyR9TgWJLPza6EcW44ESpzwNPg=", aucd, b));
        return arrayList;
    }
}
